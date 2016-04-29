package com.istsergey.facebook.messenger.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MessageDto {
    private MessengerUserDto recipient;
    private MessageContentDto message;

    public MessengerUserDto getRecipient() {
        return recipient;
    }

    public void setRecipient(MessengerUserDto recipient) {
        this.recipient = recipient;
    }

    public MessageContentDto getMessage() {
        return message;
    }

    public void setMessage(MessageContentDto message) {
        this.message = message;
    }
}
