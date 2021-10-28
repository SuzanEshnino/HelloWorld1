import java.util.Scanner;

public class Usertals {


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter hue många tal");
        int i=Integer.parseInt(sc.nextLine());
        System.out.println(i);
        int number=0;
       for (int y=0; y<i; y++)
       {
            System.out.println("Skriv talet");
           // System.out.println(sc.nextLine());
           int x=Integer.parseInt(sc.nextLine());
            number=number+x;

            }
       System.out.println(number);
        }

       //System.out.println("Summan blir" + i);
    }



