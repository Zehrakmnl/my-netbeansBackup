import java.awt.event.*;
import javax.swing.JFrame;


public class Window extends JFrame {
    public Window(){
        setTitle("MY WINDOW");
        setBounds(600,400,300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    
        addKeyListener(new KeyAdapter(){
           public void keyPressed (KeyEvent evt){
               formKeyPressed(evt);
           }
        });
        addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent evt){
               formMouseClicked(evt);
           }
        });
        addWindowListener(new WindowAdapter(){
           public void windowOpened(WindowEvent evt){
               formWindowOpened(evt);
           }
        });
    }
    public static void main(String args[]){
        new Window();
    }
    private void formKeyPressed(KeyEvent e){
        System.out.println("Basilan tus : " +e.getKeyChar());
    }
    private void formMouseClicked(MouseEvent e){
        System.out.println("Tiklanan koordinat : "+"(" +e.getX()+ "," +e.getY()+")");
    }
    private void formWindowOpened(WindowEvent e){
        System.out.println("Pencere boyutu : "+"(" +getSize().width+ "," +getSize().height+")");
    }
}

