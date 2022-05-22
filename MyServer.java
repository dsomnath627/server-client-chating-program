import java.io.*;
import java.net.*;
class MyServer {
	public static void main(String args[])throws Exception
	{
		ServerSocket m = new ServerSocket(444);
		Socket s = m.accept();
		System.out.println("This Server is ready for connection ");
		PrintStream p= new PrintStream(s.getOutputStream());
		BufferedReader b= new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedReader q= new BufferedReader(new InputStreamReader(System.in));
		while (true) 
			{
			String str, str1;
			while ((str = b.readLine()) != null) {
				System.out.println(str);
				str1 = q.readLine();
				p.println(str1);
			}
			p.close();
			b.close();
			q.close();
			m.close();
			s.close();
			System.exit(0);
		}
	}
}
