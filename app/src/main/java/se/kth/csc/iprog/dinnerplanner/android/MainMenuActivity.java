package se.kth.csc.iprog.dinnerplanner.android;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import se.kth.csc.iprog.dinnerplanner.android.view.MenuEditorPage;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //getting the model
        DinnerModel model = ((DinnerPlannerApplication) this.getApplication()).getModel();

        //passing the model over to the menu editor page in charge of the menu editor view
        MenuEditorPage menuView = new MenuEditorPage(findViewById(R.id.menu_editor_id), model);
    }

}
