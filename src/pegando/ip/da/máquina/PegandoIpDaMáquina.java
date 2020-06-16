/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pegando.ip.da.máquina;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Suporte T.I 2
 */
public class PegandoIpDaMáquina {

    /**
     * @param args the command line arguments
     * @throws java.net.UnknownHostException
     */
    public static void main(String[] args) throws UnknownHostException {
        //pegamos o ip da maquina.
        String ipDaMaquina = InetAddress.getLocalHost().getHostAddress();
        System.out.println(ipDaMaquina);
        //nome da maquina.
        String nomeDaMaquina = InetAddress.getLocalHost().getHostName();
        System.out.println(nomeDaMaquina);
    }
    
}
