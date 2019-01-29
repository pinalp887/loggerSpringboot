package com.cignex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LoogerInSpringbootApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoogerInSpringbootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoogerInSpringbootApplication.class, args);
		LOGGER.warn("in warn log level");
		LOGGER.error("in error level log");
		LOGGER.info("in info level log");
		LOGGER.debug("in debug level log");
	}
	@RequestMapping("/")
	public String hello() {
		String name="pinal";
		if(name.equalsIgnoreCase("pinal"))
		{
			throw new RuntimeException("there is an exception in name");
		}
		return "hello world";
	}

}
