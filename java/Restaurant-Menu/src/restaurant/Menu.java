package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;
    private HashMap<String, ArrayList<MenuItem>>  categoryToItemsMap = new HashMap<>();
    public Menu(ArrayList<MenuItem> items) {
        setItems(items);
    }
    public Menu(Date d, ArrayList<MenuItem> items) {
        setItems(items);
        this.lastUpdated = d;
    }
    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = new Date();
    }

    public void addItem(MenuItem item) {
        if(this.items.contains((item))){
            System.out.println("That item already exists");
            return;
        }
        this.items.add(item);
        this.lastUpdated = new Date();
    }

    public void removeItem(MenuItem item) {
        this.items.remove(item);
    }


    public Date getLastUpdated() {
        return this.lastUpdated;
    }
    public String getMenuString() {
        String str = "";
        for(MenuItem item: this.items){
            str+= item.getCategory() + " (" + item.getPrice() +")" + "-"  + item.getDescription();
        }
        return str;
    }
}