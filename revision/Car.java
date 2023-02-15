
package revision;
public class Car {
    private String company;
    private String model;
    private int sn;
    private int speed ; //or double 
    public Car(){this("NoCompany","NoModel",0,0);}
    public Car(String company,String model,int sn,int speed){
        this.setCompany(company);
        this.setModel(model);
        this.setSn(sn);
        this.setSpeed(speed);
        
    }
    public void setSpeed(int speed){
        if (speed >= 60)
            this.speed = speed;
        else 
            this.speed = 0;
    }
    
    public void onBreak(){
        speed = 0;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public int getSpeed() {
        return speed;
    }
    @Override
    public String toString(){
        return "Copmpany is " +getCompany() +"\nModel is "+getModel()+"\nSerial Number is "+getSn() +"\nSpeed is "+getSpeed();
    }

    public static void main(String[] args) {
        Car a = new Car("BMW","M6",123456,66);
        Car b = new Car("Feriari","854",123564,340);
        Car c = new Car("Tesla","s3x",125463,120);
        Car d = new Car("Formela","F1",123456,300);
        
        System.out.println(a.toString());
        System.out.println( );
        System.out.println(b.toString());
        System.out.println( );
        System.out.println(c.toString());
        System.out.println( );
        System.out.println(d.toString());
        
        d.onBreak();
        System.out.println(d.toString());
        System.out.println( );
        a.setSpeed(400);
        System.out.println(a.toString() );
    }
    
}
