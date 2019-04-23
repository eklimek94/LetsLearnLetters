package peppersapplications.com.letslearnletters;

public class LetterQuestions {

    private boolean mAnswerTrue;

    public LetterQuestions(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
    }
}