package kr.hs.emirim.kjminn.viewanimationtest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        YoYo.with(Techniques.Shake)
                .duration(700)
                .repeat(2)
                .playOn(findViewById(R.id.ani_text_view));
    }
}