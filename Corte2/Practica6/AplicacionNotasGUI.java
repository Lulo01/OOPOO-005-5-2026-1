
package practicagui;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;


public class AplicacionNotasGUI extends JFrame {

    private static final Color COLOR_FONDO = new Color( 245, 248, 252);
    private static final Color COLOR_TITULO = new Color( 20, 70, 140);
    private static final Color COLOR_BOTON_AZUL = new Color( 30, 100, 180)
            ;
    private static final Color COLOR_BOTON_VERDE = new Color( 40, 140, 90)
            ;
    private static final Color COLOR_BOTON_ROJO = new Color( 180, 60, 60);
    private static final Color COLOR_BOTON_GRIS = new Color( 245, 248, 252)
            ;
    
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtNota1;
    private JTextField txtNota2;
    private JTextField txtNota3;
    
    private JComboBox<String> cmbPrograma;
    
    private JRadioButton rbDiurna;
    private JRadioButton rbNocturna;
    private ButtonGroup grupoJornada;
    
    private JTable tablaEstudiantes;
    private DefaultTableModel modeloTabla;
    private JLabel lblEstado;
    private JLabel lblResumen;
    
    public AplicacionNotasGUI(){
    configurarVentana();
    }
    
    public void configurarVentana(){
    setTitle("Registro de estudiantes");
    setSize(1100,600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
        new AplicacionNotasGUI().setVisible(true);
        });
        
    }
    
}
