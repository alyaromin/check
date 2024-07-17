package main.java.com.alyaromin.check;

import java.util.Map;

public class CheckDirector {
	public static String createCheck(Map<Integer, Integer> products,
									int discountCardNumber,
									float balanceDebitCard) {
		CheckBuilder builder;
		
		try {
		// try to build normal check
		builder = new NormalCheckBuilder();
				
		} catch (Exception e) {
		// build error check
		builder = new ErrorCheckBuilder();
				
		}
		return builder.build();
	}
}
