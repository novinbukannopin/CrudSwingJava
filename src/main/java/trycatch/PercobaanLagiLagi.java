package trycatch;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Novin on 30/11/2022
 * @project KelasSwingCrud
 */
public class PercobaanLagiLagi {
    public static void method() throws FileNotFoundException {
        throw new FileNotFoundException("File tidak ada");
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
