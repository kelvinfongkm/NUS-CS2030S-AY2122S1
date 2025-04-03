package Lab01.Level4;

class Point {

    // include the properties of a Point
    double x;
    double y;

    // constructor
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point midPoint(Point q) {
        double newX = (x + q.x) / 2;
        double newY = (y + q.y) / 2;

        return new Point(newX, newY);
    }

    double angleTo(Point q) {
        double newX = q.x - x;
        double newY = q.y - y;

        return Math.atan2(newY, newX);
    }

    Point moveTo(double angle, double distance) {
        double newX = x + distance * Math.cos(angle);
        double newY = y + distance * Math.sin(angle);

        return new Point(newX, newY);
    }

    @Override
    public String toString() {
        return String.format("point (%.3f, %.3f)", x, y);
    }
}

