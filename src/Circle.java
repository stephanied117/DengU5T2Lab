public class Circle {
    public double radius;

    public Circle(double myRadius) {
        radius = myRadius;
    }

    public void setRadius(int newRadius) {
        radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public double diameter() {
        return radius * 2;
    }

    public double perimeter(){
        return Math.PI * diameter();
    }

    public String circInfo() {
        return "Circle with a radius of " + radius;
    }
}

