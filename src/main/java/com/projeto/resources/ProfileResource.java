package com.projeto.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/profile")
public class ProfileResource {

	@Value("${info}")
	private String profileInfo;

	@GetMapping
	public void testProfile() {
		System.out.println(profileInfo);
	}
}
