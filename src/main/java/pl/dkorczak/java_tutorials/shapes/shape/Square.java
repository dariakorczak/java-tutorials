package pl.dkorczak.java_tutorials.shapes.shape;

public class Square extends Shape{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public double countArea() {
        return Math.pow(side, 2);
    }

    public double countCircuit() {
        return 4 * side;
    }

    public String toString() {
        return String.format("Square[side=%d, area=%.2f, circuit=%.2f]",
                side,
                countArea(),
                countCircuit());
    }
}
