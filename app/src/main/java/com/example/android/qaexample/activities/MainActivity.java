package com.example.android.qaexample.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.qaexample.R;
import com.example.android.qaexample.models.Question;
import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity {
    private DatabaseReference mDatabase;
    private FirebaseListAdapter<Question> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = (ListView) findViewById(R.id.questionsLV);

        //get instance of database
        mDatabase = FirebaseDatabase.getInstance().getReference();

        mAdapter = new FirebaseListAdapter<Question>(this, Question.class, android.R.layout.two_line_list_item, mDatabase) {
            @Override
            protected void populateView(View view, Question question, int position) {
                Log.v("MainActivity", "Question is: " + question.getTitle());
                ((TextView)view.findViewById(android.R.id.text1)).setText(question.getTitle());
                ((TextView)view.findViewById(android.R.id.text2)).setText(question.getContent());

            }
        };
        listView.setAdapter(mAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mAdapter.cleanup();
    }
}
