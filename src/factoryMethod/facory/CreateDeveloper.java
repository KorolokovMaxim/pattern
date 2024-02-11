package factoryMethod.facory;

import factoryMethod.facory.impl.CppDeveloperFactory;
import factoryMethod.facory.impl.JavaDeveloperFactory;
import factoryMethod.facory.impl.PhpDeveloperFactory;

import java.util.Locale;

public class CreateDeveloper {

    public static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        return switch (speciality.toLowerCase()) {
            case "java" -> new JavaDeveloperFactory();
            case "c++" -> new CppDeveloperFactory();
            case "php" -> new PhpDeveloperFactory();
            default -> throw new RuntimeException(speciality + " is unknown speciality");
        };
    }
}
