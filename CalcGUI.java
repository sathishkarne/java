import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Panel;

public class CalcGUI implements ActionListener{
	Frame f1;
	Panel p1;
	Button btns[] = new Button[12];
	TextField tf1;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text = tf1.getText();   // initially empty or take the text value from textField
		for(int i=0;i<10;i++) {			
		    if(e.getSource() == btns[i]) {   //once press 
		    	
		    	if(tf1.getText().equals("0")) {  //if(textField==0)
		    		tf1.setText("");      // create empty TextField
		    	}
		    	text=tf1.getText()+btns[i].getName();   //textField followed by pressing button value
		    	tf1.setText(text);                       // display value in textField
		    }
		}
		if(e.getSource() == btns[10]) {     
			tf1.setText("0");          // if we press CE button set TextFiled to 0
		}
		
	}
	
	public CalcGUI() {
		f1 = new Frame("Calculator");
		p1 = new Panel();
		tf1 = new TextField(30);
		for(int i=0;i<10;i++) {
			Button btn = new Button(""+i);  // creating 10 buttons with numbers 0 to 9
			btn.setName(""+i);				// assigning name numbers 0 to 9 to buttons
			btns[i] = btn;					// taking new array of buttons
			btns[i].addActionListener(this); 
		}
		Button ce = new Button("CE");  // creating a button ce with the Name CE
		ce.addActionListener(this);
		Button eq = new Button("=");
		eq.addActionListener(this);
		btns[10] = ce;          // assigning btns[10] name as CE
		btns[11] = eq;
		
		GridLayout layout = new GridLayout(4,3);   // creating grid layout of 4X3
		p1.setLayout(layout);                    // creating pannel layout
		for(int i=9;i>0;i--) {              // display bttons as 9,8,7,...,1
			p1.add(btns[i]);				// adding buttons to pannel
		}
		p1.add(btns[10]);				// add CE
		p1.add(btns[0]);				// add 0
		p1.add(btns[11]);				// add =
		
		f1.add(tf1,BorderLayout.NORTH);    // locate textField in north position
		f1.add(p1,BorderLayout.CENTER);	   // locate button pannel center
		
		f1.setSize(200,300);
		f1.setVisible(true);
	}
	public static void main(String[] args) {
		CalcGUI gui = new CalcGUI();
	}


}
