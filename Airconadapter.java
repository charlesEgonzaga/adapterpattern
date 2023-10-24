package adapterpattern;

import adapterpattern.Aircon.AirCon;

public class Airconadapter implements Remotecontrolfunction {
    private Aircon Aircon;

    public Airconadapter(Aircon Aircon){
        this.Aircon = Aircon;
    }

    @Override
    public String powerOn() {
        return Aircon.turnOn();
    }

    @Override
    public String powerOff() {
        return Aircon.turnOff();
    }

    @Override
    public String pressPlusButton() {
        return Aircon.tempUp();
    }

    @Override
    public String pressMinusButton() {
        return Aircon.tempDown();
    }
}