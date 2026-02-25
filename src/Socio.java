public class Socio {
    private final int numeroSocio;
    private final String nombre;

    public Socio(int numeroSocio, String nombre) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
            return "[" + numeroSocio + "] " + nombre;
        }

}

