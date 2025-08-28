package Example2;

public class Person {
    private String firstname;
    private String lastname;
    private int birthYear;

    public Person(String firstname, String lastname, int birthYear) {
        this.firstname = firstname;
        this.lastname  = lastname;
        this.birthYear = birthYear;
    }

    public String getName() {
        return firstname + " " + lastname;
    }

    public void drive(Bicycle bike, int kilometers) {
        System.out.println(" ");
        for (int i = 1; i <= kilometers; i++){
            System.out.println(bike.getSound() +" "+ i + " km travelled");
        }
    }
}

class BicycleTest2 {
    public static void main(String[] args) {
        Person benzino;
        Bicycle tunturi, nopsa;

        benzino = new Person("Enzio", "benzino", 1982);
        tunturi = new Bicycle(benzino, "Tunturi", 5, "Viuh");
        nopsa = new Bicycle(benzino,"Nopsa", 3, "Ka...boom");
        benzino.drive(tunturi, 3);
        benzino.drive(nopsa, 2);
    }
}