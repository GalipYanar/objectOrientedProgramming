package oopOdev01;

public class Cars {

    private String model;
    private String bodyType;
    private String colour;
    private String engineType;
    private String transmission;
    private int relaseDate;
    private int numberOfPassangers;
    private int whp;

    public void wash (){
        System.out.println("car is dirty, now is washing");
    }
    public void buy (){
        System.out.println("car is buying");
    }
    public void repair (){
        System.out.println("car is damaged, now fix it");
    }

    public String getBrand() {
        return model;
    }

    public void setBrand(String brand) {
        this.model = brand;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(int relaseDate) {
        this.relaseDate = relaseDate;
    }

    public int getNumberOfPassangers() {
        return numberOfPassangers;
    }

    public void setNumberOfPassangers(int numberOfPassangers) {
        this.numberOfPassangers = numberOfPassangers;
    }

    public int getWhp() {
        return whp;
    }

    public void setWhp(int whp) {
        this.whp = whp;
    }
}
