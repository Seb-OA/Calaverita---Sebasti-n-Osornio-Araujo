
package calaverita;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author SEbastián Osornio Araujo
 */
public class TextoLiterario extends JFrame {
    
     private JPanel panel;
    
    public TextoLiterario (){
        setSize(500,500); //Establecemos el tamaño de la ventana
        setTitle("Texto Literario"); //Establecemos el titulo de la ventana
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
        colocarBotones();
        colocarAreasDeTexto();
    }
    
    private void colocarPaneles(){
        panel = new JPanel(); //Creación de un panel
        //panel.setBackground(Color.GREEN); //Establecemos el color del panel
        panel.setLayout(null); //Desactivando el Layout "Diseño"
        this.getContentPane().add(panel); //Agregamos el panel a la ventana
    }
    
    private void colocarBotones(){
        //Boton - botón de texto
        JButton boton = new JButton();
        boton.setText("Return"); //Estabelcemos un texto al botón
        boton.setBounds(3, 400,95, 40);
        boton.setEnabled(true); //Habilitar o Deshabilitar las funciones del botón
        boton.setForeground(Color.RED); //Establecemos el color de la letra del botón
        boton.setFont(new Font("cooper black", Font.BOLD, 15)); //Establecemos la fuente de la letra del botón
        boton.setMnemonic('d'); //Establecemos alt + letra
        panel.add(boton);
        
        //Proceso para que el funcionamiento del botón
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                Ventana texto = new Ventana();
                texto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                texto.setVisible(true);

                setVisible(false);

            }
        });
        
    }
    
    private void colocarAreasDeTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(100, 10, 300, 445);
        areaTexto.setBackground(Color.BLUE);
        areaTexto.setForeground(Color.WHITE);
        areaTexto.setFont(new Font("comic sans ms", Font.PLAIN, 18));
        areaTexto.setText("A mi amiga Gaby\n" + "que la flaca se llevó\n" + "por andar en la parranda\n" + "en la fiesta y el danzón.");
        //Añade más texto al area
        areaTexto.append("\n\nTan alegre Gaby\n" + "que a la flaca conquistó\n" + "con su gracia y alegría\n" + "con su baile, con su son\n" + "y por ello no dudó\n" + "en cargar con sus huesitos\n" + "y llevarla a un pachangón.");
        areaTexto.append("\n\nHoy mi amiga Gaby\n" + "muy feliz se va a bailar\n" + "con su amiga la huesuda\n" + "que no para de gozar\n" + "de una chela bien helada\n" + "cuando dejan de bailar.");
        areaTexto.setEditable(false); //Editar el area de texto
        panel.add(areaTexto);
    }
    
}
