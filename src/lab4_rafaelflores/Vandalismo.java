/*
Clase Hija Hija Vandalismo
 */
package lab4_rafaelflores;

import java.util.Date;

public class Vandalismo extends DelitoMenor{
    private String edificacion,nombreDuenio;
    private int pisos;

    public Vandalismo() {
    }

    public Vandalismo(String edificacion, String nombreDuenio, int pisos, String nombrePolicia, int idPolicia, int numeroCelda, String descripcion, String nombreVictima, String pais, String sentencia, int numeroDelito, boolean isCulpable, Date fecha) {
        super(nombrePolicia, idPolicia, numeroCelda, descripcion, nombreVictima, pais, sentencia, numeroDelito, isCulpable, fecha);
        this.edificacion = edificacion;
        this.nombreDuenio = nombreDuenio;
        this.pisos = pisos;
    }

    public void setEdificacion(String edificacion) {
        this.edificacion = edificacion;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getEdificacion() {
        return edificacion;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public int getPisos() {
        return pisos;
    }

    @Override
    public String toString() {
        String patron = super.toString()+"%20s|%20s|%20d|";
        return String.format(patron, this.getEdificacion(), this.getNombreDuenio(), this.getPisos());
    }
    
    
}
