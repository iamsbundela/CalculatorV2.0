import java.awt.*;
import javax.swing.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Event;
import java.awt.Font;

class CalculatorV2 implements ActionListener 
{
    //Global Declaration
    JFrame frm;
    String s1, s2, s3, s4;
    int c;
    double total = 0;
    TextField tf;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bDot, bAdd, bSub, bMul, bDiv, bEql, bClr;
    Font f1 = new Font("Helvetica", Font.PLAIN, 22);
    Font f2 = new Font("Cambria", Font.PLAIN, 22);
    //Constructor

    CalculatorV2()
    {
        //Frame
        JFrame frm = new JFrame("Calculator V2.0");
        frm.setSize(400, 600);
        frm.setLocation(100, 70);
        frm.setDefaultCloseOperation(3);
        frm.setVisible(true);
        frm.setLayout(null);
        
        //TextField
        tf = new TextField(50);
        tf.setBounds(50, 50, 300, 70);

        //Buttons
        b0 = new Button("0");
        b0.setBounds(50, 470, 140, 60);
        b1 = new Button("1");
        b1.setBounds(50, 390, 60, 60);
        b2 = new Button("2");
        b2.setBounds(130, 390, 60, 60);
        b3 = new Button("3");
        b3.setBounds(210, 390, 60, 60);
        b4 = new Button("4");
        b4.setBounds(50, 310, 60, 60);
        b5 = new Button("5");
        b5.setBounds(130, 310, 60, 60);
        b6 = new Button("6");
        b6.setBounds(210, 310, 60, 60);
        b7 = new Button("7");
        b7.setBounds(50, 230, 60, 60);
        b8 = new Button("8");
        b8.setBounds(130, 230, 60, 60);
        b9 = new Button("9");
        b9.setBounds(210, 230, 60, 60);
        bDot = new Button(".");
        bDot.setBounds(210, 470, 60, 60);
        bAdd = new Button("+");
        bAdd.setBounds(290, 310, 60, 60);
        bSub = new Button("-");
        bSub.setBounds(290, 230, 60, 60);
        bDiv = new Button("/");
        bDiv.setBounds(50, 150, 60, 60);
        bMul = new Button("*");
        bMul.setBounds(130, 150, 60, 60);
        bEql = new Button("=");
        bEql.setBounds(290, 390, 60, 140);
        bClr = new Button("Clear");
        bClr.setBounds(210, 150, 140, 60);
        //Adding Elements
        frm.add(tf);
        frm.add(bDot);
        frm.add(bEql);
        frm.add(bDiv);
        frm.add(bMul);
        frm.add(bSub);
        frm.add(bClr);
        frm.add(bAdd);
        frm.add(b0);
        frm.add(b1);
        frm.add(b2);
        frm.add(b3);
        frm.add(b4);
        frm.add(b5);
        frm.add(b6);
        frm.add(b7);
        frm.add(b8);
        frm.add(b9);
        //Formatting
        tf.setFont(f1);
        b0.setFont(f2);
        b1.setFont(f2);
        b2.setFont(f2);
        b3.setFont(f2);
        b4.setFont(f2);
        b5.setFont(f2);
        b6.setFont(f2);
        b7.setFont(f2);
        b8.setFont(f2);
        b9.setFont(f2);
        bAdd.setFont(f2);
        bSub.setFont(f2);
        bMul.setFont(f2);
        bDiv.setFont(f2);
        bDot.setFont(f2);
        bEql.setFont(f2);
        bClr.setFont(f2);

        //Action Listener object
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bAdd.addActionListener(this);
        bSub.addActionListener(this);
        bDiv.addActionListener(this);
        bMul.addActionListener(this);
        bEql.addActionListener(this);
        bDot.addActionListener(this);
        bClr.addActionListener(this);
    }

    //actionPerformed method
    public void actionPerformed(ActionEvent ae) 
    {
        try{
            if(ae.getSource() == b0)
            {
                s1 =  tf.getText();
                s2 = "0";
                s3 = s1 + s2;
                tf.setText(s3);
            }
            if(ae.getSource() == b1)
            {
                s1 =  tf.getText();
                s2 = "1";
                s3 = s1 + s2;
                tf.setText(s3);
            }
            if(ae.getSource() == b2)
            {
                s1 =  tf.getText();
                s2 = "2";
                s3 = s1 + s2;
                tf.setText(s3);
            }
            if(ae.getSource() == b3)
            {
                s1 =  tf.getText();
                s2 = "3";
                s3 = s1 + s2;
                tf.setText(s3);
            }
            if(ae.getSource() == b4)
            {
                s1 =  tf.getText();
                s2 = "4";
                s3 = s1 + s2;
                tf.setText(s3);
            }
            if(ae.getSource() == b5)
            {
                s1 =  tf.getText();
                s2 = "5";
                s3 = s1 + s2;
                tf.setText(s3);
            }
            if(ae.getSource() == b6)
            {
                s1 =  tf.getText();
                s2 = "6";
                s3 = s1 + s2;
                tf.setText(s3);
            }
            if(ae.getSource() == b7)
            {
                s1 =  tf.getText();
                s2 = "7";
                s3 = s1 + s2;
                tf.setText(s3);
            }
            if(ae.getSource() == b8)
            {
                s1 =  tf.getText();
                s2 = "8";
                s3 = s1 + s2;
                tf.setText(s3);
            }
            if(ae.getSource() == b9)
            {
                s1 =  tf.getText();
                s2 = "9";
                s3 = s1 + s2;
                tf.setText(s3);
            }
            if(ae.getSource() == bDiv)
            {
                c = 1;
                s1 = tf.getText();
                tf.setText("");
            }
            if(ae.getSource() == bMul)
            {
                c = 2;
                s1 = tf.getText();
                tf.setText("");
            }
            if(ae.getSource() == bAdd)
            {
                c = 3;
                s1 = tf.getText();
                tf.setText("");
            }
            if(ae.getSource() == bSub)
            {
                c = 4;
                s1 = tf.getText();
                tf.setText("");
            }
            if(ae.getSource() == bDot)
            {
                s1 = tf.getText();
                s2 = s1 + ".";
                tf.setText(s2);
            }
            if(ae.getSource() == bClr)
            {
                tf.setText(" ");
            }
            
            if(ae.getSource() == bEql)
            {
                s4 = tf.getText();
                if(c == 1)
                {
                    try
                    {
                        Double i = Double.parseDouble(s4);
                        if(i != 0)
                        {
                            total = Double.parseDouble(s1) / Double.parseDouble(s4);
                            tf.setText(String.valueOf(total));
                        }
                        else
                        {
                            tf.setText("Invalid Operation");
                        }
                    }
                    catch(Exception e){}
                }

                else if(c == 2)
                {
                    total = Double.parseDouble(s1) / Double.parseDouble(s4);
                    tf.setText(String.valueOf(total));
                }
                else if(c == 3)
                {
                    total = Double.parseDouble(s1) + Double.parseDouble(s4);
                    tf.setText(String.valueOf(total));
                }
                else if(c == 4)
                {
                    total = Double.parseDouble(s1) - Double.parseDouble(s4);
                    tf.setText(String.valueOf(total));
                }
            }
    
        }
        catch(Exception e)
        {
            tf.setText("Invalid Operation");
        }
    }
    public static void main(String[] args)
    {
        new CalculatorV2();    
    }
}