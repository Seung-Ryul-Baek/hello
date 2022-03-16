package com.okdevtv.tdd.hello;

public class HelloWorld {
	String message;
	static final String HELLO_WORLD = "Hello World"; 
	public String getMessage() {
		return HELLO_WORLD;
	}

	public String getMessage(String name) {
		if (name == null)
			name = "World";
		return "Hello " + name;
	}
}
