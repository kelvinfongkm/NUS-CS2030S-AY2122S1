class Circle {
    private final Point centre;
    private final double radius;

    Circle(Point p, double r) {
        this.centre = p;
        this.radius = r;
    }

    Circle createUnitCircle(Point p, Point q) {
        Point m = p.midPoint(q);
        double theta = p.angleTo(q) + (Math.PI / 2.0);
        double pm = p.distanceTo(m);
        double d = Math.sqrt(1 - pm * pm);
        return new Circle(m.moveTo(theta, d), 1.0);
    }

    boolean contains(Point p) {
        double d = this.centre.distanceTo(p);
        return d <= this.radius;
    }

    int containedPoints(Point[] p) {
        double d;
        int amount = 0;
        for (int i = 0; i < p.length; i++) {
            d = this.centre.distanceTo(p[i]);
            if (d <= this.radius) {
                amount++;
            }
        }
        return amount;
    }

    @Override
    public String toString() {
        return String.format("circle of radius %s centered at %s",
            this.radius, this.centre.toString());
    }
}