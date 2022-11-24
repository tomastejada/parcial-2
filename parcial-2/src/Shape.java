public class Shape {
    public String color="red";
    public boolean filled=true;

    Shape () {

    }

    Shape(String color, boolean filled) {
        this.setColor(color);
        this.setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled () {
        return filled;
    }

    public void setFilled (boolean filled){
        this.filled = filled;
    }




}
