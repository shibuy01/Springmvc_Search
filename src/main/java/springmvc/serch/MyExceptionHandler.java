package springmvc.serch;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {

	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NullPointerException.class , NumberFormatException.class})
	public String exceptionHandler() {
		return"null_page";
	}
	
	@ResponseStatus(value=HttpStatus.NOT_MODIFIED)
	@ExceptionHandler(Exception.class)
	public String exceptionGeneral() {
		return"null_page";
	}
}
