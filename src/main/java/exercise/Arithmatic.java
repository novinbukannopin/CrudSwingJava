package exercise;

/**
 * @author Novin on 07/12/2022
 * @project KelasSwingCrud
 */
public class Arithmatic {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a", "b", "c"};
        try{
            System.out.println(b[3]);
            System.out.println(bil/0);
        } catch (ArithmeticException exception){
            System.out.println("Terjadi aritmatika error");
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Melebihi jumlah array");
        } catch (Exception exception){
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
