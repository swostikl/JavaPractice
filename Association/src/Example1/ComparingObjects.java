package Example1;

import java.util.Scanner;

public class ComparingObjects {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println( " Enter input for s1 : ");
        String s1 = sc.nextLine();
        String s2 = "Metropolia";

        // Compare with ==
        //  here it compares the object's memory i.e s1 and s2 which are the different objects so results in false
        if (s1 == s2) {
            System.out.println("s1 == s2 → true");
        } else {
            System.out.println("s1 == s2 → false");
        }

        // Compare with .equals()
        // here it compares the contents of the object resulting true
        if (s1.equals(s2)) {
            System.out.println("s1.equals(s2) → true");
        } else {
            System.out.println("s1.equals(s2) → false");
        }
    }
}