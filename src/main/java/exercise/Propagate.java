package exercise;

/**
 * @author Novin on 07/12/2022
 * @project KelasSwingCrud
 */
public class Propagate {
    public static void main(String[] args) {
        try{
            System.out.println("This is a string");
        } catch (Exception exception){
            System.out.println("The string was blank");
        } finally {
            System.out.println("All done");
        }
    }
    public static String reverse(String s) throws Exception{
        if(s.length() == 0){
            throw new Exception();
        }
        String reverseStr = "";
        for(int i = s.length()-1;i>=0; --i){
            reverseStr += s.charAt(i);
        }
        return reverseStr;
    }
}
