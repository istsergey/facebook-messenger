package com.istsergey.facebook.messenger.api;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of attachment
 * 
 * @author Sergey_Isterin
 */
public enum AttachmentType {
	IMAGE("image"), VIDEO("video"), AUDIO("audio"), UNKNOWN("UNKNOWN");

	private final String value;

	private AttachmentType(String value) {
		this.value = value;
	}

	public static AttachmentType fromValue(String value) {
		if (value != null) {
			for (AttachmentType attachmentType : values()) {
				if (attachmentType.value.equalsIgnoreCase(value)) {
					return attachmentType;
				}
			}
		}
		return getDefault();
	}

	public static AttachmentType getDefault() {
		return UNKNOWN;
	}

	@JsonValue
	public String toValue() {
		return value;
	}
}
