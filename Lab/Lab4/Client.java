import java.io.IOException;
import java.net.Socket;
import java.io.DataOutputStream;
class Client
{
	public static void main(String[] args) throws IOException
	{
		Socket sock = new Socket("127.0.0.1", 6666);

		DataOutputStream dataOutput = new DataOutputStream(sock.getOutputStream());

		dataOutput.writeUTF("Hello");
		dataOutput.flush();
		dataOutput.close();

		sock.close();
	}
}