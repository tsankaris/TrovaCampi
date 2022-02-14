package it.sal.disco.unimib.trovacampi.ui.notifications;

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


public class Profile extends Fragment {
    private static final String TAG = "profile";
    Button button9, button10, button11;

    public Profile(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_profile, container, false);

        button9 = view.findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if(user!=null) {
                    FirebaseAuth.getInstance().signOut();
                    String errore = " Logout effettuato";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }else{
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }
        });

        button10 = view.findViewById(R.id.button10);

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if(user!=null) {
                    user.delete()
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                private static final String TAG = "profile";

                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        Log.d(TAG, "User account deleted.");

                                        String errore = " Utente cancellato correttamente";
                                        Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                                    }
                                    }

                            });
                }else{
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }
        });
        button11 = view.findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth auth = FirebaseAuth.getInstance();
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if(user!=null) {
                    String emailAddress = user.getEmail();

                    auth.sendPasswordResetEmail(emailAddress)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        Log.d(TAG, "Email sent.");

                                        String errore = " Email inviata";
                                        Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                                    }
                                    }
                            });

                }else{
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(),errore,Toast.LENGTH_LONG).show();
                }
            }


        });
return view;
    }

 }
