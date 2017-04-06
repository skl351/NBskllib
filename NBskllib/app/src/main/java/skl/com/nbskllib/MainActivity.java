package skl.com.nbskllib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import skl.com.nbsklib.Show_toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Show_toast.showText(this,"haha");
    }
}
