package callback.yuehang.com;

import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TestDemo {
	public static void main(String[] args){
		System.out.println("Start testing......");
		ActionListener tp = new TimerPrinter();
		Timer t = new Timer(10000, tp);
		t.start();
		JOptionPane.showMessageDialog(null, "Do you want to quit?");
		System.exit(0);
	}
}
