package geometryProcessor;

public class Circle implements Shape {

    double length;
    double area;
    String colour;
    String name;

    public Circle(double l, String c, String n) {
        length = l;
        colour = c;
        area = Math.PI * (l / 2) * (l / 2);
        name = n;
    }

    public String getShape() {
        return "Circle";
    }

    public String getName() {
        return colour;
    }

    @Override
    public String getColour() {
        return colour;
    }

    //Get the area of this circle
    public double getArea() {
        return area;
    }

    public void setLength(double l) {
        length = l;
        area = Math.PI * (l / 2) * (l / 2);
    }

    public void setColour(String c) {
        colour = c;
    }

    public void setName(String n) {
        name = n;
    }

}
