package solucion3;


public class Auto {
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    private String chassisNo;
    private String model;

    public Auto(String model) {
        numVehicles++;
        setChassisNo("ch" + numVehicles);
        setModel(model);
        System.out.println("Vehicle manufactured");
    }

    public static class Engine {
        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        public static String getMake() {
            return MAKE;
        }

        public static int getCapacity() {
            return CAPACITY;
        }
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "The vehicle is manufactured by: " + MAKE +
                "\nThe model type is " + getModel() +
                "\nThe chassis number is " + getChassisNo() +
                "\nThe engine make is " + Engine.getMake() +
                "\nThe engine capacity is " + Engine.getCapacity() + "cc";
    }

    public void setMake(String make) {
        MAKE = make;
    }
}


