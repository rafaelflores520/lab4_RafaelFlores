/*
Clase Hija Terrorista
 */
package lab4_rafaelflores;

public class Terrorista extends Criminal implements Agente{
    private String paisAtaque, ciudad, metodo;

    public Terrorista() {
    }

    public Terrorista(String paisAtaque, String ciudad, String metodo, String nombre, String genero, String paisResidencia, String descripcionFisica, int edad, boolean encarcelado) {
        super(nombre, genero, paisResidencia, descripcionFisica, edad, encarcelado);
        this.paisAtaque = paisAtaque;
        this.ciudad = ciudad;
        this.metodo = metodo;
    }

    public void setPaisAtaque(String paisAtaque) {
        this.paisAtaque = paisAtaque;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getPaisAtaque() {
        return paisAtaque;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getMetodo() {
        return metodo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public void Delito() {
        System.out.println("El cliente solicito un atentado en: " + this.getPaisAtaque() + ", especificamente en "
                + "\nla ciudad de: " +this.getCiudad()+". Para el atentado se uso el metodo de: "+ this.getMetodo()
                + "\n. Resultando en eliminacion de los objetivos..."
                + "\n"
                + "\nGracias por usar nuestro servicios. Atentamente, agente: "+super.getNombre()+" Terrorista");
    }
    
}
