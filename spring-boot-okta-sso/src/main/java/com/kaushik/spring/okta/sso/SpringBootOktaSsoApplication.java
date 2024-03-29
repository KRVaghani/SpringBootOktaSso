package com.kaushik.spring.okta.sso;

import java.security.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso

public class SpringBootOktaSsoApplication {
	public String welcome2User(Principal principal) {
		return "HI "+ principal.getName() + " Welcome to Kaushik Vaghani";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootOktaSsoApplication.class, args);
	}
}
