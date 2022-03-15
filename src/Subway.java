public class Subway extends Vehicle{
    private int carriages;
    private int numOfRepair;
    private int numOfDelays;

    Subway (String name, int wheel, int carriages, int numOfRepair, int numOfDelays) {
        super(name, wheel);
        this.carriages = carriages;
        this.numOfRepair = numOfRepair;
        this.numOfDelays = numOfDelays;
    }

    public int getCarriages(){
        return carriages;
    }
    public int getNumOfRepair(){
        return numOfRepair;
    }
    public int getNumOfDelays(){
        return numOfDelays;
    }
}
