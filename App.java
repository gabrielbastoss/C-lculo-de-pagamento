import java.util.Scanner;
import java.time.LocalDate;
import java.time.ZoneId;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner lerint = new Scanner(System.in);
        Scanner lerstring = new Scanner(System.in);
        Scanner lerfloat = new Scanner(System.in);
        Scanner lerchar = new Scanner(System.in);

        
        
        
        String cargo1;
        float salariocargo1;

        
        
        
        
        System.out.println("Escreva o nome do cargo:");
        cargo1 = lerstring.nextLine();

        

        
        
        
        
        System.out.println("\n" + cargo1 + " foi adicionado com sucesso!");
        
       


        
        
        
        System.out.println("\nDigite valor do sálario do " + cargo1);
        salariocargo1 = lerfloat.nextFloat();
        
        
        

        
        
        
        System.out.println("\nSalário do " + cargo1 + " de " +  "R$" + salariocargo1 +  " foi adicionado com sucesso!");
        
        


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //CADASTRO DE DADOS DO FUNCIONARIO

        
        
        
        String nome, cpf, cpfformatado;
        char genero;

        cpfformatado = "";

        
        System.out.println("\nDados para cadastro dos funcionários! ");

        
        
        System.out.println("\nDigite nome do funcionário: ");
        nome = lerstring.nextLine();

        


        System.out.println("\nNome: " + nome + "salvo com sucesso!");


        
        System.out.println("\nDigite genêro do funcionário: \nm para masculino \nf para feminino \nu para outro. ");
        genero = lerchar.next().charAt(0);


        if (genero == 'm') {

            
            System.out.println("Genêro masculino adicionado com sucesso!");

            
            
            System.out.println("\nDigite o CPF do " + nome);
            cpf = lerstring.nextLine();

            
            
            cpfformatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);

            
            
            System.out.println("\nCPF: " + cpfformatado + " salvo com sucesso!");



        } else if (genero == 'f') {

            System.out.println("Genêro feminino adicionado com sucesso!");

            
            System.out.println("\nDigite o CPF da " + nome);
            cpf = lerstring.nextLine();

            
            
            cpfformatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);


            
            System.out.println("\nCPF: " + cpfformatado + " salvo com sucesso!");

        
        } else if (genero == 'u') {

            System.out.println("Genêro 'outro' adicionado com sucesso!");
            
            
            System.out.println("\nDigite o CPF de " + nome);
            cpf = lerstring.nextLine();

            
            
            cpfformatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);

            
            System.out.println("\nCPF: " + cpfformatado + " salvo com sucesso!");

        
        } else {

            System.out.println("\nDeu erro!");
                    
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //CALCULO SALÁRIO POR HORA

        int horatrabalhodia, horatrabalhodiatotal, horatrabalhosemana, horatrabalhomes;
        float salariohora;
        String respostasimnao1, escolhercargo;

        
        
        salariohora = 0;

        
        
        System.out.println("Período de descanso é remunerado?\nResponda com s para (sim) ou n para (não).");
        respostasimnao1 = lerstring.nextLine();
      
        
        
        
        if (respostasimnao1.equals("n")) {
      
          System.out.println("\nEscolha o cargo que deseja ver as horas trabalhas\nDigite c1 (cargo 1)");
          escolhercargo = lerstring.nextLine();
      
      
          if (escolhercargo.equals("c1"))  {
      
            System.out.println("\nDigite quantas horas por dia é trabalhada: ");
            horatrabalhodia = lerint.nextInt();
      
              if (horatrabalhodia > 6) {
      
                horatrabalhodiatotal = (horatrabalhodia + 2);
        
        
                horatrabalhosemana = (horatrabalhodiatotal * 5);
        
                   
                horatrabalhomes = (horatrabalhosemana * 5);
        
                   
                salariohora = (salariocargo1 / horatrabalhomes);
      
      
                System.out.println("\nO salário é de " + (float) salariohora + " por hora.");
      
      
              
              } else {
      
               horatrabalhosemana = (horatrabalhodia * 5);
      
               horatrabalhodiatotal = (horatrabalhodia + 1);
      
               horatrabalhomes = (horatrabalhosemana * 5);
      
               salariohora = (salariocargo1 / horatrabalhomes);
      
               System.out.println("\nO salário é de " + (float) salariohora + " por hora."); 
            
            }
              
      
            
          } else {

            System.out.println("\nDeu erro!");

          }

          
      
          
        } else if (respostasimnao1.equals("s")) {
    
          System.out.println("\nEscolha o cargo que deseja ver as horas trabalhadas\nDigite c1 (cargo 1)");
          escolhercargo = lerstring.nextLine();
    
          if (escolhercargo.equals("c1")) {
            
            System.out.println("\nDigite quantas horas por dia é trabalhada: ");
            horatrabalhodia = lerint.nextInt();
    
            horatrabalhosemana = (horatrabalhodia * 5);
      
            horatrabalhodiatotal = (horatrabalhodia + 1);
      
            horatrabalhomes = (horatrabalhosemana * 5);
      
            salariohora = (salariocargo1 / horatrabalhomes);
      
            System.out.println("\nO salário é de " + (float) salariohora + " por hora.");
    
            
    
            
          } else {

            System.out.println("\nDeu erro!");

          }
    
            
        } else {
    
          System.out.println("\nDeu erro!");
    
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //CALCULO PERICULOSIDADE


        float periculosidade;
        String perguntapericulosidade, escolhercargopericulosidade;

        System.out.println("\nCalculo de periculosidade:");


        System.out.println("\nO cargo necessita de um adicional de periculosidade?\nDigite s (sim) ou n (não)");
        perguntapericulosidade = lerstring.nextLine();

        
        
        if (perguntapericulosidade.equals("s")) {

            System.out.println("\nEscolha o cargo que deseja colocar adicional de pericusidade\nDigite c1 (cargo 1)");
            escolhercargopericulosidade = lerstring.nextLine();

            if (escolhercargopericulosidade.equals("c1")) {

                periculosidade = (((salariocargo1 * 130/100) - salariocargo1));


                System.out.println("\nPericulosidade do " + cargo1 + " é igual a " + "R$" + periculosidade);

            } else {

              System.out.println("Deu erro!");

            }
        
        
        } else {

            System.out.println("\nSem acréscimo de periculosidade.");


        }

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //CALCULO DE INSALUBRIDADE

        double salariominimo, insalubridade;
        String perguntainsalubridade, perguntarisco;
        

        System.out.println("\nCalculo de insalubridade.");

        
        
        System.out.println("\nValor do salário minímo é de R$ 1.380,60");

        
        
        
        salariominimo = 1380.60;

        
        
        
        System.out.println("\nSerá necessário calcular insalubridade?\nDigite s (sim) e n (não)");
        perguntainsalubridade = lerstring.nextLine();

        
        
        
        if (perguntainsalubridade.equals("s")) {

          System.out.println("\nQual é o grau de risco?\nDigite:\nb para Baixo = 10%\nm para Médio = 20\na para Alto = 40%");
          perguntarisco = lerstring.nextLine();

          if (perguntarisco.equals("b")) {

            
            insalubridade = (((salariominimo * 1.10) - salariominimo));

            

            System.out.println("\nCom o grau de baixo risco o calculo resultará em:" + " R$ " + (float) insalubridade);

            
            

          } else if (perguntarisco.equals("m")) {

            insalubridade = (((salariominimo * 1.20) - salariominimo));

            

            System.out.println("\nCom o grau de médio risco o calculo resultará em:" + " R$ " + (float) insalubridade);

            


          } else if (perguntarisco.equals("a")) {

            insalubridade = (((salariominimo * 1.40) - salariominimo));

            

            System.out.println("\nCom o grau de alto risco o calculo resultará em:" + " R$ " + (float) insalubridade);


          } else {

            System.out.println("Deu erro!");

          }

        } else if (perguntainsalubridade.equals("n")) {

          System.out.println("\nNão será adicionado o calculo de insalubridade.");

        } else {

          System.out.println("Deu erro!");
          
        }


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //CALCULO DO VALE TRANSPORTE

        
        double valordescontar, valetransporte;

        
        System.out.println("\nCalculo do vale transporte");

        System.out.println("Digite o valor do vale transporte");
        valetransporte = lerfloat.nextFloat();

        valordescontar = ((salariocargo1 * 1.06) - salariocargo1);

        

        if (valordescontar > valetransporte) {


          System.out.println("Valor a descontar" + " R$ " + (float) valetransporte);



        } else {

          System.out.println("Valor a descontar " + " R$ " + (float) valordescontar);


        }
        
        ///////////////////////////////////////////////////////////////////////////////////////


        //CALCULO VALE ALIMENTÇÃO



        System.out.println("Calculo do vale alimentação.");





        double valealimentacaodiario, valorvalealimentacao;
        int jornadatrabalhodias;

        System.out.println("\nDigite o valor do vale alimentação(diário):");
        valealimentacaodiario = lerfloat.nextFloat();

        System.out.println("\nDigite o período de jornada de trabalho em dias:");
        jornadatrabalhodias = lerint.nextInt();





        valorvalealimentacao = (float) valealimentacaodiario * jornadatrabalhodias;


        
        
        
        
        System.out.println("O valor do vale alimentação é " + valorvalealimentacao);





        ////////////////////////////////////////////////////////////////////////////////

        //CALCULO DESCONTO DE INSS

        double calculofaixa1, calculofaixa2, calculofaixa3, calculofaixa4, liquotaefetiva, contribuicaoinss;
        
        
        
        System.out.println("Calculo de desconto de INSS");

        System.out.println("\nA seguir a tabela de contribuição do INSS");

        System.out.println("\nFaixa  Salário de Contribuição (R$)  Alíquota Progressiva (%)\n1ª     Até R$ 1.302,00	                                 7,5 \n2ª     De R$ 1.302,01 a R$ 2.571,29	                 9,0\n3ª     De R$ 2.571,30 até R$ 3.856,94	                12,0\n4ª     De R$ 3.856,95 até R$ 7.507,49	                14,0");



        
        
        
        System.out.println("\nCalculo 1ª Faixa: R$ 1.302,00 X 7,5% = R$ 97,65");

        calculofaixa1 = 97.65;
        
        
        System.out.println("Calculo 2ª Faixa: R$ 2.571,29 - R$ 1.302,00 = R$ 1.269,29 X 9% = R$ 114,24");

        calculofaixa2 = 114.24;
        
        
        System.out.println("Calculo 3ª Faixa: R$ 3.856,94 - R$ 2.571,29 = R$ 1.285,65 X 12%  = R$ 154,28");

        calculofaixa3 = 154.28;
        
        
        System.out.println("Calculo 4ª Faixa: R$ 7.507,49 - R$ 3.856,94 = R$ 3.650,55 X 14%  = R$ 511,07");

        calculofaixa4 = 511.07;


        if (salariocargo1 <= 1302) {

           contribuicaoinss = calculofaixa1;
           
           liquotaefetiva = ((contribuicaoinss / salariocargo1) * 100);

           System.out.println("\nAlíquota efetiva será de " + (float) liquotaefetiva + "%");
        
        
        } else if (salariocargo1 >= 1302.01 && salariocargo1 <= 2571.29) {

          contribuicaoinss = calculofaixa1 + calculofaixa2;

          liquotaefetiva = ((contribuicaoinss / salariocargo1) * 100);

          System.out.println("\nAlíquota efetiva será de " + (float) liquotaefetiva + "%");


        } else if (salariocargo1 >= 2571.30 && salariocargo1 <= 3856.94) {

          contribuicaoinss = calculofaixa1 + calculofaixa2 + calculofaixa3;

          liquotaefetiva = ((contribuicaoinss / salariocargo1) * 100);

          System.out.println("\nAlíquota efetiva será de " + (float) liquotaefetiva + "%");


        } else if (salariocargo1 >= 3856.95 && salariocargo1 <= 7507.49) {

          contribuicaoinss = calculofaixa1 + calculofaixa2 + calculofaixa3 + calculofaixa4;

          liquotaefetiva = ((contribuicaoinss / salariocargo1) * 100);

          System.out.println("\nAlíquota efetiva será de " + (float) liquotaefetiva + "%");


        } else {

          contribuicaoinss = calculofaixa1 + calculofaixa2 + calculofaixa3 + calculofaixa4;

          liquotaefetiva = ((contribuicaoinss / salariocargo1) * 100);

          System.out.println("\nAlíquota efetiva será de " + (float) liquotaefetiva + "%");


        }


        /////////////////////////////////////////////////////////////////////////////////////////////////

        //CALCULO FGTS

        double fgtsarecolher;

        
        
        System.out.println("\nCalculo FGTS.");

        fgtsarecolher = (((salariocargo1 * 1.08) - salariocargo1));

        System.out.println("\nO FGTS a recolher é de: " + "R$ " + (float) fgtsarecolher);

        ////////////////////////////////////////////////////////////////////////////////////////////////


        //CALCULO DESCONTO DE IRRF


        double salariobase, basedecalculo, totaldededucoes, deducaodependente, numerodependente, incidenciamensal, subtrairdeducoes;

        subtrairdeducoes = 0;


        System.out.println("\nCalculo de IRRF.");


        System.out.println("\nFaixa Base de cálculo (R$)       Alíquota (%) Dedução IRPF (R$)\n1ª    Até 1.903,98	                   -                 -\n2ª    De 1.903,99 até 2.826,65           7,5            142,80\n3ª    De 2.826,66 até 3.751,05          15,0            354,80\n4ª    De 3.751,06 até 4.664,68          22,5            636,13\n5ª    Acima de 4.664,68                 27,5            869,36");
        



        salariobase = salariocargo1 - contribuicaoinss;

        
        
        System.out.println("\nDedução por dependente: R$ 189,59");
        
        System.out.println("\nDigite o número de dependentes:");
        numerodependente = lerint.nextInt();


        deducaodependente = numerodependente * 189.59;

        totaldededucoes = contribuicaoinss + deducaodependente;

        basedecalculo = salariocargo1 - totaldededucoes;



        if (basedecalculo <= 1903.98) {
          
          
          
          System.out.println("\nNão tem alíquota efetiva.");

        
        
        } else if (basedecalculo >= 1903.99 && basedecalculo >= 2826.65) {

          incidenciamensal = ((basedecalculo * 1.075) - basedecalculo);

          subtrairdeducoes = incidenciamensal - 142.80;

          System.out.println("\nDesconto do IRRF e de: " + (float) subtrairdeducoes);


        } else if (basedecalculo >= 2826.66 && basedecalculo >= 3751.05) {

          incidenciamensal = ((basedecalculo * 1.15) - basedecalculo);

          subtrairdeducoes = incidenciamensal - 354.80;

          System.out.println("\nDesconto do IRRF e de: " + (float) subtrairdeducoes);
        
        
        
        } else if (basedecalculo >= 3751.06 && basedecalculo >= 4664.68) {

          incidenciamensal = ((basedecalculo * 1.225) - basedecalculo);

          subtrairdeducoes = incidenciamensal - 636.13;

          System.out.println("\nDesconto do IRRF e de: " + (float) subtrairdeducoes);

        
        
        
        } else if (basedecalculo >= 4664.68) {

          incidenciamensal = ((basedecalculo * 1.275) - basedecalculo);

          subtrairdeducoes = incidenciamensal - 869.36;

          System.out.println("\nDesconto do IRRF e de: " + (float) subtrairdeducoes);

        
        } else {

          System.out.println("\nDeu erro!");

        }
        
        //////////////////////////////////////////////////////////////////////////////////////////////

        //CALCULO SALÁRIO LÍQUIDO

        double salariodeducoes, salariodeducoesopcionais, salarioliquido;
        
        System.out.println("\nCanculo salário líquido.");

        System.out.println("O salário bruto é de: " + "R$ " + (float) salariocargo1);

        salariodeducoes = salariocargo1 - (subtrairdeducoes + contribuicaoinss);

        System.out.println("\nsálario com as deduções obrigatórias: " + "R$ " + (float) salariodeducoes);

        salariodeducoesopcionais =  salariocargo1 - (valorvalealimentacao + valordescontar + valetransporte);

        System.out.println("\nSalário com as deduções opcionais: " + "R$ " + (float) salariodeducoesopcionais);



        salarioliquido =  salariocargo1 - (valorvalealimentacao + valordescontar + valetransporte + subtrairdeducoes + contribuicaoinss);

        
        System.out.println("\nSalário com as deduções opcionais: " + "R$ " + (float) salarioliquido);


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //RELATÓRIO

        System.out.println("\nFolha de pagamento.");


        System.out.println("\nNome do colaborador: " + nome);
        
        
        
        System.out.println("\nCPF do colaborador: " + cpfformatado);
        
        
        
        
        
        
        
        ZoneId zonaHoraria = ZoneId.of("America/Sao_Paulo");
        
        LocalDate dataAtual = LocalDate.now(zonaHoraria);
        
        System.out.println("\nData de admissão: " + dataAtual);


        
        
        
        
        System.out.println("\nCargo do colaborador: " + cargo1);

        
        
        
        System.out.println("\nSalário do colaborador: " + salariocargo1);

        
        
        
        System.out.println("\nDescontos: ");
        
        
        
        
        
        System.out.println("\nINSS: " + contribuicaoinss);
        
        System.out.println("IRFF: " + subtrairdeducoes);
        
        System.out.println("FGTS: " + fgtsarecolher);
        
        System.out.println("Vale animentação: " + valorvalealimentacao);
        
        System.out.println("Vale transporte: " + valordescontar + valetransporte);
        
        System.out.println("Valor salário por hora:" + salariohora);






        System.out.println("\nValor do salário líquido: " + salarioliquido);














    }
}
