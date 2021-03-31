package com.medicineshopping.demo.exceptions;

/**
 * @author shirdisai
 *
 */
@SuppressWarnings("serial") //Disables compilation warnings
public class MedicineNotFoundException extends Exception{

	public MedicineNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicineNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MedicineNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MedicineNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MedicineNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
