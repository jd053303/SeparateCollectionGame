import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class playscreen extends JFrame {
    JScrollPane scrollPane;
    ImageIcon icon =  new ImageIcon("d:\\thr.png"); ;
    private int heart=3;
    private int what;
    private int score=-1;
    
    playscreen() {
        JPanel background = new JPanel() {
            public void paintComponent(Graphics g) {
                g.drawImage(icon.getImage(), 0, 0, null);
                setOpaque(false); 
                super.paintComponent(g);
            }
        };
        scrollPane = new JScrollPane(background);
        background.setLayout(null);
        
        JLabel item = new JLabel();
        
		JLabel sco = new JLabel(); 
        JLabel ht = new JLabel();
		sco.setBounds(660, 20, 90, 10);
		ht.setBounds(560, 20, 90, 10);
     	background.add(sco);
     	background.add(ht);
		
    	this.addKeyListener(new KeyAdapter(){ 
    		int move;
    		
             public void keyPressed(KeyEvent e){  
              switch(e.getKeyCode()){   
               case KeyEvent.VK_LEFT:
            	   if(move>1) {
            		   item.setLocation(item.getX()-153, item.getY()); 
            		   move--;
            	   }
            	   break;
               case KeyEvent.VK_RIGHT:
            	   if(move<6) {
            		   item.setLocation(item.getX()+155, item.getY()); 
            		   move++;
            	   }
            	   break;
               case KeyEvent.VK_SPACE:
            	   
                   break;
               case KeyEvent.VK_UP:
            	   int a = Right.right(move, what);
            	   if(a==1) score++;
            	   else heart--;
                   sco.setText("Score : "+ score);
              	   ht.setText("Heart : "+ heart);
            	   img();
            	   move=3;
            	   break;
              }
              System.out.printf("\n%d %d %d %d", move, what, score, heart);
             }

			private void img() {
				what = ((int)(Math.random()*3)+1);
    			System.out.printf("\n%d\n", what);
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
    			item.setBounds(375, 303, 113, 170);
			}
        });	
        System.out.printf("\n³¡");
        setContentPane(scrollPane);
    }
    public static void main(String[] args) {
    	playscreen frame = new playscreen();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1040, 615);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}