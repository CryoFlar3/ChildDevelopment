package computermentors.org.childdevelopment;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class PrematureActivity extends ActionBarActivity {

    private EditText mPrematureEditText;
    private Button mMilestoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premature);

        mPrematureEditText = (EditText)findViewById(R.id.prematureEditText);
        mMilestoneButton = (Button) findViewById(R.id.milestoneButton);

        mMilestoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String earlyBirth = mPrematureEditText.getText().toString();
                milestonePage(earlyBirth);
            }
        });
    }

    private void milestonePage(String date) {
        Intent intent = new Intent(this, MilestoneActivity.class);
        intent.putExtra(getString(R.string.early), date);
        startActivity(intent);
    }

}
