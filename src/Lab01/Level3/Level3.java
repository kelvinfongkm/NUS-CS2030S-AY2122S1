package Lab01.Level3;

public class Level3 {

    public void run() {
        System.out.println("\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("Level 3 - Moving the point\n");

        System.out.println("Point p = new Point(0.0, 0.0)");
        Point p = new Point(0.0, 0.0);
        System.out.println("p ==> " + p);

        System.out.println("\np.moveTo(Math.PI / 2, 1.0)");
        System.out.println("==> " + p.moveTo(Math.PI / 2, 1.0));

        System.out.println("\np");
        System.out.println("p ==> " + p);
        System.out.println("\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
}
