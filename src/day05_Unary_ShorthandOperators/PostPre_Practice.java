package day05_Unary_ShorthandOperators;

public class PostPre_Practice {

    public static void main(String[] args) {
        int b = 50;
        b = --b + b++ + b-- + b++; // 49 + 50 + 50 + 51 ==> 49 + 51 + 49 + 51 ==> 200
        // 49 + 49 + 50 + 49 = 197
        System.out.println(b);

        int x = 4;
        int y = x * 4 - x++;
        //16 - 4 = 12
        System.out.println(y);

        int a = 1;
        a = -a-- + a++ / -a-- * --a;
        // (-1) + (0) / (-1) * (-1)
        // (-1) + (0) * (-1)
        //(-1) + (0) = -1

        System.out.println(a);


    }
}
