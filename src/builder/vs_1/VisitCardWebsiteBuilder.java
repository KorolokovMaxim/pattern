package builder.vs_1;

import builder.Cms;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPERSS);
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
