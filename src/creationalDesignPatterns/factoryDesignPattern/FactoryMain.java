package creationalDesignPatterns.factoryDesignPattern;
// client + context + product
public class FactoryMain {
    public static void main(String[] args) throws Exception {
        Context context;
        String osName = System.getProperty("os.name");
        if(osName.equals("Windows 11")) {
            context = new WindowsContext();
            context.render();
        }
        else if(osName.equals("linux")) {
            context = new LinuxContext();
            context.render();
        }
        else {
            throw new Exception("Error Unknown Operating System");
        }
    }
}
