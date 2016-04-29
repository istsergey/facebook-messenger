package com.istsergey.facebook.messenger.api;

public class Sender {
    /**
     *  PSID of the user
     */
    private Long id;

    /**
     * 
     * @return
     *     The id
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Long id) {
        this.id = id;
    }

	@Override
	public String toString() {
		return "Sender [id=" + id + "]";
	}
}
