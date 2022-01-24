package it.sal.disco.unimib.trovacampi.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import it.sal.disco.unimib.trovacampi.R;


public class profile extends Fragment {
    private static final String TAG = "profile";
    Button button9, button10, button11;

    public profile (){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        button9 = view.findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth auth = FirebaseAuth.getInstance();
                FirebaseUser currentUser = auth.getCurrentUser();
                if(currentUser!=null) {

                    FirebaseAuth.getInstance().signOut();
                    Toast.makeText(requireActivity(), "logout effettuato", Toast.LENGTH_LONG).show();


            }else{
                Toast.makeText(requireActivity(), "login non effettuato", Toast.LENGTH_LONG).show();
            }}
        });


        button10 = view.findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth auth = FirebaseAuth.getInstance();
                FirebaseUser currentUser = auth.getCurrentUser();
                if(currentUser!=null) {
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                user.delete()
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            private static final String TAG = "profile";

                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Log.d(TAG, "User account deleted.");
                                    Toast.makeText(requireActivity(), "account cancellato correttamente", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                }else{
                    Toast.makeText(requireActivity(), "login non effettuato", Toast.LENGTH_LONG).show();
                }
            }
        });
        button11 = view.findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth auth = FirebaseAuth.getInstance();
                FirebaseUser currentUser = auth.getCurrentUser();
                if(currentUser!=null) {


                    String emailAddress = currentUser.getEmail();

                    auth.sendPasswordResetEmail(emailAddress)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        Log.d(TAG, "Email sent.");
                                        Toast.makeText(requireActivity(), "email inviata", Toast.LENGTH_LONG).show();
                                    }
                                }
                            });
                }else{
                    Toast.makeText(requireActivity(), "login non effettuato", Toast.LENGTH_LONG).show();
                }

            }


        });
        return view;
    }




}
