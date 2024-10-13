package EADTicketBookingSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    private ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
    private ArrayList<Penumpang> daftarPenumpang = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void tambahPenerbangan(Penerbangan penerbangan) {
        daftarPenerbangan.add(penerbangan);
    }

    public void tampilDaftarPenerbangan() {
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.println("Opsi " + i);
            daftarPenerbangan.get(i).tampilDaftarPenerbangan();
        }
    }

    public void tambahPenumpang() {
        System.out.println("Masukkan NIK : ");
        String NIK = scanner.nextLine();

        System.out.println("Masukkan Nama Depan : ");
        String namaDepan = scanner.nextLine();

        System.out.println("Masukkan Nama Belakang : ");
        String namaBelakang = scanner.nextLine();

        Penumpang penumpang = new Penumpang(NIK, namaDepan, namaBelakang);
        daftarPenumpang.add(penumpang);

        tampilDaftarPenumpang();
        tampilDaftarPenerbangan();

        System.out.println("Pilih penerbangan yang ingin dipesan : ");
        int indexPenerbangan = scanner.nextInt();
        scanner.nextLine();  

        if (indexPenerbangan >= 0 && indexPenerbangan < daftarPenerbangan.size()) {
            System.out.println("Penerbangan berhasil dipesan!");
            daftarPenerbangan.get(indexPenerbangan).tampilDaftarPenerbangan();
        } else {
            System.out.println("Penerbangan tidak ditemukan!");
        }
    }

    public void tampilDaftarPenumpang() {
        for (Penumpang penumpang : daftarPenumpang) {
            penumpang.tampilDaftarPenumpang();
        }
    }

    public static void main(String[] args) {
        Pembelian pembelian = new Pembelian();

       
        pembelian.tambahPenerbangan(new Penerbangan("GA123", "Soekarno-Hatta", "Ngurah Rai", "09:00", "11:00", 1500000));
        pembelian.tambahPenerbangan(new Penerbangan("SQ456", "Changi", "Soekarno-Hatta", "14:00", "16:00", 2000000));
        pembelian.tambahPenumpang();
    }
}

