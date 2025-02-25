import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form2 extends JFrame {
    public Form2(){
        getContentPane().setLayout(new BorderLayout());
        Draw2 a = new Draw2();
        getContentPane().add(a,BorderLayout.CENTER);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
class Draw2 extends JPanel implements ActionListener{
    int r = 100 ;
    int m = 0;
    boolean decrease_r = true ;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(getWidth()/2-r, getHeight()/2-r, r*2, r*2);
        for (int i = 1; i<= 6; i++) {
            g.fillArc(getWidth()/2-r, getHeight()/2-r, r*2, r*2,i*60+m,30);
            
        }
    }
    public Draw2(){
        Timer timer1 = new Timer(50, this);
        timer1.start();
    }
    public void actionPerformed(ActionEvent e) {
        if(decrease_r){
            r -= 5;
            if(r==0){
                decrease_r = false;
            }
            
        }else{
            r += 5 ;
            if(r==100){
                decrease_r = true;
            }
        }
        m += 2;
        repaint();
    }
}   