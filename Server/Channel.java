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
        new Channel("chat").addMessage("This is where all communication goes."),
        new Channel("vouch").addMessage("This is where all vouches goes."),
        //2z
        new Channel("chipotle buy4u").addMessage("**CHIPOTLE BUY4U**").addImage("chipotle-buy4u.jpg"),
        //luffy
        new Channel("amazon").addMessage("Amazon.com\n" + 
            "\n" + 
            "Questions :100::star_struck::100:\n" + 
            "\n" + 
            "1. Can I use a reship address / Amazon locker? - Answer: Yes\n" + 
            "\n" + 
            "2. Can I use a Fresh Amazon account? - Answer: Yes\n" + 
            "\n" + 
            "3. What's the Max limit for each order? - Answer: $5000\n" + 
            "\n" + 
            "4. How many times can I do it on each Amazon account? - Answer: 3-4 times on each Amazon account\n" + 
            "\n" + 
            "5. What's the timeframe for the refund on Amazon? - Answer: 2-3 weeks Max! (Might be longer cus rona)\n" + 
            "Items under 700 can be done in 2-5 days\n" + 
            "\n" + 
            "6. What payment method, do I need to use for it? - Answer: It doesn't matter\n" + 
            "\n" + 
            "7. What If I need to sign for the package/packages? - Answer: Just use your real signature, it actually doesn't matter!\n" + 
            "\n" + 
            "8. What If the delivery guy made a picture of my package/packages? - Answer - It doesn't matter, even If he made 1million pictures, I can refund it!\n" + 
            "\n" + 
            "9. What is the Amazon item limit? - Answer: 7-8 for each Order!\n" + 
            "\n" + 
            "Requirements: It needs to be Fulfilled/sold by Amazon - Amazon sells everything that you can think of.\n" + 
            "\n" + 
            "My Fee: 30-40% after the refund confirmation \n" + 
            "\n" + 
            "Success rate: 100% :100:\n" + 
            "\n" + 
            "If you have used  someone else to refund your Amazon order and It failed then DM me, I can fix it but I'll charge a higher fee! :partying_face:"),
        new Channel("target").addMessage(":white_check_mark: Target - up to $15 000 USD (in-store pickup allowed, multiple items, multiple refunds per account) :moneybag: \n" + 
            "\n" + 
            "Also Furniture and TV's:tv: \n" + 
            "\n" + 
            "You can also do store pickup!!!You can manage to do 2-3 refunds per account, no problems as long as you switch up target store you do pick-ups at. Signature does not matter.\n" + 
            "\n" + 
            "Has to say “target.com” in return policy \n" + 
            "\n" + 
            ":clock1230: Refund timeframe is about 2 to 3 days.\n" + 
            "\n" + 
            "<-- Pick ups / Delivery\n" + 
            "\n" + 
            "Refund fee: 30-40% \n" + 
            "\n" + 
            "MUST PAY AFTER EMAIL CONFIRMATION (Looks like the one above)")
            .addImage("targetcom.jpg"),
            
        new Channel("paypal").addMessage("PayPal refund \n" + 
            "\n" + 
            "1. Can refund all site that takes PayPal \n" + 
            "2. Does not matter if signed \n" + 
            "3. Min 500$\n" + 
            "4. Max 25k\n" + 
            "5. Process time 2-3weeks\n" + 
            "6. Pay me 40% of total\n" + 
            "7. Will not affect your account and one PayPal refund at a time\n" + 
            "8. Pickup orders work too\n" + 
            "Show me b4 placing\n" + 
            "9. No limit on items\n" + 
            "\n" + 
            "Questions regarding StockX, Goat and Grailed: :gem: :athletic_shoe::drooling_face:\n" + 
            "\n" + 
            "1. Max limit: $25 000 - PayPal required \n" + 
            "\n" + 
            "2. Max items: 1\n" + 
            "\n" + 
            "Questions regarding PayPal:\n" + 
            "\n" + 
            "1. The PayPal doesn't need to be verified\n" + 
            "\n" + 
            "2. The PayPal doesn't need to be aged\n" + 
            "\n" + 
            "Just make a few transactions on it and it's fine.\n" + 
            "\n" + 
            "3. Process time: 2-3 weeks"),
        new Channel("walmart").addMessage(":white_check_mark: Walmart - up to $5000 USD multiple items, multiple refunds per account) :moneybag: \n" + 
            "\n" + 
            "You can purchase Apple products and much more!\n" + 
            "\n" + 
            "!!!You can manage to do 2-3 refunds per account, no problems. Signature does not matter.\n" + 
            "\n" + 
            "Max items: 5-10\n" + 
            "\n" + 
            ":clock1230: Refund timeframe is about 1-3 days\n" + 
            "\n" + 
            "<-- Only Delivery\n" + 
            "\n" + 
            "The items must be sold by Walmart - Really important!\n" + 
            "\n" + 
            "Payment methods: Credit/debit card or PayPal <--- No PayPal required!\n" + 
            "\n" + 
            "<-- New Method\n" + 
            "\n" + 
            "Refund fee: 30-40% after the refund"),
        new Channel("ebay").addMessage("eBay.com (USA)\n" + 
            "\n" + 
            "<-- Max limit: $25 000\n" + 
            "<-- Min: $400\n" + 
            "-Reships allowed\n" + 
            "-Delivery allowed\n" + 
            "\n" + 
            "Max items: 3-4\n" + 
            "\n" + 
            "Process time 7-10days\n" + 
            "\n" + 
            "You can purchase everything you want, even really big TV's. It doesn't matter!\n" + 
            "\n" + 
            "Success rate: 100% :white_check_mark::100::star_struck:\n" + 
            "\n" + 
            "Fee: 35-40%\n" + 
            "\n" + 
            "Credit/debit card (No PayPal required) any payment\n" + 
            "\n" + 
            "\n" + 
            "Important information: :sos: \n" + 
            "\n" + 
            "1. Make sure the seller has the eBay Money back Guarantee and accepts returns.\n" + 
            "\n" + 
            "2. Seller must have at least 10k+ reviews"),
        new Channel("adidas").addMessage("Adidas.com (USA) <--- Max limit: $5000 - 100% success rate.\n" + 
            "\n" + 
            "Max items: 15-20\n" + 
            "\n" + 
            "Process time: 7-12 days\n" + 
            "\n" + 
            "<-- Payment methods: Credit / debit card or PayPal - It's up to you!\n" + 
            "\n" + 
            "Fee: 35-40%"),
        new Channel("home depot").addImage("homedepot.png"),
        new Channel("food refund").addMessage("Food refund 60% off (25 min)\n" + 
            "Steps\n" + 
            "1.You place order yourself\n" + 
            "2. Lmk when delivered \n" + 
            "3. Give me login to acc and pay me 40%\n" + 
            "4. Wait patiently till I tell you it’s done \n" + 
            "\n" + 
            "Grubhub,DoorDash, postmate,uber eats and seamless\n" + 
            "Instacart ^"),
        new Channel("other store list").addMessage("POPULAR STORES -\n" + 
            "TARGET 15k 20 items\n" + 
            "Wayfair 15k\n" + 
            "DICKS SPORTING 1k \n" + 
            "MACY'S 2k\n" + 
            "NIKE 500-1k 8 items\n" + 
            "NORDSTROM 2k\n" + 
            "BLOOMINGDALES 2k\n" + 
            "VICTORIA SECRET 1-2k\n" + 
            "SEPHORA 2-3k\n" + 
            "BESTBUY 500\n" + 
            "SAKS 5TH AVE 500\n" + 
            "FOREVER 21 500 \n" + 
            "Neiman Marcus 1,000\n" + 
            "\n" + 
            "STORE LIST:\n" + 
            "Abercrombie & Fitch 1k\n" + 
            "Academy 500\n" + 
            "Banana Republic 500\n" + 
            "BestBuy 500 (1-2 item)\n" + 
            "Blue Fly 500\n" + 
            "Cabelas 1k\n" + 
            "Chewy 500\n" + 
            "DXL Apparel 500\n" + 
            "Dicks Sporting Goods 1k\n" + 
            "Dillard’s 750\n" + 
            "Store Disney 500\n" + 
            "Dockers 500\n" + 
            "Express 500\n" + 
            "Eyebuydirect 500\n" + 
            "Fanatics 500\n" + 
            "Fans Edge 750\n" + 
            "Gap 750\n" + 
            "Gnc 500\n" + 
            "H&M 500\n" + 
            "Hollister 500\n" + 
            "Hot Topic\n" + 
            "JCrew 500\n" + 
            "Jos A Bank 1,000\n" + 
            "Kmart 500\n" + 
            "Kenzo 1k\n" + 
            "Levi’s 500\n" + 
            "MLB/NBA/NFL STORE 500\n" + 
            "Macy’s 2k\n" + 
            " Madewell 500\n" + 
            "New Balance 500\n" + 
            "Nike 1k\n" + 
            "Nordstrom RACK 1,000\n" + 
            "Nordstrom 2k\n" + 
            "Oakley 500\n" + 
            "Old Navy 750\n" + 
            "Pink 500\n" + 
            "QVC 2,000 (1 item)\n" + 
            "REI 500\n" + 
            "Ralph Lauren 1k\n" + 
            "River Island 500\n" + 
            "Sierra 500\n" + 
            "Saks 5th Ave 2k\n" + 
            "Tommy Hilfiger 1k\n" + 
            "The Children’s Place 500\n" + 
            "UNIQLO 1k POPULAR\n" + 
            "Vans 500\n" + 
            "Zappos 1,000\n" + 
            "\n" + 
            "Does not require PayPal. HMU for more info"),
        new Channel("chipotle-buy4u").addImage("luffy chip.png", "luffy chip instruction.png"),
        new Channel("ubereats-buy4u").addMessage("Dm me with these info:\n" + 
            "\n" + 
            "Number \n" + 
            "Full Address\n" + 
            "Screenshot of your order include (store name and total of your order)\n" + 
            "Payment first b4 I place order").addImage("ubereats.jpg"),
        new Channel("Refund Services").addMessage("**LUFFYS SERVICES**")
            .addImage("apple.jpg", "costco.jpg", "doubledip.jpg", "luffy chip.png", "luffy chip instruction.png", "luffy pamphlet.jpg",
            "psa giftcard.jpg", "psa giftcard2.jpg", "psa giftcard3.jpg", "luffy shop.jpg"),
        //litesin
        new Channel("btc-exchange").addMessage("BTC\n" + 
            "Rates : 10-14%\n" + 
            "Exchanged aroud 50k\n" + 
            "I accept Cashapp and Zelle\n" + 
            "Minimum of $20, else there is a $2.50 flat feet for under $20\n" + 
            "\n" + 
            "Cashapp requires to be sent from balance, Zelle requires verification"),
        //potato
        new Channel("walmart").addMessage("This is a BUY4U service so don't place to order. Ill do all the work and placing the order. Make sure to DM me if you have any questions, I usually reply pretty quickly. No question is too small or too big :slight_smile:\n")
            .addImage("walmart.png"),
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
