package creationalDesignPatterns.builderPattern;
// this is one way of building the object
public interface HouseBuilder {
    HouseBuilder buildFloor();
    HouseBuilder buildWalls();
    HouseBuilder buildRoof();
    HouseBuilder buildDoors();
    House getResult();
}
