package factoryMethod.model.impl;

import factoryMethod.model.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes c++ code");
    }
}
