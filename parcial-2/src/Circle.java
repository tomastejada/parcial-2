public class Circle extends Shape{
    protected double radious;

    public Circle() {
        super();
        this.setRadious(1.0);
    }

    public Circle(double radious){
        this.radious = radious;

    }

    public Circle(String color, boolean filled, double radious) {
        super(color, filled);
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    @Override
    public double getArea() {
        double area = radious*radious*Math.PI;
        System.out.println("El área del circulo es de: " + area);
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2*radious*Math.PI;
        System.out.println("El perímetro del círculo es de: "+ perimeter);
        return perimeter;
    }

    public String toString() {
        return "Circle [radius=" + this.radious + " " + super.toString() + "]";
    }




}