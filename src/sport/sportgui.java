package sport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sportgui {
    Schüler pschüler;
    List <Schüler> teilnehmerliste;
    private JPanel label;
    private JTextField textvorname;
    private JTextField textnachname;
    private JButton hinzufügenButton;
    private JTextArea textlist;
    private JTextField textzeit;
    private JButton sortierenButton;


    public sportgui() {
    teilnehmerliste = new List<Schüler>();
    hinzufügenButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(teilnehmerliste.isEmpty()){
            if(!textvorname.getText().equals(null) &&!textnachname.getText().equals(null)  &&!textzeit.getText().equals(null)) {
                Schüler pSchüler = new Schüler(textvorname.getText(), textnachname.getText(),Double.valueOf(textzeit.getText()));
                teilnehmerliste.append(pSchüler);

                teilnehmerliste.toFirst();
               // textlist.setText(textvorname.getText()+" "+ textnachname.getText()+" "+textzeit.getText());
                textvorname.setText("");
                textnachname.setText("");
                textzeit.setText("");
            }}
            if(!teilnehmerliste.isEmpty()) {
                if (!textvorname.getText().equals(null) && !textnachname.getText().equals(null)) {
                    Schüler pSchüler = new Schüler(textvorname.getText(), textnachname.getText(), Double.valueOf(textzeit.getText()));
                    teilnehmerliste.toFirst();
                    while (pSchüler.getZeit() > teilnehmerliste.getContent().getZeit()) {
                        teilnehmerliste.next();
                    }
                    if (teilnehmerliste.hasAccess()) {
                        teilnehmerliste.insert(pschüler);
                    } else {
                        teilnehmerliste.append(pschüler);


                    }

                    textvorname.setText("");
                    textnachname.setText("");
                    textzeit.setText("");

                }

            }


        }}
    );

        sortierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textlist.setText("");
                teilnehmerliste.toFirst();
                while(teilnehmerliste.hasAccess()){
                    System.out.println("\n"+teilnehmerliste.getContent().getVorname()+", "+teilnehmerliste.getContent().getNachname()+", "+teilnehmerliste.getContent().getZeit() );
                    teilnehmerliste.next();

                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("sportgui");
        frame.setContentPane(new sportgui().label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



































    //Leons Projekt 16.01.24
}
