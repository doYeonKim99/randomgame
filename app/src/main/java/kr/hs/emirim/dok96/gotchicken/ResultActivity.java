package kr.hs.emirim.dok96.gotchicken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by appcreator36 on 2016. 3. 28..
 */

public class ResultActivity extends ActionBarActivity {
    TextView mResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mResult = (TextView) findViewById(R.id.result);


        Intent intent = getIntent();
        String name=intent.getStringExtra("name");
        int age=intent.getIntExtra("age",-1);

        mResult.setText(name+"님 , 하이염");
    }
}