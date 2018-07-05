
/* Game Client

created by Shevis Johnson
Oct 21, 2016
*/

import java.net.Socket;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class GameClient
{

	public static void main(String[] args)
	{
		try
		{
			String hostname = "localhost";
			int port = 7654;
			boolean myTurn = true;
			System.out.println("Connecting to game server on port " + port);
			Socket connectionSock = new Socket(hostname, port);

			DataOutputStream serverOutput = new DataOutputStream(connectionSock.getOutputStream());

			System.out.println("Connection made.");

			// Start a thread to listen and display data sent by the server
			GameListener listener = new GameListener(connectionSock);
			Thread theThread = new Thread(listener);
			theThread.start();

			// Read input from the keyboard and send it to everyone else.
			// The only way to quit is to hit control-c, but a quit command
			// could easily be added.
			Scanner keyboard = new Scanner(System.in);
			while (serverOutput != null)
			{
				String data = keyboard.nextLine();
				if (!myTurn) {
					System.out.println("Please wait for your turn.");
				} else if ((data.equals("0") || data.equals("1")) || data.equals("2")) {
					serverOutput.writeBytes(data + "\n");
				} else if (data.equals("quit")) {
          serverOutput.close();
					serverOutput = null;
        } else {
					System.out.println("Invalid input, pleas try again.");
				}
			}
      System.out.println("Connection lost.");
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
} // MTClient
