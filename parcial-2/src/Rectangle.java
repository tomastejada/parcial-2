public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.setWidth(1.0);
        this.setLength(1.0);
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        double area = width*length;
        System.out.println("El área es de: " + area);
        return  area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2*(width+length);
        System.out.println("El perímetro es de: " + perimeter);
        return perimeter;
    }

    public String toString() {
        return "Rectangle [width=" + this.width + ", length=" + this.length + " " + super.toString() + "]";
    }


}
