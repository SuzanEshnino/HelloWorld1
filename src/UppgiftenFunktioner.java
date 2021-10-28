import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SplittableRandom;

public class UppgiftenFunktioner {

    private String information;
    private int count = 0;
    private int length = 0;
    private int numOfWords = 0;
    private String longWord;
    private String listOfWords[];
    private int L = 1;
    private String checkWordStop[];
    private String[] checkWithoutStop;
    private String[] stringSplit;
    ArrayList<Integer> words = new ArrayList<Integer>();
    ArrayList<String> words2= new ArrayList<String>();


    public UppgiftenFunktioner() {

    }

    public void setInfo(String data) {

        information = data;
        checkData(information);
        checkLength(information);
        //checkWords(information);
        checkLongWord(information);

    }

    public String getInfo() {

        return information;
    }

    public void checkData(String data) {
        information = data;
        if (information.contains("stop")) {
            information = "stop";
        } else {
            count += 1;
        }
    }



    public void checkLength(String data) {
        information = data;

         stringSplit = information.split(" ");

             for (int i = 0; i < stringSplit.length; i++) {
                 words2.add(stringSplit[i]);

                 for (int j=0; j<words2.size();j++){
                     if(!words2.get(j).equals("stop")){
                         length=length+words2.get(j).length();
                         //  words.add(words2.get(j));

                     }

                        else{

                         information="stop";
                     }





            }






            }
        }


        //  String[] x= information.split(" ");

        //{
        //    for(String w=stringSplit) {

        //    for (int i = 0; i < stringSplit.length; i++) {
        //      if (!w.equals("stop")) {
        //      length = length + 1;

        //      }
        //       length = length;
        //  }
        //  }


        //     length+=1;
        // }
        //  length=length;
        //   }

        //   System.out.println(w);
        //

        //else {
        //      length=length;


        //  if (!nonStop.equals("stop")) {
        //   length = length + nonStop.length();

        // }
        //  }


        //public void checkWords(String data) {
        //   information = data;
        //  String[] d= information.split("");
        // for(int i=0;i<d.length;i++){ // Loop to search the Element
        //   if(!d[i].equals("stop"))
        //      words.add(d[i].length());
        //     numOfWords=numOfWords+words.size();

        //      }
        //    numOfWords=numOfWords;


        //  }


        public void checkLongWord (String data){
            information = data;
            // if (!information.equals("stop")) {
            //longest=information.length();
            listOfWords = information.split(" ");
            for (String word : listOfWords) {
                if (word.length() > L && !word.equals("stop")) {
                    longWord = word;
                    L = word.length();
                }
            }

        }


        public int getCount () {

            return count;


        }

        public int getLength () {

            return length;


        }

        public int getNumOfWords () {

            return numOfWords;


        }

        public String getLongWord() {

            return longWord;


        }
    }












