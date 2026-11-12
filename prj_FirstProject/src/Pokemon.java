public class Pokemon {
    private String nome;
    private int puntiVita;
    private String tipo;
    private String mosse;

    public Pokemon (String nome, int puntiVita, String tipo, String mosse){
        this.nome = nome;
        this.puntiVita = puntiVita;
        this.tipo = tipo;
        this.mosse = mosse;
    }

    public String Display() {
        String d = "";
        d += "-Nome: " + nome + " ";
        d += "-Punti vita: " + puntiVita + " ";
        d += "-Tipo: " + tipo + " ";
        d += "-Mosse: " + mosse + " ";
        return d;
    }
}
