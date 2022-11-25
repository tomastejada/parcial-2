public class Square extends Rectangle {
    private double side;

    public Square () {
        super();
        this.setSide(1.0);
    }

    public Square (double side) {
        this.side = side;

    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(this.side);

    }

    @Override
    public void setLength(double side) {
        super.setLength(this.side);
    }

    public String toString() {
        return "Square[side=" + this.side + " " + super.toString() + "}";
    }




}