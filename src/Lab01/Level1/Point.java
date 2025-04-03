package Lab01.Level1;

class Point {

    // include the properties of a Point
    double x;
    double y;

    // constructor
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("point (%.3f, %.3f)", x, y);
    }
}
