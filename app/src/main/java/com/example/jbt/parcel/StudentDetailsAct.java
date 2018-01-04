package com.example.jbt.parcel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StudentDetailsAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

       // String name = getIntent().getStringExtra("name");

        Student s1= getIntent().getParcelableExtra("student");

        ((TextView) findViewById(R.id.nameTV)).setText(s1.name);
        ((TextView) findViewById(R.id.gradeTV)).setText(""+s1.grade);

    }
}
