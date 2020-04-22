package Practice;

public class Task156_MethodsWirhReturn1CountApperance {
    public static int  count_appearance(String[] arr, String t)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (t.equals(arr[i])) {
                count++;
            }
        }
        return count;

    } //end  count_appearance

    public static void main(String[] args) {
        String [] arr1 = {"a","foo","bar","foo","bla"};
        String t1 = "foo";

        int num1 = count_appearance(arr1, t1);
        System.out.println(num1);
    }
}
