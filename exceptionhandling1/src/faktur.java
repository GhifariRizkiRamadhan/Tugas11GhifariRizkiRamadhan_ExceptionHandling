import java.util.Scanner;

public class faktur extends dataPembelian { // inheritance kelas dataPembelian

    @Override
    public void isidata() {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        System.out.print("masukkan nomor faktur   :");
        nofaktur = scanStr.nextLine();

        System.out.print("masukkan nama pelanggan :");
        namaPelanggan = scanStr.nextLine();

        System.out.print("masukkan nomor HP       :");
        noHP = scanStr.nextLine();

        System.out.print("masukkan nama barang    :");
        namaBarang = scanStr.nextLine();

        System.out.print("masukkan harga barang   :");
        hargaBarang = scanInt.nextInt();

        System.out.print("masukkan jumlah beli    :");
        jumlahBeli = scanInt.nextInt();

        totalBayar = hargaBarang * jumlahBeli;

        scanInt.close();
        scanStr.close();
    }

    @Override
    public void cetakFaktur() {
        System.out.println("\n faktur yang tercetak");
        System.out.println("nomor faktur   : " + nofaktur);
        System.out.println("nama pelanggan : " + namaPelanggan);
        System.out.println("nomor HP       : " + noHP);
        System.out.println("nama barang    : " + namaBarang);
        System.out.println("harga barang   : " + hargaBarang);
        System.out.println("jumlah beli    : " + jumlahBeli);
        System.out.println("total bayar    : " + totalBayar);
    }

}
