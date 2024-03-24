package JavaBasic;

public class Variable2 {
    public static void main(String[] args) {
        String name;
        name = "Idaz Anggara";

        System.out.println(name);

        int age = 30;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Budi Nugraha";
        name = "buda";
        System.out.println(name);

//        var name ;
//        name = "Idaz Anggara";
        var age1 = 30;
        var address1 = "Indonesia";

        System.out.println(age1);
        System.out.println(address1);

        // final sama dengan const

        final String theName =  "Anggara";
//        theName = "idaz";
        System.out.println(theName);

        int x = 10; // Local variable x
        System.out.println(x);
    }
}

//public class Example {
//    static int y = 20; // Static variable y
//
//    public void exampleMethod() {
//        System.out.println(y); // Static variable bisa diakses langsung dari method instance
//    }
//
//    public static void main(String[] args) {
//        System.out.println(Example.y); // Static variable bisa diakses langsung dari method static
//    }
//}

//public class Example {
//    int z = 30; // Instance variable z
//
//    public void exampleMethod() {
//        System.out.println(z); // Instance variable z bisa diakses langsung dari method instance
//    }
//
//    public static void main(String[] args) {
//        Example obj1 = new Example();
//        Example obj2 = new Example();
//
//        System.out.println(obj1.z); // Instance variable z diakses melalui objek pertama
//        System.out.println(obj2.z); // Instance variable z diakses melalui objek kedua
//
//        obj1.z = 40; // Mengubah nilai instance variable z untuk objek pertama
//        System.out.println(obj1.z); // Output: 40
//        System.out.println(obj2.z); // Output: 30 (tidak berubah karena instance variables terpisah untuk setiap objek)
//    }
//}
