package abstractfactory.website;

import abstractfactory.ProjectManager;

public class WebsiteProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website Project Manager manages website project");
    }
}
