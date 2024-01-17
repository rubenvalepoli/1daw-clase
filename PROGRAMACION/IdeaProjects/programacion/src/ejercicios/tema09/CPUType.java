package ejercicios.tema09;

public enum CPUType {

    PENTIUM_GOLD_G7400("3.1GHz"),
    RYZEN_3_4100("3.8GHz"),
    CORE_I5_12400F("2.1GHz"),
    RYZEN_7_5800X("3.8GHz"),
    CORE_I7_12700KF("3.8GHz");

    private String speed;


    CPUType(String speed) {
        this.speed = speed;
    }

    public String getSpeed(){
        return this.speed;
    }

    @Override
    public String toString() {
        return "CPUType{" +
                "speed='" + speed + '\'' +
                '}';
    }
}
