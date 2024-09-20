package abstractfactory;

import abstractfactory.banking.BankingTeamFactory;

public class SuperSystemBank {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating Super System Bank");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
