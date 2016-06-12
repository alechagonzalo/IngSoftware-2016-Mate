

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ignacio on 10/06/16.
 */
public class MemoView extends JFrame implements ActionListener{

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn0;
    private JButton btnBorrar;

    private JLabel label;

    private String pulsacion;


    public MemoView() {

        pulsacion = "";

        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn0 = new JButton("0");
        btnBorrar = new JButton("Borrar");


        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
        btnBorrar.addActionListener(this);


        GridLayout gridLayout = new GridLayout(1,0);
        JPanel container = new JPanel();
        JPanel p1 = new JPanel(gridLayout);
        JPanel p2 = new JPanel(gridLayout);
        JPanel p3 = new JPanel(gridLayout);
        JPanel p4 = new JPanel(new GridLayout(1,0));

        p1.add(btn1);
        p1.add(btn2);
        p1.add(btn3);

        p2.add(btn4);
        p2.add(btn5);
        p2.add(btn6);

        p3.add(btn7);
        p3.add(btn8);
        p3.add(btn9);

        p4.add(btn0);

        label = new JLabel("Bienvenido", SwingConstants.CENTER);
        Font font = new Font("nemeros grandes", NORMAL, 20);
        label.setFont(font);

        p4.add(label);
        p4.add(btnBorrar);

        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        container.add(p1);
        container.add(p2);
        container.add(p3);
        container.add(p4);
        add(container);

        setVisible(true);
        setTitle("Juego de Memoria");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,300,400,300);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btn1)
            pulsacion = pulsacion.concat("1");
        if(e.getSource() == btn2)
            pulsacion = pulsacion.concat("2");
        if(e.getSource() == btn3)
            pulsacion = pulsacion.concat("3");
        if(e.getSource() == btn4)
            pulsacion = pulsacion.concat("4");
        if(e.getSource() == btn5)
            pulsacion = pulsacion.concat("5");
        if(e.getSource() == btn6)
            pulsacion = pulsacion.concat("6");
        if(e.getSource() == btn7)
            pulsacion = pulsacion.concat("7");
        if(e.getSource() == btn8)
            pulsacion = pulsacion.concat("8");
        if(e.getSource() == btn9)
            pulsacion = pulsacion.concat("9");
        if(e.getSource() == btn0){
            pulsacion = pulsacion.concat("0");
        }
        if(e.getSource() == btnBorrar && pulsacion.length() > 0)
            pulsacion = pulsacion.substring(0,pulsacion.length()-1);

        label.setText(pulsacion);

    }

    public void setLabel(String label){
        this.label.setText(label);
    }

    public String getPulsacion(){

        return pulsacion;
    }

    public void activarBotones(boolean activar){

        if(activar){
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn0.setEnabled(true);
            btnBorrar.setEnabled(true);
        }
        else{
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            btn0.setEnabled(false);
            btnBorrar.setEnabled(false);
        }
    }

    public void mostrarSequencia(String secuencia){


        for(int i = 0; i < secuencia.length(); i++){

            char c = secuencia.charAt(i);
            JButton btn = asignarBoton(c);
            btn.setEnabled(true);
           //aca tendria que haber una pausa
            btn.setEnabled(false);

        }

    }


    private JButton asignarBoton(char c){
        switch (c){
            case '1':
                return btn1;
            case '2':
                return btn2;
            case '3':
                return btn3;
            case '4':
                return btn4;
            case '5':
                return btn5;
            case '6':
                return btn6;
            case '7':
                return btn7;
            case '8':
                return btn8;
            case '9':
                return btn9;
            case '0':
                return btn0;
            default:
                return null;
        }
    }

    public void resetPulsacion(){
        pulsacion = "";
    }
}


