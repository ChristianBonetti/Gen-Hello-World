package org.generation.HelloWorldController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController



@RequestMapping("/hello")
public class HelloWorldController {

	@GetMapping
	public String hello() {
		return "Oi Mundo";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "trabalho em equipe";
}
	@GetMapping("/bsm1")
	public String bsm1() {
		return "comunicação";
}}