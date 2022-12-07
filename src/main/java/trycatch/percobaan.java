package trycatch;

/**
 * @author Novin on 30/11/2022
 * @project KelasSwingCrud
 */
public class percobaan {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Setelah blok try catch");

        }
    }
}
