package PACKAGE_NAME;

public class Gimnasio {
    private String codigo;
    private String nombre;
    private Socio[] listaSocios = new Socio[12];
    private Sala[] listaSalas = new Sala[6];
    private int responsableId = -1;


    public Gimnasio(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public boolean registrarSocio(Socio s){
        boolean registrado = false;
        for (int i = 0; i < listaSocios.length; i++) {
            if (listaSocios[i] == null && !registrado) {
                listaSocios[i] = s;
                registrado = true;
            }
        }
    return registrado;

    }

    public Socio expulsarSocio(int numero){
        boolean expulsadoCorrecto = false;
        Socio socio = null;
        for (int i = 0; i < listaSocios.length; i++) {

        }
        return socio;
    }


    @Override
    public String toString() {
        return "Gimnasio{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
}
