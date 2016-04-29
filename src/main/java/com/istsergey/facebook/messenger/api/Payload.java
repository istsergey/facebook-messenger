package com.istsergey.facebook.messenger.api;

public class Payload {
    /**
     *  URL of attachment
     */
    private String url;

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

	@Override
	public String toString() {
		return "Payload [url=" + url + "]";
	}
}
