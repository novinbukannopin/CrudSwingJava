package trycatch.d;

/**
 * @author Novin on 30/11/2022
 * @project KelasSwingCrud
 */


class counterEx extends Exception {
    String complain;

    public counterEx(String complain) {
        this.complain = complain;
    }

    public String toString() {
        return "Counter Exception " + complain;
    }
}

class counter {
    int n = 0;

    public int zero() {
        return n = 0;
    }

    public int up() {
        return n++;
    }

    public int down() throws counterEx {
        if (n <= 0) {
            throw new counterEx(n + "Counter down failed");
        }
        return --n;
    }
}

//public class counterException extends Throwable {
//    public static void main(String[] args) {
//        counter c = new counter()44;
//        c.zero();
//        c.up();
//        try {
//            c.down();
//        } catch (counterEx exception) {
//            System.out.println("" + exception);
//        }
//        try {
//            c.down();
//        } catch (counterEx ex) {
//            System.out.println("" + ex);
//        } finally {
//            System.out.println("Finally");
//        }
//    }
//}

public class counterException {
    public static void main(String[] args) throws Exception {
        counter c = new counter();
        c.zero();
        c.up();
        c.down();
        c.down();
        System.out.println("Completed");
    }
}
