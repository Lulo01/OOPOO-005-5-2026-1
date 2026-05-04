package matriz2x2;

public class Main2x2 {
    public static void main(String[] args) {

        System.out.println("Primera matriz");
        Matriz2x2 m1 = new Matriz2x2();
        m1.setDatos();
        m1.getDatos();

        System.out.println("\nSegunda matriz");
        Matriz2x2 m2= new Matriz2x2();
        m2.setDatos();
        m2.getDatos();

        System.out.println("\nSuma Matriz");
        Matriz2x2 resultado=m1.setSumar(m2);
        resultado.getDatos();

        System.out.println("\nMultiplicacion Matriz");
        Matriz2x2 resultado1=m1.setMultiplicacion(m2);
        resultado1.getDatos();
    }
}