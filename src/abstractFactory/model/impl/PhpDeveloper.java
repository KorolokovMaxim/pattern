package abstractFactory.model.impl;

import abstractFactory.model.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code");
    }
}
