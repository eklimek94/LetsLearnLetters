package peppersapplications.com.letslearnletters;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Game3Activity extends AppCompatActivity {
    private TextView mQuestionTextView;
    private Button leftButton;
    private Button rightButton;


    // Provides the image answers for the questions
    private LetterQuestions[] mLetterQuestionsBank = new LetterQuestions[]{
            new LetterQuestions(true),
            new LetterQuestions(true),
            new LetterQuestions(false),
            new LetterQuestions(false),
            new LetterQuestions(true),
            new LetterQuestions(true),
            new LetterQuestions(false),
            new LetterQuestions(true),
            new LetterQuestions(true),
            new LetterQuestions(true),
            new LetterQuestions(true),
            new LetterQuestions(false),
            new LetterQuestions(true),
            new LetterQuestions(false),
            new LetterQuestions(false),
            new LetterQuestions(false),
            new LetterQuestions(true),
            new LetterQuestions(false),
            new LetterQuestions(false),
            new LetterQuestions(true),
            new LetterQuestions(false),
            new LetterQuestions(true),
            new LetterQuestions(false),
            new LetterQuestions(false),
            new LetterQuestions(true),
            new LetterQuestions(false),
    };
    private int mCurrentIndex = 0;
    private int letterTracer = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);
        mQuestionTextView = (TextView) findViewById(R.id.question_text_view);
        leftButton = (Button) findViewById(R.id.true_button);
        rightButton = (Button) findViewById(R.id.false_button);
    }


    //assigns the right image
    public Drawable[] rightAssigner() {
        Drawable[] right = new Drawable[26];
        right[0] = getDrawable(R.drawable.ball_button);
        right[1] = getDrawable(R.drawable.frog_button);
        right[2] = getDrawable(R.drawable.cat_button);
        right[3] = getDrawable(R.drawable.dog_button);
        right[4] = getDrawable(R.drawable.frog_button);
        right[5] = getDrawable(R.drawable.egg_button);
        right[6] = getDrawable(R.drawable.goat_button);
        right[7] = getDrawable(R.drawable.apple_button);
        right[8] = getDrawable(R.drawable.xray_button);
        right[9] = getDrawable(R.drawable.zebra_button);
        right[10] = getDrawable(R.drawable.train_button);
        right[11] = getDrawable(R.drawable.lion_button);
        right[12] = getDrawable(R.drawable.pencil_button);
        right[13] = getDrawable(R.drawable.nose_button);
        right[14] = getDrawable(R.drawable.owl_button);
        right[15] = getDrawable(R.drawable.pencil_button);
        right[16] = getDrawable(R.drawable.cat_button);
        right[17] = getDrawable(R.drawable.rocket_button);
        right[18] = getDrawable(R.drawable.snail_button);
        right[19] = getDrawable(R.drawable.cat_button);
        right[20] = getDrawable(R.drawable.unicorn_button);
        right[21] = getDrawable(R.drawable.apple_button);
        right[22] = getDrawable(R.drawable.water_button);
        right[23] = getDrawable(R.drawable.xray_button);
        right[24] = getDrawable(R.drawable.cat_button);
        right[25] = getDrawable(R.drawable.zebra_button);


        return right;
    }

    // assigns the left image
    public Drawable[] leftAssigner() {
        Drawable[] left = new Drawable[26];
        left[0] = getDrawable(R.drawable.button_apple);
        left[1] = getDrawable(R.drawable.ball_button);
        left[2] = getDrawable(R.drawable.water_button);
        left[3] = getDrawable(R.drawable.rocket_button);
        left[4] = getDrawable(R.drawable.egg_button);
        left[5] = getDrawable(R.drawable.frog_button);
        left[6] = getDrawable(R.drawable.lion_button);
        left[7] = getDrawable(R.drawable.house_button);
        left[8] = getDrawable(R.drawable.island_button);
        left[9] = getDrawable(R.drawable.journal_button);
        left[10] = getDrawable(R.drawable.king_button);
        left[11] = getDrawable(R.drawable.train_button);
        left[12] = getDrawable(R.drawable.mouse_button);
        left[13] = getDrawable(R.drawable.xray_button);
        left[14] = getDrawable(R.drawable.van_button);
        left[15] = getDrawable(R.drawable.cat_button);
        left[16] = getDrawable(R.drawable.queen_button);
        left[17] = getDrawable(R.drawable.snail_button);
        left[18] = getDrawable(R.drawable.frog_button);
        left[19] = getDrawable(R.drawable.train_button);
        left[20] = getDrawable(R.drawable.dog_button);
        left[21] = getDrawable(R.drawable.van_button);
        left[22] = getDrawable(R.drawable.ball_button);
        left[23] = getDrawable(R.drawable.apple_button);
        left[24] = getDrawable(R.drawable.yoyo_button);
        left[25] = getDrawable(R.drawable.cat_button);


        return left;
    }

    //Assigns the letter image
    public Drawable[] letterArrayAssigner() {
        Drawable[] letter = new Drawable[26];
        letter[0] = getDrawable(R.drawable.backgroundimagechalk_a);
        letter[1] = getDrawable(R.drawable.backgroundimagechalk_b);
        letter[2] = getDrawable(R.drawable.backgroundimagechalk_c);
        letter[3] = getDrawable(R.drawable.backgroundimagechalk_d);
        letter[4] = getDrawable(R.drawable.backgroundimagechalk_e);
        letter[5] = getDrawable(R.drawable.backgroundimagechalk_f);
        letter[6] = getDrawable(R.drawable.backgroundimagechalk_g);
        letter[7] = getDrawable(R.drawable.backgroundimagechalk_h);
        letter[8] = getDrawable(R.drawable.backgroundimagechalk_i);
        letter[9] = getDrawable(R.drawable.backgroundimagechalk_j);
        letter[10] = getDrawable(R.drawable.backgroundimagechalk_k);
        letter[11] = getDrawable(R.drawable.backgroundimagechalk_l);
        letter[12] = getDrawable(R.drawable.backgroundimagechalk_m);
        letter[13] = getDrawable(R.drawable.backgroundimagechalk_n);
        letter[14] = getDrawable(R.drawable.backgroundimagechalk_o);
        letter[15] = getDrawable(R.drawable.backgroundimagechalk_p);
        letter[16] = getDrawable(R.drawable.backgroundimagechalk_q);
        letter[17] = getDrawable(R.drawable.backgroundimagechalk_r);
        letter[18] = getDrawable(R.drawable.backgroundimagechalk_s);
        letter[19] = getDrawable(R.drawable.backgroundimagechalk_t);
        letter[20] = getDrawable(R.drawable.backgroundimagechalk_u);
        letter[21] = getDrawable(R.drawable.backgroundimagechalk_v);
        letter[22] = getDrawable(R.drawable.backgroundimagechalk_w);
        letter[23] = getDrawable(R.drawable.backgroundimagechalk_x);
        letter[24] = getDrawable(R.drawable.backgroundimagechalk_y);
        letter[25] = getDrawable(R.drawable.backgroundimagechalk_z);


        return letter;
    }

    // updates to the next question
    private void updateQuestion() {
        Drawable[] myLetter = letterArrayAssigner();
        Drawable[] myLeft = leftAssigner();
        Drawable[] myRight = rightAssigner();

        letterTracer++;
        if (letterTracer == 26) {
            letterTracer = 0;
        }


        mQuestionTextView.setForeground(myLetter[letterTracer]);
        leftButton.setForeground(myLeft[letterTracer]);
        rightButton.setForeground(myRight[letterTracer]);

    }

    //Checks if the Answer is true if true show next LetterQuestions
    private void checkAnswer(boolean userPressedTrue) {
        boolean answerIsTrue = mLetterQuestionsBank[mCurrentIndex].isAnswerTrue();
        if (userPressedTrue == answerIsTrue) {
            mCurrentIndex = (mCurrentIndex + 1) % mLetterQuestionsBank.length;
            updateQuestion();
        } else {
        }
    }

    public void onClickTrue(View v) {
        checkAnswer(true);
    }

    public void onClickFalse(View v) {
        checkAnswer(false);
    }

}
