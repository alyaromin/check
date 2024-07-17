package main.java.com.alyaromin.check;

public class CheckRunner {

	public static void main(String[] args) {
		var parser = new ArgumentParser(args);
		
		String check = CheckFactory.createCheck(parser.getProducts(), 
												parser.getDiscountCard(), 
												parser.getBalanceDebitCard());
		System.out.println(check);
	}

}
