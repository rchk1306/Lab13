import java.awt.*;
import javax.swing.*;

public class Form1 extends JFrame {
    public Form1(){
        getContentPane().setLayout(new BorderLayout());
        Draw1 a = new Draw1();
        getContentPane().add(a,BorderLayout.CENTER);
        setSize(370, 370);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
class Draw1 extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();
        int s = 190;
        int x = (w-s)/2;
        int y = (h-s)/2;

        g.setFont(new Font("Tahoma", Font.CENTER_BASELINE, 22));
        g.drawString("Just Keep Smiling", x, y-20);
        g.setColor(Color.BLACK);
        g.fillOval( x-3, y-3, s+6, s+6);
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, s, s);
        g.setColor(Color.BLACK);
        g.fillOval(x+50, y+43, 38, 38);
        g.fillOval(x+100, y+43, 38, 38);
        g.drawArc(x-5, y-45, 200, 200, 235, 70);

        Polygon xy = new Polygon();
        xy.addPoint(x+95, y+192);
        xy.addPoint(x+190, y+170);
        xy.addPoint(x+190, y+214);
        xy.addPoint(x, y+170);
        xy.addPoint(x, y+214);
        g.setColor(Color.red);
        g.fillPolygon(xy);
        g.setColor(Color.black);
        g.drawPolygon(xy);
    }
}   
