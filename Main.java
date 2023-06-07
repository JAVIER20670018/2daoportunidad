// Clase principal con el método main
public class Main {
    public static void main(String[] args) {
        EmpleadoBase empleadoBase = new EmpleadoBase("Javier", 23, 4800, 1200);
        EmpleadoHoras empleadoPorHoras = new EmpleadoHoras("Juan", 25, 1800, 60, 10);
        EmpleadoComision empleadoComision = new EmpleadoComision("Jesus", 25, 8800, 120, 18);

        System.out.println(empleadoBase.obtenerDetalles());
        System.out.println();
        System.out.println(empleadoPorHoras.obtenerDetalles());
        System.out.println();
        System.out.println(empleadoComision.obtenerDetalles());
    }
}



