/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;




public class UDPClient {
    public static final int SERVER_PORT=5432;
    public static void main(String[] args)throws IOException{
        DatagramSocket ds = new DatagramSocket();//making the socket
        
        Scanner in = new Scanner(System.in);//make all the variables
        String userInput;
        byte[] b;
        
        while ((userInput = in.next()) != null) {
        b = (userInput).getBytes();
        
        InetAddress ia = InetAddress.getLocalHost();//geting the IP to make sure its safe
        DatagramPacket dp = new DatagramPacket(b,b.length,ia,SERVER_PORT);
        ds.send(dp);
        }
    }
}
