package sport;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sportgui {

    List <Schüler> teilnehmerliste;
    private JPanel label;
    private JTextField textvorname;
    private JTextField textnachname;
    private JButton hinzufügenButton;
    private JTextArea textlist;
    private JTextField textzeit;


    public sportgui() {
    teilnehmerliste = new List<Schüler>();
    hinzufügenButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(teilnehmerliste.isEmpty()){

                Schüler pSchüler = new Schüler(textvorname.getText(), textnachname.getText(), Double.valueOf(textzeit.getText()));
                teilnehmerliste.append(pSchüler);

                teilnehmerliste.toFirst();
               // textlist.setText(textvorname.getText()+" "+ textnachname.getText()+" "+textzeit.getText());
                textvorname.setText("");
                textnachname.setText("");
                textzeit.setText("");
                while(teilnehmerliste.hasAccess()){
                    System.out.println(teilnehmerliste.getContent().getVorname()+", "+teilnehmerliste.getContent().getNachname()+", "+teilnehmerliste.getContent().getZeit() );
                    teilnehmerliste.next();}
                System.out.println("\n");


            }
             else //if (!teilnehmerliste.isEmpty())
            {
                Schüler pSchüler = new Schüler(textvorname.getText(), textnachname.getText(), Double.valueOf(textzeit.getText()));
                teilnehmerliste.toFirst();
                while (teilnehmerliste.hasAccess() && pSchüler.getZeit() > teilnehmerliste.getContent().getZeit()) {

                    teilnehmerliste.next();


                }
                if (teilnehmerliste.hasAccess()) {
                    teilnehmerliste.insert(pSchüler);

                } else {
                    teilnehmerliste.append(pSchüler);


                }

                textvorname.setText("");
                textnachname.setText("");
                textzeit.setText("");

                teilnehmerliste.toFirst();
                while(teilnehmerliste.hasAccess()){
                    System.out.println(teilnehmerliste.getContent().getVorname()+", "+teilnehmerliste.getContent().getNachname()+", "+teilnehmerliste.getContent().getZeit() );
                    teilnehmerliste.next();}
                System.out.println("\n");


            }}



        }
    );


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
