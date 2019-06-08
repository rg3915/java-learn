public class Program {
    public void init () {
        System.out.println("Hello");

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Regis");
        pessoa.setIdade(40);
        pessoa.setPeso(90);
        pessoa.setFilhos(true);

        System.out.println(pessoa.getNome());

        int res = soma(20, 2);
        System.out.println(res);
    }

    private int soma (int a, int b) {
        return a + b;
    }
}