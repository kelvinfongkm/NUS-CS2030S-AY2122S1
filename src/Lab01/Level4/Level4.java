package Lab01.Level4;

public class Level4 {

    public void run() {
        System.out.println("\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Level 4 - Creating the Circle\n");

        System.out.println("new Circle(new Point(0.0, 0.0), 1.0)");
        System.out.println("==> " + new Circle(new Point(0.0, 0.0), 1.0));

        System.out.println("\nnew Circle(new Point(1, 1), 2)");
        System.out.println("==> " + new Circle(new Point(1, 1), 2));

        System.out.println("\ncreateUnitCircle(new Point(0, 0), new Point(1, 0))");
        System.out.println("==> " + createUnitCircle(new Point(0, 0), new Point(1, 0)));

        System.out.println("\ncreateUnitCircle(new Point(0, 0), new Point(2, 0))");
        System.out.println("==> " + createUnitCircle(new Point(0, 0), new Point(2, 0)));
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
}
