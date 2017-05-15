# LearnObjectAnimator
Android属性动画相关API ObjectAnimator实例
```java
public class MainActivity extends AppCompatActivity {

    private int height;
    private LinearLayout layout;
    private TextView txt;
    private MyPointView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (LinearLayout) findViewById(R.id.layout);
        txt = (TextView) findViewById(R.id.txt);
        height = layout.getHeight();
        myView = (MyPointView) findViewById(R.id.my_view);
    }


    public void onBtn1(View v) {
        myView.setVisibility(View.GONE);
        ObjectAnimator animator = ObjectAnimator.ofFloat(txt, "alpha", 1f, 0f, 1f, 0f, 1f);
        animator.setDuration(6000);
        animator.start();
    }

    public void onBtn2(View v) {
        myView.setVisibility(View.GONE);
        ObjectAnimator animator = ObjectAnimator.ofFloat(txt, "rotation", 0f, 360f, 0f);
        animator.setDuration(6000);
        animator.start();
    }

    public void onBtn3(View v) {
        myView.setVisibility(View.GONE);
        ObjectAnimator animator = ObjectAnimator.ofFloat(txt, "scaleX", 2f, 4f, 1f, 0.5f, 1f);
        animator.setDuration(6000);
        animator.start();
    }

    public void onBtn4(View v) {
        myView.setVisibility(View.GONE);
        ObjectAnimator animator = ObjectAnimator.ofFloat(txt, "translationY", height / 8, -100, height / 2);
        animator.setDuration(6000);
        animator.start();
    }

    public void onBtn5(View v) {
        myView.setVisibility(View.VISIBLE);
        ObjectAnimator animator = ObjectAnimator.ofFloat(myView, "pointRadius", 0, 300, 100);
        animator.setDuration(6000);
        animator.start();
    }
}
```
