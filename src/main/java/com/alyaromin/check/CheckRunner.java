package main.java.com.alyaromin.check;

public class CheckRunner {

	public static void main(String[] args) {
		var argumentParser = new ArgumentParser(args);
		System.out.println(argumentParser.getProducts());
		System.out.println(argumentParser.getDiscountCard());
		System.out.println(argumentParser.getBalanceDebitCard());

	}

}
