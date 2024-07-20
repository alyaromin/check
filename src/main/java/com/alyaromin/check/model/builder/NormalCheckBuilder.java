package main.java.com.alyaromin.check.model.builder;

import java.util.List;
import java.util.Map;

import main.java.com.alyaromin.check.model.entities.AvailableProduct;
import main.java.com.alyaromin.check.model.entities.CartProduct;
import main.java.com.alyaromin.check.view.Order;

public class NormalCheckBuilder implements CheckBuilder {
	private List <AvailableProduct> availableProducts;
	private List <CartProduct> cartProducts;
	private List discountCards;

	public NormalCheckBuilder(Order order) {
		// TODO initialize availableProducts list
		// TODO initialize cartProducts list
		// TODO initialize discountCards list
		if (order.products().isEmpty()||
			order.balanceDebitCard() <= 0) {
			throw new IllegalArgumentException("BAD REQUEST");
		}
		
	}

	@Override
	public String build() {
		// TODO implement build()
		return "normal check";
	}

}
