package com.example.feng.snowfall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=(Button) findViewById(R.id.button1);
        Button button2=(Button) findViewById(R.id.button2);
        Button button3=(Button) findViewById(R.id.button3);
        Button button4=(Button) findViewById(R.id.button4);
        Button button5=(Button) findViewById(R.id.button5);
        Button button6=(Button) findViewById(R.id.button6);

        if(button1!=null){
            button1.setOnClickListener(myClickLisenter);
        }
        if(button2!=null){
            button2.setOnClickListener(myClickLisenter);
        }
        if(button3!=null){
            button3.setOnClickListener(myClickLisenter);
        }
        if(button4!=null){
            button4.setOnClickListener(myClickLisenter);
        }
        if(button5!=null){
            button5.setOnClickListener(myClickLisenter);
        }
        if(button6!=null){
            button6.setOnClickListener(myClickLisenter);
        }
    }

    private MyClickListener myClickLisenter=new MyClickListener();


    private class MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            int id=view.getId();
            switch (id){
                case(R.id.button1):
                    showToast("Popular Movie Message");
                case(R.id.button2):
                    showToast("STOCK HAWK");
                case(R.id.button3):
                    showToast("BUILD BUGGER");
                case(R.id.button4):
                    showToast("MAKE YOUR APP MATERIAL");
                case(R.id.button5):
                    showToast("GO UBIQUITOUS");
                case(R.id.button6):
                    showToast("CAPSTONE");
                    default:
                        showToast("Some Thing ERROR!");
            }
        }
    }

    private void showToast(String string){
        Toast toast=Toast.makeText(getApplicationContext(),string,Toast.LENGTH_LONG);
        toast.show();
    }
}
