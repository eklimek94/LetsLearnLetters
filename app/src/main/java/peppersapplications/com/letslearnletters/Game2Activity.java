package peppersapplications.com.letslearnletters;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Game2Activity extends AppCompatActivity {

    private Game2Canvas game2;
    int letterTracer = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        game2 = findViewById(R.id.game2);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);


        game2.init(metrics);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    //Assigns values to all letters
    public Drawable[] BackgroundArrayAssigner() {
        Drawable[] Background = new Drawable[26];
        Background[0] = getDrawable(R.drawable.backgroundimagechalk_a);
        Background[1] = getDrawable(R.drawable.backgroundimagechalk_b);
        Background[2] = getDrawable(R.drawable.backgroundimagechalk_c);
        Background[3] = getDrawable(R.drawable.backgroundimagechalk_d);
        Background[4] = getDrawable(R.drawable.backgroundimagechalk_e);
        Background[5] = getDrawable(R.drawable.backgroundimagechalk_f);
        Background[6] = getDrawable(R.drawable.backgroundimagechalk_g);
        Background[7] = getDrawable(R.drawable.backgroundimagechalk_h);
        Background[8] = getDrawable(R.drawable.backgroundimagechalk_i);
        Background[9] = getDrawable(R.drawable.backgroundimagechalk_j);
        Background[10] = getDrawable(R.drawable.backgroundimagechalk_k);
        Background[11] = getDrawable(R.drawable.backgroundimagechalk_l);
        Background[12] = getDrawable(R.drawable.backgroundimagechalk_m);
        Background[13] = getDrawable(R.drawable.backgroundimagechalk_n);
        Background[14] = getDrawable(R.drawable.backgroundimagechalk_o);
        Background[15] = getDrawable(R.drawable.backgroundimagechalk_p);
        Background[16] = getDrawable(R.drawable.backgroundimagechalk_q);
        Background[17] = getDrawable(R.drawable.backgroundimagechalk_r);
        Background[18] = getDrawable(R.drawable.backgroundimagechalk_s);
        Background[19] = getDrawable(R.drawable.backgroundimagechalk_t);
        Background[20] = getDrawable(R.drawable.backgroundimagechalk_u);
        Background[21] = getDrawable(R.drawable.backgroundimagechalk_v);
        Background[22] = getDrawable(R.drawable.backgroundimagechalk_w);
        Background[23] = getDrawable(R.drawable.backgroundimagechalk_x);
        Background[24] = getDrawable(R.drawable.backgroundimagechalk_y);
        Background[25] = getDrawable(R.drawable.backgroundimagechalk_z);


        return Background;
    }


    //controls menu buttons
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        Drawable[] myBackground = BackgroundArrayAssigner();


        if (id == R.id.left_arrow) {
            letterTracer--;
            if (letterTracer == -1) {
                letterTracer = 25;
            }
            game2.erase();

            game2.setBackground(myBackground[letterTracer]);


        }


        if (id == R.id.right_arrow) {
            letterTracer++;
            if (letterTracer == 26) {
                letterTracer = 0;
            }
            game2.erase();

            game2.setBackground(myBackground[letterTracer]);


        }
        return super.onOptionsItemSelected(item);

    }

}
