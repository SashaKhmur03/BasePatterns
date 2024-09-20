package abstractfactory.website;

import abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer write php code");
    }
}
