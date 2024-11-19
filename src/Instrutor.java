public class Instrutor extends Pessoa{
    private String especialidade;

    public Instrutor(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    //get e set especialidade
    public String getEspecialidade(){
        return especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Especialidade: " + especialidade);
    }
}
