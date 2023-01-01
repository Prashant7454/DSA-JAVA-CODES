/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1;i<=t;i++){
            String s = sc.next();
            s = s.toLowerCase();
            switch (s) {
                case "b" -> System.out.println("BattleShip");
                case "c" -> System.out.println("Cruiser");
                case "d" -> System.out.println("Destroyer");
                case "f" -> System.out.println("Frigate");
                default -> {
                    break;
                }
            }

        }
    }
}
