package builder.vs_2;

import builder.Website;

public class Director {
    private final WebsiteBuilder websiteBuilder;

    public Director(WebsiteBuilder websiteBuilder) {
        super();
        this.websiteBuilder = websiteBuilder;
        if (this.websiteBuilder == null)
            throw new IllegalArgumentException("Director don't work without WebsiteBuilder");
    }

    public Website createWebsite() {
        return websiteBuilder.buildName().buildCms().buildPrice().build();
    }
}
