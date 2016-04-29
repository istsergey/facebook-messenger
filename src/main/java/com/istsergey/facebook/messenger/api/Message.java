package com.istsergey.facebook.messenger.api;

import java.util.ArrayList;
import java.util.List;

public class Message {
    /**
     *  Message ID
     */
    private String mid;
    /**
     * Message sequence number
     */
    private Integer seq;
    /**
     *  Text of message
     */
    private String text;
    /**
     * List containing attachment data
     */
    private List<Attachment> attachments = new ArrayList<Attachment>();

    /**
     * 
     * @return The mid
     */
    public String getMid() {
        return mid;
    }

    /**
     * 
     * @param mid
     *            The mid
     */
    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
     * 
     * @return The seq
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * 
     * @param seq
     *            The seq
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * 
     * @return The attachments
     */
    public List<Attachment> getAttachments() {
        return attachments;
    }

    /**
     * 
     * @param attachments
     *            The attachments
     */
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    /**
     * 
     * @return The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *            The text
     */
    public void setText(String text) {
        this.text = text;
    }

	@Override
	public String toString() {
		return "Message [mid=" + mid + ", seq=" + seq + ", text=" + text + ", attachments=" + attachments + "]";
	}
}
