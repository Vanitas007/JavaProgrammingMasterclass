package s6_OOP1_ClassesConstructorsInheritance.Exercise;

public class e035_ComplexOperations {

    private double real;
    private double imaginary;

    public e035_ComplexOperations(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(e035_ComplexOperations complexNumber) {
        add(complexNumber.getReal(), complexNumber.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(e035_ComplexOperations complexNumber) {
        subtract(complexNumber.getReal(), complexNumber.getImaginary());
    }
}
