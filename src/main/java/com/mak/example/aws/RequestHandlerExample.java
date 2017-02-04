package com.mak.example.aws;

import java.util.logging.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * 
 * @author msarmalkar
 *
 */
public class RequestHandlerExample implements RequestHandler<String, String> {
	private static final Logger LOG = Logger.getLogger(RequestHandlerExample.class.getName());

	public String handleRequest(String name, Context context) {
		LOG.info("inside handleRequest: name="+ name);
		return "RequestHandlerExample : Hello "+ name;
	}

}
