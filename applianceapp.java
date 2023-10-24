package adapterpattern;

import commandpattern.musicplayer;

public class applianceapp {

    public static void main(String[] args){

        Tv tv = new Tv();
        Remotecontrolfunction tvRc = new Tvadapter(tv);

        Aircon airCon = new Aircon();
        Remotecontrolfunction airConRc = new Airconadapter(airCon);

        musicplayer speaker = new musicplayer();
        Remotecontrolfunction speakerRc = new musicplayeradpater(speaker);

        laptop laptop = new laptop();
        poweroutlet laptopPo = new laptopadapter(laptop);

        refrigerator refrigerator = new refrigerator();
        poweroutlet refrigeratorPo = new refrigeratoradapter(refrigerator);

        smartphonecharger smartphonecharger = new smartphonecharger();
        poweroutlet smartphoneChargerPo = new smartphoneadapter(smartphonecharger);

        //turn on the appliances
        System.out.println(tvRc.powerOn());
        System.out.println(airConRc.powerOn());
        System.out.println(speakerRc.powerOn());

        System.out.println();

        //press button up
        System.out.println(tvRc.pressPlusButton());
        System.out.println(airConRc.pressPlusButton());
        System.out.println(speakerRc.pressPlusButton());

        System.out.println();

        //plug in to charge
        System.out.println(laptopPo.plugIn());
        System.out.println(refrigeratorPo.plugIn());
        System.out.println(smartphoneChargerPo.plugIn());
    }
}