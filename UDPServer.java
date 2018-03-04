/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static final int SERVER_PORT=5432;
    public static void main(String[] args)throws IOException{
        DatagramSocket ds = new DatagramSocket(SERVER_PORT);
        
        byte [] b1= new byte[1024];
        DatagramPacket dp;
        
        while(true){
            
        dp = new DatagramPacket(b1,b1.length);
        ds.receive(dp);
        String str = new String(dp.getData(), dp.getOffset(), dp.getLength());// i need to do this to clear the DP
        System.out.println(str);
        }
    }
}
