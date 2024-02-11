package abstractFactory.project;

import abstractFactory.project.Project;
import abstractFactory.project.impl.AuctionSiteProject;
import abstractFactory.project.impl.SuperBankProject;

public class CreateProjectTeam {
    public static Project createProjectTeamBySpeciality(String speciality) {
        return switch (speciality.toLowerCase()) {
            case "auctionsite" -> new AuctionSiteProject();
            case "superbank" -> new SuperBankProject();
            default -> throw new RuntimeException(speciality + " is unknown speciality");
        };
    }
}
