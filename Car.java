public class Car {
    private String brand;
    private String model;
    private int seatNo;
    private int enginePower;
    private String color;

    public Car(CarBuilder builder){
        brand = builder.getBrand();
        model = builder.getModel();
        seatNo = builder.getSeatNo();
        enginePower = builder.getEnginePower();
        color = builder.getColor();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public int getEnginePower() {
        return enginePower;
    }
    public String getColor() {
        return color;
    }

    public static class CarBuilder{
        private String brand;
        private String model;
        private int seatNo;
        private int enginePower;
        private String color;

        public CarBuilder(){

        }

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setSeatNo(int seatNo) {
            this.seatNo = seatNo;
            return this;
        }

        public CarBuilder setEnginePower(int enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build(){
            return new Car(this);
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getSeatNo() {
            return seatNo;
        }

        public int getEnginePower() {
            return enginePower;
        }

        public String getColor() {
            return color;
        }
    }
}
