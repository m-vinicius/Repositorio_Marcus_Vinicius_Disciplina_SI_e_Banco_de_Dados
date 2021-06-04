package Atividade2;

 
public class Aluno
{
    private String nome = "Marcus";
    public String getNome(){
        return nome;
    }
    public String alteraNome;
    public void alteraNome(String novoNome){
        nome = novoNome;
        System.out.println(nome);
    }
    
    
    private int id = 5;
    public int getId(){
        return id;
    }
    public void alteraId(int novoId){
        id = novoId;
        System.out.println(id);
    }

    
    private double media;
    protected double nota1;
    protected double nota2;
    
    private double calculaMedia(double nota1, double nota2, double media){
        media = (nota1 + nota2)/2;
        return media;
    }
    
    public double retornaMedia(){
        System.out.println("Digite a nota1: ");
        nota1 = sc.nextdouble();
        System.out.println("Digite a nota2: ");
        nota2 = sc.nextdouble();
    }
    
    public void passou(double media){
        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media < 7){
            System.out.println("Reprovado");
        }
    }
    
}
