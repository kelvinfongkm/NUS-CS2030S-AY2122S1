package Lab01.Level2;

public class Level2 {

    public void run() {
        System.out.println("\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Level 2 - Find the mid-point and angle of line pq\n");

        System.out.println("new Point(0.0, 0.0).midPoint(new Point(1.0, 1.0))");
        System.out.println("==> " + new Point(0.0, 0.0).midPoint(new Point(1.0, 1.0)));

        System.out.println("\nnew Point(0.0, 0.0).angleTo(new Point(1.0, 1.0))");
        System.out.println("==> " + new Point(0.0, 0.0).angleTo(new Point(1.0, 1.0)));

        System.out.println("\nnew Point(0, 0).angleTo(new Point(-1, -1))");
        System.out.println("==> " + new Point(0, 0).angleTo(new Point(-1, -1)));

        System.out.println("\nPoint p = new Point(1, 1)");
        Point p = new Point(1, 1);
        System.out.println("p ==> " + p);

        System.out.println("\np.midPoint(new Point(2,2))");
        System.out.println("==> " + p.midPoint(new Point(2,2)));

        System.out.println("\np");
        System.out.println("p ==> " + p);
        System.out.println("\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
}
