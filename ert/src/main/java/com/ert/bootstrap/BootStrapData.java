package com.ert.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BootStrapData implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		log.debug("LOG: Al arrancar se ejecuta todo lo que pongamos aquí.");
	}

}
