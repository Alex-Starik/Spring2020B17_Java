package day40_Encapsulation;

public class Encapsulation {

    private long SSN;

    // getter: read only
    public long getSSN(){
        return SSN;
    }

    // setter: write only
    public void setSSN(long SSN){
        this.SSN = SSN;
    }
}

class Test{
    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        //System.out.println(obj.SSN);

        obj.setSSN(98765432);

        System.out.println(obj.getSSN());
    }

}

