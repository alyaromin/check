package main.java.com.alyaromin.check.controller;

import main.java.com.alyaromin.check.model.builder.CheckDirector;
import main.java.com.alyaromin.check.view.ArgumentParser;

public class CheckRunner {

	public static void main(String[] args) {
		ArgumentParser parser = new ArgumentParser(args);
		
		String check = CheckDirector.createCheck(parser.getOrder());
		System.out.println(check);
	}

}