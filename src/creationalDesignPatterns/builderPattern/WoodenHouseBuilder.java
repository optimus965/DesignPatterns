package creationalDesignPatterns.builderPattern;

public class WoodenHouseBuilder implements HouseBuilder{
    private House house;
    public WoodenHouseBuilder() {
        house = new House();
    }
    @Override
    public HouseBuilder buildFloor() {
        System.out.println("building floor with wood");
        house.setFloor(true);
        return this;
    }

    @Override
    public HouseBuilder buildWalls() {
        System.out.println("building floor with wood");
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        System.out.println("building floor with wood");
        return this;
    }

    @Override
    public HouseBuilder buildDoors() {
        house.setDoors(true);
        System.out.println("building floor with wood");
        return this;
    }

    @Override
    public House getResult() {
        System.out.println("building floor with wood");
        return house;
    }
}
