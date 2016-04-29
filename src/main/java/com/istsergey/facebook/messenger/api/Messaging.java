package com.istsergey.facebook.messenger.api;

import java.util.Date;

public class Messaging {
    private Sender sender;
    private Recipient recipient;
    private Date timestamp;
    private Message message;
    private Postback postback;
    private Optin optin;
    /**
     *  Indicates there are updates that are of delivery type
     */
    private Delivery delivery;

    /**
     * 
     * @return The sender
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * 
     * @param sender
     *            The sender
     */
    public void setSender(Sender sender) {
        this.sender = sender;
    }

    /**
     * 
     * @return The recipient
     */
    public Recipient getRecipient() {
        return recipient;
    }

    /**
     * 
     * @param recipient
     *            The recipient
     */
    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    /**
     * 
     * @return The timestamp
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *            The timestamp
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * @return The message
     */
    public Message getMessage() {
        return message;
    }

    /**
     * 
     * @param message
     *            The message
     */
    public void setMessage(Message message) {
        this.message = message;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Postback getPostback() {
        return postback;
    }

    public void setPostback(Postback postback) {
        this.postback = postback;
    }

    public Optin getOptin() {
        return optin;
    }

    public void setOptin(Optin optin) {
        this.optin = optin;
    }

	@Override
	public String toString() {
		return "Messaging [sender=" + sender + ", recipient=" + recipient + ", timestamp=" + timestamp + ", message="
				+ message + ", postback=" + postback + ", optin=" + optin + ", delivery=" + delivery + "]";
	}
}
