package JavaBasic;

public class TypeDataString5 {
    public static void main(String[] args) {
        String firstName =  "Idaz";
        String lastName = "Anggara";

        String fullName = firstName + " " + lastName;
//        String fullName = "Idaz" + " " + "Anggara";
        String theName = null; // karena ini bukan primitif
//        theName = "aa";


        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(fullName);
        System.out.println(theName);

        String num = "33000";
        int intValue = Integer.parseInt(num);
        System.out.println(intValue); // Output: 33000


        String num1 = "1000";
        Integer integerValue = Integer.valueOf(num1);
        System.out.println(integerValue); // Output: 1000

        System.out.printf(String.valueOf(integerValue instanceof Integer));



    }
}
