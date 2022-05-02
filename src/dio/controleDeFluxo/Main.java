package dio.controleDeFluxo;

public class Main {
    public static void main(String[] args) {

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifmenor();

        switchSemana();
        switchNumero();
        switchFerias();
    }

    private static void  ifFlecha() {

        //regras de boas práticas
        //evitar esse tipo de código | efeito flexa
        //mal projetado

        int mes = 9;

        if(mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2){
                System.out.println("Fevereiro");
            }else {
                if (mes == 3){
                    System.out.println("Março");
                }else{
                    if (mes == 4){
                        System.out.println("Abril");
                    }else{
                        if (mes == 5){
                            System.out.println("Maio");
                        }else{
                            if (mes == 6){
                                System.out.println("Junho");
                            }else{
                                if (mes == 7){
                                    System.out.println("Julho");
                                }else{
                                    if (mes == 8){
                                        System.out.println("Agosto");
                                    }else{
                                        if (mes == 9){
                                            System.out.println("Setembro");
                                        }else{
                                            if (mes == 10){
                                                System.out.println("Outubro");
                                            }else{
                                                if (mes == 11){
                                                    System.out.println("Novembro");
                                                }else{
                                                    if (mes == 12){
                                                        System.out.println("Dezembro");
                                                    }else{
                                                        System.out.println("Mês Invalido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }

    }

    private static void  ifSemFlecha() {

        //jeito certo, não cria uma "flecha", esteticamente melhor

        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        }else if (mes == 4) {
            System.out.println("Abril");
        }else if (mes == 5) {
            System.out.println("Maio");
        }else if (mes == 6) {
            System.out.println("julho");
        }else if (mes == 7) {
            System.out.println("junho");
        }else if (mes == 8) {
            System.out.println("Agosto");
        }else if (mes == 9) {
            System.out.println("Setembro");
        }else if (mes == 10) {
            System.out.println("Outubro");
        }else if (mes == 11) {
            System.out.println("Novembro");
        }else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês indefinido");
        }

    }

    private static void  ifFerias() {

        //como não fazer
        //valor exato, neste caso era melhor ter usado um switch

        String mes = "junho";
        if (mes == "junho" || mes == "Dezembro" || mes == "Janeiro") {
            System.out.println("Ferias");
        }

    }

    private static void  ifmenor(){
        //melhorar os if atráves da criação de váriaveis intermediarias

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        // Deve ser evitado

        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionário deve receber auxílio");
        }

        boolean salarioBaixo = salarioMensal < mediaSalario ;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if (salarioBaixo && muitosDependentes) {
            System.out.println("Funcionário deve receber auxílio");
        }

        boolean recebeAuxilio = salarioBaixo && muitosDependentes;

        if(recebeAuxilio){
            System.out.println("Funcionário deve receber auxílio");
        }else {
            System.out.println("Funcionário não deve receber auxílio");
        }

    }


    private static void  switchSemana(){
        String dia = "Terça";
        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(8);
                break;
            default:
                System.out.println(1);
                System.out.println("Dia Inválido");
                break;

        }
    }
    private static void  switchNumero(){
        int numero = 4;
        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido");
                break;
        }
    }
    private static void  switchFerias(){
        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias");
                break;
            case "fevereiro":
            case "março":
            case "abril":
            case "maio":
            case "junho":
            case "agosto":
            case "setembro":
            case "outubro":
            case "novembro":
                System.out.println("Pérodo de trabalho");
                break;
            default:
                System.out.println("Mês indefinido");
                break;
        }
    }

}
