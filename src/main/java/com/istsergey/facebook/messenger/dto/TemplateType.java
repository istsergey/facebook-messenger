package com.istsergey.facebook.messenger.dto;

public enum TemplateType {
	RECEIPT("receipt"),
	BUTTON("button"),
	GENERIC("generic");
	
	private final String value;

	private TemplateType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
