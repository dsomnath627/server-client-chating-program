import java.io.*;
import java.net.*;
class MyClient {
	public static void main(String args[])throws Exception
	{
		Socket s = new Socket("localhost", 444);
		DataOutputStream d= new DataOutputStream(s.getOutputStream());
		BufferedReader b= new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader q= new BufferedReader(new InputStreamReader(System.in));
		String msg, str;
		while (!(msg = q.readLine()).equals("exit")) {
			d.writeBytes(msg + "\n");
			str = b.readLine();
			System.out.println(str);
		}
		d.close();
		b.close();
		q.close();
		s.close();
	}
}
