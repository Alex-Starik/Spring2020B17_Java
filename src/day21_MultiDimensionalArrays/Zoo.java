package day21_MultiDimensionalArrays;

public class Zoo {
    public static void main(String[] args) {
        String [] wildAnimals = {"Tiger", "Lion", "Monkey", "Turtle", "Crocodile"};

        String [] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};

        String [][] zoo = {wildAnimals, birds};

        String kfc = zoo[1][3]; // "Chicken"
        System.out.println(kfc);

        System.out.println("===========================");
        for (String eachbirds: zoo[1]){ // 4 times

            if (eachbirds.equals("Chicken")){
                continue;
            }
            System.out.println(eachbirds);

        }
        System.out.println("==============================");

        for( String each: zoo[0]){ // 5
            if(each.equals("Turtle")) {
                continue;
            }
            System.out.println(each);
        }
    }
}
