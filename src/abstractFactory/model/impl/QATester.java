package abstractFactory.model.impl;

import abstractFactory.model.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA Tester tests banking code");
    }
}
