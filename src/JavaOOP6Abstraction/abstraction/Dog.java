package JavaOOP6Abstraction.abstraction;


// buat tugas
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Guk guk");
    }
}
