import java.util.Scanner;

public class faktur extends dataPembelian { // inheritance kelas data pembelian

    @Override
    public void isidata() {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        System.out.print("masukkan nomor faktur   : ");
        nofaktur = scanStr.nextLine();

        System.out.print("masukkan nama pelanggan : ");
        namaPelanggan = scanStr.nextLine();

        System.out.print("masukkan nomor HP       : ");
        noHP = scanStr.nextLine();

        System.out.print("masukkan nama barang    : ");
        namaBarang = scanStr.nextLine();

        System.out.print("masukkan harga barang   : ");
        try {
            hargaBarang = scanInt.nextInt(); // handlingException
            if (hargaBarang > 10000) {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("nilai tidak valid, nilai lebih dari 10000");
        }

        System.out.print("masukkan jumlah beli    : ");
        try {
            jumlahBeli = scanInt.nextInt(); // handlingException
            if (jumlahBeli > 10000) {
                throw new IllegalArgumentException();
            }

        } catch (Exception e) {
            System.out.println("nilai tidak valid, nilai lebih dari 10000");
        }

        totalBayar = hargaBarang * jumlahBeli;

        scanInt.close();
        scanStr.close();
    }

    @Override
    public void cetakFaktur() {
        System.out.println("\n  *selamat menikmati*");
        System.out.println("nomor faktur   : " + nofaktur);
        System.out.println("nama pelanggan : " + namaPelanggan);
        System.out.println("nomor HP       : " + noHP);
        System.out.println("nama barang    : " + namaBarang);
        System.out.println("harga barang   : " + hargaBarang);
        System.out.println("jumlah beli    : " + jumlahBeli);
        System.out.println("total bayar    : " + totalBayar);
    }

}
