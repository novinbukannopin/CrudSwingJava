package exercise;

/**
 * @author Novin on 07/12/2022
 * @project KelasSwingCrud
 */
import java.lang.Exception;
public class ExceptionTry {
    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            a[5] = 100;
        }
        catch (Exception exception){
            System.out.println("Telah terjadi pelanggaran memory");
        }
    }
}
