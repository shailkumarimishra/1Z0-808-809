package exceptionhandling;

public class InsufficientBalance extends Exception {
private String message;
InsufficientBalance(String message){
this.message=message;	
}
public String getMessage() {
	return message;
}

}
