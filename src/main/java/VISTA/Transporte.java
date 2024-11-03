
package VISTA;


public class Transporte {
    private static final double PRECIO_PASAJE = 37.5;
    private int cantidadPasajes;
    private String turno;

    public Transporte(int cantidadPasajes, String turno) {
        this.cantidadPasajes = cantidadPasajes;
        this.turno = turno;
    }

    // Calcula el importe total de la compra
    public double calcularImporteCompra() {
        return cantidadPasajes * PRECIO_PASAJE;
    }

    // Calcula el porcentaje de descuento basado en la cantidad de pasajes
    public double calcularDescuento() {
        double porcentajeDescuento = (cantidadPasajes >= 15) ? 0.08 : 0.05;
        return calcularImporteCompra() * porcentajeDescuento;
    }

    // Calcula el importe final a pagar después del descuento
    public double calcularImporteAPagar() {
        return calcularImporteCompra() - calcularDescuento();
    }

    // Calcula la cantidad de caramelos en base al importe a pagar
    public int calcularCaramelos() {
        double importeAPagar = calcularImporteAPagar();
        return (importeAPagar > 200) ? 2 * cantidadPasajes : 0;
    }
}

