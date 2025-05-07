
public class Videospiel implements Medium
{
    /**
     * Ein Kommentar zum Medium. Also eine kleine Beschreibung. 
     */
    private String _kommentar;

    /**
     * Der Titel des Mediums
     * 
     */
    private String _titel;
    
    /**
     * Das System auf dem das Spiel lauffähig ist.
     */
    
    private String _system;
    
    
    /**
     * Initialisiert ein neues Exemplar.
     * 
     * @param titel Der Titel des Videspiels
     * @param kommentar Ein Kommentar zu dem Videospiel
     * @param system Das System auf dem das Videospiel lauffähig ist.
     * 
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     */
    public Videospiel(String titel, String kommentar, String system)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert system != null : "Vorbedingung verletzt: system != null";
        
        _titel = titel;
        _kommentar = kommentar;
        _system = system;
    }
    
    @Override
    public String getKommentar()
    {
        return _kommentar;
    }
    @Override
    public String getMedienBezeichnung()
    {
        return "Videospiel";
    }
    @Override
    public String getTitel()
    {
        return _titel;
    }
    
    
    /**
     * Die Methode gibt das System auf dem das Videospiel lauffähig ist zurück
     * @return _system
     */
    public String getSystem()
    {
        return _system;
    }
    
    @Override
    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + ":\n" + "    " + "Titel: " + _titel
                + "\n" + "    " + "Kommentar: " + _kommentar + "\n" + "    "
                + "System: " + _system+ "\n";
    }

    
}
