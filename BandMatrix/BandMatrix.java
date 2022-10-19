public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int distance = 0;
        int diagonal = 0;

        for (int row = 0; row < n; row++) {
        
            diagonal = row;

            for (int col = 0; col < n; col++) {
                
                distance = col - diagonal;

                if (Math.abs(distance) > width)
                    System.out.print("0 ");
                else
                    System.out.print("* ");

                //System.out.println(distance);

            }
            
            System.out.println("");

        }
        
    }
}
