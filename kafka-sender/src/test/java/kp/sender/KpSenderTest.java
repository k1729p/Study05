package kp.sender;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.binder.test.OutputDestination;
import org.springframework.cloud.stream.binder.test.TestChannelBinderConfiguration;
import org.springframework.messaging.Message;
import org.springframework.test.annotation.DirtiesContext;

import kp.model.Box;

/**
 * The KP sender test.
 *
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ImportAutoConfiguration(value = TestChannelBinderConfiguration.class, //
		exclude = { KafkaAutoConfiguration.class, //
				DataSourceAutoConfiguration.class, //
				TransactionAutoConfiguration.class, //
				DataSourceTransactionManagerAutoConfiguration.class })
@DirtiesContext
class KpSenderTest {

	@Autowired
	private OutputDestination outputDestination;

	private static final long RECEIVE_TIMEOUT = 5000;
	private static final String OUTPUT_DESTINATION_NAME = "kp-1";
	private static final String EXPECTED_SND_NUM = "\"sndNum\":1";
	private static final String EXPECTED_PRC_NUM = "\"prcNum\":0";
	private static final String EXPECTED_REC_NUM = "\"recNum\":0";
	private static final String EXPECTED_MILLIS = "\"milliseconds\":";

	private static final String MESSAGE_NULL_ERR_MSG = "Message is null";
	private static final String PAYLOAD_NULL_ERR_MSG = "Payload is null";
	private static final String SND_NUM_ERR_MSG = "Bad send number in Box";
	private static final String PRC_NUM_ERR_MSG = "Bad process number in Box";
	private static final String REC_NUM_ERR_MSG = "Bad receive number in Box";
	private static final String MILLIS_ERR_MSG = "Bad millis in Box";

	/**
	 * The constructor.
	 * 
	 */
	public KpSenderTest() {
		super();
	}

	/**
	 * Should send the {@link Box}.
	 * 
	 */
	@Test
	void shouldSendBox() {
		// GIVEN
		// WHEN
		final Message<byte[]> outputMessage = outputDestination.receive(RECEIVE_TIMEOUT, OUTPUT_DESTINATION_NAME);
		// THEN
		Assertions.assertNotNull(outputMessage, MESSAGE_NULL_ERR_MSG);
		final String payload = new String(outputMessage.getPayload());
		Assertions.assertNotNull(payload, PAYLOAD_NULL_ERR_MSG);
		Assertions.assertTrue(payload.contains(EXPECTED_SND_NUM), SND_NUM_ERR_MSG);
		Assertions.assertTrue(payload.contains(EXPECTED_PRC_NUM), PRC_NUM_ERR_MSG);
		Assertions.assertTrue(payload.contains(EXPECTED_REC_NUM), REC_NUM_ERR_MSG);
		Assertions.assertTrue(payload.contains(EXPECTED_MILLIS), MILLIS_ERR_MSG);
	}
}
