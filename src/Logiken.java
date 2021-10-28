import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Logiken {


    public void RänknaData(){

        // Ta in data från användare
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your data");

        String input = "";
        int NumberOfRows = 0;
        String inputStop = "";
        ArrayList<String> list = new ArrayList<String>();
        while (true){
            input = scan.nextLine();

            // om data innehåller ordet stop gör break
            if (input.contains("stop"))
            {
                inputStop = input;
                break;
            }

            list.add(input);

        }

        // Räkna all linjer utom den som innehåller
        System.out.println("Antal rader = " + list.size());

        // Räkna alla ord om innehåller alla ord förutom ordet stop
        String stringList = list.toString();
        String[] splitstring = stringList.split(" ");
        String[] splitinputStop = inputStop.split(" ");
        System.out.println("Number of words = " + (splitstring.length + splitinputStop.length - 1));

//        String longest = ArrayList(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
    }
        // Printa längsta ord



    }
