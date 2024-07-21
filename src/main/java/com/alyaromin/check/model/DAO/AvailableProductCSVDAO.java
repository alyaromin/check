package main.java.com.alyaromin.check.model.DAO;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import main.java.com.alyaromin.check.model.entities.AvailableProduct;

public class AvailableProductCSVDAO implements AvailableProductDAO {

	@Override
	public List<AvailableProduct> getAllAvailableProducts() throws Exception {
		List<AvailableProduct> products = new ArrayList<AvailableProduct>();
		
		try {
			String rootPath = System.getProperty("user.dir");
			String filePath = rootPath + "/src/main/resources/products.csv";
			
			FileReader fileReader = new FileReader(filePath);
			CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
			CSVReader csvReader = new CSVReaderBuilder(fileReader).withCSVParser(parser).build();
		
			String[] nextLine;
		
			nextLine = csvReader.readNext();
			while ((nextLine = csvReader.readNext()) != null) {
				AvailableProduct product = new AvailableProduct(Integer.parseInt(nextLine[0]), 
																nextLine[1], 
																Float.parseFloat(nextLine[2].replaceAll(",", ".")), 
																Integer.parseInt(nextLine[3]), 
																(nextLine[4].equals("+")));
				products.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("INTERNAL SERVER ERROR");
		} 
		return products;
	}

}
