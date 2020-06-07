package Practice;

public class Gas_Tank {
    double amount = 0;
    double capacity;

    public Gas_Tank(double capacity){  this.capacity=capacity; }

    public void addGas(double num){
        if (num <= capacity){
            amount += num;
        } else{
            amount += capacity;
        }
    }

    public void useGas(double num1){
        if (amount >= num1) {
            amount -= num1;
        } else{
            amount = 0;
        }
    }

    public boolean isEmpty(){
        return amount < 0.1;
    }

    public boolean isFull(){
        return amount > capacity-0.1;
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp (){
        double dif = 0;
        dif = capacity - amount;
        amount = capacity;
        return dif;
    }
}
