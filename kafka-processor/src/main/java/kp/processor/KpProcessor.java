package kp.processor;

import java.lang.invoke.MethodHandles;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kp.model.Box;

/**
 * The KP processor using the {@link Function}.
 *
 */
@Configuration
public class KpProcessor {

	private static final Log logger = LogFactory.getLog(MethodHandles.lookup().lookupClass().getName());
	private static final AtomicInteger atomic = new AtomicInteger();

	/**
	 * The constructor.
	 * 
	 */
	public KpProcessor() {
		super();
	}

	/**
	 * Creates the {@link Function} for processing the {@link Box}.
	 * 
	 * @return the {@link Function}
	 */
	@Bean
	public Function<Box, Box> processBox() {
		return box -> {
			box.setPrcNum(atomic.incrementAndGet());
			final long diff = Instant.now().toEpochMilli() - box.getMilliseconds();
			box.setMilliseconds(Instant.now().toEpochMilli());
			final String msg = String.format("Snd[%03d], Prc[%03d], elapsed time[%d]", box.getSndNum(), box.getPrcNum(),
					diff);
			logger.info(msg);
			return box;
		};
	}

}