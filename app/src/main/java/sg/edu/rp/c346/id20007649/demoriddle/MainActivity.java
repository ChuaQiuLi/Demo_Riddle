package sg.edu.rp.c346.id20007649.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvQ1;
    Button btnRevealQ1;
    TextView tvAnswer;

    TextView tvQ2;
    Button btnRevealQ2;
    TextView tvAnswer2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvQ1 = findViewById(R.id.textViewQ1);
        btnRevealQ1 = findViewById(R.id.buttonRevealQ1);

        tvQ2 = findViewById(R.id.textViewQ2);
        btnRevealQ2 = findViewById(R.id.buttonRevealQ2);


        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AnswerActivity.class);
                intent.putExtra("Question 1 ", "Q1 ");
                intent.putExtra("Answer"," answer is : Queue ");


                startActivity(intent);

            }
        });


        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AnswerActivity.class);
                intent.putExtra("Question 2", "Q2");
                intent.putExtra("Answer", " answer is : Gone");
                startActivity(intent);

            }
        });
    }


}

