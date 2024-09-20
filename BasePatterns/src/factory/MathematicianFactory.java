package factory;

public class MathematicianFactory implements StudentFactory{
    @Override
    public Student createStudent() {
        return new Mathematician();
    }
}
