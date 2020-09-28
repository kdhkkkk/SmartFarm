package com.smartfarm.www.data;

import com.google.gson.annotations.SerializedName;

public class EmbeddedResponse {
    @SerializedName("code")
    private int code;

    @SerializedName("userNo")
    private int userNo;

    @SerializedName("Humi")
    private int Humi;

    @SerializedName("Temp")
    private int Temp;

    @SerializedName("automode")
    private int automode;

    @SerializedName("pump")
    private int pump;

    @SerializedName("fan")
    private int fan;

    @SerializedName("led")
    private int led;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public int getHumi() {
        return Humi;
    }

    public void setHumi(int humi) {
        Humi = humi;
    }

    public int getTemp() {
        return Temp;
    }

    public void setTemp(int temp) {
        Temp = temp;
    }

    public int getAutomode() {
        return automode;
    }

    public void setAutomode(int automode) {
        this.automode = automode;
    }

    public int getPump() {
        return pump;
    }

    public void setPump(int pump) {
        this.pump = pump;
    }

    public int getFan() {
        return fan;
    }

    public void setFan(int fan) {
        this.fan = fan;
    }

    public int getLed() {
        return led;
    }

    public void setLed(int led) {
        this.led = led;
    }
}