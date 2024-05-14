package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo");
 
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDADNO O RESULTADI DIS DEMAIS CANDIDATOS");
        }
    }
}
