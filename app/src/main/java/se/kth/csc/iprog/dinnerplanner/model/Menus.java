package se.kth.csc.iprog.dinnerplanner.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Lee Han Young on 17-Feb-16.
 */
public class Menus {

    private Set<Dish> dishes = new HashSet<Dish>();
    private String menuName;

    //// TODO: 17-Feb-16 implement stricter checks for adding a menu, see if can add menu so easily

    public Menus (String menuname, Dish dish1, Dish dish2, Dish dish3){
        this.menuName = menuName;
        dishes.add(dish1);
        dishes.add(dish2);
        dishes.add(dish3);
    }

    public Set<Dish> getAllDishes(){
        return dishes;
    }
    public String getMenuName(){return menuName;}

}
