package com.btrtm.ngue.sgsdm.domaine;

public abstract class HotelInformation {
    private String uniqueId;
    private String timeStamp ;

    private int hotelCode ;

    private String channelCode ;

    private int chainCode ;

    private String brandCode ;

    public HotelInformation() {
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }


    public int getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(int hotelCode) {
        this.hotelCode = hotelCode;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public void setChainCode(int chainCode) {
        this.chainCode = chainCode;
    }

    public int getChainCode() {
        return chainCode;
    }


    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }
}
