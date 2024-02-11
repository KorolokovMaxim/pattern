package abstractFactory.factory.impl;

import abstractFactory.model.Developer;
import abstractFactory.model.ProjectManger;
import abstractFactory.factory.ProjectTeamFactory;
import abstractFactory.model.Tester;
import abstractFactory.model.impl.BankingPM;
import abstractFactory.model.impl.JavaDeveloper;
import abstractFactory.model.impl.QATester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManger getProjectManager() {
        return new BankingPM();
    }
}
