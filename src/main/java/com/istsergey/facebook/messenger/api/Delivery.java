package com.istsergey.facebook.messenger.api;

import java.util.ArrayList;
import java.util.List;

public class Delivery {
    /**
     *  List containing message IDs of messages that were delivered. Field may not be present.
     */
    private List<String> mids = new ArrayList<String>();
    /**
     *  All messages that were sent before this timestamp were delivered
     */
    private Long watermark;
    /**
     *  Sequence number
     */
    private Integer seq;
    
    public List<String> getMids() {
        return mids;
    }
    public void setMids(List<String> mids) {
        this.mids = mids;
    }
    public Long getWatermark() {
        return watermark;
    }
    public void setWatermark(Long watermark) {
        this.watermark = watermark;
    }
    public Integer getSeq() {
        return seq;
    }
    public void setSeq(Integer seq) {
        this.seq = seq;
    }
	@Override
	public String toString() {
		return "Delivery [mids=" + mids + ", watermark=" + watermark + ", seq=" + seq + "]";
	}
}
