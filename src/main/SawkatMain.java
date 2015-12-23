package main;

import java.io.IOException;

import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.NickAlreadyInUseException;

public class SawkatMain {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Sawkat bot = new Sawkat();
		bot.setVerbose(true);
		
		// Try to connect and join a channel using default parameters
		while (true){
			try{
				bot.connect(bot.getDefaultServer(), bot.getDefaultPort());
				bot.joinChannel(bot.getDefaultChannel());
				
				break;
				
			}catch(NickAlreadyInUseException naiue){
				System.out.println("Nick "+bot.getCurrentNick()+", already in use. Trying alternate nick.");
				bot.changeNick();
				
			}catch(IrcException irce){
				System.out.println("IRC Exception occured!");
				
			}catch(IOException ioe){
				System.out.println("IO Exception occured!");
				
			}
		}
		
		bot.sendMessage(bot.getDefaultChannel(), "Hello, from "+bot.getCurrentNick());
	}

}
