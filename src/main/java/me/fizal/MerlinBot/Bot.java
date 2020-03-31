package me.fizal.MerlinBot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.JDABuilder;

public class Bot extends ListenerAdapter {
  
  
  public static void main(String[] args) {
    // String API_KEY = System.getenv().keySet().get("DISCORD_TOKEN");
    new JDABuilder(API_KEY)
      .addEventListeners(new Bot())
      .setActivity(Activity.playing("Type .merlin"))
      .build();
  }
    
    @Override
    // public void onMessageReceived(MessageReceivedEvent event)
    // {
    //     Message msg = event.getMessage();
    //     if (msg.getContentRaw().equals("!ping"))
    //     {
    //         MessageChannel channel = event.getChannel();
    //         long time = System.currentTimeMillis();
    //         channel.sendMessage("Pong!") /* => RestAction<Message> */
    //               .queue(response /* => Message */ -> {
    //                   response.editMessageFormat("Pong: %d ms", System.currentTimeMillis() - time).queue();
    //               });
    //     }
    // }
}