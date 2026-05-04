package matriz3x3;

public class Main3x3 {
    public static void main(String[] args) {

        System.out.println("Primera matriz");
        Matriz3x3 m1 = new Matriz3x3();
        m1.setDatos();
        m1.getDatos();

        System.out.println("\nSegunda matriz");
        Matriz3x3 m2= new Matriz3x3();
        m2.setDatos();
        m2.getDatos();

        System.out.println("\nSuma Matriz");
        Matriz3x3 resultado=m1.setSumar(m2);
        resultado.getDatos();

        System.out.println("\nMultiplicacion Matriz");
        Matriz3x3 resultado1=m1.setMultiplicacion(m2);
        resultado1.getDatos();
    }
}