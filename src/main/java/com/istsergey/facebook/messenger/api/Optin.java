package com.istsergey.facebook.messenger.api;

public class Optin {
    /**
     *  data-ref parameter that was defined with the entry point
     */
    private String ref;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

	@Override
	public String toString() {
		return "Optin [ref=" + ref + "]";
	} 
}
