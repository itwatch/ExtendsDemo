package cnlive.com.myextends;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * @author 陈硕
 * @time 2017/4/25  10:21
 * @desc ${TODD}
 */
public class MyActivity extends BaseActivty {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //doCan("asdfasfs");

    }


    @Override
    public void doCan(String string) {

        Log.i(Tag, "doCan");
        super.doCan("fasda");

    }

    @Override
    public void doTest(int i) {
        super.doTest(i);
        Log.i(Tag, i+"");

    }
}
