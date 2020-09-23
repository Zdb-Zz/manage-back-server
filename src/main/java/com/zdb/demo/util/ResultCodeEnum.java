package com.zdb.demo.util;

public enum ResultCodeEnum {
	/** 参数错误 */
	PARAMETER_FAIL(0, "参数错误"),
	/** 返回成功 */
	SUCCESS(1, "返回成功"),
	/** 登陆失败 */
	LOGIN_FAIL(2, "登陆失败"),
	/** 返回失败 */
	FAIL(3, "返回失败"),
	/** 其他错误 */
	OTHER_FAIL(4, "其他错误"),

	TOKEN_EXPIRED(5, "token过期"),
	;

	private Integer value;
	private String message;

	ResultCodeEnum(Integer value, String message) {
		this.value = value;
		this.message = message;
	}

	public Integer getValue() {
		return value;
	}

	public String getMessage() {
		return message;
	}



}
