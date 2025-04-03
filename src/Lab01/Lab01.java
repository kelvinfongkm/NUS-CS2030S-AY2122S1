package Lab01;

import Lab01.Level1.Level1;
import Lab01.Level2.Level2;
import Lab01.Level3.Level3;

public class Lab01 {

    static Level1 level1 = new Level1();
    static Level2 level2 = new Level2();
    static Level3 level3 = new Level3();

    public static void main(String[] args) {
        level1();   // Level 1 - Represent a Point
        level2();   // Level 2 - Find the mid-point and angle of line pq
        level3();   // Level 3 - Moving the point
    }

    // Level 1 - Represent a Point
    private static void level1() {
        level1.run();
    }

    // Level 2 - Find the mid-point and angle of line pq
    private static void level2() {
        level2.run();
    }

    // Level 3 - Moving the point
    private static void level3() {
        level3.run();
    }
}
