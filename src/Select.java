import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Select extends JFrame {
	int what;
	 int move=3;
     int score=0;
	Select(JPanel background) {
		 JLabel item = new JLabel();
		 item.setBounds(375, 303, 113, 170);
//		do {
			what = ((int)(Math.random()*3)+1);
			System.out.printf("%d", what);
			
			if(what==1) {
				item.setIcon(new ImageIcon("D:\\box1.jpg"));
				background.add(item);
			}
			if(what==2) {
				item.setIcon(new ImageIcon("D:\\box2.jpg"));
				background.add(item);
			}
			if(what==3) {
				item.setIcon(new ImageIcon("D:\\box3.jpg"));
				background.add(item);
			}
		
			
//		}while(heart!=3);
	        System.out.printf("³¡!");
	}
}
        

