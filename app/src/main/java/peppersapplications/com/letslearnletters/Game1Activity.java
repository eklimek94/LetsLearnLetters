package peppersapplications.com.letslearnletters;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;

public class Game1Activity extends AppCompatActivity {

        private Game1Canvas game1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_game1);
            game1 = findViewById(R.id.game1);
            DisplayMetrics metrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(metrics);
            game1.init(metrics);
        }


    }