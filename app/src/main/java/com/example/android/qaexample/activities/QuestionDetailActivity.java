package com.example.android.qaexample.activities;

import com.example.android.qaexample.R;
import com.example.android.qaexample.models.Question;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class QuestionDetailActivity extends AppCompatActivity {

    private TextView questionTextView;
    private TextView descriptionTextView;
    private Button answerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_detail);

        //fetch views
        questionTextView = (TextView) findViewById(R.id.questionTV);
        descriptionTextView = (TextView) findViewById(R.id.descriptionTV);
        answerBtn = (Button) findViewById(R.id.answerBtn);

        Question question = (Question) getIntent().getSerializableExtra("question");
        loadQuestion(question);

    }


    private void loadQuestion(Question question){
        questionTextView.setText(question.getTitle());
        descriptionTextView.setText(question.getContent());
    }

}
