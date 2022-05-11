package reboot;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Invite.Guild;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;

public class Main {
    
    private static JDA jda;
    private static final String token = "token";
    
    public static void main(String[] args) throws LoginException, InterruptedException {
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        String build = "BUILT @ : " + cal.get(Calendar.HOUR) + ":" 
            +  cal.get(Calendar.MINUTE) + (cal.get(Calendar.AM_PM) == 1 ? "PM" : "AM");
        
        jda = JDABuilder.createDefault(token)
            .setActivity(Activity.watching(build))
            .addEventListeners(new MessageHandler())
            .addEventListeners(new GenericListener())
            .setChunkingFilter(ChunkingFilter.ALL) // enable member chunking for all guilds
            .setMemberCachePolicy(MemberCachePolicy.ALL) // ignored if chunking enabled
            .enableIntents(GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_PRESENCES)
            
            .build();
        
        //block until cache loaded
        jda.awaitReady();
        
        
        for (net.dv8tion.jda.api.entities.Guild g : jda.getGuilds()) {
            if (g.getName().contains("test") || g.getName().contains("BACKUP")) {
                g.delete().complete();
            }
        }
        
        for (net.dv8tion.jda.api.entities.Guild g : jda.getGuilds()) {
            System.out.println(g.getName());
        }
        
       
    }
}
