package me.materialdesign.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import me.materialdesign.utils.ParseJarFile;

/**
 * Created by Administrator on 2017/6/24 0024.
 */

public class ProxyOtherActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("this is my proxy activity");
        setContentView(tv);

        ParseJarFile.parseApk(getPackageCodePath(),this);
    }
}
