package main.java.com.alyaromin.check.model.checkbilder;

public class ErrorCheckBuilder implements CheckBuilder {
	private Exception exception;

	public ErrorCheckBuilder(Exception e) {
		this.exception = e;
	}

	@Override
	public String build() {
		return "ERROR\n" + exception.getMessage();
	}

}