package Example2;

public class Bicycle {
    private Person owner;
    private String model;
    private int gears;
    private String Sound;

    public Bicycle(Person owner, String model, int gears, String Sound) {
        this.owner = owner;
        this.model = model;
        this.gears = gears;
        this.Sound = Sound;
    }
    public void drive(){
        System.out.println(this.model + ": " + owner.getName() + " drives");
    }

    public String getSound() {
            return Sound;
    }
}



class BicycleTest{
    public static void main(String[] args) {
        // main() knows both the Person and Bicycle objects, because main()creates both of them
        Bicycle bike, nopsa;
        Person Lama;


        Lama = new Person("Suresh", "Lama",1992);
        bike    = new Bicycle(Lama, "Tunturi",5," Viuh");
        nopsa = new Bicycle(Lama,"Nopsa", 3, "Ka...boom");
        bike.drive();

        String sound = bike.getSound();
        System.out.println(sound);


    }
}


