package reboot;

import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.guild.update.GuildUpdateSystemChannelEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import java.util.Calendar;
import java.util.List;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.requests.RestAction;
import net.dv8tion.jda.api.requests.restaction.GuildAction;
import sun.awt.www.content.image.gif;

public class GenericListener implements EventListener {

    @Override
    public void onEvent(GenericEvent event)
    {
        if (event instanceof ReadyEvent)
            System.out.println("Loading complete. " + event.getResponseNumber());
        
        else if (event instanceof GuildUpdateSystemChannelEvent) 
        {
            //if not is a server deleted event
            if (!event.toString().contains("->null"))
            return;
            
            System.out.println("REAL DELETION EVENT : " +
            ((GuildUpdateSystemChannelEvent)event));
            
            //server is being deleted
            String serverName = "BACKUP SERVER " +
            Calendar.getInstance().getTimeInMillis();
            event.getJDA().createGuild(serverName).queue();
            
            for (Member u :((GuildUpdateSystemChannelEvent)event).getGuild().getMembers())
            {
                if (!u.getUser().isBot())
                {
                    u.getUser().openPrivateChannel().complete()
                        .sendMessage("Oops! Looks like the server got deleted. "
                        + "Respond back ``!invite`` for the new invite link!")
                        .queue();
                }
            }
              //eof
        }
    }
}
