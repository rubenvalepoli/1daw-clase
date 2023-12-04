package ejercicios.tema08.ejercicio01;
import java.util.Scanner;
public class Coche {
        static Scanner scanner = new Scanner(System.in);
        private String marca,modelo,color;
        private int numeroBastidor, velocidad = 0;


        public String getMarca() {
                return marca;
        }

        public void setMarca(String marca) {
                this.marca = marca;
        }

        public String getModelo() {
                return modelo;
        }

        public void setModelo(String modelo) {
                this.modelo = modelo;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public int getNumeroBastidor() {
                return numeroBastidor;
        }

        public void setNumeroBastidor(int numeroBastidor) {
                this.numeroBastidor = numeroBastidor;
        }

        public int getVelocidad() {
                return velocidad;
        }

        public void setVelocidad(int velocidad) {
                this.velocidad = velocidad;
        }

        public void acelerar (int aumento){
                velocidad += aumento;
        }
        public void reducir (int reduciendo){
                velocidad -= reduciendo;
        }

        /*EJERCICIO 3*/
        public int aumentarvelocidad(){
                int ponvelocidad;
                System.out.println("Introduce cuanta velocidad quieres subirle");
                ponvelocidad = scanner.nextInt();

                int aumentarvelocidad = getVelocidad() + ponvelocidad;
                return aumentarvelocidad;
        }

        public int disminuirvelocidad(){
                int quitavelocidad;
                System.out.println("Introduce cuanta velocidad quieres disminuir");
                quitavelocidad = scanner.nextInt();

                int disminuirvelocidad = getVelocidad() - quitavelocidad;
                return disminuirvelocidad;
        }

        /*EJERCICIO 4*/
        @Override
        public String toString() {
                return "Coche{" +
                        "marca='" + marca + '\'' +
                        ", modelo='" + modelo + '\'' +
                        ", color='" + color + '\'' +
                        ", numeroBastidor=" + numeroBastidor +
                        '}';
        }
}
