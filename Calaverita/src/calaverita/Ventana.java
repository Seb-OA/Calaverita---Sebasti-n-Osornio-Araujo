
package calaverita;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Sebastián Osornio Araujo
 */
public class Ventana extends JFrame{
    
    private JPanel panel;
    
    public Ventana (){
        setSize(500,500); //Establecemos el tamaño de la ventana
        setTitle("Calaverita: Para Gaby"); //Establecemos el titulo de la ventana
        //setLocation(100,200); //Establecemos la posición inicial de la ventana
        //setBounds(100, 200, 500, 500); //Establecemos la posición inicial y el tamaño de la ventana
        setLocationRelativeTo(null); //Establecemos la ventana en el centro de la pantalla
        
        //setResizable(false); //Establecemos si la ventana puede cambiar de tamaño o no
        setMinimumSize(new Dimension(200, 200)); //Establecemos el tamaño mínimo
        
        //this.getContentPane().setBackground(Color.RED); //Establecemos el color de la ventana
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Con esto automaticamente se deja de ejecutar el programa a la hora de cerrar la ventana
    }
    
    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
    }
    
    private void colocarPaneles(){
        panel = new JPanel(); //Creación de un panel
        //panel.setBackground(Color.GREEN); //Establecemos el color del panel
        panel.setLayout(null); //Desactivando el Layout "Diseño"
        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }
    
    private void colocarEtiquetas(){
        //Etiqueta 1 - etiqueta tipo texto
        JLabel etiqueta1 = new JLabel(); //Creamos una etiqueta
        etiqueta1.setText("Calaverita"); //Establecemos el texto de la etiqueta
        etiqueta1.setBounds(90, -10, 300, 80);
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER); //Establecemos la alineación horizontal del texto
        etiqueta1.setForeground(Color.BLUE); //Establecemos el color de la letra
        //etiqueta.setOpaque(true); //Habilitar o Deshabilitar el fondo de la etiqueta
        //etiqueta.setBackground(Color.BLACK); //Cambiamos el color del fondo de la etiqueta
        etiqueta1.setFont(new Font("cooper black", Font.PLAIN, 40)); //Establecemos la fuente del texto
        panel.add(etiqueta1); //Agregamos la etiqueta al panel
        
        //Etiqueta 2 - etiqueta tipo imagen
        ImageIcon imagen = new ImageIcon("Calaverita.jpg");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(70, 65, 343, 400);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }
    
    private void colocarBotones(){
        //Boton - botón de texto
        JButton boton = new JButton();
        boton.setText("Start"); //Estabelcemos un texto al botón
        boton.setBounds(190, 430,100, 30);
        boton.setEnabled(true); //Habilitar o Deshabilitar las funciones del botón
        boton.setForeground(Color.RED); //Establecemos el color de la letra del botón
        boton.setFont(new Font("cooper black", Font.BOLD, 20)); //Establecemos la fuente de la letra del botón
        boton.setMnemonic('d'); //Establecemos alt + letra
        panel.add(boton);
        
        //Proceso para que el funcionamiento del botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                TextoLiterario texto = new TextoLiterario();
                texto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                texto.setVisible(true);

                setVisible(false);

            }
        });
    }
}
