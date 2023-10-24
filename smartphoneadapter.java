package adapterpattern;

public class smartphoneadapter implements poweroutlet {
    private smartphoneadapter smartphonecharger;

    public smartphoneadapter(smartphoneadapter smartphonecharger){
        this.smartphonecharger = smartphonecharger;
    }
    @Override
    public String plugIn() {
        return smartphonecharger.chargePhone();
    }
}