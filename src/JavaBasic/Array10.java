package JavaBasic;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[6];
        arrayString[0] = "idaz";
        arrayString[2] = "anggara";
        arrayString[4] = "kurniawan";

        System.out.println(arrayString); // kalau di print hash
        String addresArr = Integer.toHexString(System.identityHashCode(arrayString));
        System.out.println(addresArr);
        // System.out.println(System.identityHashCode(arrayString));
        System.out.println(arrayString[0]);
        System.out.println(arrayString.length);
        System.out.println(Arrays.toString(arrayString));

        int[] arrayInt = new int[6];
        arrayInt[0] = 1;
        arrayInt[3] = 2;
        arrayInt[5] = 4;

        System.out.println(Arrays.toString(arrayInt));

        int[] newArrIntInt = new int[]{1,4,5};

        System.out.println(Arrays.toString(newArrIntInt));

        int[] newArrInt = {1,2,4};

        System.out.println(Arrays.toString(newArrInt));

        String[][] members = {
                {"Idaz", "Anggara"},
                {"Kurniawan", "Adi"},
                {"Joko"}
        };

        System.out.println(Arrays.toString(members));

        for (var i = 0; i < members.length; i++) {
            System.out.println(Arrays.toString(members[i]));
        }

        System.out.println("FOR EACH");
        for (var member: members) { // String member
            System.out.println(Arrays.toString(member));
        }


        String[] arrMessage = new String[]{"Jeruk", "Mangga", "Duren", "Anggur", "Anggur", "Duren", "Duren", "Jeruk", "Anggur" };
        String[] arrTas = new String[arrMessage.length];
        byte counter = 0;
        // "a"
        for (int i = 0; i < arrMessage.length; i++) {
            boolean flag = false;
            for (int j = 0; j < counter; j++) {
                System.out.println(arrMessage[i]+" == "+ arrTas[j] + " "+ (arrMessage[i].equals(arrTas[j])));
                if (arrTas[j].equals(arrMessage[i])) {
                    flag = true;
                    break;
                }

            }
            System.out.println(arrMessage[i] + " | " + flag);
            if(!flag){
                // disini kita masukkan karakter kita ke tas
                arrTas[counter++] = arrMessage[i];
            }
        }
        System.out.println("ini isi tas = "+ Arrays.toString(arrTas));

        // -------

        String data = "kuda,gajah,buaya,jerapah,singa";
        String[] result = new String[10];
        String temp = "";
        byte count = 0;

        for (int i = 0; i < data.length(); i++) {
            System.out.println(""+( i + 1 == data.length() ) + (i + 1) + " == "+ (data.length()) +" "+data.charAt(i));
//            if (data.charAt(i) == ','){
//                result[count++] = temp;
//                temp = "";
//            } else {
//                temp += data.charAt(i);
//            }
            if (data.charAt(i) != ','){
                temp += data.charAt(i);

            } else {
                result[count++] = temp;
                temp = "";
            }
//            if (i + 1 == data.length()) {
//                result[count++] = temp;
//            }
        }
        System.out.println(temp);
        result[count++] = temp;
        System.out.println(Arrays.toString(result));

    }
}
