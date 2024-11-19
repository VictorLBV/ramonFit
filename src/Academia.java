import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Pessoa> pessoas;

    public Academia(){
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public void listarPessoas(){
        for(Pessoa pessoa : pessoas){
            pessoa.exibirInfo();
            System.out.println("------------");
        }
    }
}
