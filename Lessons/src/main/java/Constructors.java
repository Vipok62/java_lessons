public class Constructors {

    public static void main(String[] args) {
    Humans h1 = new Humans("Test",23);
    Humans h2 = new Humans("Testic",32);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
    Humans h3 = new Humans("Digle",53);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
    h3.printNumberOfPeople();
    }
}
class Humans {
     private String name;
     private int age;
     private static int countPeople;


    public Humans(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}

    public void printNumberOfPeople(){
        System.out.println("Number of people is "+countPeople);
    }

}


