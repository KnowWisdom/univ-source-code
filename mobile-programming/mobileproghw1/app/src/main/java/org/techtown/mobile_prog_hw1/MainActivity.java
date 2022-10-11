package org.techtown.mobile_prog_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnExt;
    TextView result;
    String num1, num2;
    Float num3;

    public static final String ZERO = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단 계산기 | 21913662 김지혜");

        input1 = (EditText) findViewById(R.id.Edit1);
        input2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnExt = (Button) findViewById(R.id.BtnExt);

        result = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = input1.getText().toString();
                num2 = input2.getText().toString();

                // 값이 비어있을 경우 토스트 메시지를 띄우고 계산하지 않음
                if(num1.trim().equals("") || num2.trim().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(), "입력값이 비어있음", Toast.LENGTH_SHORT);
                    toast.show();

                }else{
                    num3 = Float.parseFloat(num1) + Float.parseFloat(num2);
                    result.setText("계산 결과 : " + num3.toString());
                }

            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = input1.getText().toString();
                num2 = input2.getText().toString();

                // 값이 비어있을 경우 토스트 메시지를 띄우고 계산하지 않음
                if(num1.trim().equals("") || num2.trim().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(), "입력값이 비어있음", Toast.LENGTH_SHORT);
                    toast.show();

                }else{
                    num3 = Float.parseFloat(num1) - Float.parseFloat(num2);
                    result.setText("계산 결과 : " + num3.toString());
                }

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = input1.getText().toString();
                num2 = input2.getText().toString();

                // 값이 비어있을 경우 토스트 메시지를 띄우고 계산하지 않음
                if(num1.trim().equals("") || num2.trim().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(), "입력값이 비어있음", Toast.LENGTH_SHORT);
                    toast.show();

                }else{
                    num3 = Float.parseFloat(num1) * Float.parseFloat(num2);
                    result.setText("계산 결과 : " + num3.toString());
                }

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = input1.getText().toString();
                num2 = input2.getText().toString();


                // 값이 비어있을 경우 토스트 메시지를 띄우고 계산하지 않음
                if(num1.trim().equals("") || num2.trim().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(), "입력값이 비어있음", Toast.LENGTH_SHORT);
                    toast.show();

                }
                // 0으로 나눌 경우 토스트 메시지를 띄우고 계산하지 않음
                else if(num2.equals(ZERO)){
                    Toast toast = Toast.makeText(getApplicationContext(), "0으로 나눌 수 없음", Toast.LENGTH_SHORT);
                    toast.show();

                }
                else{
                    num3 = Float.parseFloat(num1) / Float.parseFloat(num2);
                    result.setText("계산 결과 : " + num3.toString());
                }

            }
        });

        btnExt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = input1.getText().toString();
                num2 = input2.getText().toString();

                // 값이 비어있을 경우 토스트 메시지를 띄우고 계산하지 않음
                if(num1.trim().equals("") || num2.trim().equals("")){
                    Toast toast = Toast.makeText(getApplicationContext(), "입력값이 비어있음", Toast.LENGTH_SHORT);
                    toast.show();

                }else{
                    num3 = Float.parseFloat(num1) % Float.parseFloat(num2);
                    result.setText("계산 결과 : " + num3.toString());
                }

            }
        });

    }




}