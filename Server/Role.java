package Server;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import net.dv8tion.jda.api.Permission;

public class Role {
    private String role;
    private ArrayList<Permission> perms;
    private Color color;
    
    public static Role[] roles = {
        
        //top role
        new Role("Pirate Sheep")
            .addPermission(Permission.ADMINISTRATOR)
            .setColor(Color.orange),
           
            
        
        //plug role
        new Role("Plugs")
            .addPermission(Permission.MESSAGE_MANAGE)
            .setColor(Color.red),
        
        //consumer role
        new Role("Consumer")
            .setColor(Color.blue)
    };
    
    public Role(String r)
    {
        role = r;
        perms = new ArrayList<>();
        
    }
    
    public Role setColor(Color c) {
        this.color = c;
        return this;
    }
    
    public Color getColor() {
        return color;
    }
    
    public Role addPermission(Permission p) {
        perms.add(p);
        return this;
    }
    
    public String getRole() {
        return role;
    }
    
    /**
     * static method returns a role
     * @param name
     * @return
     */
    public static Role getRole(String name) {
        for (Role r : roles) {
            if (r.getRole().equals(name)) {
                return r;
            }
        }
        return null;
    }
    
    public ArrayList<Permission> getPerms() {
        return perms;
    }
}
