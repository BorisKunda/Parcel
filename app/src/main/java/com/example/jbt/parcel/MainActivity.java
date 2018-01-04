package com.example.jbt.parcel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById(R.id.saveBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String name=  ((EditText)(findViewById(R.id.studentnameET))).getText().toString();
               String grade=  ((EditText)(findViewById(R.id.gradeET))).getText().toString();


               Intent intent= new Intent(MainActivity.this, StudentDetailsAct.class);

               Student s1= new Student(name, Integer.parseInt(grade));

             //  intent.putExtra("name", name);
             //   intent.putExtra("grade", grade);

                //Student must implement Parcelable
                intent.putExtra("student", s1);


               startActivity(intent);



            }
        });



    }
}
