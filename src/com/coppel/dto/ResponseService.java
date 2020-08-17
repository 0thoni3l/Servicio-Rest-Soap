package com.coppel.dto;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModelProperty;

@XmlRootElement(name="response")
@XmlAccessorType()
public class ResponseService {
	@XmlElement
	@ApiModelProperty(example = "200")
	private String code;
	@XmlElement
	@ApiModelProperty(example = "{'data':'data'}")
	private String data;
	@XmlElement
	@ApiModelProperty(example = "mensaje de erro")
	private String message;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
