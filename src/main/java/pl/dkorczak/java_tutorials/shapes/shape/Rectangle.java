package pl.dkorczak.java_tutorials.shapes.shape;

public class Rectangle extends Shape {

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double countArea() {
        return sideA * sideB;
    }

    public double countCircuit() {
        return 2 * sideA + 2 * sideB;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[sideA=%d, sideB=%d, area=%.2f, circuit=%.2f]",
                sideA,
                sideB,
                countArea(),
                countCircuit());
    }
}
