package exercise;

/**
 * @author Novin on 07/12/2022
 * @project KelasSwingCrud
 */
public class Divide {
    public static void main(String[] args) {
        int bil = 0;
        try {
            System.out.println(bil / 0);
        } catch (ArithmeticException exception) {
            System.out.println("Terjadi aritmatika error");
        } catch (Exception exception) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}