package exercise;

/**
 * @author Novin on 07/12/2022
 * @project KelasSwingCrud
 */
public class RangeErrorException extends Throwable{
    public RangeErrorException(String s){
        super(s);
    }

    public static void main(String[] args) {
        int position = 1;
        try{
            if (position>0){
                throw new RangeErrorException("Position" + position);
            }
        }
        catch (RangeErrorException exception){
            System.out.println("Range error : " + exception.getMessage());
        }
        System.out.println("This is the last program.");
    }
}
