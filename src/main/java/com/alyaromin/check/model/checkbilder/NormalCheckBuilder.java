package main.java.com.alyaromin.check.model.checkbilder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

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
		// TODO initialize availableProducts list
		setAvailableProducts();
		// TODO initialize cartProducts list
		
		if (order.products().isEmpty()||
			order.balanceDebitCard() <= 0) {
			throw new IllegalArgumentException("BAD REQUEST");
		}
		// TODO initialize discountCards list
		
	}

	private void setAvailableProducts() throws Exception {
		// TODO Auto-generated method stub
		AvailableProductDAO dao = AvailableProductDAOFactory.getDAO(StorageTypes.csv);
		
		for (AvailableProduct product: dao.getAllAvailableProducts()) {
			System.out.println(product);
		}
	}

	@Override
	public String build() {
		// TODO implement build()
		return "normal check";
	}

}
