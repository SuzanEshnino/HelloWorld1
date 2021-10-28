

public class Pet {

    private String name;
    private int age;


    public Pet(String petName) {

        name = petName;
        age = 0;
    }

    public void happyBirthday() {
        System.out.println("Happy birthday" +name);
        age =  age + 1;
    }

    public int getAge() {
        return age;
    }

   public String Name(){

        return name;
   }
}
