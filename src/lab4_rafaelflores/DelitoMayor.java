/*
Clase Hija Delito Mayor
 */
package lab4_rafaelflores;

import java.util.Date;

public class DelitoMayor extends Delito{
    private int gravedad;

    public DelitoMayor() {
    }

    public DelitoMayor(int gravedad, String descripcion, String nombreVictima, String pais, String sentencia, int numeroDelito, boolean isCulpable, String fecha) {
        super(descripcion, nombreVictima, pais, sentencia, numeroDelito, isCulpable, fecha);
        this.gravedad = gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    public int getGravedad() {
        return gravedad;
    }

    @Override
    public String toString() {
        String patron = super.toString()+"%20d|";
        return String.format(patron, this.getGravedad());
    }
    
    
}
