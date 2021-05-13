import java.awt.*;
 
import javax.swing.*;
 
public class timer extends JFrame{
    JLabel timerLabel = null;
    public timer()
    {
        this.setTitle("Timer Test");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        timerLabel = new JLabel("0");
        timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
        c.add(timerLabel);
        this.setSize(300,150);
        this.setVisible(true);
        int k = 5;
        while(true)
        {
            timerLabel.setText(""+k);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            k--;
            if(k<0) break;
        }
    }
    public static void main(String[] args) {
        new timer();
    }
}
