package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText login;
    private EditText pass;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //превязка по айди
        login = findViewById(R.id.mail_et);
        pass = findViewById(R.id.pass_et);
        btn = findViewById(R.id.voiti_btn);
        //вызов метода
        initBtn();

        //Слушатель на 2 едит текст
        pass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                //вызов метода
                checker();
            }
        });

    }

    private void initBtn() {
        //поставили слушателб для кнопку
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //вывод сообщения(TOAST)
                Toast toast = Toast.makeText(getApplicationContext(),"ДОБРО ПОЖАЛОВАТЬ!",Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    private void checker() {
        //если логин не пуст и  пароль не пуст
        if (!login.getText().toString().isEmpty()&&!pass.getText().toString().isEmpty()){
            //то кнопка аткивна
            btn.setEnabled(true);
        }
        //иначе
        else {
            // кнопка неактивна
            btn.setEnabled(false);
        }
    }
}
