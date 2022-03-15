public class Bicycle extends Vehicle{
    private int gearCount;

    public Bicycle(String name, int wheel, int gearCount) {
        super(name, wheel);
        this.gearCount = gearCount;

    }

    public int getGearCount() {
        return gearCount;
    }

    public void ringBell() {
        System.out.println("You have ring the bell, get out of the way !");
    }

}
