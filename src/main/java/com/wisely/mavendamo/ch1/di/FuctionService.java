package com.wisely.mavendamo.ch1.di;

import org.springframework.stereotype.Service;

@Service
public class FuctionService {
	
	public String sayHello(String word) {
		return "Hello " + word + " !";
	}

}
