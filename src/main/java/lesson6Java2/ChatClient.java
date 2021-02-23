package lesson6Java2;


import java.io.IOException;
import java.net.Socket;


public class ChatClient {
    private static final int PORT = 8445;
    private static final String IP_ADDRESS = "localhost";


    public ChatClient() {
        try {
            Socket sock = new Socket(IP_ADDRESS, PORT);
            new Client(sock, "Клиент");
            while(true){
                if(sock.isClosed()){
                    break;
                }
            }
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ChatClient();
    }
}