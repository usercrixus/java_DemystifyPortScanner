package Main;


import java.net.Socket;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i < 100 ; i++) {
			try {
				Socket connection = new Socket("127.0.0.1", i);				
				System.out.println("port "+i+" of host 127.0.0.1 is open");
			} catch (Exception e) {

			}
		}


	}

}
