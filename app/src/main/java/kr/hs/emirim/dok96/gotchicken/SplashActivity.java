package kr.hs.emirim.dok96.gotchicken;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


public class SplashActivity extends ActionBarActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() { //2개의 인자값이 들어감
            @Override
            public void run() {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class); //메인 액티비티를 사용할때 필수 intent
                startActivity(intent);
                overridePendingTransition(0,R.anim.zoom_exit); //zoom_exit가 splash를 끝낼때 불러져옴
                finish(); //현재 엑티비티 소멸
            }
        },3000);

    }
}