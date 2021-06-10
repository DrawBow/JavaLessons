// Наследование
public class Chapter6_2 {
    public static void main(String[] args) {
        Owner owner_1 = new Owner("Mike");
        Pet pet_1 = new Pet("Kitty");


        owner_1.say();
        pet_1.say();
    }
}
class Owner{
    private String name;
    public Owner(String name) {
        this.name = name;
    }
    public void say() {
        System.out.println(name);
    }
}
class Pet extends Owner{
    public Pet(String name) {
        super(name);
    }
}

/*
public class Chapter6_2 {
    public static void main(String[] args) {
        Owner owner_1 = new Owner("Mike");
        Pet pet_1 = new Pet("Kitty");

        owner_1.say();
        pet_1.say();
    }
}
class Owner{
    private String name;

    public String getName(){
        return this.name;
    }
    public Owner(String name){
        this.name = name;
    }
    public void say(){
        System.out.println("Hello, my name is " + name);
    }
}
class Pet extends Owner{
    public Pet(String name){
        super(name);
    }
}
*/