package factoryMethod.facory.impl;

import factoryMethod.facory.DeveloperFactory;
import factoryMethod.model.Developer;
import factoryMethod.model.impl.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
