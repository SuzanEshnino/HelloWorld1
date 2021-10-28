package MyData;

import java.util.Scanner;

public class MyDataresult {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your data");
        MyDatacounting data = new MyDatacounting();
        while (scan.hasNext()) {
            String next=scan.nextLine();
         //   System.out.println(next);
            if(next.contains("stop")){
                data.addLines();
                data.addlength(next);
                data.addWords(next);
                data.checkLongWord(next);
                break;
            }

            data.addLines();
            data.addlength(next);
            data.addWords(next);
            data.checkLongWord(next);


        }

        System.out.println("Number of characters = "+" " + data.getLength());
        System.out.println("Number of lines = "+" " + data.getLines());
        System.out.println("Number of words = "+" " + data.getNumOfWords());
        System.out.println("longest  words = "+" " + data.getLongestWord());
    }
}