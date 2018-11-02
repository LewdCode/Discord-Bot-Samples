package com.github.lewdcode.Samples;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

public class Connect {

  public static JDA jda;
  
  public static void main(String[] args)
      throws LoginException, RateLimitException, InterruptedException
  {
    
      jda = new JDABuilder(AccountType.BOT).setToken("YOUR-BOT-TOKEN").buildBlocking();
  }

}
