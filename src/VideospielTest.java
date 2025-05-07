import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VideospielTest
{
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "System";
    private Videospiel _vs1;
 
    
    
    
    public VideospielTest()
    {
        _vs1 = getMedium();
    }
    
    
    private Videospiel getMedium()
    {
        return new Videospiel(TITEL, KOMMENTAR, SYSTEM);
    }
    
    
    @Test
    public void testGetMedienBezeichnung()
    {
        assertEquals(BEZEICHNUNG, _vs1.getMedienBezeichnung());
    }
    
    @Test
    public void testGetKommentar()
    {
        assertEquals(KOMMENTAR, _vs1.getKommentar());
    }
    
    @Test
    public void testGetTitel()
    {
        assertEquals(TITEL, _vs1.getTitel());
    }
    
    @Test
    public void testGetSystem()
    {
        assertEquals(SYSTEM, _vs1.getSystem());
    }
    @Test
    public void testGetFormatiertenString()
    {
        assertEquals(BEZEICHNUNG + ":\n" + "    " + "Titel: " + TITEL
                + "\n" + "    " + "Kommentar: " + KOMMENTAR + "\n" + "    "
                + "System: " + SYSTEM + "\n", _vs1.getFormatiertenString());
    }
    
}
