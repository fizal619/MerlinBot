# MerlinBot 

Discord bot written with Java running on repl.it. Hopefully we can get this up and running. 

## Dependencies

Create a `.env` file in your repl.it (if you forked this) with the following: 

```
DISCORD_TOKEN=<your bot's token>
```

## How to Edit

This project consists of 2 parts: 

- A webserver to make sure repl.it keeps our bot alive. This consists of two java classes (both in `Main.java`) and a few of maven packages.
- A discord bot (`Bot.java`) which already has the `onMessageReceived` event handler set up.

## WTF - Why is there a webserver here?

In order for repl.it to keep our bot alive and not kill it when we close replit. There's a monitor on https://uptimerobot.com/ to ping this repl.it's web url (https://MerlinBot--fizal619.repl.co) every 23 minutes.

## Resources: 

- [JDA (Java Discord API)](https://github.com/DV8FromTheWorld/JDA)
