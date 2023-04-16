import java.awt.*;
import java.awt.event.*;
class Banko extends Frame implements ActionListener
{
Label l1,l2,l3;
TextField tf1,tf2,tf3;
Button b1,b2;

public Banko()
{
setLayout(new FlowLayout());
l1=new Label("Please enter your initial balance:");
l2=new Label("Please enter your amount to do transaction:");
l3=new Label("Your balance after transaction is:");
b1=new Button("Deposit");
b2=new Button("Withdraw");
tf1=new TextField(10);
tf2=new TextField(10);
tf3=new TextField(10);
add(l1);
add(tf1);
add(l2);
add(tf2);
add(b1);
add(b2);
add(l3);
add(tf3);
b1.addActionListener(this);
b2.addActionListener(this);
addWindowListener(new MyWindowAdapter());
}

public void actionPerformed(ActionEvent ae)
{
int inbal,amt;
inbal=Integer.parseInt(tf1.getText());
amt=Integer.parseInt(tf2.getText());
if(ae.getSource()==b1)
{
inbal=inbal+amt;
tf3.setText(" "+inbal);
}
if(ae.getSource()==b2)
{
inbal=inbal-amt;
tf3.setText(" " +inbal);
}
}

public static void main(String args[])
{
Banko b=new Banko();
b.setSize(400,400);
b.setVisible(true);
}
}
class MyWindowAdapter extends WindowAdapter
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
}