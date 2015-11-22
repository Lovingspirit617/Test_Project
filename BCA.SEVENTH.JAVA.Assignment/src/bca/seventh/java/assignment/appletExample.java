package bca.seventh.java.assignment;

import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class appletExample extends Applet implements ActionListener
{
JButton b1,b2;
Label l1,l2,l3,l4,l5,lblMale, lblFemale;
TextField t1,t2,t3;
JRadioButton male, female;
ButtonGroup bg;
List city=new List();
public void init()
{
b1=new JButton("submit");
b2=new JButton("Cancel");
l1=new Label("Enter your Name\n");
l2=new Label("Enter Address");
l3=new Label("Enter feedBack\n");
l4=new Label("select a city\n");
l5=new Label("Select a gender");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
lblMale=new Label("Male");
lblFemale=new Label("Female");
male=new JRadioButton("male");
female=new JRadioButton("Female");
bg=new ButtonGroup();
bg.add(male);
bg.add(female);

city.add("kathmandu");
city.add("chitwam");
city.add("Biratnagar");
city.add("BUtwal");
GridBagLayout gbag =new GridBagLayout();
GridBagConstraints gbc=new GridBagConstraints();
setLayout(gbag);
setBackground(Color.green);
// for name 
gbc.gridwidth=1;
 gbc.gridx=0;
 gbc.gridy=0;
 gbag.setConstraints(l1,gbc);
 add(l1);
 //for NAME TEXTBOX
 gbc.gridwidth=1;
  gbc.gridx=1;
  gbc.gridy=0;
  gbc.insets=new Insets(1,2,3,2);
  gbag.setConstraints(t1,gbc);
  add(t1);
  // for address ADDRESS LABEL  
  gbc.gridwidth=1;
  gbc.gridwidth=1;
  gbc.gridx=0;
  gbc.gridy=1;
 gbag.setConstraints(l2,gbc);
 add(l2);
 // for address textbox
gbc.gridheight=1;
gbc.gridwidth=1;
gbc.gridx=1;
gbc.gridy=1;
gbag.setConstraints(t2,gbc);
add(t2);
//phone number
gbc.gridwidth=1;
//gbc.ipady=5;
gbc.gridx=0;
gbc.gridy=2;
gbag.setConstraints(l3,gbc);
add(l3);
//phone number text box
gbc.gridwidth=1;
gbc.gridx=1;
gbc.gridy=2;
gbag.setConstraints(t3, gbc);
add(t3);
 //select city
gbc.gridwidth=1;
gbc.gridx=0;
gbc.gridy=3;
gbag.setConstraints(l4, gbc);
add(l4);
// city options
gbc.gridwidth=1;
gbc.gridx=1;
gbc.gridy=3;
gbag.setConstraints(city,gbc);
add(city);
// for gender label
gbc.gridwidth=1;
gbc.gridx=0;
gbc.gridy=4;
gbag.setConstraints(l5,gbc);
add(l5);
//for select gender Radio.
gbc.gridwidth=1;
gbc.gridx=0;
gbc.gridy=5;
gbag.setConstraints(male,gbc);
add(male);
gbc.gridwidth=1;
gbc.gridx=1;
gbc.gridy=5;
gbag.setConstraints(female, gbc);
add(female);
gbc.gridwidth=1;
gbc.gridheight=1;
gbc.gridx=0;
gbc.gridy=6;
gbc.insets=new Insets(10,1,1,1);
gbag.setConstraints(b1, gbc);
add(b1);
gbc.gridwidth=1;
gbc.gridheight=1;
gbc.gridx=1;
gbc.gridy=6;
gbc.insets=new Insets(10,1,1,1);
gbag.setConstraints(b2, gbc);
add(b2);
setSize(400,400);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
    JFrame jp =new JFrame("this is new window");
    jp.setSize(400,400);
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5;
l1=new JLabel("Name= ");
l2=new JLabel("Address= ");
l3=new JLabel("feedBack= ");
l4=new JLabel("City= ");
l5=new JLabel("Gender= ");
t1=new JTextField(this.t1.getText());
t2=new JTextField(this.t2.getText());
t3=new JTextField(this.t3.getText());
t4=new JTextField(this.city.getSelectedItem());
t5=new JTextField(this.bg.getSelection().toString());

jp.add(l1);jp.add(l2);jp.add(l3);jp.add(l4);jp.add(l5);jp.add(t1);jp.add(t2);jp.add(t3);jp.add(t4);
jp.add(t5);

add(jp);
jp.setVisible(true);
}
}
public static void main(String s[])
{
    appletExample ob=new appletExample();
}
}