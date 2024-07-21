package main.java.com.alyaromin.check.model.entities;

public record AvailableProduct(int id, 
							   String description,
							   float price,
							   int quantity,
							   boolean isWholesale) {
}
