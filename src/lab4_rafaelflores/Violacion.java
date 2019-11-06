/*
Clase Hija Hija Violacion
 */
package lab4_rafaelflores;

import java.util.Date;

public class Violacion extends DelitoMayor{
    private int edadVictima;

    public Violacion() {
    }

    public Violacion(int edadVictima, int gravedad, String descripcion, String nombreVictima, String pais, String sentencia, int numeroDelito, boolean isCulpable, Date fecha) {
        super(gravedad, descripcion, nombreVictima, pais, sentencia, numeroDelito, isCulpable, fecha);
        this.edadVictima = edadVictima;
    }

    public void setEdadVictima(int edadVictima) {
        this.edadVictima = edadVictima;
    }

    public int getEdadVictima() {
        return edadVictima;
    }

    @Override
    public String toString() {
        String patron = super.toString()+"%20d|";
        return String.format(patron, this.getEdadVictima());
    }
    
    
}
