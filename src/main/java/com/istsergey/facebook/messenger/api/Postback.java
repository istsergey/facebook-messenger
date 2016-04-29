package com.istsergey.facebook.messenger.api;

public class Postback {
    /**
     * payload parameter that was defined with the button
     */
    private String payload;

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

	@Override
	public String toString() {
		return "Postback [payload=" + payload + "]";
	}
}
