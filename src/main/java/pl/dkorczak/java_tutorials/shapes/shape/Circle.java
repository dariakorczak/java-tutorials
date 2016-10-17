package pl.dkorczak.java_tutorials.shapes.shape;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double countArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public double countCircuit() {
        return 2 * Math.PI * radius;
}

    @Override
    public String toString() {
        return String.format("Circle[radius=%d, area=%.2f, circuit=%.2f]",
                radius,
                countArea(),
                countCircuit());
    }

}