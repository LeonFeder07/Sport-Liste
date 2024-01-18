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
    private JButton löschenButton;
    private JButton sucheschnellstenButton;
    private JButton gibMirZeitButton;
    private JTextField textField1;


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
                textlist.setText(pSchüler.getVorname()+", "+ pSchüler.getNachname()+", "+ pSchüler.getZeit());


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
                textlist.setText(pSchüler.getVorname()+", "+ pSchüler.getNachname()+", "+ pSchüler.getZeit());


            }}



        }
    );


        sucheschnellstenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!teilnehmerliste.isEmpty()){
                    teilnehmerliste.toFirst();
                    double lokalezeit = teilnehmerliste.getContent().getZeit();
                    String lokalername = teilnehmerliste.getContent().getVorname();
                    while (teilnehmerliste.hasAccess()){
                        teilnehmerliste.next();
                        if (teilnehmerliste.getContent().getZeit()<lokalezeit && teilnehmerliste.hasAccess()){
                            lokalezeit=teilnehmerliste.getContent().getZeit();
                            lokalername=teilnehmerliste.getContent().getVorname();

                        }

                    }
                    textField1.setText(lokalezeit+" "+ lokalername);
                }
            }
        });
        löschenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!teilnehmerliste.isEmpty()){
                    teilnehmerliste.toFirst();
                    while (teilnehmerliste.hasAccess()){
                        while (teilnehmerliste.getContent().getVorname()!=textvorname.getText()){
                            teilnehmerliste.next();
                        }
                        teilnehmerliste.remove();
                    }
                }
            }
        });
        gibMirZeitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!teilnehmerliste.isEmpty()){
                    teilnehmerliste.toFirst();
                    while (teilnehmerliste.hasAccess()){
                        while (teilnehmerliste.getContent().getVorname()!=textvorname.getText()){
                            teilnehmerliste.next();
                        }
                       double lokalezeit1= teilnehmerliste.getContent().getZeit();
                    }


            }
        });
        }}



    public static void main(String[] args) {
        JFrame frame = new JFrame("sportgui");
        frame.setContentPane(new sportgui().label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



































    //Leons Projekt 16.01.24
}
