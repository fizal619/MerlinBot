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

  static Dotenv dotenv = Dotenv.load();
  static String API_KEY = dotenv.get("DISCORD_TOKEN");

  public Bot main() throws LoginException {
    new JDABuilder(API_KEY)
    .addEventListeners(new Bot())
    .setActivity(Activity.playing("Type .merlin"))
    .build();

    return this;
  }

  @Override
  public void onMessageReceived(MessageReceivedEvent event) {
    Message msg = event.getMessage();

    System.out.println("\n");
    System.out.println(msg.getContentRaw());
    System.out.println("\n");

    if (msg.getContentRaw().contains(".merlin")) {
      MessageChannel channel = event.getChannel();
      channel.sendMessage("Hoh skunt, meh ah live bai!")
        .queue();
    }
  }
}