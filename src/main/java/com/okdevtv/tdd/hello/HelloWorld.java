package com.okdevtv.tdd.hello;

public class HelloWorld {
	String message;

	public String getMessage() {
		return "Hello World";
	}

	public String getMessage(String name) {
		if (name == null)
			name = "World";
		return "Hello " + name;
	}
}
