/*
Clase Hija Hija Trafico
 */
package lab4_rafaelflores;

import java.util.Date;

public class TraficoDrogas extends DelitoMayor{
    private String nombreDroga;
    private int cantidad;

    public TraficoDrogas() {
    }

    public TraficoDrogas(String nombreDroga, int cantidad, int gravedad, String descripcion, String nombreVictima, String pais, String sentencia, int numeroDelito, boolean isCulpable, String fecha) {
        super(gravedad, descripcion, nombreVictima, pais, sentencia, numeroDelito, isCulpable, fecha);
        this.nombreDroga = nombreDroga;
        this.cantidad = cantidad;
    }

    public void setNombreDroga(String nombreDroga) {
        this.nombreDroga = nombreDroga;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreDroga() {
        return nombreDroga;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        String patron = super.toString()+"%20s|%20d|";
        return String.format(patron, this.getNombreDroga(), this.getCantidad());
    }
    
    
}
