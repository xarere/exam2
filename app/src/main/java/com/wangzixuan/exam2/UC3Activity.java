package com.wangzixuan.exam2;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class UC3Activity extends AppCompatActivity {
    ImageView iv1,iv2,iv3,iv4,iv5;
    int count=0;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc3);
        iv1=findViewById(R.id.iv1);
        iv2=findViewById(R.id.iv2);
        iv3=findViewById(R.id.iv3);
        iv4=findViewById(R.id.iv4);
        iv5=findViewById(R.id.iv5);
        iv1.setBackground(getResources().getDrawable(R.drawable.ic_t1));
        iv2.setBackground(getResources().getDrawable(R.drawable.ic_t2));
        iv3.setBackground(getResources().getDrawable(R.drawable.ic_t3));
        iv4.setBackground(getResources().getDrawable(R.drawable.ic_t4));
        iv5.setBackground(getResources().getDrawable(R.drawable.ic_t5));
        handler.postDelayed(runnable, 2000);//每两秒执行一次runnable.

    }


    public void onClickbtn5(View view) {
        finish();
    }

    Handler handler=new Handler();
    Runnable runnable=new Runnable(){
        @Override
        public void run() {
// TODO Auto-generated method stub
//要做的事情

            count++;
            switch (count%5){
                case 0:
                    iv1.setVisibility(View.VISIBLE);
                    iv2.setVisibility(View.GONE);
                    iv3.setVisibility(View.GONE);
                    iv4.setVisibility(View.GONE);
                    iv5.setVisibility(View.GONE);
                    break;
                case 1:
                    iv1.setVisibility(View.GONE);
                    iv2.setVisibility(View.VISIBLE);
                    iv3.setVisibility(View.GONE);
                    iv4.setVisibility(View.GONE);
                    iv5.setVisibility(View.GONE);
                    break;
                case 2:
                    iv1.setVisibility(View.GONE);
                    iv2.setVisibility(View.GONE);
                    iv3.setVisibility(View.VISIBLE);
                    iv4.setVisibility(View.GONE);
                    iv5.setVisibility(View.GONE);
                    break;
                case 3:
                    iv1.setVisibility(View.GONE);
                    iv2.setVisibility(View.GONE);
                    iv3.setVisibility(View.GONE);
                    iv4.setVisibility(View.VISIBLE);
                    iv5.setVisibility(View.GONE);
                    break;
                case 4:
                    iv1.setVisibility(View.GONE);
                    iv2.setVisibility(View.GONE);
                    iv3.setVisibility(View.GONE);
                    iv4.setVisibility(View.GONE);
                    iv5.setVisibility(View.VISIBLE);
                    break;

            }
            handler.postDelayed(this, 2000);
        }
    };

    @Override
    protected void onDestroy() {
        handler.removeCallbacks(runnable);
        handler=null;
        super.onDestroy();
    }
}
