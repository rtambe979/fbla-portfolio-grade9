public class Birthday {
    public static void main(String[] args){
        int n = 365;
        int trials = 1000;

        Boolean[] birthdays = new Boolean[n];

        for (int t = 0 ; t < trials ; t++) {
            for (int i=0 ; i< 400 ; i++) {
                // assign a random birthday for person i
                int min = 0;
                int max = n-1;
                int i_bday = (int) ((Math.random() * (max - min)) + min);

                //check if i_bday exist in the birthday array
                if (birthdays[i_bday] == true) {
                    //birthday exists
                    System.out.println("birthday found! People in room = " + i);
                    break;
                } 
                else {
                    birthdays[i_bday] = true;
                }
            }
        }

    }
}
