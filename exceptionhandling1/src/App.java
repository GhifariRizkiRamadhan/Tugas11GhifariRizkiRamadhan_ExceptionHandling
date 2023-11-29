import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {

        dataPembelian gipa = new faktur(); // polymorphisme

        try {
            gipa.isidata();
        } catch (InputMismatchException e) { // exception handling
            System.out.println("data yang dimasukkan tidak valid");
        }

        gipa.cetakFaktur();

    }
}
