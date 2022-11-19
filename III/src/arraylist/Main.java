package arraylist;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        // Add element
        mahasiswaList.add(new Mahasiswa(1,"Lily Cortez","TIF 22",3));
        mahasiswaList.add(new Mahasiswa(2,"Jo Moreno", "TI 22", 11));
        mahasiswaList.add(new Mahasiswa(3,"Rachael Ashton", "TU 22", 26));
        mahasiswaList.add(new Mahasiswa(4,"Kratos", "TO 20", 9));
        mahasiswaList.add(new Mahasiswa(5,"Steve", "TIF 21", 31));

        System.out.println("\nPrint semua element :");
        //System.out.println(mahasiswaList);
        //Print all element
        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa));

        System.out.println("\nSize Arraylist : "+ mahasiswaList.size());

        //remove mahasiswaList untuk index no 2
        mahasiswaList.remove(2);

        //Hasil setelah menghapus element bernomor index 2
        System.out.println("\nSetelah remove element index ke 2 :");
        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa));
    }
}
