package main.java.com.alyaromin.check.model.DAO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.opencsv.exceptions.CsvValidationException;

import main.java.com.alyaromin.check.model.entities.AvailableProduct;

public interface AvailableProductDAO {
	List<AvailableProduct> getAllAvailableProducts() throws Exception; 
}
