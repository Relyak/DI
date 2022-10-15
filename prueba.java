
import java.awt.*;
import javax.swing.*;

public class prueba{
    public static void main(String[] args) {
        miMarco marco1= new miMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
   
}
class miMarco extends JFrame{
    public miMarco(){
        /*setSize(500,300); //esto para darle tamaño a la ventana
        setLocation(500, 500);*///esto para poner donde se abrirá la ventana
        setBounds(500,300,250,250);//esto para elegir tamaño + donde se abrirá
       // setResizable(false);//esto para que no pueda cambiar el tamaño
      // setExtendedState(Frame.MAXIMIZED_BOTH);//esto para que se abra al completo
      setTitle("Holaaa");//nombre de la ventana 
      Toolkit pantalla= Toolkit.getDefaultToolkit();
      Dimension tamanoPantalla= pantalla.getScreenSize();
      int alturaPantalla=tamanoPantalla.height;
      int anchoPantalla=tamanoPantalla.width;
      setSize(anchoPantalla/2,alturaPantalla/2);
      setLocation(anchoPantalla/4,alturaPantalla/4);
        Image miIcono=pantalla.getImage("platano.png");
        setIconImage(miIcono);

    }
}