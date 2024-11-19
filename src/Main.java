public class Main {
    public static void main(String[] args) {

        Academia ramonFit = new Academia();

        Aluno aluno1 = new Aluno("Victor Hugo", 19, "Anual");
        Aluno aluno2 = new Aluno("Yuri Barbosa", 21, "Mensal");
        Instrutor instrutor1 = new Instrutor("Jefferson Caminhões", 45, "FitDance");

        ramonFit.adicionarPessoa(aluno1);
        ramonFit.adicionarPessoa(aluno2);
        ramonFit.adicionarPessoa(instrutor1);

        System.out.println("Pessoas cadastradas na academia:");
        ramonFit.listarPessoas();
    }
}