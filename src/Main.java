public class Main {

    public static void main(String[] args) {
        Socio socio1;
        Socio socio2;
        Sala sala1;
        Sala sala2;

    socio1= new Socio(1,"Harry Potter");
    socio2= new Socio(2, "Aha");

    sala1 = new Sala(1,"ejercicios difíciles");
    sala2 = new Sala(2,"ejercicios fáciles");

    System.out.println(socio1.toString());
    System.out.println(socio2.toString());

    System.out.println(sala1.toString());
    System.out.println(sala2.toString());
    }
}