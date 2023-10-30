package nl.madebydj.locamation;

public class Wifi {

    private Boolean wifion;
    private Boolean wifioff;

    Wifi(Boolean wifion, Boolean wifioff) {
        this.wifion = wifion;
        this.wifioff = wifioff;
    }

    public Boolean getWifion() {
        return wifion;
    }

    public void setWifion(Boolean wifion) {
        this.wifion = wifion;
    }

    public Boolean getWifioff() {
        return wifioff;
    }

    public void setWifioff(Boolean wifioff) {
        this.wifioff = wifioff;
    }
}
