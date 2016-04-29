package com.istsergey.facebook.messenger.api;

public class Attachment {
    /**
     *  Type of attachment
     */
    private String type;
    private Payload payload;

    /**
     * 
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *            The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return The payload
     */
    public Payload getPayload() {
        return payload;
    }

    /**
     * 
     * @param payload
     *            The payload
     */
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

	@Override
	public String toString() {
		return "Attachment [type=" + type + ", payload=" + payload + "]";
	}
}
