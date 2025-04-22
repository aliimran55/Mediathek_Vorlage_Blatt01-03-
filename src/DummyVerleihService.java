import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Diese Klasse implementiert das Interface VerleihService. Es handelt sich
 * lediglich um eine Dummy-Implementation, um die GUI zu testen.
 * 
 * @author GUI-Team
 * @version SoSe 2021
 */
class DummyVerleihService extends AbstractObservableService
        implements VerleihService
{
    // Generator für Zufallszahlen und zufällige boolsche Werte
    private static final Random RANDOM = new Random();

    private static final CD MEDIUM = new CD("Titel", "Kommentar", "Interpret",
            70);
    private static final Kundennummer KUNDENNUMMER = new Kundennummer(123456);
    private static final Kunde ENTLEIHER = new Kunde(KUNDENNUMMER, "Vorname",
            "Nachname");
    private static final Verleihkarte VERLEIHKARTE = new Verleihkarte(ENTLEIHER,
            MEDIUM, Datum.heute());

    public DummyVerleihService(KundenstammService kundenstamm,
            MedienbestandService medienbestand,
            List<Verleihkarte> initialBestand)
    {
    }

    /**
     * Die Methode erstellt beim jeden Aufruf eine neue Liste und fügt die Klassenvariable MEDIUM zu der Liste hinzu. 
     * @param kunde ist der Kunde
     * @return ergebnisListe ist die ergänzte Liste
     */
    @Override
    public List<Medium> getAusgelieheneMedienFuer(Kunde kunde)
    {
        List<Medium> ergebnisListe = new ArrayList<Medium>();
        ergebnisListe.add(MEDIUM);
        return ergebnisListe;
    }

    /**
     * Die Methode gibt den Entleiher vom Medium zurück
     * @param medium ist das entliehene Medium
     * @return ENTLEIHER ist die Klassenvariabele 
     */
    @Override
    public Kunde getEntleiherFuer(Medium medium)
    {
        return ENTLEIHER;
    }

    /**
     * Die Methode gibt die entsprechende Verleihkarte für das gegebene Medium zurück
     * @param medium ist das Medium
     * @return VERLEIHKARTE ist die Karte
     */
    @Override
    public Verleihkarte getVerleihkarteFuer(Medium medium)
    {
        return VERLEIHKARTE;
    }

    /**
     * Die Methode fügt eine Verleihkarte hinzu
     * @return ergebnisListe ist die ergänzte Kartenliste
     */
    @Override
    public List<Verleihkarte> getVerleihkarten()
    {
        List<Verleihkarte> ergebnisListe = new ArrayList<Verleihkarte>();
        ergebnisListe.add(VERLEIHKARTE);
        return ergebnisListe;
    }

    /**
     * Die Methode gibt einen zufälligen Wahrheitswert auf die Abfrage, ob ein Medium verliehen ist
     * @param medium ist das Medium
     * @return RANDOM.nestBoolen() ist der Wahrheitswert
     */
    @Override
    public boolean istVerliehen(Medium medium)
    {
        return RANDOM.nextBoolean();
    }

    /**
     * Die Methode ist leer
     * param medien ist die Medienliste
     * @param rueckgabeDatum ist das Rückgabedatum
     */
    @Override
    public void nimmZurueck(List<Medium> medien, Datum rueckgabeDatum)
    {
    }

    /**
     * Die Methode gibt einen zufälligen Wahrheitswert auf die Abfrage, ob alle Medien nicht verliehen sind
     * @param medien ist die Medienliste
     * @return RANDOM.nestBoolen() ist der Wahrheitswert
     */
    @Override
    public boolean sindAlleNichtVerliehen(List<Medium> medien)
    {
        return RANDOM.nextBoolean();
    }

    /**
     * Die Methode gibt einen zufälligen Wahrheitswert auf die Abfrage, ob alle Medien verliehen sind
     * @param medien ist die Medienliste
     * @return RANDOM.nestBoolen() ist der Wahrheitswert
     */
    @Override
    public boolean sindAlleVerliehen(List<Medium> medien)
    {
        return RANDOM.nextBoolean();
    }

    /**
     * Methode macht nichts, weil sie leer ist
     * @param kunde ist der Kunde
     * @param medien ist die Liste der Medien
     * @param ausleihDatum ist das Ausleihdatum
     */
    @Override
    public void verleiheAn(Kunde kunde, List<Medium> medien, Datum ausleihDatum)
    {
    }

    /**
     * Die Methode prüft, ob ein Kunde eine Entleiher ist
     * @param kunde ist der Kunde
     * @return ENTLEIHER.equals(kunde) ist der Wahrheitswert
     */
    @Override
    public boolean kundeImBestand(Kunde kunde)
    {
        return ENTLEIHER.equals(kunde);
    }

    /**
     * Die Methode überprüft, ob ein Medium im Bestand ist
     * @param medium ist das überprüfte Medium
     * @return MEDIUM.equals(medium) ist der Wahrheitswert
     */
    @Override
    public boolean mediumImBestand(Medium medium)
    {
        return MEDIUM.equals(medium);
    }

    /**
     * Die Methode prüft, ob ein Medium in der Medienliste ist
     * @param medien ist die Medienliste
     * @return result ist der Wahrheitswert
     */
    @Override
    public boolean medienImBestand(List<Medium> medien)
    {
        boolean result = true;
        for (Medium medium : medien)
        {
            if (!mediumImBestand(medium))
            {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Die Methode gibt die entsprechende Verleihkarte für den gegebenen Kunden zurück
     * @param kunde ist der Kunde
     * @return result ist die ergänzte Kartenliste
     */
    @Override
    public List<Verleihkarte> getVerleihkartenFuer(Kunde kunde)
    {
        List<Verleihkarte> result = new ArrayList<Verleihkarte>();
        result.add(VERLEIHKARTE);
        return result;
    }

    /**
     * Die Methode verneint die Abfrage, ob Verleihen möglich ist
     * @param kunde ist der Kunde
     * @param medien ist die Medienliste
     * @return false
     */
    @Override
    public boolean istVerleihenMoeglich(Kunde kunde, List<Medium> medien)
    {
        return false;
    }
}
