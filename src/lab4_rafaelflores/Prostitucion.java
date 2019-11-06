/*
    Calse hija Dhija Prostitucion
 */
package lab4_rafaelflores;

import java.util.Date;

public class Prostitucion extends DelitoMenor{
    private String nombreSolicitante;

    public Prostitucion() {
    }

    public Prostitucion(String nombreSolicitante, String nombrePolicia, int idPolicia, int numeroCelda, String descripcion, String nombreVictima, String pais, String sentencia, int numeroDelito, boolean isCulpable, String fecha) {
        super(nombrePolicia, idPolicia, numeroCelda, descripcion, nombreVictima, pais, sentencia, numeroDelito, isCulpable, fecha);
        this.nombreSolicitante = nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    @Override
    public String toString() {
        String patron = super.toString()+"%20s|";
        return String.format(patron, this.getNombreSolicitante());
    }
    
    
}
