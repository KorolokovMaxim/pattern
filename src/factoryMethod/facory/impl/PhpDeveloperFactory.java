package factoryMethod.facory.impl;

import factoryMethod.facory.DeveloperFactory;
import factoryMethod.model.Developer;
import factoryMethod.model.impl.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
