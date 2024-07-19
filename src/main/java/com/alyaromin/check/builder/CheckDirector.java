package main.java.com.alyaromin.check.builder;

import java.util.Map;

public class CheckDirector {
	public static String createCheck(Map<Integer, Integer> products,
									int discountCardNumber,
									float balanceDebitCard) {
		CheckBuilder builder;
		
		try {
		// try to build normal check
		builder = new NormalCheckBuilder(products, discountCardNumber, balanceDebitCard);
				
		} catch (Exception e) {
		// build error check
		builder = new ErrorCheckBuilder(e);
				
		}
		return builder.build();
	}
}
