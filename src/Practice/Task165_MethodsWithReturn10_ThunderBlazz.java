package Practice;

public class Task165_MethodsWithReturn10_ThunderBlazz {
    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1
            , int ingredient2, int ingredient3)
    {
        /*if (available) {
            return true;
        }
        if (gift) {
            return true;
        }

         */
        boolean a = (available) || (gift) || (ingredient1==1 && ingredient2==2 && ingredient3==3) || (ingredient1==3 && ingredient2==1 && ingredient3==2);

        if (a) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean available1 = false;
        boolean gift = false;
        int ingredient1 = 3;
        int ingredient2 = 1;
        int ingredient3 = 2;

        System.out.println(getThunderBlazz(available1, gift, ingredient1, ingredient2, ingredient3));
    }
}
