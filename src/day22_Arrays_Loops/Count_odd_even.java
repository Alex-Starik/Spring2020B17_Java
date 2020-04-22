package day22_Arrays_Loops;
/*
write a program that can count the even and odd number from an array of integers
                        MUST use for each loop
 */
public class Count_odd_even {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11};

        int countOddNumbers = 0;
        int countEvenNumbers = 0;

        for (int each : arr) {
            /*if(each%2!=0) {
                countOddNumbers++;
            } else {
                countEvenNumbers++;
            }

             */
            if(each%2 ==0) {
                countEvenNumbers++;
                continue;
            }
            countOddNumbers++;
        }

        System.out.println("even numbers: "+ countEvenNumbers);
        System.out.println("odd numbers: "+ countOddNumbers);
    }
}
