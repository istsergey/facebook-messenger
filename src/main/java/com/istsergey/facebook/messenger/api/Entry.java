package com.istsergey.facebook.messenger.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Entry {
    /**
     *  Page ID of page
     */
    private Long id;
    /**
     *  Time of update
     */
    private Date time;
    private List<Messaging> messaging = new ArrayList<Messaging>();

    /**
     * 
     * @return The id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *            The id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return The time
     */
    public Date getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *            The time
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 
     * @return The messaging
     */
    public List<Messaging> getMessaging() {
        return messaging;
    }

    /**
     * 
     * @param messaging
     *            The messaging
     */
    public void setMessaging(List<Messaging> messaging) {
        this.messaging = messaging;
    }

	@Override
	public String toString() {
		return "Entry [id=" + id + ", time=" + time + ", messaging=" + messaging + "]";
	}
}
