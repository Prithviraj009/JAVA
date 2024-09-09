//sessionl 2 java code

import java.awt.*;
import java.awt.event.*;

public class Main extends Frame
{  Button b1,b2,b3;
	Label l1,l2;
	TextField t1;
	Main(){
        setSize(500,500);
        setVisible(true);
		setLayout(new BorderLayout());
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel(new BorderLayout()); // adding border layout to panel as flow layout is default layout in panel
		b1 = new Button("Button !");
		b2 = new Button("button 2");
		b3 = new Button("BUTTON");
		l1 = new Label("Label 1");
		l2 = new Label("Label 2");
		p1.setBackground(Color.red);
		p2.setBackground(Color.orange);
		t1 = new TextField();
		p3.add(t1,BorderLayout.NORTH);	//adding text field to north in p3 panel
		p3.add(b3,BorderLayout.CENTER);

		p1.add(b1);
		p1.add(b2);
		p2.add(l1);
		p2.add(l2);
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.WEST);
		add(p3,BorderLayout.CENTER);
	
}
		
	
    public static void main(String args[])
    {
        Main d1 = new Main();
    }
}
