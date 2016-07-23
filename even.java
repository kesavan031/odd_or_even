package checknumber;

import java.util.Scanner;

public class ODD_0R_EVEN {

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        n = s.nextInt();
        if (n %2== 0) {
            System.out.println("THE NUMBER IS EVEN");  
    }
     else
        {
                        System.out.println("THE NUMBER IS ODD");  
    }

    }
}
