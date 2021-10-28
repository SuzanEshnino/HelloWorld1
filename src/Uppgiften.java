import java.util.Scanner;

public class Uppgiften {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       System.out.println("Enter your data");
       UppgiftenFunktioner d = new UppgiftenFunktioner();

       while (scan.hasNext()) {
            String data = scan.nextLine();
           d.setInfo(data);
          String info=d.getInfo();
          if(info.equals("stop"))
                break;
            System.out.println(info);

           }

       System.out.println("Number of lines = " + " " + d.getCount());
       System.out.println("Number of characters= " + " " + d.getLength());
       System.out.println("Number of words = " + " " + d.getNumOfWords());
        System.out.println("The longest word is " + " " + d.getLongWord());
        }



    }

