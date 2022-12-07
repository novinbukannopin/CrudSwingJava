package trycatch.d;

import java.io.FileNotFoundException;

/**
 * @author Novin on 30/11/2022
 * @project KelasSwingCrud
 */
public class percobaan6 {
    public static void method() {
        throw new ArrayIndexOutOfBoundsException("Melebihi Kapasitas");
    }

    public static void main(String[] args) {
        try{
            method();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

}
