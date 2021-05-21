package sg.edu.rp.c346.id20007649.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {


    TextView tvAnswer3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);


        tvAnswer3 = findViewById(R.id.tvAnswer3);

        Intent intent = getIntent();

        String code = intent.getStringExtra("Question");
        String ans = intent.getStringExtra("Answer");

        tvAnswer3.setText(code + " " + ans);









    }
}