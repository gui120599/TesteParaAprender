/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegando.ip.da.máquina;

/**
 *
 * @author Suporte T.I 2
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vencimento = 5;
        int idade = 70;
        double fatura = 875.00;
        int juros = 3;
        double result = 0;
        
        if(vencimento >= 5 && idade <= 64){
        fatura = fatura+(juros*fatura/100);
            System.out.println("Valor final R$"+fatura);
    }else{
            System.out.println("Idade errada");
        }
        
        
    }
    
}
