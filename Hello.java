public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Regis");
        pessoa.setIdade(40);
        pessoa.setPeso(90);
        pessoa.setFilhos(true);

        System.out.println(pessoa.getNome());
    }
}