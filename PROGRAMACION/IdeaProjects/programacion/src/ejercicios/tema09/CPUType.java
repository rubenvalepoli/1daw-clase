package ejercicios.tema09;

public enum CPUType {

    PENTIUM_GOLD_G7400("3.1GHz", "2/4"),
    RYZEN_3_4100("3.8GHz", "4/8"),
    CORE_I5_12400F("2.1GHz", "6/12"),
    RYZEN_7_5800X("3.8GHz","8/16"),
    CORE_I7_12700KF("3.8GHz","12/20");

    private String speed;
    private String rope;


    CPUType(String speed, String rope) {
        this.speed = speed;
        this.rope = rope;
    }


    public String getSpeed(){
        return this.speed;
    }


    @Override
    public String toString() {
        return "CPUType{" +
                "speed='" + speed + '\'' +
                ", rope=" + rope +
                '}';
    }

    public String getRope() {
        return rope;
    }
}
