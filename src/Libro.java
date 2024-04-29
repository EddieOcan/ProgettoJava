public class Libro {
    private String titolo;
    private String autore;
    private String genere;
    private int anno;
    private int numeroPagine;

    public Libro(String titolo, String autore, String genere, int anno, int numeroPagine){
        this.titolo=titolo;
        this.autore=autore;
        this.genere=genere;
        this.anno=anno;
        this.numeroPagine=numeroPagine;
    }

    public Libro(){
    }

}
