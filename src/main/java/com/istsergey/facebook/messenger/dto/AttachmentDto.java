package com.istsergey.facebook.messenger.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class AttachmentDto {
	private String type;
    private PayloadDto payload;

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The payload
     */
    public PayloadDto getPayload() {
        return payload;
    }

    /**
     * 
     * @param payload
     *     The payload
     */
    public void setPayload(PayloadDto payload) {
        this.payload = payload;
    }
    

    @Override
	public String toString() {
		return "AttachmentDto [type=" + type + ", payload=" + payload + "]";
	}


}
