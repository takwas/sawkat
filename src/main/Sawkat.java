package main;

import org.jibble.pircbot.PircBot;

public class Sawkat extends PircBot {

	private static final String NICK = "sawkat";
	private static final String ALT_NICK = "sawkat_bot";
	
	private final String DEFAULT_IRC_SERVER = "irc.freenode.net";
	private final int DEFAULT_IRC_SERVER_PORT = 6667;
	private final String DEFAULT_CHANNEL = "#dgplug";
	
	
	/*
	 * You are encouraged to use this constructor
	 * over the other as it uses the default and
	 * registered nick.
	 */
	public Sawkat() {
		this(NICK);
	}
	
	public Sawkat(String nick){
		this.setName(nick);
	}
	
	
	
	public String getDefaultServer(){
		
		return this.DEFAULT_IRC_SERVER;
	}
	
	public int getDefaultPort(){
		
		return this.DEFAULT_IRC_SERVER_PORT;
	}
	
	public void changeNick(){
		try{
			
		}catch(Exception e){
			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
