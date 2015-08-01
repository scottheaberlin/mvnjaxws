package com.scotth.mvnjaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SampleService {

	@WebMethod
	public String sayHello(String name) {
		return String.format("Hello, %s", name);
	}
}
