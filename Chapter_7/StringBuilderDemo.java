public class StringBuilderDemo {
    public static void main(String[] args) {

        StringBuilder sbA = new StringBuilder("Java");
        StringBuilder sbB = new StringBuilder("Programming");

        System.out.println("sbA: " + sbA + " | capacity: " + sbA.capacity());
        System.out.println("sbB: " + sbB + " | capacity: " + sbB.capacity());
      
        sbA.setLength(8);  
        sbB.setLength(5);  

        System.out.println("\nAfter setLength():");
        System.out.println("sbA: " + sbA + " | length: " + sbA.length());
        System.out.println("sbB: " + sbB + " | length: " + sbB.length());
    }
}
