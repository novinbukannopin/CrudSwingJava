package trycatch;

/**
 * @author Novin on 30/11/2022
 * @project KelasSwingCrud
 */
public class PercobaanLagi {
    public static void main(String[] args) {
        int bilangan = 1;
        String b[] = {"a", "b", "c", "d"};
        try{
            System.out.println(bilangan/0);
            System.out.println(b[10]);
        } catch (ArithmeticException e){
            System.out.println("Error Arithmatic = " + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error Array = " + e);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
