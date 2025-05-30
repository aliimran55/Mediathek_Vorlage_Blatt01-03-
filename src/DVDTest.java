import org.junit.Test;

import static org.junit.Assert.*;

public class DVDTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "DVD";
    private static final int LAENGE = 100;
    private static final String REGISSEUR = "DVD Regisseur";
    private DVD _dvd1;
    private DVD _dvd2;

    public DVDTest()
    {
        _dvd1 = getMedium();
        _dvd2 = getMedium();
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, _dvd1.getMedienBezeichnung());
    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(TITEL, _dvd1.getTitel());
        assertEquals(KOMMENTAR, _dvd1.getKommentar());
        assertEquals(LAENGE, _dvd1.getLaufzeit());
        assertEquals(REGISSEUR, _dvd1.getRegisseur());
    }

    @Test
    /*
     * Von ein und der selben DVD kann es mehrere Exemplare geben, die von
     * unterschiedlichen Personen ausgeliehen werden können.
     */
    public void testEquals()
    {
        assertNotEquals("Mehrere Exemplare der gleichen DVD sollten ungleich sein", _dvd1, _dvd2);
        assertEquals("Dasselbe Exemplare der gleichen DVD sollte gleich sein", _dvd1, _dvd1);
    }

    private DVD getMedium()
    {
        return new DVD(TITEL, KOMMENTAR, REGISSEUR, LAENGE);
    }

}
