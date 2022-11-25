public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.setColor("red");
        this.setFilled(true);
    }

    public Shape(String color, boolean filled) {
        super();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape [color=" + this.color + ", filled=" + this.filled + "]";
    }

}