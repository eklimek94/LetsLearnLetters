package peppersapplications.com.letslearnletters;


import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.*;
import android.util.*;
import android.view.*;


public class Game2Canvas extends View {
    private Paint myPaint;
    private Bitmap mBitmap;
    private Canvas mCanvas;
    private Paint mBitmapPaint = new Paint(Paint.DITHER_FLAG);

    public Game2Canvas(Context context) {
        this(context, null);
    }

    public Game2Canvas(Context context, AttributeSet attrs) {
        super(context, attrs);
        myPaint = new Paint();
        myPaint.setAntiAlias(true);
        myPaint.setDither(true);
        myPaint.setStyle(Paint.Style.STROKE);
        myPaint.setStrokeJoin(Paint.Join.ROUND);
        myPaint.setStrokeCap(Paint.Cap.ROUND);
        myPaint.setStrokeWidth(150);
        myPaint.setColor(Color.CYAN);


    }

    public void init(DisplayMetrics metrics) {
        int height = metrics.heightPixels;
        int width = metrics.widthPixels;

        mBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        mCanvas = new Canvas(mBitmap);

    }


    public void erase() {
        invalidate();
        path.reset();
        mCanvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR);


    }


    @Override
    protected void onDraw(Canvas canvas) {
        canvas.save();
        mCanvas.drawColor(Color.TRANSPARENT);
        mCanvas.drawPath(path, myPaint);


        canvas.drawBitmap(mBitmap, 0, 0, mBitmapPaint);
        canvas.restore();
    }


    private Path path = new Path();


    // Get x and y and append them to the path
    public boolean onTouchEvent(MotionEvent event) {
        float pointX = event.getX();
        float pointY = event.getY();
        // Checks for the event that occurs
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                // Starts a new line in the path
                path.moveTo(pointX, pointY);
                break;
            case MotionEvent.ACTION_MOVE:
                // Draws line between last point and this point
                path.lineTo(pointX, pointY);
                break;
            default:
                return false;
        }

        postInvalidate(); // Indicate view should be redrawn
        return true; // Indicate we've consumed the touch
    }

}