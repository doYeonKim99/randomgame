package kr.hs.emirim.dok96.gotchicken;

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
        setContentView(R.layout.activity_main);

        mResult = (TextView) findViewById(R.id.result);
        mResult.setText("결과");
    }
}