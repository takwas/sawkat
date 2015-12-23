package main;

import org.jibble.pircbot.PircBot;

public class Sawkat extends PircBot {

	private static final String NICK = "sawkat";
	private static final String ALT_NICK = "sawkat_bot";
	
	private final String DEFAULT_IRC_SERVER = "irc.freenode.net";
	private final int DEFAULT_IRC_SERVER_PORT = 6667;
	private final String DEFAULT_CHANNEL = "#pircbot";
	
	
	
	
	
	
	
	
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
	
	
	
	
	public String getDefaultChannel(){
		
		return this.DEFAULT_CHANNEL;
	}

	
	
	
	public String getNick(){
		
		return NICK;
	}
	
	
	
	
	public String getAltNick(){
		
		return ALT_NICK;
	}
	
	
	
	
	public String getCurrentNick(){
		
		return this.getName();
	}




	public void changeNick(){
		
		if (getCurrentNick().equals(getNick())){
			this.setName(this.getAltNick());
			
		}else{
			this.setName(this.getNick());
			
		}
	}
	
	
	
	
	
	
	
	
	/*Sawkat actions ;)*/
	
	
	/* Defines action to perform when a message is sent
	 * in the channel.
	 */
	public void onMessage(String channel, String sender, String login,
			String hostname, String message){
		
		if (msgIsToMe(message)){
			try{
				if (message.contains("hi")){
					this.sendMessage(channel, "Hello "+sender+"!");
					Thread.sleep(1000);
					this.sendMessage(channel, sender+", how are you today?");
				}
			}catch(InterruptedException ie){
				System.out.println("Couldn't sleep. Thread was interrupted.");
			}
		}
	}
	
	
	/* Determines if the given message text
	 * mentions this bot.
	 */
	public boolean msgIsToMe(String msg){
		return msg.contains(this.getCurrentNick());
	}

	

	
}
