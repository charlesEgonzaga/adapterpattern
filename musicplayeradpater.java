package adapterpattern;


    
public class musicplayeradpater implements Remotecontrolfunction {
    private musicplayer Speaker;

    public musicplayeradpater(musicplayer Speaker){
        this.Speaker = Speaker;
    }

    @Override
    public String powerOn() {
        return Speaker.speakerOn();
    }

    @Override
    public String powerOff() {
        return Speaker.speakerOff();
    }

    @Override
    public String pressPlusButton() {
        return Speaker.volumeUp();
    }

    @Override
    public String pressMinusButton() {
        return Speaker.voulumeDown();
    }
}