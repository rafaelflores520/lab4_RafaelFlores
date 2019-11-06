/*
Clase Hija Hija Secuestro
 */
package lab4_rafaelflores;

import java.util.Date;

public class Secuestro extends DelitoMayor{
    private String diasRetenido;
    private boolean muerto;

    public Secuestro() {
    }

    public Secuestro(String diasRetenido, boolean muerto, int gravedad, String descripcion, String nombreVictima, String pais, String sentencia, int numeroDelito, boolean isCulpable, String fecha) {
        super(gravedad, descripcion, nombreVictima, pais, sentencia, numeroDelito, isCulpable, fecha);
        this.diasRetenido = diasRetenido;
        this.muerto = muerto;
    }

    public void setDiasRetenido(String diasRetenido) {
        this.diasRetenido = diasRetenido;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    public String getDiasRetenido() {
        return diasRetenido;
    }

    public boolean isMuerto() {
        return muerto;
    }

    @Override
    public String toString() {
        String patron = super.toString()+"%20s|%20s|";
        return String.format(patron, this.getDiasRetenido(), this.isMuerto());
    }
    
    
}
