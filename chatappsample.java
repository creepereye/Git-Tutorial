
package kr.co.softcampus.chapapp2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etPassword,etId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPassword=(EditText)findViewById(R.id.etPassword);
        etId=(EditText)findViewById(R.id.etId);

        String getid=etId.getText().toString();
        String getpassword=etPassword.getText().toString();

        Button btnLogin=(Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this,"Login",Toast.LENGTH_LONG).show();
                Intent in=new Intent(MainActivity.this,ChatActivity.class);
                startActivity(in);
            }
        });
        Button btnregister=(Button)findViewById(R.id.btnRegister);
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stemail=etId.getText().toString();
                String stpassword=etPassword.getText().toString();
                if(stemail.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"please inseretmail",Toast.LENGTH_LONG).show();
                    return;
                }
                if(stpassword.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"please insert password",Toast.LENGTH_LONG).show();
                    return;
                }
                Toast.makeText(MainActivity.this,"Email :"+stemail+" password :"+stpassword,Toast.LENGTH_LONG).show();
            }
        });
    }
}
