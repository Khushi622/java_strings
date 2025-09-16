public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius + "\nArea: " + getArea() + "\nCircumference: " + getCircumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.display();
    }
}
