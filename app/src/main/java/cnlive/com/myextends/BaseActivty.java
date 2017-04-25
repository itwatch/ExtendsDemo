package cnlive.com.myextends;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * @author 陈硕
 * @time 2017/4/25  10:18
 * @desc ${TODD}
 */
public class BaseActivty extends AbstrctActivity {
    protected final String Tag = "BaseActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // doCan("dasfsa");
        doTest(3);
    }

    @Override
    public void doTest(int i) {

        Log.i(Tag, "doTest");
    }


    public void doSuperMethored() {
        Log.i(Tag, "doSuperMethored");
        doCan("fsda");
    }


    public void doCan(String string) {
        Log.i(Tag, "doCanfu");


    }
}
