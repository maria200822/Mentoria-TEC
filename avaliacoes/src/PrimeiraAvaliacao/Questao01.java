package PrimeiraAvaliacao;

public class Questao01 {
    public static void main(String[] args) {
        double n1 = 7.8;
        double n2 = 7.0;
        double n3 = 6.2;
        double n4 = 9.0;
        double n5 = 6.8;
        double n6 = 9.8;
        double n7 = 5.0;
        double n8 = 7.8;

        double mediaBimestral1 = (n1+n2)/ 2 ;
        double mediaBimestral2 = (n3+n4)/ 2 ;
        double mediaBimestral3 = (n5+n6)/ 2 ;
        double mediaBimestral4 = (n7+n8)/ 2 ;

        double semestre1 = (mediaBimestral1 + mediaBimestral2) / 2;
        double semestre2 = (mediaBimestral3 + mediaBimestral4) / 2;

        System.out.println("RESULTADO DO PRIMEIRO BIMESTRE: "+ mediaBimestral1 );
        System.out.println("RESULTADO DO SEGUNDO BIMESTRE: "+ mediaBimestral2 );
        System.out.println("RESULTADO DO TERCEIRO BIMESTRE: "+ mediaBimestral3 );
        System.out.println("RESULTADO DO QUARTO BIMESTRE: "+ mediaBimestral4 );
        System.out.println("RESULTADO DA MEDIA DO PRIMEIRO SEMESTRE: "+ semestre1);
        System.out.println("RESULTADO DA MEDIA DO SEGUNDO SEMESTRE: "+ semestre2);





    }
}
