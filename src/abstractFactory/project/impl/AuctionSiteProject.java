package abstractFactory.project.impl;

import abstractFactory.factory.ProjectTeamFactory;
import abstractFactory.factory.impl.WebsiteTeamFactory;
import abstractFactory.model.Developer;
import abstractFactory.model.ProjectManger;
import abstractFactory.model.Tester;
import abstractFactory.project.Project;

public class AuctionSiteProject implements Project {
    @Override
    public void creatProject() {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManger projectManger = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction website...");
        developer.writeCode();
        tester.testCode();
        projectManger.manageProject();
    }
}
