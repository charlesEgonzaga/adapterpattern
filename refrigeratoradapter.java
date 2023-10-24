package adapterpattern;


public class refrigeratoradapter implements poweroutlet{
   private refrigerator refrigerator;

   public refrigeratoradapter(refrigerator refrigerator){
       this.refrigerator = refrigerator;
   }

   @Override
   public String plugIn() {
       return refrigerator.startCooling();
   }
}