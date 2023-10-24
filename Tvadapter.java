package adapterpattern;

public class Tvadapter implements  Remotecontrolfunction {
    private Tv tv;

    public Tvadapter(Tv tv){
        this.tv = tv;
    }


    @Override
    public String powerOn() {
        return tv.switchOn();
    }

    @Override
    public String powerOff() {
        return tv.switchOff();
    }

    @Override
    public String pressPlusButton() {
        return tv.changeChannelUp();
    }

    @Override
    public String pressMinusButton() {
        return tv.changeChannelDown();
    }
}