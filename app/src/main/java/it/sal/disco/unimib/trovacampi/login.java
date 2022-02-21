package it.sal.disco.unimib.trovacampi;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    private static final String TAG = "login";
    private FirebaseAuth mAuth;
    // [END declare_auth]

    EditText memail, mpassword;
    Button button;
    Button button1;
    Button button2;
    Button button3;
    boolean isPasswordVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();
        memail = findViewById(R.id.editTextTextEmailAddress2);
        mpassword = findViewById(R.id.editTextTextPassword2);
        button = findViewById(R.id.button4);
        button1 = findViewById(R.id.button5);
        button2 = findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), EmailPasswordActivity.class));
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = memail.getText().toString().trim();
                String password = mpassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    String emailRichiesta = "email richiesta";
                    memail.setError(emailRichiesta);
                } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(memail.getText().toString()).matches()) {
                    String emailValida = "inserisci un'email valida";
                    memail.setError(emailValida);
                }
                if (TextUtils.isEmpty(password)) {
                    String passwordRichiesta = "password richiesta";
                    mpassword.setError(passwordRichiesta);
                    return;
                }


                if (password.length() < 6) {
                    String passwordCorta = "inserisci una password lunga almeno 6 caratteri";
                    mpassword.setError(passwordCorta);
                    return;
                }
                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(login.this, "Accesso effettuato", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        } else {
                            Toast.makeText(login.this, "errore: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });

            }


        });

    }


    public void perform_action(View view) {
        FirebaseAuth auth = FirebaseAuth.getInstance();
        String emailAddress = memail.getText().toString().trim();

        if (TextUtils.isEmpty(emailAddress)) {
            String emailRichiesta = "email richiesta";
            memail.setError(emailRichiesta);
        } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(memail.getText().toString()).matches()) {
            String emailValida = "inserisci un'email valida";
            memail.setError(emailValida);
        }else{

            auth.sendPasswordResetEmail(emailAddress)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {

                                Log.d(TAG, "Email sent.");
                                String errore = "Email inviata.";
                                Toast.makeText(login.this, errore, Toast.LENGTH_LONG).show();
                            }
                        }
                    });
        }
    }
}