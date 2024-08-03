package main.java.com.alyaromin.check.model.checkbilder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.opencsv.exceptions.CsvValidationException;

import main.java.com.alyaromin.check.model.DAO.AvailableProductDAO;
import main.java.com.alyaromin.check.model.DAO.AvailableProductDAOFactory;
import main.java.com.alyaromin.check.model.DAO.StorageTypes;
import main.java.com.alyaromin.check.model.entities.AvailableProduct;
import main.java.com.alyaromin.check.model.entities.CartProduct;
import main.java.com.alyaromin.check.view.Order;

public class NormalCheckBuilder implements CheckBuilder {
	private List <AvailableProduct> availableProducts;
	private List <CartProduct> cartProducts;
	private List discountCards;

	public NormalCheckBuilder(Order order) throws Exception {
		setAvailableProducts();
		// TODO initialize cartProducts list
		setCartProducts(order);
		
		
		// TODO initialize discountCards list
		
	}

	

	private void setAvailableProducts() throws Exception {
		AvailableProductDAO dao = AvailableProductDAOFactory.getDAO(StorageTypes.csv);
		availableProducts = dao.getAllAvailableProducts();
	}
	
	private void setCartProducts(Order order) {
		// TODO Auto-generated method stub
		if (order.products().isEmpty()|| order.balanceDebitCard() <= 0) {
			throw new IllegalArgumentException("BAD REQUEST");
			}
		order.products().forEach((productId, qty) -> {
			Optional<AvailableProduct> availableProduct = availableProducts.stream().filter(obj -> obj.id() == productId).findFirst();
			if (availableProduct.isPresent() && 
					(availableProduct.get().quantity() >= qty)) {
//				cartProducts.add();
			}
			else {
				throw new IllegalArgumentException("BAD REQUEST");
			};
		});
	}

	@Override
	public String build() {
		// TODO implement build()
		return "normal check";
	}

}
