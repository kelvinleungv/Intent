package cn.edu.gdmec.s07150724.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by abc on 2016/10/28.
 */
public class IntentDemo2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo2);
    }
    public void upper(View v){
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        final String value=bundle.getString("value").toUpperCase();

        Intent intentResult=new Intent();
        intentResult.putExtra("result",value);
        setResult(RESULT_OK,intentResult);
        finish();
    }
}
