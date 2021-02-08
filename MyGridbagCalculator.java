import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;

class MyCal implements ActionListener
{
    
    JFrame f;
    JPanel p;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
    Font font1 = new Font("SansSerif",Font.BOLD,65);
    Font font2 = new Font("SansSerif",Font.BOLD,20);
    Font font3 = new Font("Serif",Font.BOLD,30);

    int con , conEqual;
    String a, b;
    double num1, num2, m1, m2, mrc=0;
    int clicked = 0, clickedOn = 0;
	
    
    MyCal()
    {
        f = new JFrame();
        p = new JPanel();
        p.setBackground(Color.BLACK);
        f.add(p);
        t = new JTextField();
        t.setFont(font1);
        t.setEditable(false);
        f.add(t, BorderLayout.NORTH);
        t.setForeground(Color.BLACK);
        t.setBackground(Color.GRAY);
        p.setLayout(new GridBagLayout());



        b1 = new JButton("MRC");//completed
        b2 = new JButton("M-");//completed
        b3 = new JButton("M+");//completed
        b4 = new JButton("CE");//completed
        b5 = new JButton("ON");//completed
        b6 = new JButton("7");//completed
        b7 = new JButton("8");//completed
        b8 = new JButton("9");//completed
        b9 = new JButton("%");//completed
        b10 = new JButton("^");//completed
        b11 = new JButton("4");//completed
        b12 = new JButton("5");//completed
        b13 = new JButton("6");//completed
        b14 = new JButton("X");//completed
        b15 = new JButton("÷");//completed
        b16 = new JButton("1");//completed
        b17 = new JButton("2");//completed
        b18 = new JButton("3");//completed
        b19 = new JButton("+");//completed
        b20 = new JButton("-");//completed
        b21 = new JButton("0");//completed
        b22 = new JButton(".");//completed
        b23 = new JButton("+/-");//completed
        b24 = new JButton("=");//completed


        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b4.setBackground(Color.GRAY);
        b4.setForeground(Color.WHITE);
        b5.setBackground(Color.GRAY);
        b5.setForeground(Color.WHITE);
        b6.setBackground(Color.GRAY);
        b6.setForeground(Color.WHITE);
        b7.setBackground(Color.GRAY);
        b7.setForeground(Color.WHITE);
        b8.setBackground(Color.GRAY);
        b8.setForeground(Color.WHITE);
        b9.setBackground(Color.GRAY);
        b9.setForeground(Color.WHITE);
        b10.setBackground(Color.GRAY);
        b10.setForeground(Color.WHITE);
        b11.setBackground(Color.GRAY);
        b11.setForeground(Color.WHITE);
        b12.setBackground(Color.GRAY);
        b12.setForeground(Color.WHITE);
        b13.setBackground(Color.GRAY);
        b13.setForeground(Color.WHITE);
        b14.setBackground(Color.GRAY);
        b14.setForeground(Color.WHITE);
        b15.setBackground(Color.GRAY);
        b15.setForeground(Color.WHITE);
        b16.setBackground(Color.GRAY);
        b16.setForeground(Color.WHITE);
        b17.setBackground(Color.GRAY);
        b17.setForeground(Color.WHITE);
        b18.setBackground(Color.GRAY);
        b18.setForeground(Color.WHITE);
        b19.setBackground(Color.GRAY);
        b19.setForeground(Color.WHITE);
        b20.setBackground(Color.GRAY);
        b20.setForeground(Color.WHITE);
        b21.setBackground(Color.GRAY);
        b21.setForeground(Color.WHITE);
        b22.setBackground(Color.GRAY);
        b22.setForeground(Color.WHITE);
        b23.setBackground(Color.GRAY);
        b23.setForeground(Color.WHITE);
        b24.setBackground(Color.GRAY);
        b24.setForeground(Color.WHITE);

        
        b1.setFont(font2);
        b2.setFont(font2);
        b3.setFont(font2);
        b4.setFont(font2);
        b5.setFont(font2);
        b6.setFont(font3);
        b7.setFont(font3);
        b8.setFont(font3);
        b9.setFont(font3);
        b10.setFont(font3);
        b11.setFont(font3);
        b12.setFont(font3);
        b13.setFont(font3);
        b14.setFont(font2);
        b15.setFont(font3);
        b16.setFont(font3);
        b17.setFont(font3);
        b18.setFont(font3);
        b19.setFont(font3);
        b20.setFont(font3);
        b21.setFont(font3);
        b22.setFont(font3);
        b23.setFont(font3);
        b24.setFont(font3);

        b1.setPreferredSize(new Dimension(80, 60));
        b2.setPreferredSize(new Dimension(80, 60));
        b3.setPreferredSize(new Dimension(80, 60));
        b4.setPreferredSize(new Dimension(80, 60));
        b5.setPreferredSize(new Dimension(80, 60));
        b6.setPreferredSize(new Dimension(80, 60));
        b7.setPreferredSize(new Dimension(80, 60));
        b8.setPreferredSize(new Dimension(80, 60));
        b9.setPreferredSize(new Dimension(80, 60));
        b10.setPreferredSize(new Dimension(80, 60));
        b11.setPreferredSize(new Dimension(80, 60));
        b12.setPreferredSize(new Dimension(80, 60));
        b13.setPreferredSize(new Dimension(80, 60));
        b14.setPreferredSize(new Dimension(80, 60));
        b15.setPreferredSize(new Dimension(80, 60));
        b16.setPreferredSize(new Dimension(80, 60));
        b17.setPreferredSize(new Dimension(80, 60));
        b18.setPreferredSize(new Dimension(80, 60));
        b19.setPreferredSize(new Dimension(80, 60));
        b20.setPreferredSize(new Dimension(80, 60));
        b21.setPreferredSize(new Dimension(80, 60));
        b22.setPreferredSize(new Dimension(80, 60));
        b23.setPreferredSize(new Dimension(80, 60));
        b24.setPreferredSize(new Dimension(80, 60));

        
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.gridx = 0;
        gbc1.gridy = 0;
        gbc1.insets = new Insets(7, 7, 7, 7);
        p.add(b1,gbc1);

        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridx = 1;
        gbc2.gridy = 0;
        gbc2.insets = new Insets(7, 7, 7, 7);
        p.add(b2,gbc2);

        GridBagConstraints gbc3 = new GridBagConstraints();
        gbc3.gridx = 2;
        gbc3.gridy = 0;
        gbc3.insets = new Insets(7, 7, 7, 7);
        p.add(b3,gbc3);

        GridBagConstraints gbc4 = new GridBagConstraints();
        gbc4.gridx = 3;
        gbc4.gridy = 0;
        gbc4.insets = new Insets(7, 7, 7, 7);
        p.add(b4,gbc4);

        GridBagConstraints gbc5 = new GridBagConstraints();
        gbc5.gridx = 4;
        gbc5.gridy = 0;
        gbc5.insets = new Insets(7, 7, 7, 7);
        p.add(b5,gbc5);

        GridBagConstraints gbc6 = new GridBagConstraints();
        gbc6.gridx = 0;
        gbc6.gridy = 1;
        gbc6.insets = new Insets(7, 7, 7, 7);
        p.add(b6,gbc6);

        GridBagConstraints gbc7 = new GridBagConstraints();
        gbc7.gridx = 1;
        gbc7.gridy = 1;
        gbc7.insets = new Insets(7, 7, 7, 7);
        p.add(b7,gbc7);

        GridBagConstraints gbc8 = new GridBagConstraints();
        gbc8.gridx = 2;
        gbc8.gridy = 1;
        gbc8.insets = new Insets(7, 7, 7, 7);
        p.add(b8,gbc8);

        GridBagConstraints gbc9 = new GridBagConstraints();
        gbc9.gridx = 3;
        gbc9.gridy = 1;
        gbc9.insets = new Insets(7, 7, 7, 7);
        p.add(b9,gbc9);

        GridBagConstraints gbc10 = new GridBagConstraints();
        gbc10.gridx = 4;
        gbc10.gridy = 1;
        gbc10.insets = new Insets(7, 7, 7, 7);
        p.add(b10,gbc10);

        GridBagConstraints gbc11 = new GridBagConstraints();
        gbc11.gridx = 0;
        gbc11.gridy = 2;
        gbc11.insets = new Insets(7, 7, 7, 7);
        p.add(b11,gbc11);

        GridBagConstraints gbc12 = new GridBagConstraints();
        gbc12.gridx = 1;
        gbc12.gridy = 2;
        gbc12.insets = new Insets(7, 7, 7, 7);
        p.add(b12,gbc12);

        GridBagConstraints gbc13 = new GridBagConstraints();
        gbc13.gridx = 2;
        gbc13.gridy = 2;
        gbc13.insets = new Insets(7, 7, 7, 7);
        p.add(b13,gbc13);

        GridBagConstraints gbc14 = new GridBagConstraints();
        gbc14.gridx = 3;
        gbc14.gridy = 2;
        gbc14.insets = new Insets(7, 7, 7, 7);
        p.add(b14,gbc14);

        GridBagConstraints gbc15 = new GridBagConstraints();
        gbc15.gridx = 4;
        gbc15.gridy = 2;
        gbc15.insets = new Insets(7, 7, 7, 7);
        p.add(b15,gbc15);

        GridBagConstraints gbc16 = new GridBagConstraints();
        gbc16.gridx = 0;
        gbc16.gridy = 3;
        gbc16.insets = new Insets(7, 7, 7, 7);
        p.add(b16,gbc16);

        GridBagConstraints gbc17 = new GridBagConstraints();
        gbc17.gridx = 1;
        gbc17.gridy = 3;
        gbc17.insets = new Insets(7, 7, 7, 7);
        p.add(b17,gbc17);

        GridBagConstraints gbc18 = new GridBagConstraints();
        gbc18.gridx = 2;
        gbc18.gridy = 3;
        gbc18.insets = new Insets(7, 7, 7, 7);
        p.add(b18,gbc18);

        GridBagConstraints gbc19 = new GridBagConstraints();
        gbc19.gridx = 3;
        gbc19.gridy = 3;
        gbc19.insets = new Insets(7, 7, 7, 7);
        gbc19.gridheight = 2;
        gbc19.fill = GridBagConstraints.VERTICAL;
        p.add(b19,gbc19);

        GridBagConstraints gbc20 = new GridBagConstraints();
        gbc20.gridx = 4;
        gbc20.gridy = 3;
        gbc20.insets = new Insets(7, 7, 7, 7);
        p.add(b20,gbc20);

        GridBagConstraints gbc21 = new GridBagConstraints();
        gbc21.gridx = 0;
        gbc21.gridy = 4;
        gbc21.insets = new Insets(7, 7, 7, 7);
        p.add(b21,gbc21);

        GridBagConstraints gbc22 = new GridBagConstraints();
        gbc22.gridx = 1;
        gbc22.gridy = 4;
        gbc22.insets = new Insets(7, 7, 7, 7);
        p.add(b22,gbc22);

        GridBagConstraints gbc23 = new GridBagConstraints();
        gbc23.gridx = 2;
        gbc23.gridy = 4;
        gbc23.insets = new Insets(7, 7, 7, 7);
        p.add(b23,gbc23);

        GridBagConstraints gbc24 = new GridBagConstraints();
        gbc24.gridx = 4;
        gbc24.gridy = 4;
        gbc24.insets = new Insets(7, 7, 7, 7);
        p.add(b24,gbc24);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);

        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        b6.setVisible(false);
        b7.setVisible(false);
        b8.setVisible(false);
        b9.setVisible(false);
        b10.setVisible(false);
        b11.setVisible(false);
        b12.setVisible(false);
        b13.setVisible(false);
        b14.setVisible(false);
        b15.setVisible(false);
        b16.setVisible(false);
        b17.setVisible(false);
        b18.setVisible(false);
        b19.setVisible(false);
        b20.setVisible(false);
        b21.setVisible(false);
        b22.setVisible(false);
        b23.setVisible(false);
        b24.setVisible(false);

        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);
        f.setTitle("MyGridbagCalculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)//MRC
        {
            t.setText(String.valueOf(mrc));
        }
        if(e.getSource()==b2)//M-
        {
            m1 = Double.parseDouble(t.getText());
            mrc -= m1;
            t.setText("");
        }
        if(e.getSource()==b3)//M+
        {
            m2 = Double.parseDouble(t.getText());
            mrc += m2;
            t.setText("");
        }
        if(e.getSource()==b4)//CE
        {
            clicked = 0;
            t.setText("");
            mrc = 0;
            m1 = 0;
            m2 = 0;
            num1 = 0;
            num2 = 0;
            clicked = 0;
        }
        if(e.getSource()==b5)//ON
        {
            clickedOn++;
            if(clickedOn % 2 != 0)
            {
                b5.setText("Off");

                b1.setVisible(true);
                b2.setVisible(true);
                b3.setVisible(true);
                b4.setVisible(true);
                b6.setVisible(true);
                b7.setVisible(true);
                b8.setVisible(true);
                b9.setVisible(true);
                b10.setVisible(true);
                b11.setVisible(true);
                b12.setVisible(true);
                b13.setVisible(true);
                b14.setVisible(true);
                b15.setVisible(true);
                b16.setVisible(true);
                b17.setVisible(true);
                b18.setVisible(true);
                b19.setVisible(true);
                b20.setVisible(true);
                b21.setVisible(true);
                b22.setVisible(true);
                b23.setVisible(true);
                b24.setVisible(true);
            
            }
            else
            {
                b5.setText("On");
                t.setText("");
                mrc = 0;
                m1 = 0;
                m2 = 0;
                num1 = 0;
                num2 = 0;
                clicked = 0;

                
                b1.setVisible(false);
                b2.setVisible(false);
                b3.setVisible(false);
                b4.setVisible(false);
                b6.setVisible(false);
                b7.setVisible(false);
                b8.setVisible(false);
                b9.setVisible(false);
                b10.setVisible(false);
                b11.setVisible(false);
                b12.setVisible(false);
                b13.setVisible(false);
                b14.setVisible(false);
                b15.setVisible(false);
                b16.setVisible(false);
                b17.setVisible(false);
                b18.setVisible(false);
                b19.setVisible(false);
                b20.setVisible(false);
                b21.setVisible(false);
                b22.setVisible(false);
                b23.setVisible(false);
                b24.setVisible(false);

            }
        }
        if(e.getSource()==b6)//1
        {
            a = t.getText();
            b = b6.getActionCommand();
            t.setText(a+b);
        }
        if(e.getSource()==b7)//2
        {
            a = t.getText();
            b = b7.getActionCommand();
            t.setText(a+b);
        }
        if(e.getSource()==b8)//3
        {
            a = t.getText();
            b = b8.getActionCommand();
            t.setText(a+b);
        }
        if(e.getSource()==b9)//%
        {
            num1 = Double.parseDouble(t.getText());
            t.setText(String.valueOf(num1/100));
        }
        if(e.getSource()==b10)//^
        {
            num1 = Double.parseDouble(t.getText());
            t.setText("");
            con = 5;
            conEqual = 0;
        }
        if(e.getSource()==b11)//4
        {
            a = t.getText();
            b = b11.getActionCommand();
            t.setText(a+b);
        }
        if(e.getSource()==b12)//5
        {
            a = t.getText();
            b = b12.getActionCommand();
            t.setText(a+b);
        }
        if(e.getSource()==b13)//6
        {
            a = t.getText();
            b = b13.getActionCommand();
            t.setText(a+b);
        }
        if(e.getSource()==b14)//X
        {
            num1 = Float.parseFloat(t.getText());
            t.setText("");
            con = 3;
            conEqual = 0;
        }
        if(e.getSource()==b15)//÷
        {
            num1 = Double.parseDouble(t.getText());
            t.setText("");
            con = 4;
            conEqual = 0;
        }
        if(e.getSource()==b16)//7
        {
            a = t.getText();
            b = b16.getActionCommand();
            t.setText(a+b);
        }
        if(e.getSource()==b17)//8
        {
            a = t.getText();
            b = b17.getActionCommand();
            t.setText(a+b);
        }
        if(e.getSource()==b18)//9
        {
            a = t.getText();
            b = b18.getActionCommand();
            t.setText(a+b);
        }
        if(e.getSource()==b19)//+
        {
            num1 = Float.parseFloat(t.getText());
            t.setText("");
            con = 1;
            conEqual = 0;
        }
        if(e.getSource()==b20)//-
        {
            num1 = Float.parseFloat(t.getText());
            t.setText("");
            con = 2;
            conEqual = 0;
        }
        if(e.getSource()==b21)//0
        {
            a = t.getText();
            b = b21.getActionCommand();
            t.setText(a+b);
        }
        if(e.getSource()==b22)//.
        {
            a = t.getText();
            b = b22.getActionCommand();
            clicked++;
            if(clicked == 1 && t.getText().indexOf(".") == -1)
            {
                t.setText(a+b);
            }
        }
        if(e.getSource()==b23)//+/-
        {
            a = t.getText();

            if(Double.parseDouble(a) < 0)
            {
                a = a.replace("-","");
                t.setText(a);
            }
            else if(Double.parseDouble(a) > 0)
            {
                t.setText("-"+a);
            }
            else if(Double.parseDouble(a) == 0)
            {
                t.setText("0");
            }
        }
        if(e.getSource()==b24)//=
        {
            if((con == 1 || con == 2 || con == 3 || con == 4 || con == 5) && (conEqual != 1))
            {
                num2 = Double.parseDouble(t.getText());
            }
            

            switch(con)
            {
                case 1: t.setText(String.valueOf(num1 + num2));
                        num1 = num1 + num2;
                        conEqual = 1;
                break;

                case 2: t.setText(String.valueOf(num1 - num2));
                        num1 = num1 - num2;
                        conEqual = 1;
                break;

                case 3: t.setText(String.valueOf(num1 * num2));
                        num1 = num1 * num2;
                        conEqual = 1;
                break;

                case 4: t.setText(String.valueOf(num1 / num2));
                        num1 = num1 / num2;
                        conEqual = 1;
                break;

                case 5: t.setText(String.valueOf(Math.pow(num1, num2)));
                        num1 = Math.pow(num1, num2);
                        conEqual = 1;
                break;
            }
        }
    }
}

public class MyGridbagCalculator 
{
    public static void main(String[] args)
    {
        new MyCal();
    }
}