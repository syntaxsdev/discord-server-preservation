package Server;

import java.util.ArrayList;
import net.dv8tion.jda.api.Permission;

public class ServerSetup {

    private ArrayList<Channel> channels;
    private Role[] roles;
    
    public void setUp()
    {
        channels = new ArrayList<>();
        roles = getRoles();
        //CHANNELS

        
    }
    
    
    public Role[] getRoles()
    {
        ArrayList<Role> roles = new ArrayList<Role>();
        
        //top role
        
        roles.add(new Role("Pirate Sheep")
            .addPermission(Permission.ADMINISTRATOR));
        
        //plug role
        roles.add(new Role("Plugs")
            .addPermission(Permission.MESSAGE_MANAGE));
        
        //consumer role
        roles.add(new Role("Consumer"));
        
        return (Role[])roles.toArray();
    }

}
