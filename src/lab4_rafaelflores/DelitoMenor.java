/*
Clase Hija Delitop Menor
 */
package lab4_rafaelflores;

import java.util.Date;

public class DelitoMenor extends Delito{
    private String nombrePolicia;
    private int idPolicia, numeroCelda;

    public DelitoMenor() {
    }

    public DelitoMenor(String nombrePolicia, int idPolicia, int numeroCelda, String descripcion, String nombreVictima, String pais, String sentencia, int numeroDelito, boolean isCulpable, Date fecha) {
        super(descripcion, nombreVictima, pais, sentencia, numeroDelito, isCulpable, fecha);
        this.nombrePolicia = nombrePolicia;
        this.idPolicia = idPolicia;
        this.numeroCelda = numeroCelda;
    }

    public void setNombrePolicia(String nombrePolicia) {
        this.nombrePolicia = nombrePolicia;
    }

    public void setIdPolicia(int idPolicia) {
        this.idPolicia = idPolicia;
    }

    public void setNumeroCelda(int numeroCelda) {
        this.numeroCelda = numeroCelda;
    }

    public String getNombrePolicia() {
        return nombrePolicia;
    }

    public int getIdPolicia() {
        return idPolicia;
    }

    public int getNumeroCelda() {
        return numeroCelda;
    }

    @Override
    public String toString() {
        String patron = super.toString()+"%20s%20d|%20d|";
        return String.format(patron, this.getNombrePolicia(), this.getIdPolicia(), this.getNumeroCelda());
    }
    
    
}
