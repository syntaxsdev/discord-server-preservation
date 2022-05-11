package Server;

import java.util.ArrayList;
import net.dv8tion.jda.api.Permission;

public class Category {
    private String name;
    private ArrayList<Permission> perms;
    private ArrayList<String> permsName;
    private ArrayList<Channel> channels;
    
   public static Category[] categories = 
   {
       new Category("Announcement")
           .addChannel(Channel.getByName("media"))
           .addChannel(Channel.getByName("welcome"))
           .addChannel(Channel.getByName("news")),
           
       new Category("General")
           .addChannel(Channel.getByName("chat"))
           .addChannel(Channel.getByName("vouch"))
           .addPermission(Role.getRole("Plugs"), Permission.MESSAGE_WRITE),
           
           
           /*
            * new Category("Staff")
            * .addChannel(Channel.getByName("staff")),
            */
           
       new Category("Services")
           .addChannel(Channel.getByName("Refund Services"))
           .addChannel(Channel.getByName("amazon"))
           .addChannel(Channel.getByName("target"))
           .addChannel(Channel.getByName("paypal"))
           .addChannel(Channel.getByName("ebay"))
           .addChannel(Channel.getByName("adidas"))
           .addChannel(Channel.getByName("home depot"))
           .addChannel(Channel.getByName("food refund"))
           .addChannel(Channel.getByName("other store list"))
           .addChannel(Channel.getByName("chipotle-buy4u"))
           .addChannel(Channel.getByName("ubereats-buy4u")),
           
       /*
        * new Category("Litesin Services")
        * .addChannel(Channel.getByName("btc-exchange")),
        * 
        * new Category("General")
        * .addChannel(Channel.getByName("chat"))
        * .addPermission(Role.getRole("Plugs"), Permission.MESSAGE_MANAGE),
        * 
        * new Category("2z services")
        * .addChannel(Channel.getByName("chipotle buy4u"))
        */
       
   };
    
    public Category(String n) {
        perms = new ArrayList<>();
        permsName = new ArrayList<>();
        channels = new ArrayList<>();
        
        this.name = n;
    }

    
    public Category addPermission(Role role, Permission p) {
        
        perms.add(p);
        return this;
    }
    
    public Category addChannel(Channel c) {
        channels.add(c);
        return this;
    }
    
    public String getName()
    {
        return name;
    }
    
    public ArrayList<Channel> getChannels() {
        return channels;
    }
    
    public Permission[] getPermission() {
        return (Permission[])perms.toArray();
    }
}


