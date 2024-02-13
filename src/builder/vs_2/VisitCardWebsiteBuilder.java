package builder.vs_2;

import builder.Cms;
import builder.Website;

public class VisitCardWebsiteBuilder implements WebsiteBuilder {
    String name;
    Cms cms;
    int price;
    @Override
    public WebsiteBuilder buildName() {
        this.name = "Visit card";
        return this;
    }

    @Override
    public WebsiteBuilder buildCms() {
        this.cms = Cms.WORDPERSS;
        return this;
    }

    @Override
    public WebsiteBuilder buildPrice() {
        this.price = 500;
        return this;
    }

    @Override
    public Website build() {
        return new Website(name , cms, price);
    }
}
