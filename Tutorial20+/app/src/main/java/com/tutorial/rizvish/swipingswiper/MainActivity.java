package com.tutorial.rizvish.swipingswiper;

        //import android.accessibilityservice.GestureDescription;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.support.design.widget.FloatingActionButton;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.MotionEvent;
        import android.view.View;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.RelativeLayout;
        import android.widget.TextView;
        import android.view.GestureDetector;
        import android.support.v4.view.GestureDetectorCompat;
        import android.widget.Button;


public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener{

    private TextView MyMess;
    private Button MyButton;
    private GestureDetectorCompat gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyButton = (Button) findViewById(R.id.MyButton);
        MyMess = (TextView) findViewById(R.id.MyMessage);

        MyButton.setBackgroundColor(Color.CYAN);
        MyMess.setTextColor(Color.WHITE);

        MyButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        MyMess.setText("onClick");
                    }

                }
        );
        MyButton.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        MyMess.setText("onLongClick");
                        return true;
                    }

                }
        );


        this.gestureDetector = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);


    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        MyMess.setText("Single Tap");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        MyMess.setText("Double Tap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        MyMess.setText("Double tapping");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        MyMess.setText("Down");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        MyMess.setText("ShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        MyMess.setText("SinglTapUp");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        MyMess.setText("Scrolling");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        MyMess.setText("Long Click");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        MyMess.setText("Fling");
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

