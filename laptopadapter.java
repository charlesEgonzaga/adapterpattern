package adapterpattern;



public class laptopadapter implements poweroutlet {
    private laptop laptop;

    public laptopadapter(laptop laptop){
        this.laptop = laptop;
    }

    @Override
    public String plugIn() {
        return laptop.charge();
    }
}