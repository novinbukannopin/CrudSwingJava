package exercise;

/**
 * @author Novin on 07/12/2022
 * @project KelasSwingCrud
 */
public class ThrowExample {
    static void demo(){
        NullPointerException exception;
        exception = new NullPointerException("Coba Throw");
        throw exception;
    }

    public static void main(String[] args) {
        try{
            demo();
            System.out.println("Selesai");
        } catch (NullPointerException exception){
            System.out.println("Ada pesan error: " + exception
            );
        }
    }
}
