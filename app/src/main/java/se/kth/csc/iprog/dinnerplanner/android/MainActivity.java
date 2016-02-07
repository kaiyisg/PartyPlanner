package se.kth.csc.iprog.dinnerplanner.android;

import android.app.Activity;
import android.os.Bundle;
import se.kth.csc.iprog.dinnerplanner.android.view.LoginPage;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Default call to load previous state
        super.onCreate(savedInstanceState);

        // Set the view for the main activity screen
        // it must come before any call to findViewById method
        setContentView(R.layout.activity_main);

        // Creating the view class instance - only needed for views which require programming
        LoginPage mainView = new LoginPage(findViewById(R.id.login_page_id));
    }

}
