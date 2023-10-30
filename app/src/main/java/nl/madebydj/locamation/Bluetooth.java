package nl.madebydj.locamation;

public class Bluetooth {
    private Boolean bton;
    private Boolean btoff;

    Bluetooth(Boolean bton, Boolean btoff) {
        this.bton = bton;
        this.btoff = btoff;
    }

    public Boolean getBTon() {
        return bton;
    }

    public void setBTon(Boolean bton) {
        this.bton = bton;
    }

    public Boolean getBToff() {
        return btoff;
    }

    public void setBToff(Boolean btoff) {
        this.btoff = btoff;
    }
}
