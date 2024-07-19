package main.java.com.alyaromin.check.builder;

import java.util.List;
import java.util.Map;

import main.java.com.alyaromin.check.products.AvailableProduct;
import main.java.com.alyaromin.check.products.CartProduct;

public class NormalCheckBuilder implements CheckBuilder {
	private List <AvailableProduct> availableProducts;
	private List <CartProduct> cartProducts;
	private List discountCards;

	public NormalCheckBuilder(Map<Integer, Integer> products, int discountCardNumber, float balanceDebitCard) {
		// TODO initialize availableProducts list
		// TODO initialize cartProducts list
		// TODO initialize discountCards list
	}

	@Override
	public String build() {
		// TODO implement build()
		return "normal check";
	}

}
