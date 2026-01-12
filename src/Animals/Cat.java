package Animals;

import java.util.stream.Stream;

public class Cat {
    private String type;
    private String name;
    private String color;
    private int age;

    public static int catCounter = 0;
    private static void counterImplement() {
        Cat.catCounter++;
    }

    public Cat(String type, String name, String color, int age) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;

        Cat.counterImplement();
    }

    public Cat(String type, String name, String color) {
        new Cat(type, name, color, 0);
    }

    public void sayMeow() {
        System.out.println(this.name + " say: \"Meow!\"");
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.type = value;
    }

    public String getColor() {
        return this.color;
    }

    public int getAge() {
        return this.age;
    }
}