package peppersapplications.com.letslearnletters;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // starts Game 1
    public void onButtonClick(View v) {
        Intent myIntent = new Intent(getBaseContext(), Game1Activity.class);
        startActivity(myIntent);

    }
    // Starts Game 2
    public void onButtonClick2(View v) {
        Intent myIntent = new Intent(getBaseContext(), Game2Activity.class);
        startActivity(myIntent);

    }

    // Starts Game 3
    public void onButtonClick3(View v) {
        Intent myIntent = new Intent(getBaseContext(), Game3Activity.class);
        startActivity(myIntent);

    }
}
