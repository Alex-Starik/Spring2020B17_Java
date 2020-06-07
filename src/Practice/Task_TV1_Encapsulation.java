package Practice;

public class Task_TV1_Encapsulation {
    int channel=1;
    int volumeLevel=1;
    boolean on = false;
    String brand = "undefined";

    public Task_TV1_Encapsulation(){
        System.out.println("Creating TV object using no Args- constructor");
    }

    public Task_TV1_Encapsulation(String brand){
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public boolean isOn(){
        return on;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setChannel(int channel) {
        if (on && channel > 0 && channel < 121) {
            this.channel = channel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public void setVolumeLevel(int volumeLevel) {
        if (isOn() == true && volumeLevel > 0 && volumeLevel < 8) {
            this.volumeLevel = volumeLevel;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp(){
        if (getChannel() > 0 && getChannel() < 120) {
            channel += 1;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public void channelDown(){
        if (getChannel() > 1 && getChannel() < 121) {
            channel -= 1;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public void volumeUp(){
        if (isOn() == true && getVolumeLevel() > 0 && getVolumeLevel() < 7) {
            volumeLevel += 1;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public void volumeDown(){
        volumeLevel -= 1;
        if (isOn() == true && getVolumeLevel() > 1 && getVolumeLevel() < 8) {
            volumeLevel -= 1;
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }


    public void turnOn(){
        if (isOn()!= true) {
            on = true;
        } else {
            System.out.println("TV is already ON");
        }
    }

    public void turnOff(){
        if (isOn()== true) {
            on = false;
        } else {
            System.out.println("TV is already OFF");
        }
    }


}

class Test6 {
    public static void main(String[] args) {
        Task_TV1_Encapsulation obj = new Task_TV1_Encapsulation();
        obj.channelUp();
        System.out.println(obj.channel);
        obj.channelDown();
        System.out.println(obj.channel);
    }
}


