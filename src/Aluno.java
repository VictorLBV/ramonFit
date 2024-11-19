public class Aluno extends Pessoa{
    private String plano;

    public Aluno(String nome, int idade, String plano) {
        super(nome, idade);
        this.plano = plano;
    }

    // get e set plano
    public String getPlano(){
        return plano;
    }
    public void setPlano(String plano){
        this.plano = plano;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Plano: " + plano);
    }
}
