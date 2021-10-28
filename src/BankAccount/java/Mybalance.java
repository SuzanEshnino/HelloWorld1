package BankAccount.java;

public class Mybalance

{
   // private double salary;
   private double balance = 0;


    public Mybalance(){
        balance=0;

    }

   public void My(){

    System.out.println("Your balance =" +" " + balance);
}

public void Newbalance(double newbalance){

        balance=newbalance;
    System.out.println(balance);
}

public void Add(double extra){
        balance +=extra;
  //  System.out.println("My new balace  " + "=" +" " +balance);

}
public void Min(double extra){

        balance -=extra;
  //  System.out.println("My new balace  " + "=" +" " +balance);
}

public double getBalance(){

        return balance;
}

}


