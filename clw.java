public class clw {
    public static void main(String[] args) {
        int a = 350;
        int b = (a - 100);
        int c = (a - 200);
        int d = (a - 300);
        int e = b*7 + c*8;
        int f = b*7 + c*8 + d*10;

        if (a <= 100) {
            System.out.print("Don't need to pay anything");
        } else if (a <= 200) {
            System.out.print("Pay " + b*7);
        } else if (a <= 300) {
            System.out.print("Pay " + e);
        } else {
            System.out.print("Pay " + f);
        }
    }
}