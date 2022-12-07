package trycatch.d;

/**
 * @author Novin on 30/11/2022
 * @project KelasSwingCrud
 */
public class exercise1 {
    static void f1(){
        System.out.println("1");
        try{
            System.out.println("2");
            f2();
            System.out.println("3");
        } catch (Exception e){
            System.out.println("4");
        } finally {
            System.out.println("5");
        }
    }

    static void f2() throws Exception{
        if (true) throw new Exception();
    }

    public static void main(String[] args) {
        f1();
    }
}
