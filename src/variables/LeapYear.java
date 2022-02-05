package variables;
import java.util.Scanner;
class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next(), s3 = sc.next();
        String sBig1 = s1.toUpperCase(), sBig2 = s2.toUpperCase(), sBig3 = s3.toUpperCase();
        if (sBig1.charAt(0) < sBig2.charAt(0) && sBig1.charAt(0) < sBig3.charAt(0)){
            System.out.println(s1);
            if (sBig2.charAt(0) < sBig3.charAt(0)) {
                System.out.println(s2 + "\n" + s3);
            } System.out.println(s3 + "\n" + s2);
        } else if (sBig2.charAt(0) < sBig1.charAt(0) && sBig2.charAt(0) < sBig3.charAt(0)) {
            System.out.println(s2);
            if (sBig1.charAt(0) < sBig3.charAt(0)) {
                System.out.println(s1 + "\n" + s3);
            } System.out.println(s3 + "\n" + s1);
        } else if (sBig3.charAt(0) < sBig1.charAt(0) && sBig3.charAt(0) < sBig2.charAt(0)){
            System.out.println(s3);
            if (sBig1.charAt(0) < sBig2.charAt(0)) {
                System.out.println(s1 + "\n" + s2);
            }System.out.println(s2 + "\n" + s1);
        }

    }
}
