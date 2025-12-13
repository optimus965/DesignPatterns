package creationalDesignPatterns.builderPattern;

public class House {
    private boolean floor;
    private boolean walls;
    private boolean roof;
    private boolean doors;
    public void setFloor(boolean value) {
        System.out.println("in the roof");
        if(value) {
            System.out.println("Setting the floor");
        }
        else {
            System.out.println("this house don't have floor");
        }
    }
    public void setWalls(boolean value) {
        if(value) {
            System.out.println("Setting the walls");
        }
        else {
            System.out.println("this house don't have walls");
        }
    }
    public void setRoof(boolean value) {
        if(value) {
            System.out.println("Setting the roof");
        }
        else {
            System.out.println("this house don't have roof");
        }
    }
    public void setDoors(boolean value) {
        if(value) {
            System.out.println("Setting the Doors");
        }
        else {
            System.out.println("this house don't have Doors");
        }
    }



}
