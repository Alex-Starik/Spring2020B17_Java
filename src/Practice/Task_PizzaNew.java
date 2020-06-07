package Practice;

public class Task_PizzaNew {
    private String size;
    private int cheese;
    private int pepp;
    private int ham;

    /*public Task_PizzaNew (String size, int cheese, int pepp, int ham) {
        this.size = size;
        this.cheese = cheese;
        this.pepp = pepp;
        this.ham = ham;
    }

     */

    public String getsize(){
        return size;
    }

    public int getcheese(){
        return cheese;
    }

    public int getpepp(){
        return pepp;
    }

    public int getham(){
        return ham;
    }

    public void setsize(String size){
        this.size = size;
    }
    public void setcheese(int cheese){
        this.cheese = cheese;
    }
    public void setpepp(int pepp){
        this.pepp = pepp;
    }
    public void setham(int ham){
        this.ham = ham;
    }

    public double calcCost(){
        double cost = 0;
        if (getsize().equalsIgnoreCase("small")){
            cost += 10;
        } else if (getsize().equalsIgnoreCase("medium")) {
            cost += 12;
        } else {
            cost += 14;
        }
        return cost += getcheese()*2 + getpepp()*2 + getham()*2;
    }

    public String getDescription(){
        return getsize()+" Pizza with "+getcheese()+
                " Cheese toppings, "+getpepp()+
                " Pepperoni toppings, and "+getham()+
                " Ham toppings. \nTotal price: "+calcCost();
    }
}

class TestPizza{
    public static void main(String[] args) {
        Task_PizzaNew obj = new Task_PizzaNew();
        obj.setsize("LarGe");
        obj.setcheese(3);
        obj.setpepp(2);
        obj.setham(2);

        System.out.println(obj.getDescription());
    }
}
