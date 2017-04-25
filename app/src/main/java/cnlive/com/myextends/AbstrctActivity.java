package cnlive.com.myextends;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author 陈硕
 * @time 2017/4/25  11:16
 * @desc ${TODD}
 */
public abstract class AbstrctActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public abstract void doTest(int i);
}
