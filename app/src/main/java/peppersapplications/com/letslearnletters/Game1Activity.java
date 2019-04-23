package peppersapplications.com.letslearnletters;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Game1Activity extends AppCompatActivity {

    private Game1Canvas game1;
    int letterTracer = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);
        game1 = findViewById(R.id.game1);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);


        game1.init(metrics);
    }

    // Creates Menu
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    //Assigns values to all letters
    public Drawable[] foregroundArrayAssigner() {
        Drawable[] foreground = new Drawable[26];
        foreground[0] = getDrawable(R.drawable.backgroundimagechalk_a);
        foreground[1] = getDrawable(R.drawable.backgroundimagechalk_b);
        foreground[2] = getDrawable(R.drawable.backgroundimagechalk_c);
        foreground[3] = getDrawable(R.drawable.backgroundimagechalk_d);
        foreground[4] = getDrawable(R.drawable.backgroundimagechalk_e);
        foreground[5] = getDrawable(R.drawable.backgroundimagechalk_f);
        foreground[6] = getDrawable(R.drawable.backgroundimagechalk_g);
        foreground[7] = getDrawable(R.drawable.backgroundimagechalk_h);
        foreground[8] = getDrawable(R.drawable.backgroundimagechalk_i);
        foreground[9] = getDrawable(R.drawable.backgroundimagechalk_j);
        foreground[10] = getDrawable(R.drawable.backgroundimagechalk_k);
        foreground[11] = getDrawable(R.drawable.backgroundimagechalk_l);
        foreground[12] = getDrawable(R.drawable.backgroundimagechalk_m);
        foreground[13] = getDrawable(R.drawable.backgroundimagechalk_n);
        foreground[14] = getDrawable(R.drawable.backgroundimagechalk_o);
        foreground[15] = getDrawable(R.drawable.backgroundimagechalk_p);
        foreground[16] = getDrawable(R.drawable.backgroundimagechalk_q);
        foreground[17] = getDrawable(R.drawable.backgroundimagechalk_r);
        foreground[18] = getDrawable(R.drawable.backgroundimagechalk_s);
        foreground[19] = getDrawable(R.drawable.backgroundimagechalk_t);
        foreground[20] = getDrawable(R.drawable.backgroundimagechalk_u);
        foreground[21] = getDrawable(R.drawable.backgroundimagechalk_v);
        foreground[22] = getDrawable(R.drawable.backgroundimagechalk_w);
        foreground[23] = getDrawable(R.drawable.backgroundimagechalk_x);
        foreground[24] = getDrawable(R.drawable.backgroundimagechalk_y);
        foreground[25] = getDrawable(R.drawable.backgroundimagechalk_z);


        return foreground;
    }


    //controls menu buttons
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        Drawable[] myForeground = foregroundArrayAssigner();


        if (id == R.id.left_arrow) {
            letterTracer--;
            if (letterTracer == -1) {
                letterTracer = 25;
            }
            game1.setForeground(myForeground[letterTracer]);
            game1.erase();


        }


        if (id == R.id.right_arrow) {
            letterTracer++;
            if (letterTracer == 26) {
                letterTracer = 0;
            }

            game1.setForeground(myForeground[letterTracer]);
            game1.erase();


        }
        return super.onOptionsItemSelected(item);

    }
}