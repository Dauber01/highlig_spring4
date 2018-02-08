package com.wisely.mavendamo.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
	
	@Autowired
	private FuctionService fuctionService;
	
	public String sayHello(String word) {
		return fuctionService.sayHello(word);
	}

}
