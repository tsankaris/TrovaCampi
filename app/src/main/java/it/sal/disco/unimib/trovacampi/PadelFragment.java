package it.sal.disco.unimib.trovacampi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;


public class PadelFragment extends Fragment {


    List<Double> Rating = new ArrayList<>();
    public PadelFragment() {
        // Required empty public constructor
    }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_padel, container, false);
        RatingBar ratingbar1 = (RatingBar) view.findViewById(R.id.ratingBarPadel);
        Button buttonSubmit = (Button) view.findViewById(R.id.buttonPadel);


        buttonSubmit.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the toast
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user != null) {
                    String rating = String.valueOf(ratingbar1.getRating());
                    Toast.makeText(requireActivity(), rating, Toast.LENGTH_LONG).show();

                    Double numStelle = Double.valueOf(ratingbar1.getRating());
                    Rating.add(numStelle);

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("sportpark");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }
        });

        RatingBar ratingbar2 = (RatingBar) view.findViewById(R.id.ratingBarPadel2);
        Button buttonSubmit2 = (Button) view.findViewById(R.id.buttonPadel2);


        buttonSubmit2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the toast
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user != null) {
                    String rating = String.valueOf(ratingbar2.getRating());
                    Toast.makeText(requireActivity(), rating, Toast.LENGTH_LONG).show();

                    Double numStelle = Double.valueOf(ratingbar2.getRating());
                    Rating.add(numStelle);

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("sportpark");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }
        });
        RatingBar ratingbar3 = (RatingBar) view.findViewById(R.id.ratingBarPadel3);
        Button buttonSubmit3 = (Button) view.findViewById(R.id.buttonaPadel3);


        buttonSubmit3.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the toast
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user != null) {
                    String rating = String.valueOf(ratingbar3.getRating());
                    Toast.makeText(requireActivity(), rating, Toast.LENGTH_LONG).show();

                    Double numStelle = Double.valueOf(ratingbar3.getRating());
                    Rating.add(numStelle);

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("sportpark");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }
        });
        RatingBar ratingbar4 = (RatingBar) view.findViewById(R.id.ratingBarPadel4);
        Button buttonSubmit4 = (Button) view.findViewById(R.id.buttonPadel4);


        buttonSubmit4.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the toast
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user != null) {
                    String rating = String.valueOf(ratingbar4.getRating());
                    Toast.makeText(requireActivity(), rating, Toast.LENGTH_LONG).show();

                    Double numStelle = Double.valueOf(ratingbar4.getRating());
                    Rating.add(numStelle);

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("sportpark");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }
        });

        TextView textView = (TextView) view.findViewById(R.id.textViewPadel3);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Centro+sportivo+Monza+Triante+-+GIS+Milano+S.S.D.+Srl/@45.5753627,9.2494855,17z/data=!3m1!4b1!4m5!3m4!1s0x4786b91a607b824f:0xf77ea1fb85800e5e!8m2!3d45.5753317!4d9.2517159\">VIA PITAGORA 12, MONZA\n</a>"));
        TextView textView2 = (TextView) view.findViewById(R.id.textViewPadel6);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Circolo+Tennis+Carate+Brianza/@45.6749107,9.2240812,18.35z/data=!4m13!1m7!3m6!1s0x4786bcc8bbc5c4c7:0xee00f67aceab836e!2sVia+Olimpia,+20841+Carate+Brianza+MB!3b1!8m2!3d45.6753007!4d9.2233684!3m4!1s0x4786bd30fd6719bf:0x7f3f3a125b5786d!8m2!3d45.6751407!4d9.223545\">VIA OLIMPIA 5, CARATE\n</a>"));
        TextView textView3 = (TextView) view.findViewById(R.id.textViewPadel9);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        textView3.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Club+Tennis+Ceriano+-+Associazione+Sportiva+Dilettantistica/@45.6330427,9.0725145,17z/data=!3m1!4b1!4m5!3m4!1s0x478696960671f537:0xca7f3abd4177731d!8m2!3d45.633039!4d9.0747032\">VIA CAMPACCIO 3, CERIANO L.\n</a>"));
        TextView textView4 = (TextView) view.findViewById(R.id.textViewPadel12);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        textView4.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Centro+Sportivo+PlaySport/@45.6429359,9.3013949,17z/data=!3m1!4b1!4m5!3m4!1s0x4786baf6dbee1a0f:0xf2fc421fefdf4ceb!8m2!3d45.6429343!4d9.3035839\">VIA PETRARCA 2, LESMO\n</a>"));

        Button callB = (Button)view.findViewById(R.id.callButtonPadel);
        callB.setOnClickListener(new View.OnClickListener(){
            @Override //TRIANTE
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:039744673"));
                startActivity(intentB);
            }
        });
        Button callC = (Button)view.findViewById(R.id.callButtonPadel2);
        callC.setOnClickListener(new View.OnClickListener(){
            @Override //CARATE
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:3297530959"));
                startActivity(intentB);
            }
        });
        Button callD = (Button)view.findViewById(R.id.callButtonPadel3);
        callD.setOnClickListener(new View.OnClickListener(){
            @Override //CERIANO
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:0239449723"));
                startActivity(intentB);
            }
        });
        Button callE = (Button)view.findViewById(R.id.callButtonPadel4);
        callE.setOnClickListener(new View.OnClickListener(){
            @Override //PLAYSPORT
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:0396980021"));
                startActivity(intentB);
            }
        });
        return view;
    }

    public void goToSo (View view) {
        goToUrl ();
    }

    private void goToUrl() {
        Uri uriUrl = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScrtyp4cQ7QILiA1EeFmkRf3-KZq0Q2lLtRPam4GMKLkUfBwA/viewform?usp=sf_link");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}