package day06_Shorthnd_LogicalOperators;

public class shortHandOperators {

    public static void main(String[] args) {
        int x = 20;
        x += 10; // x = x + 10 ==> 20+10=30
        System.out.println(x); //30

        x+=60;
        System.out.println(x); // 90

        String schoolname = "Cybertek";
            schoolname += 12345; // schoolname = schoolname + 12345;
        System.out.println(schoolname);

        System.out.println( 'a' + 'b'); // 97 + 98 = 195

        char ch1 = 'a';
            ch1 += 'b';
        System.out.println(ch1); // character

        int num = 'z';
        num += 'x';
        System.out.println(num); // number

        int A = 100;
            A -= 90; // 10
        System.out.println(A);

        int b = 200;
            b -= A; // b = b - A ==> 200 - 10 = 190
        System.out.println(b);

        int a = 2;
        a *= 3;
        System.out.println(a); // 6

        int B = a *= 10;
        // b = a = a * 10 = 60
        System.out.println(B); // 60
        System.out.println(a); // 60

        int a1 = 100;
        int b1 = (a1 *= 2) + ++a1;
        // b1 = a1 = a1 * 2  ==> 200 + 201 = 401
        System.out.println(b1);

        int x1 = 10;
        int y = x1 += 10*2; // x1 = x1 + 20
                // x1 += 20; ==> 30
        System.out.println(y);

        int q = 20;
        int p = q *= 20 * 3;
            // q *= 60;    q = q * 60;


        int num1 = 300;
        num1 /= 2; // num1 = num1 / 2
        System.out.println(num1); // 150

        int num2 = 400;
            num2 /= 20 + 10; // num2 = num2 / 30
                             // num2 = 400 / 30  13.123
                            // num2 = 13
        System.out.println(num2);

        int num3 = 300;
            num3 %= 10 + 20; // 300 % 30 = 0
        System.out.println(num3);

        int n1 = 400;
            n1 %= 3* 5; // 400 % 15
        // 400 / 15 = 26.6666    400 - (15 * 26) = 10;
        System.out.println(n1);

    }
}
