
package oop;

public class Car {

    //global variables
    private String Company_name;
    private String model;
    private int speed;
    private long SN;
    
    //the class constructer
    public Car(String company, String model, int speed, long sn){
        this.setCompany_name (company);
        this.setModel (model);
        this.setSpeed (speed);
        this.setSN (sn);
    }

    public String getCompany_name() {
        return Company_name;
    }

    public void setCompany_name(String Company_name) {
        this.Company_name = Company_name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0)
            this.speed = speed;
        else
            speed = 0;
    }

    public long getSN() {
        return SN;
    }

    public void setSN(long SN) {
        this.SN = SN;
    }
    public void OnBreak(){
        speed = 0;
    }}
class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Ferari","458",380,1232452);
        Car car2 = new Car("BMW", "night ranger",453,3254523);
        Car car3 = new Car("black panther","phantom",567,666666666);
        
        System.out.println("speed before break: " +car3.getSpeed());
        car3.OnBreak();
        System.out.println("speed after break: " +car3.getSpeed());
    }
    
}
