package morgancentral99.chat;

import java.util.ArrayList;

import morgancentral99.chat.commands.ClearChat;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {
	
	static Main instance;
	private ArrayList<String> PlayersMuted = new ArrayList<>();
	private ArrayList<String> PlayersChatingGlobal = new ArrayList<>();
	
	public static Main getInstance() {
		return instance;
	}
	
	public void onEnable() {
		instance = this;
		System.out.println("Loading Bungee Chat");
		getProxy().getPluginManager().registerListener(this, new ChatListener());
		getProxy().getPluginManager().registerCommand(this, new ClearChat("ClearChat"));
	}
	
	public void addPlayerMuted(String playerName) {
		PlayersMuted.add(playerName);
	}
	
	public boolean isPlayerMuted(String playerName) {
		if(PlayersMuted.contains(playerName)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addPlayerToGlobal(String playerName) {
		PlayersChatingGlobal.add(playerName);
	}
	
	public boolean isPlayerTalkingToGlobal(String playerName) {
		if(PlayersChatingGlobal.contains(playerName)) {
			return true;
		} else {
			return false
		}
		
		
	}
	
	
	
	
	

}
