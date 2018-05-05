package morgancentral99.chat.commands;

import morgancentral99.chat.Main;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class MuteChat extends Command{

	public MuteChat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	private Main instance = Main.getInstance();
	@Override
	public void execute(CommandSender s, String[] args) {
		String player = s.getName();
		instance.addPlayerMuted(player);
		
	}

}
