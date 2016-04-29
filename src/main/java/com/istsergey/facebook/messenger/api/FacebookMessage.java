package com.istsergey.facebook.messenger.api;

import java.util.ArrayList;
import java.util.List;

public class FacebookMessage {
    /**
     *   Value will be page
     */
    private String object;
    /**
     *  List containing event data
     */
    private List<Entry> entry = new ArrayList<Entry>();

    /**
     * 
     * @return
     *     The object
     */
    public String getObject() {
        return object;
    }

    /**
     * 
     * @param object
     *     The object
     */
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * 
     * @return
     *     The entry
     */
    public List<Entry> getEntry() {
        return entry;
    }

    /**
     * 
     * @param entry
     *     The entry
     */
    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }

	@Override
	public String toString() {
		return "FacebookMessage [object=" + object + ", entry=" + entry + "]";
	}
    
    
}
