Circle createUnitCircle(Point p, Point q) {
    Point m = p.midPoint(q);
    double theta = p.angleTo(q) + (Math.PI / 2.0);
    double pm = p.distanceTo(m);
    double d = Math.sqrt(1 - pm * pm);
    return new Circle(m.moveTo(theta, d), 1.0);
}

int findMaxDiscCoverage(Point[] points) {
    int maxDiscCoverage = 0;
    int temp;

    for (int i = 0; i < points.length - 1; i++) {
        for (int j = i + 1; j < points.length; j++) {
            Circle circle = createUnitCircle(points[i], points[j]);
            temp = circle.containedPoints(points);
            if (temp>maxDiscCoverage) {
                maxDiscCoverage = temp;
            }
        }
    }

    return maxDiscCoverage;
}