package kp.receiver;

import java.lang.invoke.MethodHandles;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kp.model.Box;

/**
 * The KP receiver using the {@link Consumer}.
 * 
 */
@Configuration
public class KpReceiver {

	private static final Log logger = LogFactory.getLog(MethodHandles.lookup().lookupClass().getName());
	private static final AtomicInteger atomic = new AtomicInteger();

	private static Box receivedBox;

	/**
	 * The constructor.
	 * 
	 */
	public KpReceiver() {
		super();
	}

	/**
	 * Creates the {@link Consumer} for receiving the {@link Box}.
	 * 
	 * @return the {@link Consumer}
	 */
	@Bean
	public Consumer<Box> receiveBox() {
		return box -> {
			box.setRecNum(atomic.incrementAndGet());
			final long diff = Instant.now().toEpochMilli() - box.getMilliseconds();
			box.setMilliseconds(Instant.now().toEpochMilli());
			KpReceiver.setReceivedBox(box);
			final String msg = String.format("Snd[%03d], Prc[%03d], Rec[%03d], elapsed time[%d]", box.getSndNum(),
					box.getPrcNum(), box.getRecNum(), diff);
			logger.info(msg);
		};
	}

	/**
	 * Gets the received {@link Box}. This method is used for tests.
	 * 
	 * @return the received {@link Box}
	 */
	public static Box getReceivedBox() {
		return KpReceiver.receivedBox;
	}

	/**
	 * Sets the received {@link Box}. This method is used for tests.
	 * 
	 * @param receivedBox the received {@link Box} to set
	 */
	public static void setReceivedBox(Box receivedBox) {
		KpReceiver.receivedBox = receivedBox;
	}

}
