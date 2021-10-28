public class PetZoo {

    public static void main(String[] args) {

        String Cut= "Lolo";
        String Hund="Ziko";

        Pet zoo=new Pet(Cut);
        Pet Ljur= new Pet(Hund);
        String S= zoo.Name() + " " + "och" + " " + Ljur.Name();

        String name1=zoo.Name();
        String name2=Ljur.Name();

        System.out.println(name1);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name2);
        System.out.println(S);



    }
}
