public class App {

    public static void main(String[] args) throws Exception {
        int a=6;
        int b=7;
        Prova sommino = (q, f) -> q + f;
        int risultato = sommino.somma(a,b);
        System.out.println(risultato);
    }
}
