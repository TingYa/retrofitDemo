package me.ppting.retrofit.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by PPTing on 16/9/8.
 */
public abstract class BaseActivity extends AppCompatActivity{


    public String TAG = this.getClass().getName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
