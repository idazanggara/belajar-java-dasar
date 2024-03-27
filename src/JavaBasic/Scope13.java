package JavaBasic;

import java.util.Arrays;

public class Scope13 {
    public static void main(String[] args) {
        // jadi variable di java siklus hidupnya hanya bisa di akses di dalam bloknya, di luarnya enggak bisa
        sayHello("Idaz");
        sayHello("");

        String[][] pengunjung1 = {
            { "Idaz", "Acong", "Zeryl" }, // Nama depan
            { "Anggara", "Djoko", "Sitorus" }, // Nama belakang
            { "13", "24", "22" }, // Tanggal lahir
            { "Januari", "Maret", "Mei" }, // Bulan lahir
            { "1980", "1965", "1990" } // Tahun lahir
        };
        String[] result1 = summaryPengunjung(pengunjung1);
        System.out.println(Arrays.toString(result1));

        String[][] pengunjung2 = {
            {"Kian", "Walang", "Alexander", "Budi"},
            {"Santang", "Sungsang", "Geraham", "Pekerti"},
            {"18", "1", "7", "20"},
            {"Desember", "April", "Januari", "Juli"},
            {"1980", "1965", "1990", "1957"}
        };
        String[] result2 = summaryPengunjung(pengunjung2);
        System.out.println(Arrays.toString(result2));

    }
/*
* Ini komentar
*
* */
    static void sayHello(String name) {
        String hello = "Hello "+ name;

        if(!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
//        System.out.println(hi); // enggak bisa akses
    }

    public static String[] summaryPengunjung(String[][] input) {
        // Your code here
        String[] result = new String[input[0].length];
        for (int i = 0; i < input[0].length; i++) {
            // result[i] = input[i][0] + "-" ;
            String temp = "";
            String nama = input[0][i] + " " + input[1][i];
            temp += nama;
            if (Integer.parseInt(input[2][i]) < 10) {
                temp += " - 0";
            } else {
                temp += " - ";
            }
            // System.out.println(
            // temp + input[2][i] + "/" + input[3][i].charAt(0) + input[3][i].charAt(1) +
            // input[3][i].charAt(2));
            temp += "" + input[2][i]
                    + "/" + input[3][i].charAt(0) + input[3][i].charAt(1) + input[3][i].charAt(2)
                    + "/" + input[4][i]
                    + " - " + (2024 - Integer.parseInt(input[4][i])) + " Tahun";
            result[i] = temp;
        }
//        System.out.println(Arrays.toString(result));
        return result;
    }
}
