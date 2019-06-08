public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private boolean filhos;

    // Construtor
    Pessoa() {}

    Pessoa(String nome, int idade, float peso, boolean filhos) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.filhos = filhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isFilhos() {
        return filhos;
    }

    public void setFilhos(boolean filhos) {
        this.filhos = filhos;
    }

}