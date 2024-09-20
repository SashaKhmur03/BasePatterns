package factory;

public class ChemistFactory implements StudentFactory{
    @Override
    public Student createStudent() {
        return new Chemist();
    }
}
