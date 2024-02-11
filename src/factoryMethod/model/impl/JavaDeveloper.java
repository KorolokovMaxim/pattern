package factoryMethod.model.impl;

import factoryMethod.model.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java code");
    }
}
