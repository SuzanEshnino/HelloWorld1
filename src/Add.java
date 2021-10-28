import java.util.Scanner;

public class Add {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers");
        double AA = Double.parseDouble(sc.nextLine());
        System.out.println("The first number" + " " + AA);

        double BB = Double.parseDouble(sc.nextLine());
        System.out.println("The secound number" + " " + BB);

        Calculator cal = new Calculator(AA, BB);

       // Double D= cal.add();
      //  System.out.println(D);

       // System.out.println("The additional" + "" + cal.Additional());

        System.out.println(cal.Additional());
       // System.out.println(cal.Additional());

       System.out.println(cal.Minus());
       Calculator Coco=new Calculator(cal.Additional(),cal.Minus());
        System.out.println(Coco.Additional());
       // cal.Mult();
      //  cal.Del();
     //   Calculator Cal=new Calculator(cal.Additional(),cal.Del());
     //   Cal.Mult();


        // Scanner ss=new Scanner(cal.)
    }
}
