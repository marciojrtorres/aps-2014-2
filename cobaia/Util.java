
public class Util {

    public static String cotoiso(String s) {
        return s.split("/")[2] + "-" + s.split("/")[1] + "-" + s.split("/")[0];
    }

    public static String fn(int n, int c) {
        if (n < 10) {
            String r = "";
            for (int i = 0; i < c - 1; i++) {
                r = r + "0";
            }
            return r + n;
        } else if (n < 100) {
            String r = "";
            for (int i = 0; i < c - 2; i++) {
                r = r + "0";
            }
            return r + n;
        } else {
            String r = "";
            for (int i = 0; i < c - 3; i++) {
                r = r + "0";
            }
            return r + n;
        }
    }

    public static int sm(int a, int b) {
        return a + b;
    }

    public static int m(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static boolean pos(int n) {
        if (n > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String pl(String s) {
        return s + "s";
    }


    public static void main(String[] args) {
        
        System.out.println(cotoiso("10/03/2015"));
        System.out.println(fn(3, 4));
        System.out.println(fn(30, 4));
        System.out.println(fn(300, 4));
        System.out.println(fn(3000, 4));

    }

}