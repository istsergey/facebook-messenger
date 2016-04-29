package com.istsergey.facebook.messenger.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PayloadDto {
	@JsonProperty("template_type")
	private String templateType;
	private String text;
	private List<ButtonDto> buttons;
	private List<ElementDto> elements;

	/**
	 * 
	 * @return The templateType
	 */
	public String getTemplateType() {
		return templateType;
	}

	/**
	 * 
	 * @param templateType
	 *            The template_type
	 */
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	/**
	 * 
	 * @return The elements
	 */
	public List<ElementDto> getElements() {
		return elements;
	}

	/**
	 * 
	 * @param elements
	 *            The elements
	 */
	public void setElements(List<ElementDto> elements) {
		this.elements = elements;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<ButtonDto> getButtons() {
		return buttons;
	}

	public void setButtons(List<ButtonDto> buttons) {
		this.buttons = buttons;
	}

}
