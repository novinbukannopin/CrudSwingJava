package exercise;

/**
 * @author Novin on 07/12/2022
 * @project KelasSwingCrud
 */
public class GreetingTry {
    public static void main(String[] args) {
        int i = 0;
        String greetings[]={
                "Hello world", "No, I mean it!", "Hai Novin :3"
        };
        while (i<4){
            try{
                System.out.println(greetings[i]);
                i++;
            } catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("Resetting index value");
                i=0;
            }
        }
    }
}
