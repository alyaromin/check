package main.java.com.alyaromin.check.model.builder;

import java.util.Map;

import main.java.com.alyaromin.check.view.Order;

public class CheckDirector {
	public static String createCheck(Order order) {
		CheckBuilder builder;
		
		try {
		// try to build normal check
		builder = new NormalCheckBuilder(order);
				
		} catch (Exception exception) {
		// build error check
		builder = new ErrorCheckBuilder(exception);
				
		}
		return builder.build();
	}
}
