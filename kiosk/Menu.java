package kiosk;

import java.util.ArrayList;

public class Menu {
    String name;
    String explain;


    public Menu(String name, String explain){
        this.name = name;
        this.explain = explain;
    }

    public Menu(){

    }
    ArrayList<Menu> categoryList = new ArrayList<>();

    public String getName() {
        return name;
    }
    public String getExplain() {
        return explain;
    }

    public ArrayList<Menu> getCategoryList() {
        return categoryList;
    }

    public void Showkiosk(){
        System.out.println(getName() + "  / " + getExplain());

    }
}
