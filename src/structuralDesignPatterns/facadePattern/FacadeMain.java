package structuralDesignPatterns.facadePattern;

public class FacadeMain {
    public static void main(String[] args) {
        BuildAndDeployFacade buildAndDeployFacade = new BuildAndDeployFacade();
        buildAndDeployFacade.buildAndDeploy("http://github.com/optimus965");
    }

}
