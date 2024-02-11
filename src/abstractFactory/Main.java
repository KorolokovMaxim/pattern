package abstractFactory;

import abstractFactory.project.CreateProjectTeam;
import abstractFactory.project.Project;

public class Main {
    public static void main(String[] args) {
        Project auctionSiteProject = CreateProjectTeam.createProjectTeamBySpeciality("superbank");
        auctionSiteProject.creatProject();
    }
}
