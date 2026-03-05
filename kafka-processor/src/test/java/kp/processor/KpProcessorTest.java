package kp.processor;

import kp.model.Box;
import org.jspecify.annotations.NonNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.binder.test.InputDestination;
import org.springframework.cloud.stream.binder.test.OutputDestination;
import org.springframework.cloud.stream.binder.test.TestChannelBinderConfiguration;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.annotation.DirtiesContext;

import java.lang.invoke.MethodHandles;

/**
 * Tests for the {@link KpProcessor} class.
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ImportAutoConfiguration(value = TestChannelBinderConfiguration.class)
@DirtiesContext
class KpProcessorTest {
    private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass().getName());

    @Autowired
    private InputDestination inputDestination;

    @Autowired
    private OutputDestination outputDestination;

    private static final String INPUT_DESTINATION_NAME = "kp-1";
    private static final String OUTPUT_DESTINATION_NAME = "kp-2";
    private static final String RECEIVED_PAYLOAD = """
            {
            "sndNum" : 12345,
            "prcNum" : 0,
            "recNum" : 67890,
            "milliseconds" : 0
            }
            """;
    private static final String EXPECTED_SND_NUM = "\"sndNum\":12345";
    private static final String EXPECTED_PRC_NUM = "\"prcNum\":1";
    private static final String EXPECTED_REC_NUM = "\"recNum\":67890";
    private static final String EXPECTED_MILLIS = "\"milliseconds\":";

    private static final String MESSAGE_NULL_ERR_MSG = "Message is null";
    private static final String PAYLOAD_NULL_ERR_MSG = "Payload is null";
    private static final String SND_NUM_ERR_MSG = "Incorrect 'send' number in Box";
    private static final String PRC_NUM_ERR_MSG = "Incorrect 'process' number in Box";
    private static final String REC_NUM_ERR_MSG = "Incorrect 'receive' number in Box";
    private static final String MILLIS_ERR_MSG = "Incorrect milliseconds in Box";

    /**
     * Tests the processing of a {@link Box}.
     */
    @Test
    void shouldProcessBox() {
        // GIVEN
        final Message<@NonNull String> inputMessage = MessageBuilder.withPayload(RECEIVED_PAYLOAD).build();
        // WHEN
        inputDestination.send(inputMessage, INPUT_DESTINATION_NAME);
        final Message<byte @NonNull []> outputMessage = outputDestination.receive(
                1000, OUTPUT_DESTINATION_NAME);
        // THEN
        Assertions.assertNotNull(outputMessage, MESSAGE_NULL_ERR_MSG);
        final String payload = new String(outputMessage.getPayload());
        Assertions.assertNotNull(payload, PAYLOAD_NULL_ERR_MSG);
        Assertions.assertTrue(payload.contains(EXPECTED_SND_NUM), SND_NUM_ERR_MSG);
        Assertions.assertTrue(payload.contains(EXPECTED_PRC_NUM), PRC_NUM_ERR_MSG);
        Assertions.assertTrue(payload.contains(EXPECTED_REC_NUM), REC_NUM_ERR_MSG);
        Assertions.assertTrue(payload.contains(EXPECTED_MILLIS), MILLIS_ERR_MSG);
        logger.info("shouldProcessBox():");
    }

}
