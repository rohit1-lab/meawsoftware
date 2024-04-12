package com.rohit.exception;

import java.time.LocalDateTime;

import com.zosh.exception.ErrorDetais;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import com.zosh.exception.ErrorDetais;
@ControllerAdvice
public class GlobelExeptions {
	
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<com.zosh.exception.ErrorDetais> userEceptionHandler(UserException ue,
																			  WebRequest req){
		com.zosh.exception.ErrorDetais error=new com.zosh.exception.ErrorDetais(ue.getMessage(),req.getDescription(false),LocalDateTime.now());
		return new ResponseEntity<ErrorDetais>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<com.zosh.exception.ErrorDetais> otherEceptionHandler(Exception ue,
																			   WebRequest req){
		com.zosh.exception.ErrorDetais error=new com.zosh.exception.ErrorDetais(ue.getMessage(),req.getDescription(false),LocalDateTime.now());
		return new ResponseEntity<com.zosh.exception.ErrorDetais>(error,HttpStatus.BAD_REQUEST);
	}

}
