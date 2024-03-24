package JavaOOP6Abstraction;

import JavaOOP6Abstraction.abstraction.Animal;
import JavaOOP6Abstraction.abstraction.Cat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal() // enggak bisa instance abstrack, bisanya implementasi

        Animal cat = new Cat("Roger");
        cat.makeSound();
        cat.eat();
        // cat.climb(); // enggak bisa/ error

        Cat ncat = new Cat("Regor");
        ncat.makeSound();
        ncat.eat();
        ncat.climb();





        // Tugas
        // Aplikasi dapat menyimpan data hewan, maksimal data hewan yg dapat disimpan adalah 5
        // buatlah sebuah fungsi untuk dapat menyimpan data hewan dan membaca data hewan

        Cat[] cats = new Cat[2];
        Scanner scanner =  new Scanner(System.in);
        while (true) {
            System.out.println("1. Menyimpan Data Kucing");
            System.out.println("2. Melihat Data Kucing");
            System.out.println("Pilih Menu");
            switch (scanner.nextLine()){
                case "1":
                    // create
                    for (int i = 0; i < cats.length; i++) {
                        System.out.println("Masukkan nama hewan: ");
                        String name = scanner.nextLine();
                        Cat tcat = new Cat(name);
                        cats[i] = tcat;

                    }
                    break;
                case "2":
                    //read
                    System.out.println("----List Kucing----");
                    for (Cat tcat: cats) {
                        System.out.println(tcat.print());
                    }
                    break;
                case "3":
                    System.out.println("-----Cari Kucing-----");
                    String search = scanner.nextLine();
                    for (Cat tcat : cats) {
                        if(tcat.getName().equals(search)) {
                            System.out.println(tcat.print());
                            break;
                        }
                    }
                    break;
                case "x":
                case "X":
                    System.exit(0);

            }
        }

    }
}
