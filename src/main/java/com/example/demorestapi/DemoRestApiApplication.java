package com.example.demorestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.server.core.EvoInflectorLinkRelationProvider;

@SpringBootApplication
public class DemoRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestApiApplication.class, args);
	}

	/**
	 * Format embedded collections by pluralizing the resource's type.
	 *
	 * @return
	 */
	@Bean
	EvoInflectorLinkRelationProvider relProvider() {
		return new EvoInflectorLinkRelationProvider();
	}

}
