package computermentors.org.childdevelopment;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends ActionBarActivity {

    private DatePicker mDateField;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDateField = (DatePicker)findViewById(R.id.birthDatePicker);
        mStartButton = (Button) findViewById(R.id.startButton);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicker birthDate = mDateField;
                int   day  = birthDate.getDayOfMonth();
                int   month= birthDate.getMonth() + 1;
                int   year = birthDate.getYear();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String formattedDate = sdf.format(new Date(year, month, day));

                //Toast.makeText(MainActivity.this, formattedDate Toast.LENGTH_LONG).show();
                prematurePage(formattedDate);
            }
        });
    }

    private void prematurePage(String date) {
        Intent intent = new Intent(this, PrematureActivity.class);
        intent.putExtra(getString(R.string.dob), date);
        startActivity(intent);
    }

}
