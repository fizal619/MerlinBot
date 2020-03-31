package me.fizal.MerlinBot;

import javax.security.auth.login.LoginException;

import io.github.cdimascio.dotenv.Dotenv;

import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Bot extends ListenerAdapter {

  static String API_KEY;

  public Bot main() throws LoginException {
    try {
      Dotenv dotenv = Dotenv.load();
      API_KEY = dotenv.get("DISCORD_TOKEN");
    } catch (Exception e) {
      API_KEY = System.getenv("DISCORD_TOKEN");
    }
    new JDABuilder(API_KEY)
    .addEventListeners(new Bot())
    .setActivity(Activity.playing("Type .merlin"))
    .build();

    return this;
  }

  // do all your own java down here, do not modify above. 

  @Override
  public void onMessageReceived(MessageReceivedEvent event) {
    // all your codes within this function restart the bot on code changes

    Message msg = event.getMessage();

    System.out.println("\n");
    System.out.println(msg.getContentRaw());
    System.out.println("\n");

    //maybe this should be help text
    if (msg.getContentRaw().equals(".merlin")) {
      MessageChannel channel = event.getChannel();
      channel.sendMessage("Hoh skunt, meh ah live bai! 🔮🧙‍♀️")
        .queue();
    }
  
  
  // end of safezone
  }
}