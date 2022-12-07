package exercise;

/**
 * @author Novin on 07/12/2022
 * @project KelasSwingCrud
 */
public class StackErase {
    public static void main(String[] args) {
        int bil = 10;
        try{
            System.out.println(bil/0);
        } catch (ArithmeticException exception ){
            System.out.println("Pesan Error");
            System.out.println(exception.getMessage());
            System.out.println("Info stack erase");
            exception.printStackTrace();
            exception.printStackTrace(System.out);
        } catch (Exception exception){
            System.out.println("Ini mengehandle error yang terjadi");
        }
    }
}
