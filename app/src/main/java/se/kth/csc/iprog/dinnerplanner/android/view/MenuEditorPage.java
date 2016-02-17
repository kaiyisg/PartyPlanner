package se.kth.csc.iprog.dinnerplanner.android.view;

/**
 * Created by Lee Han Young on 17-Feb-16.
 */
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;


public class MenuEditorPage {

    DinnerModel model;
    View view;

    public MenuEditorPage(View view, DinnerModel model){

        // store in the class the reference to the Android View
        this.view = view;
        this.model = model;

        ListView allCurrentMenus = (ListView) view.findViewById(R.id.listView4);
        TextView currentMenu = (TextView) view.findViewById(R.id.textView14);

        //populating the list view based on the number of items in my dinner model

        //model.

    }

}
