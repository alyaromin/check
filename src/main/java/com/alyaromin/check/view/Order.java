package main.java.com.alyaromin.check.view;

import java.util.Map;

public record Order(Map<Integer, Integer> products,
					int discountCard,
					float balanceDebitCard) {

}
