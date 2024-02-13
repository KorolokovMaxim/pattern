package builder.vs_2;

import builder.Website;

public interface WebsiteBuilder {

    WebsiteBuilder buildName();
    WebsiteBuilder buildCms();
    WebsiteBuilder buildPrice();

    Website build();

}
