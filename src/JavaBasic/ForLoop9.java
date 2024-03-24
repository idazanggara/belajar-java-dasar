package JavaBasic;

import java.util.Random;

public class ForLoop9 {
    public static void main(String[] args) {
//        for (;;){ // hati" jangan buat program yg infinit loop seperti ini, apalagi kalau nanti sudah bermaind engan array atau obejcr
//            System.out.println("Perulangan");
//        }

        var counter = 1;
        for (;counter <= 10;){
            System.out.println("Perulangan for loop "+counter);
            counter++;
        }
        System.out.println(counter);

        // init statement dan post statement

        for (var counter1 = 1; counter1 <= 10; counter1++){
            System.out.println("Perulangan for loop inc,dec "+counter1);

        }

        // While
        var counterLoop = 1;
        // counterLoop <= 10
        // while (counterLoop <= 10) {
        while (true) {
//            if ( counterLoop == 1) {
//                continue;
//            } nilai tidak bertambah
            System.out.println("Perulangan while " + counterLoop);
            counterLoop++;

            if(counterLoop > 5){
                break;
            }

        }

        // Do While
        var counterDo = 100;
        do {
            System.out.println("Perulangan do "+ counterDo);
            counterDo++;
        }while (counterDo <=10);


        Random random = new Random(); // Membuat instance dari Random
        int angkot = 0; // Mendeklarasikan variabel angkot

        while (angkot != 7) {
            angkot = random.nextInt(10) + 1; // Mendapatkan angka acak dari 1 sampai 10
            System.out.println("Angkot yang lewat adalah angkot nomor: " + angkot);

            if (angkot == 7) {
                System.out.println("Yeayyy, angkot saya sudah sampai");
            }
        }
        System.out.println("berhenti " + angkot);
        System.out.println("=====");

        do {
            angkot = random.nextInt(10) + 1; // Mendapatkan angka acak dari 1 sampai 10
            System.out.println("Angkot yang lewat adalah angkot nomor: " + angkot);

            if (angkot == 7) {
                System.out.println("Yeayyy, angkot saya sudah sampai");
            }
        } while (angkot != 7);

        String email = "idaz.anggara@gmail.com";

        boolean flag = false;
        String result = "";
        for (int i = 0; i < email.length(); i++) {
            char kar = email.charAt(i);
            if (kar == '.' && flag == true){
                flag = false;
            }
            if(flag == true){
                result += kar;
            }
            if(kar == '@'){
                flag = true;
            }
        }
        System.out.println(result);

        String message = "aaabbbbccccdddeee111222";
        String result1 = "";
        for (int i = 0; i < message.length(); i++) {
            boolean flag1 = false;

            for (int j = 0; j < result1.length(); j++) {
                if (message.charAt(i) == result1.charAt(j)){
                    flag1 = true;
                }
            }

            if (flag1 == false){
                result1 += message.charAt(i);
            }
//            if (i == message.length() - 1 || message.charAt(i) != message.charAt(i + 1)) {
//                result1 += message.charAt(i);
//            }
        }

        System.out.println(result1 + " ---");


        String message1 = "iiiiniiiii peeeesssan   rrrahhhhassiiaa";
        String result2 = "";

        // Inisialisasi karakter sebelumnya dengan karakter pertama dari string
        // karena karakter pertama pasti akan disertakan dalam hasil
        char previousChar = message1.charAt(0);

        // Tambahkan karakter pertama ke hasil karena loop akan mulai dari karakter kedua
        result2 += previousChar;

        // Loop melalui string mulai dari karakter kedua
        for (int i = 1; i < message1.length(); i++) {
            char currentChar = message1.charAt(i);

            // Hanya tambahkan karakter ke hasil jika tidak sama dengan karakter sebelumnya
            if (currentChar != previousChar) {
                result2 += currentChar;
                previousChar = currentChar; // Perbarui karakter sebelumnya
            }
        }

        System.out.println(result2);
    }
}
