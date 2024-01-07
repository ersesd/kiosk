package kiosk;

import java.util.ArrayList;

public class Menu {
    String name;
    String explain;

    public String getName() {
        return name;
    }

    public Menu(String name, String explain){
        this.name = name;
        this.explain = explain;
    }

    public Menu(){

    }
    ArrayList<Menu> categoryList = new ArrayList<>();


    public void categoryAdd(Menu menu){
        categoryList.add(menu);

    }

    public String getExplain() {
        return explain;
    }

    public ArrayList<Menu> getCategoryList() {
        return categoryList;
    }

    public void ShowCategory(){
        System.out.print(name + "  / " + explain);
    }
}
