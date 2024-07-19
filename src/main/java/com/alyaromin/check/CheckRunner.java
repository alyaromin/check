package main.java.com.alyaromin.check;

import main.java.com.alyaromin.check.builder.CheckDirector;

public class CheckRunner {

	public static void main(String[] args) {
		var parser = new ArgumentParser(args);
		
		String check = CheckDirector.createCheck(parser.getProducts(), 
												parser.getDiscountCard(), 
												parser.getBalanceDebitCard());
		System.out.println(check);
	}

}