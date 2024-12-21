// package Networking.DatagramSocket;
// import java.io.*;
// import java.net.*;
// public class Server {
//     public static void main(String[] args) throws Exception {


//     DatagramSocket serverSocket = new DatagramSocket(9876);

//     byte[] receiveData = new byte[1024];
//     byte[] sendData = new byte[1024];


//             while(true)
//     {
//         DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
//         serverSocket.receive(receivePacket);

//         String sentence = new String( receivePacket.getData());
//         System.out.println("RECEIVED: " + sentence);

//         InetAddress IPAddress = receivePacket.getAddress();

//         int port = receivePacket.getPort();

//         String capitalizedSentence = sentence.toUpperCase();

//         sendData = capitalizedSentence.getBytes();

//         DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);

//         serverSocket.send(sendPacket);
//         serverSocket.close();
//     }

// }

// }

import java.net.*;
public class Server {
    public static void main(String[] args) {
        DatagramSocket serverSocket = null;
        try {
            serverSocket = new DatagramSocket(9876);
            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];
            System.out.println("Server is listening on port 9876...");
            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);  // This blocks until data is received

                String sentence = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("RECEIVED: " + sentence);

                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                String capitalizedSentence = sentence.toUpperCase();

                sendData = capitalizedSentence.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                serverSocket.send(sendPacket);  // Send back the processed message
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();  // Ensure socket is closed when done
            }
        }
    }
}