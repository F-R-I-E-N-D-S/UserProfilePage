package com.example.aishwarya.bioform;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by aishwarya on 25/2/18.
 */

public class Next extends AppCompatActivity {
    TextView firstname_textview;
    TextView lastname_textview;
    TextView usn_textview;
    TextView dob_textview;
    TextView semsec_textview;
    TextView course_textview;
    TextView phno_textview;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next);

        firstname_textview= (TextView) findViewById(R.id.firstname_textview);
        lastname_textview= (TextView) findViewById(R.id.lastname_textview);
        usn_textview= (TextView) findViewById(R.id.usn_textview);
        dob_textview= (TextView) findViewById(R.id.dob_textview);
        semsec_textview= (TextView) findViewById(R.id.semsec_textview);
        course_textview= (TextView) findViewById(R.id.course_textview);
        phno_textview= (TextView) findViewById(R.id.phno_textview);

        String firstname = getIntent().getStringExtra("firstname");
        String lastname = getIntent().getStringExtra("lastname");
        String usn = getIntent().getStringExtra("usn");
        String dob = getIntent().getStringExtra("dob");
        String semsec = getIntent().getStringExtra("semsec");
        String course = getIntent().getStringExtra("course");
        String phno = getIntent().getStringExtra("phno");

        firstname_textview.setText(firstname);
        lastname_textview.setText(lastname);
        usn_textview.setText(usn);
        dob_textview.setText(dob);
        semsec_textview.setText(semsec);
        course_textview.setText(course);
        phno_textview.setText(phno);
    }
}
