package swing.yuehang.com;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SimpleFrameTest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				SimpleFrame frame = new SimpleFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);	
			}
		});
	}
}

class SimpleFrame extends JFrame{
	public SimpleFrame(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dimension = kit.getScreenSize();
		setSize(dimension.width/2, dimension.height/2);
		setLocationRelativeTo(this);
		setTitle("简单框架");
		setResizable(true);
		Image img = new ImageIcon("res/icon.png").getImage();
		setIconImage(img);
	}
}
