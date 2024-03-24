package JavaBasic;

import java.util.Scanner;

public class UserInput7 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pesan untuk meminta input pengguna
        System.out.print("Masukkan nama Anda: ");

        // Membaca input pengguna dan menyimpannya dalam variabel name
        String name = scanner.nextLine();

        System.out.print("Masukkan Umur Anda: ");
        // Membaca input pengguna dan menyimpannya dalam variabel age
        String age = scanner.nextLine();

        // Menampilkan pesan dengan menggunakan input pengguna
        System.out.println("Halo, " + name + "! Selamat datang!");
        System.out.println("Sekarang umur "+age);

        // Menutup scanner setelah selesai digunakan
        scanner.close();
    }
}
