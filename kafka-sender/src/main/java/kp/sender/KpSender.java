package kp.sender;

import java.lang.invoke.MethodHandles;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kp.model.Box;

/**
 * The KP sender using the {@link Supplier}.
 *
 */
@Configuration
public class KpSender {

	private static final Log logger = LogFactory.getLog(MethodHandles.lookup().lookupClass().getName());
	private static final AtomicInteger atomic = new AtomicInteger();

	/**
	 * The constructor.
	 * 
	 */
	public KpSender() {
		super();
	}

	/**
	 * Creates the {@link Supplier} for sending the {@link Box}.
	 * 
	 * @return the {@link Supplier}
	 */
	@Bean
	public Supplier<Box> sendBox() {
		return () -> {
			final int sndNumber = atomic.incrementAndGet();
			final Box box = new Box(sndNumber, Instant.now().toEpochMilli());
			final String msg = String.format("Snd[%03d]", sndNumber);
			logger.info(msg);
			return box;
		};
	}

}