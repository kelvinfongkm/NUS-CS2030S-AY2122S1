package Lab01.Level5;

import java.util.Arrays;

public class Level5 {

    public void run() {
        System.out.println("\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Level 5 - Maximum Disc Coverage\n");

        System.out.println("Point[] points = new Point[]{new Point(0, 0), new Point(1, 0)}");
        Point[] points = new Point[]{new Point(0, 0), new Point(1, 0)};
        System.out.println("points ==> " + Arrays.toString(points));

        System.out.println("\nfindMaxDiscCoverage(points)");
        System.out.println("==> " + findMaxDiscCoverage(points));

        System.out.println("\npoints = new Point[]{new Point(0, -1), new Point(1, 0), new Point(0, 1), new Point(-1, 0)}");
        points = new Point[]{new Point(0, -1), new Point(1, 0), new Point(0, 1), new Point(-1, 0)};
        System.out.println("points ==> " + Arrays.toString(points));

        System.out.println("\nfindMaxDiscCoverage(points)");
        System.out.println("==> " + findMaxDiscCoverage(points));
        System.out.println("\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    Circle createUnitCircle(Point p, Point q) {
        Point m = p.midPoint(q);
        double dx = p.x - m.x;
        double dy = p.y - m.y;
        double pm = Math.sqrt(dx * dx + dy * dy);
        double d = Math.sqrt(1 - pm * pm);
        double theta = p.angleTo(q) + (Math.PI / 2);
        return new Circle(m.moveTo(theta, d), 1);
    }

    int findMaxDiscCoverage(Point[] points) {
        int maxDiscCoverage = 0;

        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                Circle circle = createUnitCircle(points[i], points[j]);

                int coverage = 0;
                for (Point point : points) {
                    double dx = circle.centre.x - point.x;
                    double dy = circle.centre.y - point.y;
                    double dist = Math.sqrt(dx * dx + dy * dy);
                    if (dist <= circle.radius) coverage++;
                }

                if (maxDiscCoverage < coverage) maxDiscCoverage = coverage;
            }
        }
        
        return maxDiscCoverage;
    }
}
