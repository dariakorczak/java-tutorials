package pl.dkorczak.java_tutorials.shapes.shape;

public class Triangle extends Shape {

    private int sideA;
    private int sideB;
    private int sideC;
    private int height;

    public Triangle(int sideA, int sideB, int sideC, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public double countArea() {
        return 0.5 * sideA * height;
    }

    public double countCircuit() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return String.format("Triangle[sideA=%d, sideB=%d, sideC=%d, height=%d area=%.2f, circuit=%.2f]",
                sideA,
                sideB,
                sideC,
                height,
                countArea(),
                countCircuit());
    }
}
