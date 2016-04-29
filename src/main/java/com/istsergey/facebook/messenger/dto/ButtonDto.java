package com.istsergey.facebook.messenger.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ButtonDto {
    private String type;
    private String url;
    private String title;
    private String payload;

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

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The payload
     */
    public String getPayload() {
        return payload;
    }

    /**
     * 
     * @param payload
     *     The payload
     */
    public void setPayload(String payload) {
        this.payload = payload;
    }

}
