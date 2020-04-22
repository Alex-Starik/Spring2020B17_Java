package day18_nestedLoops;
/*
print all the even number 0 ~ 100 in the same line separated by a space
 */
public class DoWhileLoopPractice {

    public static void main(String[] args) {

        int i = 0;

        do {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }

            i++;
        } while (i < 101);
        System.out.println();
        System.out.println("===========================================");

        int y = 1;
        do{
            if (y==3) {
                y++; // need to make sure that the iterator is not skipping, so that the condition will eventually be false
                continue;
            }
            System.out.println(y);
            y++;
        } while (y<= 5);

        System.out.println("==================");

        int t = 1;
        do {
            if(t%2!=0) {
                t++;
                continue;
            }
            System.out.print(t+"");

            t++;
        } while (t<=100);
    }
}
