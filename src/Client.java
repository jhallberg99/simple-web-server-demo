import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        String hostName = args[0];
        int portNumber = Integer.parseInt(args[1]);

        Socket serverSocket = new Socket(hostName, portNumber);
        PrintWriter out = new PrintWriter(serverSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));

        String inPutLine = in.readLine();
        System.out.println(inPutLine);
    }
}
