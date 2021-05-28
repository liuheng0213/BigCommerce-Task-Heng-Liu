package com.BigCommerce.task.hengLiu.result;


public class ResultBody {

	private String code;

	private String message;

	private Object result;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	/**
	 * for delete method which returns void
	 * @return
	 */
	public static ResultBody success() {
		return success(null);
	}

	public static ResultBody success(Object data) {
		ResultBody rb = new ResultBody();
		rb.setCode("200");
		rb.setMessage("success");
		rb.setResult(data);
		return rb;
	}

	public static ResultBody error(String message) {
		ResultBody rb = new ResultBody();
		rb.setCode("-1");
		rb.setMessage(message);
		rb.setResult(null);
		return rb;
	}

	public static ResultBody error(String code,String message) {
		ResultBody rb = new ResultBody();
		rb.setCode(code);
		rb.setMessage(message);
		rb.setResult(null);
		return rb;
	}



}
