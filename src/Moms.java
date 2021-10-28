

    import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.*;


    public class Moms {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Priset exk. moms är");
            double pris = Double.parseDouble(scan.next());
            double moms = 0.25 * pris;
            double slutPris = moms + pris;
            System.out.println("Priset Ink. mos är=");
            System.out.println(slutPris);

        }
    }
