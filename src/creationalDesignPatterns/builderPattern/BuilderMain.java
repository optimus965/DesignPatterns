package creationalDesignPatterns.builderPattern;

public class BuilderMain {
    public static void main(String[] args) {
        House house = new WoodenHouseBuilder().buildDoors().getResult();
        HttpRequest httpRequest = new HttpRequest.Builder("http://google.com").addMethod("get").body("getAllTheData").build();
        System.out.println(httpRequest);
    }

}
