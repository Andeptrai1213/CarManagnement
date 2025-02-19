package carmanagement;


public class Car {
    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean ParkingBrake;

    public Car() {
        this.Colour = "";
        this.EnginePower = 0;
        this.Convertible = false;
        this.ParkingBrake = false;
    }

    // Constructor có tham số
    public Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake) {
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }

    // Getters
    public String getColour() {
        return Colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public boolean getConvertible() {
        return Convertible;
    }

    public boolean getParkingBrake() {
        return ParkingBrake;
    }

    // Setters
    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public void setParkingBrake(boolean ParkingBrake) {
        this.ParkingBrake = ParkingBrake;
    }

    // Other methods
    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }

    public void pressAcceleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }

    public void output() {
        System.out.println("Car details:");
        System.out.println("Colour: " + Colour);
        System.out.println("Engine Power: " + EnginePower);
        System.out.println("Convertible: " + Convertible);
        System.out.println("Parking Brake: " + ParkingBrake);
    }
}

    

