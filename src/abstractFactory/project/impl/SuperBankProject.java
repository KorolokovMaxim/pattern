package abstractFactory.project.impl;

import abstractFactory.factory.impl.BankingTeamFactory;
import abstractFactory.factory.ProjectTeamFactory;
import abstractFactory.model.Developer;
import abstractFactory.model.ProjectManger;
import abstractFactory.model.Tester;
import abstractFactory.project.Project;

public class SuperBankProject implements Project {
    @Override
    public void creatProject() {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManger projectManger = projectTeamFactory.getProjectManager();

        System.out.println("creating bank system");
        developer.writeCode();
        tester.testCode();
        projectManger.manageProject();
    }
}
