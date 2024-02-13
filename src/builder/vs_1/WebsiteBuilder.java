package builder.vs_1;

import builder.Website;

public abstract class WebsiteBuilder {

    Website website;

    void createWebsite(){
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebsite(){
        return website;
    }

}
