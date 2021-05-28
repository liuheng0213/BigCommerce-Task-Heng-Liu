package com.BigCommerce.task.hengLiu.exception;

import com.BigCommerce.task.hengLiu.result.ResultBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Spring boot can handle exception globally
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);


	/**
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value =Exception.class)
	@ResponseBody
	public ResultBody exceptionHandler(Exception e){
		logger.error("an exception occurs :",e.toString());
		return ResultBody.error("500",e.getMessage());
	}






}
