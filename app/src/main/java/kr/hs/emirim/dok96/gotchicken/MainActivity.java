package kr.hs.emirim.dok96.gotchicken;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    EditText mName;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText) findViewById(R.id.name);
        mButton = (Button) findViewById(R.id.btn_showmethechicken);
        mButton.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText(null);

    }

    @Override
    public void onClick(View v) {

          String name = mName.getText().toString(); //실수 주의 반드시 toString()으로 변형해서 쓰기
//        if(name==null){
//            Toast.makeText(this, name + "이름을 입력해 주세요!!", Toast.LENGTH_LONG).show();
//        }else {
//            Toast.makeText(this, name + "씨,집에 가구시퐁!!", Toast.LENGTH_LONG).show();
//            Intent intent = new Intent(this, ResultActivity.class);
//            startActivity(intent);
//        }
        try{
            Toast.makeText(this, name + "할리갈리야~", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,ResultActivity.class);
            intent.putExtra("name",name);
            intent.putExtra("age",18);
            startActivity(intent);
        }
        catch(NullPointerException e){
            Toast.makeText(this, name + "이름을 입력해 주세요!!", Toast.LENGTH_LONG).show();
        }
        catch(Exception e){
            Toast.makeText(this,"정말 죄송하지만 오류가 납니다!!", Toast.LENGTH_LONG).show();
        }

    }
}