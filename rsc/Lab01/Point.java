class Point {
    private final double x;
    private final double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point midPoint(Point q) {
        double x = (this.x + q.x) / 2.0;
        double y = (this.y + q.y) / 2.0;
        return new Point(x, y);
    }

    double angleTo(Point q) {
        double x = q.x - this.x;
        double y = q.y - this.y;
        return Math.atan2(y, x);
    }

    double distanceTo(Point p) {
        double x = this.x - p.x;
        double y = this.y - p.y;
        return Math.sqrt(x * x + y * y);
    }

    Point moveTo(double theta, double d) {
        double x = this.x + d * Math.cos(theta);
        double y = this.y + d * Math.sin(theta);
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return String.format("point (%.3f, %.3f)", this.x, this.y);
    }
}