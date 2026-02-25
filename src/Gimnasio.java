public class Gimnasio {

    private String codigo;
    private String nombre;
    private Socio[] listaSocios;
    private Sala[] listaSalas;
    private int responsableId = -1;

    private final int SOCIOS_MAX =12;
    private final int SALAS_MAX =6;

    public Gimnasio(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        listaSalas = new Sala[SALAS_MAX];
        listaSocios = new Socio[SOCIOS_MAX];
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
