package factoryMethod;

import factoryMethod.facory.CreateDeveloper;
import factoryMethod.facory.DeveloperFactory;
import factoryMethod.model.Developer;

public class Program {
    public static void main(String[] args) {
        String speciality = "c++";
        DeveloperFactory developerFactory = CreateDeveloper.createDeveloperBySpeciality(speciality);
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }
}
