package reboot;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import Server.*;
import Server.Category;
import Server.Role;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.RestAction;
import net.dv8tion.jda.api.requests.restaction.ChannelAction;
import net.dv8tion.jda.api.requests.restaction.GuildAction;
import net.dv8tion.jda.api.requests.restaction.RoleAction;
import net.dv8tion.jda.api.utils.AttachmentOption;

public class MessageHandler extends ListenerAdapter {
    
    
    private String prefix = "!";
    private String[] auth = {"574691737130500097"};
    @Override
    public void onMessageReceived(MessageReceivedEvent msgEvent)
    {
        String msg = msgEvent.getMessage().getContentRaw();
        Message message = msgEvent.getMessage();
        User author = msgEvent.getAuthor();
        MessageChannel channel = msgEvent.getChannel();
        
        //command for dm invite link
        if (msgEvent.isFromType(ChannelType.PRIVATE) && msg.equals(prefix + "invite")) 
        {
            //user is requesting new server link
            Invite link = msgEvent.getJDA().getGuilds().get(0)
                .getSystemChannel().createInvite().complete();
            
            channel.sendMessage(link.getUrl()).queue();
        }
        if (msgEvent.isFromGuild() && msg.startsWith(prefix) && isAuth(author)) {
            
            
            if (msg.equals(prefix + "id"))
            {
                for (Member u : msgEvent.getGuild().getMemberCache()) {
                    if (!u.getUser().isBot()) {
                        u.getUser().openPrivateChannel().complete().sendMessage("Testing").complete();
                    }
                    
                    //u.getUser().openPrivateChannel().complete().sendMessage("Hi");
                }
                //author.openPrivateChannel().complete().sendMessage("" + author.getIdLong() + "").queue();
                //channel.sendMessage("" + author.getIdLong() + "").queue();
            } 
            //SEVER CLEAR COMMAND
            if (msg.equals(prefix + "clear")) 
            {
                channel.sendMessage("Resetting server...").queue();;
                this.clearServer(msgEvent.getGuild());
                channel.sendMessage("Server has been reset to default.").queue();
                
                try {
                    msgEvent.getJDA().wait(10000);
                }
                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
                //clears all guilds
                for (net.dv8tion.jda.api.entities.Guild g : msgEvent.getJDA().getGuilds()) {
                    if (g.getName().contains("test") || g.getOwner().getUser().equals(msgEvent.getJDA().getSelfUser()))
                    {
                        g.delete().complete();
                    }
                }
                
            }
            
            
            //pitch
            
            if (msg.equals(prefix + "pitch")) 
            {
                channel.sendMessage("We are also taking suggestions on improving the experience for you guys!").queue();
            }
            //give roles
            if (msg.equals(prefix + "role give consumer")) 
            {
                channel.sendMessage("Granting roles...").queue();;
                this.grantRole(msgEvent.getGuild());
                channel.sendMessage("Roles Granted").queue();
            }
            
            //clear roles
            if (msg.equals(prefix + "clear roles")) 
            {
                channel.sendMessage("Resetting roles...").queue();;
                this.clearServerRoles(msgEvent.getGuild());
                channel.sendMessage("Server roles has been reset to default.").queue();
            }
            
            if (msg.equals(prefix + "assign")) 
            {
                channel.sendMessage("Server assigned!").queue();
            }
            
            if (msg.equals(prefix + "server"))
            {
                msgEvent.getJDA().createGuild("test 9").queue();
                System.out.println("Servers: " + msgEvent.getJDA().getGuilds().size());
                
                List<Guild> guildList = msgEvent.getJDA().getGuilds();
                guildList = msgEvent.getJDA().getGuilds();
                
                for (Guild g : guildList)
                    System.out.println(g.getName());
                    
            }
            //SERVER CREATION COMMAND
            if (msg.equals(prefix + "setup"))
            {
              //reply back
                channel.sendMessage("Setting up server...").queue();
                ServerSetup server = new ServerSetup();
                
                //call the create server function
                createServer(msgEvent.getGuild());
                
            }
            
            
            
        }
    }
    
    public void createServer(Guild guild) 
    {
        //first we will create roles for the server
        for (Role r : Role.roles) 
        {
            RoleAction ra = guild.createRole().setName(r.getRole());
            ra.setHoisted(true).setColor(r.getColor());
            if (!r.getPerms().isEmpty()) {
                ra.setPermissions(r.getPerms());
            }
            ra.queue();
        }
        
        
        //now setup the channels
        for (Category c : Category.categories) {
            net.dv8tion.jda.api.entities.Category ca = guild.createCategory(c.getName()).complete();
            if (!c.getChannels().isEmpty()) {
                for (Channel ch : c.getChannels()) {
                    MessageChannel msgChan = ca.createTextChannel(ch.getName()).complete();
                    if (!ch.getMessages().equals(null)) {
                        
                        //send images for the channel
                        for (String img : ch.getImages()) {
                            msgChan.sendFile(new File("images/" + img)).queue();
                        }
                        //send text for the channel
                        for (String msg : ch.getMessages()) {
                            msgChan.sendMessage(msg).queue();
                        }
                    }
                }
            }
               
        }
        //give every auth user admin role
        for (Member u : guild.getMembers()) {
           //aa
        }
        
        for (String id : auth) {
            Member m = guild.getMemberById(Long.parseLong(id));
            
            
            if (m != null) {
                net.dv8tion.jda.api.entities.Role topRole = guild.getRolesByName(Role.roles[0].getRole(), true).get(0);
                guild.addRoleToMember(m.getIdLong(), topRole)           
                    .queue();
            }
        }
    }
    
    
    public void clearServer(Guild guild) {
        int chanSize = guild.getTextChannels().size();
        for (int i = 0; i < chanSize; i++) {
            TextChannel mc = guild.getTextChannels().get(i);
            if (!mc.getName().equals("command-chat")) {
                mc.delete().complete();
            }
        }
        int catSize = guild.getCategories().size();
        for (int i = 0; i < catSize; i++) {
            net.dv8tion.jda.api.entities.Category cat = guild.getCategories().get(i);
            if (!cat.getName().equals("general 2")) {
                cat.delete().complete();
            }
        }
        int roleSize = guild.getRoles().size() - 1;
        for (int i = 0; i < roleSize; i++) {
            net.dv8tion.jda.api.entities.Role r = guild.getRoles().get(i);
            if (!r.getName().equals("ADMINS") && !r.getName().equals("Reboot Bot")) {
                r.delete().complete();
            }
        }
       
        
    }
    
    public void grantRole(Guild guild)
    {
        for (Member m : guild.getMembers()) {
            if (m.getRoles().size() == 0) {
                net.dv8tion.jda.api.entities.Role thisRole = guild.getRolesByName("Consumer", false).get(0);
                guild.addRoleToMember(m.getIdLong(), thisRole).queue();
            }
        }
    }
    
    public void clearServerRoles(Guild guild) 
    {
        int roleSize = guild.getRoles().size() - 1;
        for (int i = 0; i < roleSize; i++) {
            net.dv8tion.jda.api.entities.Role r = guild.getRoles().get(i);
            if (!r.getName().equals("Owner") && !r.getName().equals("Reboot Bot") && !r.isManaged()) {
                r.delete().complete();
            }
        }
        
    }
    public boolean isAuth(User u)
    {
        String id = u.getId();
        for (int i = 0; i < auth.length; i++) {
            if (id.equals(auth[i])) {
                return true;
            }
        }
        return false;
    }

}
