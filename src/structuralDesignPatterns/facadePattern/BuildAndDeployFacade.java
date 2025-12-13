package structuralDesignPatterns.facadePattern;

public class BuildAndDeployFacade {
    GitService gitService;
    CompilerService compilerService;
    TestRunnerService testRunnerService;
    DockerService dockerService;
    DeploymentService deploymentService;
    public BuildAndDeployFacade() {
        this.gitService = new GitService();
        this.deploymentService = new DeploymentService();
        this.testRunnerService = new TestRunnerService();
        this.compilerService = new CompilerService();
        this.dockerService = new DockerService();
    }

    public void buildAndDeploy(String repo) {
        gitService.cloneRepo(repo);
        compilerService.compileCode();
        testRunnerService.runTests();
        dockerService.buildImage();
        deploymentService.deploy();
    }
}
