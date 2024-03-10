import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;

    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    public void tampilDataMahasiswa() {
        System.out.println("Detail Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Program Studi: " + prodi);
    }

    public static void tampilUniversitas() {
        System.out.println("Universitas ABC");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = null;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");

            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.next();
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = scanner.next();
                    while (nim.length() != 15) {
                        System.out.println("Panjang NIM harus 15 angka.");
                        System.out.print("Masukkan NIM Mahasiswa: ");
                        nim = scanner.next();
                    }
                    System.out.print("Masukkan Program Studi Mahasiswa: ");
                    String prodi = scanner.next();

                    mahasiswa = new Mahasiswa(nama, nim, prodi);
                    System.out.println("Data Mahasiswa berhasil ditambahkan.");
                    break;

                case 2:
                    if (mahasiswa != null) {
                        mahasiswa.tampilDataMahasiswa();
                    } else {
                        System.out.println("Belum ada data mahasiswa yang diinput.");
                    }
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }
}
