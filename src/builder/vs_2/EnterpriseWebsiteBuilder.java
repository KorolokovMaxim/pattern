package builder.vs_2;

import builder.Cms;
import builder.Website;

public class EnterpriseWebsiteBuilder implements WebsiteBuilder{

    private String name;
    private Cms cms;
    private int price;
    @Override
    public WebsiteBuilder buildName() {
        this.name = "Enterprise website";
        return this;
    }

    @Override
    public WebsiteBuilder buildCms() {
        this.cms = Cms.ALIFRESCO;
        return this;
    }

    @Override
    public WebsiteBuilder buildPrice() {
        this.price = 10000;
        return this;
    }

    @Override
    public Website build() {
        return new Website(name,cms,price);
    }
}
