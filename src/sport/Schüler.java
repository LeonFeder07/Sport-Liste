package sport;

public class Schüler {
String vorname;
String nachname;
double zeit;

  Schüler(String pvorname, String pnachmane,double pzeit){
      vorname=pvorname;
      nachname=pnachmane;
      zeit=pzeit;


  }
    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }
    public double getZeit() {
        return zeit;
    }
}
