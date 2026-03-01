package exercice1;

public class TestPoint {
    public static void main(String[] args) {
    	
        // Test with Integer
        Point<Integer> p1 = new Point<>(3, 7);
        System.out.println("Integer Point: " + p1);
        p1.setAbs(10);
        p1.setOrd(20);
        System.out.println("Updated Integer Point: " + p1);
        Point<Integer> p4 = new Point<>(2,3); 

        // Test with Double
        Point<Double> p2 = new Point<>(3.5, 7.8);
        System.out.println("Double Point: " + p2);
        System.out.println("Abs: " + p2.getAbs() + ", Ord: " + p2.getOrd());

        // Test with String
        Point<String> p3 = new Point<>("X", "Y");
        System.out.println("String Point: " + p3);
        p3.setOrd("Z");
        System.out.println("Updated String Point: " + p3);
        
     // Test Step 3: PointColoréNG
        System.out.println("\n--- Step 3: PointColoréNG ---");
        PointColoréNG pcng1 = new PointColoréNG(5, 15, "rouge");
        System.out.println("pcng1: " + pcng1);

        // Test getters and setters
        System.out.println("Couleur de pcng1: " + pcng1.getCouleur());
        pcng1.setCouleur("bleu");
        System.out.println("Après changement: " + pcng1);
        
        //Test : PointColoréNG 
        System.out.println("\n--- PointColoré<Integer,String>---"); 
        PointColoré<Integer,String> pc1 = new PointColoré<>(30,10,"jaune"); 
        System.out.println("pc1"+pc1); 
        
        pc1.setAbs(40);
        pc1.setOrd(60);
        pc1.setCouleur("violet");
        
        System.out.println("pc1 aprés changments : " + pc1); 
        
     // Step 7b: PointColoré with Double coordinates and CouleurRVB color
        
        System.out.println("\n--- Step 7b: PointColoré<Double, CouleurRVB> ---");
        CouleurRVB orange = new CouleurRVB(255,165,0); 
        PointColoré<Double, CouleurRVB> pc2 = new PointColoré<>(3.14, 2.71, orange);
        
        System.out.println("pc2:" + pc2); 
        
        System.out.println("Coordonnées: (" + pc2.getAbs() + ", " + pc2.getOrd() + ")");
        System.out.println("Couleur RVB: " + pc2.getCouleur());
        System.out.println("Composante rouge: " + pc2.getCouleur().getRouge()); 
        
        Point<Integer> p11 = new Point<>(30,40); 
        
        
        Cercle<Point> c1 = new Cercle(50,p11);  
        
        System.out.println("c1:"+c1); 
        
        System.out.println("\n--- Step 11: CercleAvecRestriction avec p2 ---");
        Point<Double> p22 = new Point<>(3.14,2.71); 
        CercleAvecRestriction<Point<Double>> car1 = new CercleAvecRestriction(100,p2); 
        System.out.println("car1 :" + car1); 
        
        System.out.println("\n--- Step 12: CercleAvecRestriction avec pc2 ---");
        CouleurRVB bleu = new CouleurRVB(0, 0, 255);
        PointColoré<Double, CouleurRVB> pc22 = new PointColoré<>(5.5, 7.8, bleu);
        CercleAvecRestriction<PointColoré<Double, CouleurRVB>> car2 = 
            new CercleAvecRestriction<>(30, pc22);
        System.out.println("car2: " + car2);
        
        
    }
}
