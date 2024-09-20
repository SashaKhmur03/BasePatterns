package abstractfactory;

import abstractfactory.website.WebsiteTeamFactory;

public class CarSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating Car Site Project");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
