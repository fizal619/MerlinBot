# MerlinBot 

Discord bot written in Java running on repl.it. Hopefully we can get this up and running. 

## Dependencies

Create a .env file in your repl.it (if you forked this) with the following: 

```
DISCORD_TOKEN=<your bot's token>
```

## How to Edit

This project consists of 2 parts: 

- A spring boot webserver to make sure repl.it keeps our bot alive. This consists of two java files (`MainApplication.java` & `WebController.java`) and a butt ton of maven packages.
- A discord bot (`Bot.java`) which already has the `onMessageReceived` event handler set up.

Because java is dumb these files are found in the `src/main/java/me/fizal/MerlinBot` folder. If you need to make any more classes, add them to that folder and make sure to add `package me.fizal.MerlinBot;` to the top of your file. 

## WTF - Why is there a webserver here?

In order for repl.it to keep our bot alive and not kill it when we close replit. There's a monitor on https://uptimerobot.com/ to ping this repl.it's web url (https://MerlinBot--fizal619.repl.co) every 58 minute. Hopefully this keeps it alive. 

## Resources: 

- [JDA (Java Discord API)](https://github.com/DV8FromTheWorld/JDA)
