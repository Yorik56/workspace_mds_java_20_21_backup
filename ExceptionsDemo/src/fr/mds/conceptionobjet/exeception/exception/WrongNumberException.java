package fr.mds.conceptionobjet.exeception.exception;

public class WrongNumberException extends Exception{
	private String errorCode;
	
	public WrongNumberException(String errorCode) {
		super("this is message");
		this.errorCode = errorCode;
	}
	
	public String getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}
