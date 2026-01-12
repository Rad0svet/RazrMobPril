import Animals.Cat;

public class Main {
    public static void main(String[] args) {
        Cat vasia = new Cat("Scothland", "Vasilii", "red",5);
        Cat snowball = new Cat("Persian", "Snowball", "white", 8);

        vasia.sayMeow();
        snowball.sayMeow();
        System.out.println(Cat.catCounter);


        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}