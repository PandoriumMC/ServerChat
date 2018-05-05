package morgancentral99.chat.commands;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class ClearChat extends Command{
	
	public ClearChat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(CommandSender s, String[] args) {
		for(int i = 0; i<50; i++) {
			s.sendMessage(new TextComponent(" "));
		}
		
	}
	 

}
