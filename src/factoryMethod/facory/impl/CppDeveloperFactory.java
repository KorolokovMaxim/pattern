package factoryMethod.facory.impl;

import factoryMethod.facory.DeveloperFactory;
import factoryMethod.model.impl.CppDeveloper;
import factoryMethod.model.Developer;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
