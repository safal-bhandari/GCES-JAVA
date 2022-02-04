import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
class Server
{
	public static void main(String[] args) throws IOException
	{
		ServerSocket serverSock = new ServerSocket(6666);

		Socket sock = serverSock.accept();

		DataInputStream dataInput = new DataInputStream(sock.getInputStream());


		System.out.println("Print " + (String) dataInput.readUTF());

		serverSock.close();

	}
}