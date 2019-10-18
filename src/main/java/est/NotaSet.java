package est;

public class NotaSet {

    private int ganan = 0;
    private int pieden = 0;
    private int habilitan = 0;

    /**
     * @param ganan the ganan to set
     */
    public void setGanan(int ganan) {
        this.ganan = ganan;
    }

    /**
     * @param habilitan the habilitan to set
     */
    public void setHabilitan(int habilitan) {
        this.habilitan = habilitan;
    }

    /**
     * @param pieden the pieden to set
     */
    public void setPieden(int pieden) {
        this.pieden = pieden;
    }

    /**
     * @return the ganan
     */
    public int getGanan() {
        return ganan;
    }

    /**
     * @return the habilitan
     */
    public int getHabilitan() {
        return habilitan;
    }

    /**
     * @return the pieden
     */
    public int getPieden() {
        return pieden;
    }

    public NotaSet(int pierden, int habilitan, int ganan) {
        this.ganan = ganan;
        this.pieden = pierden;
        this.habilitan = habilitan;
    }

    public NotaSet() {
        this.ganan = 0;
        this.pieden = 0;
        this.habilitan = 0;
    }
    public void plus1Pierde() {
        this.pieden += 1;
    }

    
    public void plus1Habilitan() {
        this.habilitan += 1;
    }

    public void plus1Gana() {
        this.ganan += 1;
    }
}