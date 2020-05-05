package day34_CustomClass;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public double calcCost(){
        double total = (width + length) * unitPrice;
        return (isPersian) ? total+200 : total;
    }

    public void customOrder(double CarpetWidth, double carpetLength, double carpetUnitPrice, boolean carpetPersian){
        width = CarpetWidth;
        length = carpetLength;
        unitPrice = carpetUnitPrice;
        isPersian = carpetPersian;
    }
}
