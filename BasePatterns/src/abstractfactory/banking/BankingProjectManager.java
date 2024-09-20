package abstractfactory.banking;

import abstractfactory.ProjectManager;

public class BankingProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking Project Manager manages banking project");
    }
}
