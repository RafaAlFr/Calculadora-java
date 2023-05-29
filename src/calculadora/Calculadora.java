package calculadora;
import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
public class Calculadora extends JFrame{

    JLabel RotuloN1, RotuloN2, RotuloResultado;
    JTextField N1, N2, resultado;
    JRadioButton soma, sub, multi, div, resto;
    ButtonGroup contas;
    JButton calcular;
    double total = 0;
    
    public Calculadora(){
        super("Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        
        RotuloN1 = new JLabel("N1");
        RotuloN2 = new JLabel("N2");
        RotuloResultado = new JLabel("Resultado");
        N1 = new JTextField(50);
        N2 = new JTextField(50);
        resultado = new JTextField(50);
        soma = new JRadioButton("Soma (+)");
        sub = new JRadioButton("Subtração (-)");
        multi = new JRadioButton("Multiplicação (*)");
        div = new JRadioButton("Divisão (/)");
        resto = new JRadioButton("Resto (%)");
        calcular = new JButton("Calcular");
        contas = new ButtonGroup();
        contas.add(soma);contas.add(sub);contas.add(multi);contas.add(div);contas.add(resto);
        
        
        RotuloN1.setBounds(10,10,400,20);
        RotuloN2.setBounds(10,40,150,20);
        N1.setBounds(30,10,235,20);
        N2.setBounds(30,40,235,20);
        
        soma.setBounds(5,80,100,20);
        sub.setBounds(5,110,100,20);
        multi.setBounds(5,140,120,20);
        div.setBounds(5,170,100,20);
        resto.setBounds(5,200,100,20);
        
        RotuloResultado.setBounds(10,240,100,20);
        resultado.setBounds(74,242,191,20);
        
        calcular.setBounds(170,140,94,20);
        
        calcular.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(soma.isSelected() == true){
                        double n1 = Double.parseDouble(N1.getText());
                        double n2 = Double.parseDouble(N2.getText());
                        total = n1 + n2;
                        resultado.setText(""+total);
                    }
                    if(sub.isSelected() == true){
                        double n1 = Double.parseDouble(N1.getText());
                        double n2 = Double.parseDouble(N2.getText());
                        total = n1 - n2;
                        resultado.setText(""+total);
                    }
                    if(multi.isSelected() == true){
                        double n1 = Double.parseDouble(N1.getText());
                        double n2 = Double.parseDouble(N2.getText());
                        total = n1 * n2;
                        resultado.setText(""+total);
                    }
                    if(div.isSelected() == true){
                        double n1 = Double.parseDouble(N1.getText());
                        double n2 = Double.parseDouble(N2.getText());
                        total = n1/n2;
                        resultado.setText(""+total);
                    }
                    if(resto.isSelected() == true){
                        double n1 = Double.parseDouble(N1.getText());
                        double n2 = Double.parseDouble(N2.getText());
                        total = n1%n2;
                        resultado.setText(""+total);
                    }
                }});
        tela.add(RotuloN1);tela.add(RotuloN2);tela.add(RotuloResultado);
        tela.add(N1);tela.add(N2);tela.add(resultado);tela.add(calcular);
        tela.add(soma);tela.add(sub);tela.add(multi);tela.add(div);tela.add(resto);
        
        setSize(290,310);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        Calculadora app = new Calculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
