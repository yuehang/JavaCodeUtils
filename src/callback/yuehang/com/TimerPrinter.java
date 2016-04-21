package callback.yuehang.com;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimerPrinter implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Date now = new Date();
		System.out.println("The time now is:"+now);
		System.out.println("------------------------------------------------");
		Toolkit.getDefaultToolkit().beep();
	}
	
}
