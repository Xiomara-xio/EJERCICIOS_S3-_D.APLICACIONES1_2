
package VISTA;


public class Producto {
    private double precioPorDocena;
    private int cantidadDocenas;

    public Producto(double precioPorDocena, int cantidadDocenas) {
        this.precioPorDocena = precioPorDocena;
        this.cantidadDocenas = cantidadDocenas;
    }

    public double calcularImporteCompra() {
        return precioPorDocena * cantidadDocenas;
    }

    public double calcularDescuento() {
        if (cantidadDocenas >= 10) {
            return calcularImporteCompra() * 0.20;
        } else {
            return calcularImporteCompra() * 0.10;
        }
    }

    public double calcularImporteAPagar() {
        return calcularImporteCompra() - calcularDescuento();
    }

    public int calcularLapiceros() {
        if (calcularImporteAPagar() >= 200) {
            return cantidadDocenas * 2;
        } else {
            return 0;
        }
    }
}

