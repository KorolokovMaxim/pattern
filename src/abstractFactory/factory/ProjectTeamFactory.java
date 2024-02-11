package abstractFactory.factory;

import abstractFactory.model.Developer;
import abstractFactory.model.ProjectManger;
import abstractFactory.model.Tester;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManger getProjectManager();
}
