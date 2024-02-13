package builder.vs_2;

import builder.Website;

import java.util.Objects;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        WebsiteBuilder builder = new VisitCardWebsiteBuilder();
        Director director = new Director(builder);
        Website website = director.createWebsite();
        if(Objects.nonNull(website)){
            System.out.println(website);
        }
    }
}
