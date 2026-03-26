package matriz3x3;
import java.util.Scanner;
public class Matriz3x3 {




    public int[][] data;
    public int filas;
    public int columnas;

    public Matriz3x3() {
        filas = 3;
        columnas = 3;
        data = new int[filas][columnas];
    }

    public void setDatos() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Digite:[" + i + "][" + j + "]: ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    public void getDatos() {
        System.out.println("Valores Matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Matriz3x3 setSumar(Matriz3x3 otra){
        Matriz3x3 resultado= new Matriz3x3();
         for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
           resultado.data[i][j]= this.data[i][j]+otra.data[i][j];
                }
            }
        return resultado;
    }
     public Matriz3x3 setMultiplicacion(Matriz3x3 otra){
        Matriz3x3 resultado1= new Matriz3x3();
         for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
           resultado1.data[i][j]=0;
           for(int k=0;k<columnas;k++){
            resultado1.data[i][j]=resultado1.data[i][j]+this.data[i][k]*otra.data[k][j];
           }
                }
            }
        return resultado1;
    }
   
    
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
