import  java.util.Scanner ;
public  class  MainBiblioteca{   
public  static  void  main ( String [] args ) {

        Scanner leia =  new  Scanner ( System.in );
        Cadastro b1 = new Cadastro();
        Frete b2 = new Frete();

// VARIAVEIS
        double valor = 0;
        float opcao;
        
        double frete = 0;
        double resultado;
        int n =  11 ; // tamanho do vetor
        int v [] =  new  int [n]; // declaração e alocação de espaço para o vetor "v"
        int i; // índice ou posição

 
// processando os "n" elementos do vetor "v"
        for (i = 0 ; i < n; i ++ ) {
        v [i] = i; // na i-ésima posição do vetor "v" armazena o valor da variável "i"
        }

        // Bem-Vindo
        System.out.println( " >> Livraria Online << " );
        System.out.println ( " ======================== " );
        System.out.println ( " ► APROVEITE e compre acima de 150 reais em produtos e ganhe 10% de desconto ◄ " );
        System.out.println ( " ======================== " );
        System.out.println ( " Para efetuar uma ou mais compras, cadastre-se em nosso site " );
        
        // CADASTRO
        System.out.println ( " >> CADASTRO << " );
        System.out.println ( " =========================== " );

        System.out.println ( " Nome: " );
        b1.setNome  (leia.nextLine());

        System.out.println ( " CPF: " );
        b1.setCpf  (leia.nextLine());

        System.out.println ( " Estado: " );
        b2.setEstado  (leia.nextLine());

        System.out.println ( " Telefone: " );
        b1.setNome  (leia.nextLine());

        System.out.println ( " Cadastro efetuado com sucesso, efetue o login e prossiga á suas compras. " );
        System.out.println ( " ======================== " );
                  
        // PRODUTOS
        System.out.println ( " LISTA DE LIVROS " );
        System.out.println ( " ======================== " );
        
        // AVISO
        System.out.println  ( " ▶ ATENÇÃO ◀ " );
        System.out.println ( " CASO QUEIRA UM DETERMINADO PRODUTO, DIGITE A LETRA CORRESPONDENTE AO PRODUTO, CASO NÃO QUEIRA UM OU MAIS PRODUTOS, DIGITE 'NÃO' E CLIQUE ENTER " );
        System.out.println  ( " ••••••••••••••••••••• " );
        
        // PRODUTO A
        System.out.println( " A - LIVRO: A Culpa é das Estrelas - 30 $: " );
        opcao = leia.next().charAt(0);

     if (opcao == 'a') {
          valor = valor + 30 ;

    } else  System.out.println( " Veja os próximos livros! " );
                
        // PRODUTO B        
        System.out.println( " B - LIVRO: Guerra e Paz - 50 $: " );
        opcao = leia.next().charAt(0);

     if (opcao ==  'b' ) {
          valor = valor + 50 ;

    } else  System.out.println( " Veja os próximos livros! " );
                
        // PRODUTO C        
        System.out.println( " C - LIVRO: Em busca do tempo perdido - 35 $: " );
        opcao = leia.next().charAt(0);

     if (opcao ==  'c' ) {
         valor = valor + 35 ;

    } else  System.out.println( " Veja os próximos livros! " );
                
        // PRODUTO D        
        System.out.println( " D - LIVRO: Inteligência Emocional - 50 $: " );
        opcao = leia.next().charAt(0);

     if (opcao ==  'd' ) {
         valor = valor + 50 ;

    } else System.out.println( " Veja os próximos livros! " );
                
        // PRODUTO E        
        System.out.println( " E - LIVRO: Harry Potter (Contém a saga toda, 7 livros.) - 150 $: " );
        opcao = leia.next().charAt(0);

     if (opcao ==  'e' ) {
         valor = valor + 150 ;

    } else  System.out.println( " Veja os próximos livros! " );
                
         // PRODUTO F       
         System.out.println( " F - LIVRO: Ulisses - 45 $: " );
         opcao = leia.next().charAt(0);

     if (opcao ==  'f' ) {
         valor = valor + 45 ;
    } else  System.out.println( " Veja os próximos livros! " );

         // PRODUTO G       
         System.out.println( " G - LIVRO: O nome do vento - 60 $: " );
         opcao = leia.next().charAt(0);

     if (opcao ==  'g' ) {
         valor = valor + 60 ;
    } else System.out.println( " Veja os próximos livros! " );  

        // PRODUTO H        
        System.out.println( " H - LIVRO: A montanha mágica - 20 $: " );
        opcao = leia.next().charAt(0);

     if (opcao ==  'h' ) {
         valor = valor + 20 ;

    } else  System.out.println( " Veja os próximos livros! " );

        // PRODUTO I      
        System.out.println( " I - LIVRO: A menina que rouvava livros - 65 $: " );
        opcao = leia.next().charAt(0);

     if (opcao ==  'i' ) {
         valor = valor + 65 ;

    } else  System.out.println( " Veja os próximos livros! " );

      // PRODUTO J
      System.out.println( " J - LIVRO: O Castelo - 55 $: " );
      opcao = leia.next().charAt(0);

     if (opcao ==  'j' ) {
         valor = valor + 55 ;
    } else  System.out.println( " Veja os próximos livros! " );

       // ´PRODUTO K
       System.out.println( " K - LIVRO: Hamlet - 15 $: " );
       opcao = leia.next().charAt(0);

     if (opcao ==  'k' ) {
         valor = valor + 15 ;
    } else  System.out.println( " Veja os próximos livros! " );

     // VALORES / VALOR A PAGAR
     System.out.println ( " O valor total em $ foi: " + valor);
     System.out.println ( " ---------------------- " );
     System.out.println ( " Informe seu Estado para calcular o frete: " );
     System.out.println ( " A - RS - GRATIS $ \n B - SC - 50 $ \n C - PR - 100 $ \n D - OUTROS - 50 $ \n " );  
     opcao=leia.next().charAt(0);
      
      if (opcao == 'a' ) {
      frete =  15 ;
            
}
      if (opcao == 'b' ) {
      frete = 25 ;  
}
      if (opcao == 'c' ) {
      frete = 50 ;

      }
      if (opcao == 'd' ) {
      frete = 65 ;
      }

      resultado = frete + valor;
      System.out.println( " VALOR TOTAL: "  + resultado);
      
      if (valor >= 150 ) {
        System.out.println( " Você tem 10% de desconto nesta compra. " );
        System.out.println ( " ========================================= " );
      resultado = (resultado *  0.90 );
      System.out.println ( " Valor a pagar com 10% de desconto é de: " + resultado);
      }
      // FORMA DE PAGAMENTO
      System.out.println ( " Informe a forma de pagamento: " );
      System.out.println ( " 1 - CARTÃO \n 2 - BOLETO / AVISTA " );
      opcao=leia.next().charAt(0);

      if (opcao ==  '2' ) {
        System.out.println ( " O valor á ser pago no boleto avista é de: " + resultado);    
        System.out.println ( " Clique em imprimir e efetue o pagamento do boleto na Agência ou Loterica mais próxima " );    
      
      } else  if (opcao ==  '1' ) {     
        System.out.println ( " Prossiga com seu pagamento. " );
        System.out.println( " PARCELAMENTO: " );
        System.out.println ( " Insira o número de parcelas: " );
        System.out.println ( " A - 3x \n B - 5x \n C - 8x \n D - 12x \n " );
        System.out.println ( " Digite aqui: " );
        b2.setParcelas (leia.nextInt());
      
      if (b2.getParcelas() == 3 ){
      resultado = (resultado / 3 );
      System.out.println ( " Ficou 3 vezes de: " + resultado);
      }  

      else  if (b2.getParcelas() == 5 ) {
      resultado = (resultado / 5 );
      System.out.println ( " Ficou 5 vezes de: " + resultado);
}
      else  if (b2.getParcelas() == 8 ) {
      resultado = (resultado / 8 );
      System.out.println ( " Ficou 8 vezes de: " + resultado);
}
      else  if (b2.getParcelas() == 12 ) {
      resultado = (resultado / 12 );
      System.out.println ( " Ficou 12 vezes de: " + resultado);

        }
      } 
   }
}

