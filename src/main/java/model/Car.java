package model;

public class Car {
    private String name;
    private String model;
    private short horsePower;

    public Car(String name, String model, short horsePower) {
        this.name = name;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public short getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(byte horsePower) {
        this.horsePower = horsePower;
    }
}
