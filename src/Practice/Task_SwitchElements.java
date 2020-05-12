package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task_SwitchElements {


    public static int[] do_switch(int[] i){

        int [] b = new int[i.length];

        b[0] = i [i.length-1];
        b[b.length-1] = i[0];

        for (int z = 1; z < i.length-1; z++){
            b[z] = i[z];
        }

        return b;

    }

    public static void main(String[] args) {
        int [] s = {5,4,6,7,8,3,7};
        int [] d = do_switch(s);
        System.out.println(Arrays.toString(d));
    }

}






