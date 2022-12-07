package exercise;

/**
 * @author Novin on 07/12/2022
 * @project KelasSwingCrud
 */
public class ThrowExamplee {
    public static void main(String[] args) {
        try{
            throw new Exception("Here's my Exception");
        } catch (Exception exception){
            System.out.println("Caught Exception");
            System.out.println(exception.getMessage());
            System.out.println(exception.toString());
            exception.printStackTrace();
        }
    }
}
