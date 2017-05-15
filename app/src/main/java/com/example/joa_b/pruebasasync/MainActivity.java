package com.example.joa_b.pruebasasync;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 EditText edt;
    public class hilo extends AsyncTask<String,Void,String>{


        @Override
        protected String doInBackground(String... params) {

            return params[0];
        }

        @Override
        protected void onPostExecute(String s) {

            super.onPostExecute(s);
            edt = (EditText) findViewById(R.id.editText);
            edt.setText(s);
        }



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hilo Hilo=new hilo();
        Hilo.execute("hola mundo");
    }
}
