package linkedlist;

import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Mahasiswa> list = new LinkedList<>();
        Scanner inputId = new Scanner(System.in);
        Scanner inputName = new Scanner(System.in);
        Scanner inputKelas = new Scanner(System.in);
        Scanner inputTanggalMasuk = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Jumlah data yang ingin diinput: ");
        int n = input.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println("Input data ke-"+(i+1));
            System.out.print("Masukan id : ");
            int id = inputId.nextInt();
            System.out.print("Masukan Nama : ");
            String name = inputName.nextLine();
            System.out.print("Masukan Kelas : ");
            String kelas = inputKelas.nextLine();
            System.out.print("Masukan Tanggal Masuk : ");
            int tanggal = inputTanggalMasuk.nextInt();

            list.add(new Mahasiswa(id, name, kelas, tanggal));
        }
        // print all element
        list.forEach(mahasiswa -> System.out.println(mahasiswa));


        // remove element
        System.out.println("Jumlah data yang ingin dihapus: ");
        n = input.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Masukan Nama  : ");
            String nameRemove = inputName.nextLine();
            list.removeIf(mahasiswa -> mahasiswa.getName().contains(nameRemove));
        }

        // print all element
        list.forEach(mahasiswa -> System.out.println(mahasiswa));
    }
}