package trycatch.d;

import java.io.FileNotFoundException;

/**
 * @author Novin on 30/11/2022
 * @project KelasSwingCrud
 */
public class percobaan7 {
    public static void method() throws FileNotFoundException{
        throw new FileNotFoundException("File Tidak Ada");
    }

    public static void main(String[] args) {
        try{
            method();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
