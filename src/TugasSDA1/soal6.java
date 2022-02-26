package TugasSDA1;
import java.util.ArrayList;
public class soal6 {
    public static void main(String[] args) {
        
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("A");
    nama.add("N");
    nama.add("D");
    nama.add("A");
    
    //Soal no 6
    //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
    //add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j)

    nama.add(0,"e");
    System.out.println("Array setelah fungsi add(0,e) " + nama);

    nama.add(2,"f");
    System.out.println("Array setelah fungsi add(2,f) " + nama);

    nama.add(3,"g");
    System.out.println("Array setelah fungsi add(3,g) " + nama);

    nama.add(4,"h");
    System.out.println("Array setelah fungsi add(4,h) " + nama);

    nama.add(6,"h");
    System.out.println("Array setelah fungsi add(6,h) " + nama);

    nama.add(-3,"j");
    System.out.println("Array setelah fungsi add(-3,j) " + nama);
         
    }
}
    

