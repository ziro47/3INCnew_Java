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
        d += "nome: " + nome + " ";
        d += "punti vita: " + puntiVita + " ";
        d += "tipo: " + tipo + " ";
        d += "mosse: " + mosse + " ";
        return d;
    }
}
