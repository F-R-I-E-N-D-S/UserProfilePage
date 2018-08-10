package com.example.aishwarya.bioform;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by aishwarya on 25/2/18.
 */

public class Reso extends AppCompatActivity {
private static final int SELECT_PICTURE = 0 ;
private ImageView imageview;

    EditText usn_edittext;
    EditText firstname_edittext;
    EditText lastname_edittext;
    EditText dob_edittext;
    EditText semsec_edittext;
    EditText course_edittext;
    EditText phno_edittext;
    Button submit_button;
    String firstname;
    String lastname;
    String usn;
    String dob;
    String semsec;
    String course;
    String phno;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_ll);

        usn_edittext= (EditText) findViewById(R.id.usn_edittext);
        firstname_edittext= (EditText) findViewById(R.id.firstname_edittext);
        lastname_edittext= (EditText) findViewById(R.id.lastname_edittext);
        dob_edittext= (EditText) findViewById(R.id.dob_edittext);
        semsec_edittext= (EditText) findViewById(R.id.semsec_edittext);
        course_edittext= (EditText) findViewById(R.id.course_edittext);
        phno_edittext= (EditText) findViewById(R.id.phno_edittext);
        submit_button = (Button) findViewById(R.id.submit_button);
        imageview = (ImageView) findViewById(android.R.id.icon);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            firstname=firstname_edittext.getText().toString();
            lastname=lastname_edittext.getText().toString();
            usn=usn_edittext.getText().toString();
                dob=dob_edittext.getText().toString();
                semsec=semsec_edittext.getText().toString();
                course=course_edittext.getText().toString();
                phno=phno_edittext.getText().toString();

                Intent intent = new Intent(Reso.this ,Next.class);

                intent.putExtra("firstname",firstname);
                intent.putExtra("lastname",lastname);
                intent.putExtra("usn",usn);
                intent.putExtra("dob",dob);
                intent.putExtra("semsec",semsec);
                intent.putExtra("course",course);
                intent.putExtra("phno",phno);

                startActivity(intent);
            }
        });
        }
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (resultCode == RESULT_OK) {
//            Bitmap bitmap = getPackageResourcePath(data.getData());
//            imageview.setImageBitmap(bitmap);
//        }
//    }



}

