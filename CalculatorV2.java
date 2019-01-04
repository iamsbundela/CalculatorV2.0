import java.awt.*;
import javax.swing.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorV2 implements ActionListener 
{
    //Global Declaration
    JFrame frm;
    String s1, s2, s3, s4, s5;
    int c;
    double a = 0, b = 0, total = 0;
    TextField tf;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bDot, bAdd, bSub, bMul, bDiv, bEql, bClr;
    //Fonts
    Font f1 = new Font("Helvetica", Font.PLAIN, 22);
    Font f2 = new Font("Cambria", Font.PLAIN, 22);
    Font f3 = new Font("Cambria", Font.PLAIN, 12);
    //Colours
    Color c1 = new Color(126, 87, 194);    //Buttons
    Color c2 = new Color(229, 115, 115);   //Operators
    Color c3 = new Color(255, 253, 231);  //TextField

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

        //Menu
        Menu menu = new Menu("Menu");
        MenuBar mBar = new MenuBar(); 
        MenuItem mExit = new MenuItem("Exit");

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
        menu.add(mExit);
        mBar.add(menu);
        frm.setMenuBar(mBar);
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
        mExit.setFont(f3);
        menu.setFont(f3);
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
        
        //Colour Formatting
        tf.setBackground(c3);
        bAdd.setBackground(c2);
        bDiv.setBackground(c2);
        bSub.setBackground(c2);
        bMul.setBackground(c2);
        bEql.setBackground(c2);
        bClr.setBackground(c2);
        b0.setBackground(c1);
        b1.setBackground(c1);
        b2.setBackground(c1);
        b3.setBackground(c1);
        b4.setBackground(c1);
        b5.setBackground(c1);
        b6.setBackground(c1);
        b7.setBackground(c1);
        b8.setBackground(c1);
        b9.setBackground(c1);
        bDot.setBackground(c1);
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
                s3 =  tf.getText();
                s4 = "0";
                s5 = s3 + s4;
                tf.setText(s5);
            }
            if(ae.getSource() == b1)
            {
                s3 =  tf.getText();
                s4 = "1";
                s5 = s3 + s4;
                tf.setText(s5);
            }
            if(ae.getSource() == b2)
            {
                s3 =  tf.getText();
                s4 = "2";
                s5 = s3 + s4;
                tf.setText(s5);
            }
            if(ae.getSource() == b3)
            {
                s3 =  tf.getText();
                s4 = "3";
                s5 = s3 + s4;
                tf.setText(s5);
            }
            if(ae.getSource() == b4)
            {
                s3 =  tf.getText();
                s4 = "4";
                s5 = s3 + s4;
                tf.setText(s5);
            }
            if(ae.getSource() == b5)
            {
                s3 =  tf.getText();
                s4 = "5";
                s5 = s3 + s4;
                tf.setText(s5);
            }
            if(ae.getSource() == b6)
            {
                s3 =  tf.getText();
                s4 = "6";
                s5 = s3 + s4;
                tf.setText(s5);
            }
            if(ae.getSource() == b7)
            {
                s3 =  tf.getText();
                s4 = "7";
                s5 = s3 + s4;
                tf.setText(s5);
            }
            if(ae.getSource() == b8)
            {
                s3 =  tf.getText();
                s4 = "8";
                s5 = s3 + s4;
                tf.setText(s5);
            }
            if(ae.getSource() == b9)
            {
                s3 =  tf.getText();
                s4 = "9";
                s5 = s3 + s4;
                tf.setText(s5);
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
                s5 = s1 + ".";
                tf.setText(s5);
            }
            if(ae.getSource() == bClr)
            {
                tf.setText(" ");
            }

            if(ae.getSource() == bEql)
            {
                s2 = tf.getText();
                a = Double.parseDouble(s1);
                b = Double.parseDouble(s2);
                if(c == 1)
                {
                    try
                    {
                        if(b != 0)
                        {
                            total = a / b;
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
                    total = a * b;
                    tf.setText(String.valueOf(total));
                }
                else if(c == 3)
                {
                    total = a + b;
                    tf.setText(String.valueOf(total));
                }
                else if(c == 4)
                {
                    total = a - b;
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
