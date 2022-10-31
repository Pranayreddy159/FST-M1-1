public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    Car(){
        tyres=4;
        doors=4;

    }
    public void displayCharacteristics(){
        System.out.println("color : "+color+"\ntransmission : "+transmission+"\nmake : "+make+"\ntyres : "+tyres+"\ndoors : "+doors);
    }
    public void accelarate(){
        System.out.println("Car is moving forward.");
    }
    public void brake(){
        System.out.println("Car has stopped.");
    }


}

