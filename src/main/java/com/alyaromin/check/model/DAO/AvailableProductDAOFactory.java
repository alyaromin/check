package main.java.com.alyaromin.check.model.DAO;

public class AvailableProductDAOFactory {

	public static AvailableProductDAO getDAO(StorageTypes type) {
		switch (type) {
		case csv: {
			return new AvailableProductCSVDAO();
		}
		default:
			throw new IllegalArgumentException("Unexpected storage type: " + type);
		}
	}
	
}
