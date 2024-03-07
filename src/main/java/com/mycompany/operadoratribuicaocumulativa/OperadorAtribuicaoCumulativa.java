
package com.mycompany.operadoratribuicaocumulativa;

import java.util.Locale;
import java.util.Scanner;

public class OperadorAtribuicaoCumulativa {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        
         System.out.println("Digite a quantidade de minutos usada");
        
        int minutos = teclado.nextInt();
        double conta = 50.0;
        
        if(minutos > 100){
          conta += (minutos - 100) * 2.0;  
        }
        
        System.out.println("Valor da conta = R$ " + conta);
        teclado.close();
        
    }
}
