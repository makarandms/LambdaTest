package com.mak.example.aws;

import java.util.logging.Logger;

import com.amazonaws.services.lambda.runtime.Context;

/**
 * @author msarmalkar
 */
public class SimpleExample 
{
	private static final Logger LOG = Logger.getLogger(SimpleExample.class.getName());
	
    public String myHandler(String name, Context context) {
    	LOG.info("inside myHandler: name="+ name);
        return "SimpleExample : Hello "+ name;
    }
}
