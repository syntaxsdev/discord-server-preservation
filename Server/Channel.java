package Server;

import java.util.ArrayList;

public class Channel {
    private String name;
    private ArrayList<String> messages;
    private ArrayList<String> images;
    
    public static Channel[] Channels = 
    {
        //announcement
        new Channel("media").addMessage("@luffycooks").addImage("luffyig.png"), // 0
        new Channel("welcome"), // 1
        new Channel("news"), // 2
        //general
        
        new Channel("staff").addMessage("Staff chat is default as is viewable to all. Please fix"),
        
    };
    
    public Channel(String n) {
        messages = new ArrayList<>();
        images = new ArrayList<>();
        
        this.name = n;
    }

    public Channel addImage(String... img) {
        for (String s : img) {
            images.add(s);
        }
        return this;
    }
    
    public Channel addMessage(String s) {
        messages.add(s);
        return this;
    }
    
    public String getName() {
        return name;
    }
    
    public ArrayList<String> getMessages() {
        return messages;
    }
    
    public ArrayList<String> getImages()  {
        return images;
    }
    public static Channel getByName(String n)
    {
        for (Channel c : Channels) {
            if (c.getName().equals(n)) {
                return c;
            }
        }
        return null;
    }
}
