package Lab01.Level4;

class Circle {

    Point centre;
    double radius;

    Circle(Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("circle of radius %.1f centered at %s", radius, centre);
    }
}

