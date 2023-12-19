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
            if(!textvorname.getText().equals(null) &&!textnachname.getText().equals(null) ) {
                Schüler pSchüler = new Schüler(textvorname.getText(), textnachname.getText(),Double.valueOf(textzeit.getText()));
                teilnehmerliste.append(pSchüler);
                textvorname.setText("");
                textnachname.setText("");
                teilnehmerliste.toFirst();
                textlist.setText(textvorname.getText()+" "+ textnachname.getText()+" "+textzeit.getText());
            }}
            if(!teilnehmerliste.isEmpty()){
            if(!textvorname.getText().equals(null) &&!textnachname.getText().equals(null) ) {
                Schüler pSchüler = new Schüler(textvorname.getText(), textnachname.getText(),Double.valueOf(textzeit.getText()));
                teilnehmerliste.append(pSchüler);
                textvorname.setText("");
                textnachname.setText("");
                teilnehmerliste.next();
        }}
            if(textlist.getText().equals(null)) {
                textlist.setText(teilnehmerliste.getContent().getVorname() +" "+ teilnehmerliste.getContent().getNachname()+" "+teilnehmerliste.getContent().getZeit());
            }
            if(!textlist.getText().equals(null)) {
                textlist.setText(textlist.getText()+"\n"+teilnehmerliste.getContent().getVorname() +" "+ teilnehmerliste.getContent().getNachname()+" "+teilnehmerliste.getContent().getZeit());
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
}
