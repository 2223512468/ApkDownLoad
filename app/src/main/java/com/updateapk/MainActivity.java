package com.updateapk;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
/**
 * android，开机启动页，引导页，检查更新Demo
 */

/**主界面*/
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void menuMore(View v) {
        switch (v.getId()) {

            case R.id.menuMore_update:
                UpdateManager manager = new UpdateManager(MainActivity.this);
                manager.checkUpdate();
                break;

        }
    }
}
