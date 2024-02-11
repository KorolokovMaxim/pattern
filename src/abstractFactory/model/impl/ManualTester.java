package abstractFactory.model.impl;

import abstractFactory.model.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester test website");
    }
}
