package abstractFactory.factory.impl;

import abstractFactory.model.Developer;
import abstractFactory.model.ProjectManger;
import abstractFactory.factory.ProjectTeamFactory;
import abstractFactory.model.Tester;
import abstractFactory.model.impl.ManualTester;
import abstractFactory.model.impl.PhpDeveloper;
import abstractFactory.model.impl.WebsitePM;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new WebsitePM();
    }
}
