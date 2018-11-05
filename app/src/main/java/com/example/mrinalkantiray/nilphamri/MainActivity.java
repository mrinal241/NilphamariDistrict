package com.example.mrinalkantiray.nilphamri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button about, heritage, visiting, purakriti, persons, vougolik, others;
    DatePicker datePicker;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker=findViewById(R.id.date_pick);
        textView=findViewById(R.id.today_txt);


        about=findViewById(R.id.btn_about);
        heritage=findViewById(R.id.btn_heritage);
        visiting=findViewById(R.id.btn_visiting);
        purakriti=findViewById(R.id.btn_purakriti);
        persons=findViewById(R.id.btn_persons);
        vougolik=findViewById(R.id.btn_vougolik);
        others=findViewById(R.id.btn_others);



        String value="Today: " +datePicker.getDayOfMonth() +":"+ (datePicker.getMonth()+1)+":"
                +datePicker.getYear();
        textView.setText(value);



        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), About.class);
                startActivity(intent);

            }
        });



        heritage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Heritage.class);
                startActivity(intent);

            }
        });


        visiting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Visiting.class);
                startActivity(intent);

            }
        });



        purakriti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Purakriti.class);
                startActivity(intent);

            }
        });



        persons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Persons.class);
                startActivity(intent);

            }
        });


        vougolik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Vougolik.class);
                startActivity(intent);

            }
        });


        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Others.class);
                startActivity(intent);

            }
        });













    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_dev :
                Intent intent=new Intent(getApplicationContext(), DeveloperActivity.class);
                startActivity(intent);
                break;
            default:
                Intent intet=new Intent(getApplicationContext(), DeveloperActivity.class);
                startActivity(intet);
                break;

        }
        return super.onOptionsItemSelected(item);
    }


}
