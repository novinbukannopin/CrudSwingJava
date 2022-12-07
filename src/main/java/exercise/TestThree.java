package exercise;

import java.io.IOException;

/**
 * @author Novin on 07/12/2022
 * @project KelasSwingCrud
 */
public class TestThree {
    public void methodA(){
        System.out.println("Method A");
    }
    public void methodB() throws IOException{
        System.out.println(20/0);
        System.out.println("Method B");
    }
}
class Utama{
    public static void main(String[] args) {
        TestThree three = new TestThree();
        three.methodA();
        try{
            three.methodB();
        } catch (Exception exception){
            System.out.println("Error di method B");
        } finally {
            System.out.println("Ini selalu dicetak");
        }
    }
}

