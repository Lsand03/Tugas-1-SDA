package TugasSDA1;
import java.util.ArrayList;
public class soal5 {
    public static void main(String[] args) {
        
    ArrayList<String> nama = new ArrayList<String>();
    nama.add("A");
    nama.add("N");
    nama.add("D");
    nama.add("A");
    

    System.out.println("ArrayList sebelum remove:");
    for(String var: nama){
         System.out.println(var);
    }

    //Soal no 5
    //Tentukan hasil yang didapatkan ketika dilakukan perintah remove(0), remove(3), remove(2)

    nama.remove(0);
    //nama.remove(3);
    //nama.remove(2);
    System.out.println("ArrayList setelah remove:");
       for(String var2: nama){
             System.out.println(var2);

            }
    }
}

    
