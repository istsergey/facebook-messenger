package com.istsergey.facebook.messenger.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MessageContentDto {
    private String text;
    private AttachmentDto attachment;

    public MessageContentDto() {

    }
    
    public MessageContentDto(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    /**
     * 
     * @return
     *     The attachment
     */
    public AttachmentDto getAttachment() {
        return attachment;
    }

    /**
     * 
     * @param attachment
     *     The attachment
     */
    public void setAttachment(AttachmentDto attachment) {
        this.attachment = attachment;
    }
}
