package se.kth.csc.iprog.dinnerplanner.android.view;

/**
 * Created by Lee Han Young on 17-Feb-16.
 */
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Menus;


public class MenuEditorPage {

    DinnerModel model;
    View view;

    public MenuEditorPage(View view, DinnerModel model){

        // store in the class the reference to the Android View
        this.view = view;
        this.model = model;

        ListView allCurrentMenus = (ListView) view.findViewById(R.id.listView4);
        TextView currentMenu = (TextView) view.findViewById(R.id.textView14);

        Set<Menus> allMenuData = DinnerModel.getAllMenus();


        //getting string array of menu name data
        List<String> menuViewData = new ArrayList<String>();
        Iterator<Menus> iter = allMenuData.iterator();
        while(iter.hasNext()){
            menuViewData.add(iter.next().getMenuName());
        }
        //ListAdapter list = new ArrayAdapter<String>(this,R.id.listView4,menuViewData);
        //allMenuData.

    }

}
