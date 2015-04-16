package computermentors.org.childdevelopment;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MilestoneActivity extends ActionBarActivity {

    private String mDob;
    private String mEarlyBirth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milestone);

        mDob = getIntent().getStringExtra(getString(R.string.dob));
        mEarlyBirth = getIntent().getStringExtra(getString(R.string.early));

        //loadPage();
    }

    private void loadPage(int choice){

    }

}
