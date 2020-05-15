
package veterianaria;


public class Cliente {
    private int nrocliente,antig, edad;
    private String nombreC, nombreM;

    public int getNrocliente() {
        return nrocliente;
    }

    public void setNrocliente(int nrocliente) {
        this.nrocliente = nrocliente;
    }

    public int getAntig() {
        return antig;
    }

    public void setAntig(int antig) {
        this.antig = antig;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public Cliente(int nrocliente, int antig, int edad, String nombreC, String nombreM) {
        this.nrocliente = nrocliente;
        this.antig = antig;
        this.edad = edad;
        this.nombreC = nombreC;
        this.nombreM = nombreM;
    }
    
    public String toStringCliente(){
    return "Nro de cliente: " + nrocliente + "\n"+
            "Nombre cliente:" + nombreC + "\n"+
            "Antiguedad: " + antig + "\n"+
            "Nombre de mascota: " + nombreM + "\n"+
            "Edad de mascota: " + edad ;
    }
    
    
}
