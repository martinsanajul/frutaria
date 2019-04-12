
package frutarias;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.NumberFormat;

public class FRUTARIAS extends JFrame implements ActionListener
{
 JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,L15,L16,L17,L18;
 JTextField T1, T2, T3,T4,T5;
 JRadioButton RB1, RB2,RB3;
 ButtonGroup BG;
 JButton B1;
 
 NumberFormat DF1;
 
    FRUTARIAS()
    {
        setTitle ("FRUTARIA");
        setBounds(600,300,450,200);
        getContentPane().setBackground(new Color(104, 104, 104));
        getContentPane().setLayout(new GridLayout(7,5));
        L1 = new JLabel("FRUTA");
        double valor1 = 00.00;   
        L2 = new JLabel("ATÉ  5KG");
        L3 = new JLabel("MAIS DE 5KG");
        L4 = new JLabel("MORANGO");
        L5 = new JLabel("R$ 2.50");
        L6 = new JLabel("R$ 2.20");
        L7 = new JLabel("MAÇÃ");
        L8 = new JLabel("R$ 1.80");
        L9 = new JLabel("R$ 1.50");
        L10 = new JLabel("LARANJA");
        L11 = new JLabel("R$ 0.99");
        L12 = new JLabel("R$ 0.95");
        L13 = new JLabel("BANANA");
        L14 = new JLabel("R$ 2.30");
        L15 = new JLabel("R$ 2.00");
        L16 = new JLabel("QTD EM KG");
        L17 = new JLabel();
        L18 = new JLabel("TOTAL:");
        DF1 = NumberFormat.getNumberInstance();
        DF1.setMaximumIntegerDigits(2);
        DF1.setMaximumFractionDigits(1);
        DF1.setMinimumFractionDigits(2);
        T1 = new JTextField();       
        T2 = new JTextField();
        T3 = new JTextField();
        T4 = new JTextField();
        T5 = new JTextField(); 
        T5.setText((""+DF1.format(valor1)));
        T5.setEnabled(false);
        RB1 = new JRadioButton("DINHEIRO");
        RB2 = new JRadioButton("DÉBITO");
        RB3 = new JRadioButton("CRÉDITO");
        BG = new ButtonGroup();
        B1 = new JButton();
        BG.add(RB1); RB1.addActionListener(this);
        BG.add(RB2); RB2.addActionListener(this);
        BG.add(RB3); RB3.addActionListener(this);   
    
      
        getContentPane().setLayout(new GridLayout(7,4));      
        L1.setForeground(Color.BLACK);L2.setForeground(Color.BLACK);L3.setForeground(Color.BLACK);L16.setForeground(Color.BLACK);
        RB1.setForeground(Color.BLUE);RB2.setForeground(Color.BLUE);RB3.setForeground(Color.BLUE);L18.setForeground(Color.BLUE);
        T5.setForeground(Color.RED);
        L1.setOpaque(true);L2.setOpaque(true);L3.setOpaque(true);L16.setOpaque(true);
        L4.setOpaque(true);L5.setOpaque(true);L6.setOpaque(true);L7.setOpaque(true);
        L8.setOpaque(true);L9.setOpaque(true);L10.setOpaque(true);L11.setOpaque(true);
        L12.setOpaque(true);L13.setOpaque(true);L14.setOpaque(true);L15.setOpaque(true); 
        RB1.setOpaque(true);RB2.setOpaque(true);RB3.setOpaque(true);
        L18.setOpaque(true);L17.setOpaque(true);
        
        L1.setBackground(Color.GRAY);L2.setBackground(Color.GRAY);L3.setBackground(Color.GRAY);L16.setBackground(Color.GRAY);
        L4.setBackground(Color.WHITE);L5.setBackground(Color.WHITE);L6.setBackground(Color.WHITE);L7.setBackground(Color.WHITE);
        L8.setBackground(Color.WHITE);L9.setBackground(Color.WHITE);L10.setBackground(Color.WHITE);L11.setBackground(Color.WHITE);
        L12.setBackground(Color.WHITE);L13.setBackground(Color.WHITE);L14.setBackground(Color.WHITE);L15.setBackground(Color.WHITE);
        RB1.setBackground(Color.WHITE);RB2.setBackground(Color.WHITE);RB3.setBackground(Color.WHITE);L18.setBackground(Color.WHITE);L17.setBackground(Color.WHITE);
        
           
        getContentPane().add(L1);getContentPane().add(L2);getContentPane().add(L3);getContentPane().add(L16);
        getContentPane().add(L4);getContentPane().add(L5);getContentPane().add(L6);getContentPane().add(T1);
        getContentPane().add(L7);getContentPane().add(L8);getContentPane().add(L9);getContentPane().add(T2);
        getContentPane().add(L10);getContentPane().add(L11);getContentPane().add(L12);getContentPane().add(T3);
        getContentPane().add(L13);getContentPane().add(L14);getContentPane().add(L15);getContentPane().add(T4);
        getContentPane().add(RB1);getContentPane().add(RB2);getContentPane().add(RB3);getContentPane().add(L17);
        getContentPane().add(L18);getContentPane().add(T5);
        
    }
    public static void main(String[] args) 
    {
        JFrame janela = new FRUTARIAS();
        janela.setUndecorated (true);
        janela.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    public void actionPerformed (ActionEvent e)
    {
        
        if (e.getSource()== RB1)
        {    
            double n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16, soma,total, massatotal,desconto;
            try
            {
                
                n5 = 2.50;n6 = 2.20;n7 = 1.80;n8 = 1.50;n9 = 0.99;n10 = 0.95;n11 = 2.30;n12 = 2.00;
                n1 = Double.parseDouble(T1.getText());            
                n2 = Double.parseDouble(T2.getText());
                n3 = Double.parseDouble(T3.getText());
                n4 = Double.parseDouble(T4.getText());
               
                massatotal = n1 + n2 + n3 + n4;
             
                if(n1 <= 5){n13 = n1 * n5;}else{ n13 = n1 * n6;}
                if(n2 <= 5){n14 = n2 * n7;}else{n14 = n2 * n8;}
                if(n3 <= 5){n15 = n3 * n9;}else{n15 = n3 * n10;}
                if(n4 <= 5){n16 = n4 * n11;}else{n16 = n4 * n12;}
                soma = n13 + n14 + n15 + n16;
              
                total = soma;
                    if(soma > 25 || massatotal > 8 )
                    {
                        desconto = (soma/100)*10;
                         total = soma - desconto;                  
                    } 
                      
                T5.setText("R$ "+DF1.format(total));
            }
            catch(NumberFormatException erro)
            {
             T5.setText("Erro de formatação");
            }              
        }
        if (e.getSource()== RB2)
        {            
            try
            {
                double n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16, soma,total, massatotal,desconto;
                n5 = 2.50;n6 = 2.20;n7 = 1.80;n8 = 1.50;n9 = 0.99;n10 = 0.95;n11 = 2.30;n12 = 2.00;
                n1 = Double.parseDouble(T1.getText());            
                n2 = Double.parseDouble(T2.getText());
                n3 = Double.parseDouble(T3.getText());
                n4 = Double.parseDouble(T4.getText());
                
                massatotal = n1 + n2 + n3 + n4;
                
                if(n1 <= 5){n13 = n1 * n5;}else{ n13 = n1 * n6;}
                if(n2 <= 5){n14 = n2 * n7;}else{n14 = n2 * n8;}
                if(n3 <= 5){n15 = n3 * n9;}else{n15 = n3 * n10;}
                if(n4 <= 5){n16 = n4 * n11;}else{n16 = n4 * n12;}
                soma = n13 + n14 + n15 + n16;
                                                                    
                T5.setText("R$ "+DF1.format(soma));
            }
            catch(NumberFormatException erro)
            {
             T5.setText("Erro de formatação");
            }              
        }
        if (e.getSource()== RB3)
        {            
            try
            {
                double n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16, soma,total, massatotal,desconto;
                n5 = 2.50;n6 = 2.20;n7 = 1.80;n8 = 1.50;n9 = 0.99;n10 = 0.95;n11 = 2.30;n12 = 2.00;
                n1 = Double.parseDouble(T1.getText());            
                n2 = Double.parseDouble(T2.getText());
                n3 = Double.parseDouble(T3.getText());
                n4 = Double.parseDouble(T4.getText());
                
                massatotal = n1 + n2 + n3 + n4;
               
                if(n1 <= 5){n13 = n1 * n5;}else{ n13 = n1 * n6;}
                if(n2 <= 5){n14 = n2 * n7;}else{n14 = n2 * n8;}
                if(n3 <= 5){n15 = n3 * n9;}else{n15 = n3 * n10;}
                if(n4 <= 5){n16 = n4 * n11;}else{n16 = n4 * n12;}
                soma = n13 + n14 + n15 + n16;
               
                total = soma;                               
                 desconto = (soma/100)*2;
                        total = soma + desconto;                              
                T5.setText("R$ "+DF1.format(total));
            }
            catch(NumberFormatException erro)
            {
             T5.setText("Erro de formatação");
            }
            
            
        } 
        /*if (RB3.isSelected())
                {
                        desconto = (soma/100)*2;
                        total = soma + desconto;                         
                }
*/
    }
}
