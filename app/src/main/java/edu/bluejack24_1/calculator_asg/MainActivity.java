package edu.bluejack24_1.calculator_asg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonAdd, buttonSub, buttonMul, buttonDiv;
    EditText editTextN1, editTextN2;
    TextView textView;

    Integer num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = findViewById(R.id.btn_add);
        buttonSub = findViewById(R.id.btn_sub);
        buttonMul = findViewById(R.id.btn_mul);
        buttonDiv = findViewById(R.id.btn_div);

        editTextN1 = findViewById(R.id.number1);
        editTextN2 = findViewById(R.id.number2);

        textView = findViewById(R.id.answer);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);

    }

    public int getIntFromEditText(EditText editText){
        if(editText.getText().toString().isEmpty()){
            Toast.makeText(this, "Enter Number", Toast.LENGTH_SHORT).show();
            return 0;
        }
        return Integer.parseInt(editText.getText().toString());
    }

    @Override
    public void onClick(View v) {
        num1 = getIntFromEditText(editTextN1);
        num2 = getIntFromEditText(editTextN2);
        if(v.getId() == R.id.btn_add){
            textView.setText("Answer : " + (num1 + num2));
        }else if(v.getId() == R.id.btn_sub){
            textView.setText("Answer : " + (num1 - num2));
        }else if(v.getId() == R.id.btn_mul){
            textView.setText("Answer : " + (num1 * num2));
        }else if(v.getId() == R.id.btn_div){
            textView.setText("Answer : " + ((float)num1 / (float)num2));
        }
    }
}