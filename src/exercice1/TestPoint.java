package exercice1;

public class TestPoint {
    public static void main(String[] args) {
        // Test with Integer
        Point<Integer> p1 = new Point<>(3, 7);
        System.out.println("Integer Point: " + p1);
        p1.setAbs(10);
        p1.setOrd(20);
        System.out.println("Updated Integer Point: " + p1);

        // Test with Double
        Point<Double> p2 = new Point<>(3.5, 7.8);
        System.out.println("Double Point: " + p2);
        System.out.println("Abs: " + p2.getAbs() + ", Ord: " + p2.getOrd());

        // Test with String
        Point<String> p3 = new Point<>("X", "Y");
        System.out.println("String Point: " + p3);
        p3.setOrd("Z");
        System.out.println("Updated String Point: " + p3);
    }
}
