package day21_MultiDimensionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {
        String[] DevTeam = {"Zeynep", "Haider", "Jpovid", "Muhtar"};
        String[] TestersTeam = {"Rahman", "Aishan", "Osman", "Ali"};
        String [] PO = {"Barzy", "Donald"};
        String [] TestersTeam2 = {"Ilham", "Zarina"};
        String [] [] ScrumTeam = {DevTeam, TestersTeam, PO};

        ScrumTeam [0] [3] = "Jean";

        ScrumTeam [1] = TestersTeam2;

        System.out.println(ScrumTeam [0] [3]);
        String info = ScrumTeam[1][2];
        System.out.println(info);
        System.out.println("==========================");

        for(String eachEmployee : ScrumTeam[2]){
            System.out.println(eachEmployee);
        }
        System.out.println("==========================");

        System.out.println(ScrumTeam[2][1]);


    }
}
