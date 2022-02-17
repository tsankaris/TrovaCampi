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

public class PallavoloFragment extends Fragment {



    List<Double> Rating = new ArrayList<>();
    public PallavoloFragment() {
        // Required empty public constructor
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pallavolo, container, false);
        RatingBar ratingbar1 = (RatingBar) view.findViewById(R.id.ratingBarVolley);
        Button buttonSubmit = (Button) view.findViewById(R.id.buttonVolley);


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

        RatingBar ratingbar2 = (RatingBar) view.findViewById(R.id.ratingBarVolley2);
        Button buttonSubmit2 = (Button) view.findViewById(R.id.buttonVolley2);


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
        RatingBar ratingbar3 = (RatingBar) view.findViewById(R.id.ratingBarVolley3);
        Button buttonSubmit3 = (Button) view.findViewById(R.id.buttonVolley3);


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
        RatingBar ratingbar4 = (RatingBar) view.findViewById(R.id.ratingBarVolley4);
        Button buttonSubmit4 = (Button) view.findViewById(R.id.buttonVolley4);


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

        TextView textView = (TextView) view.findViewById(R.id.textViewVolley3);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Via+Gaetana+Agnesi,+133,+20832+Desio+MB/@45.6110851,9.1925864,18.6z/data=!4m5!3m4!1s0x4786bc29b3e73dff:0x6bab05df21713cc3!8m2!3d45.610947!4d9.193091\">VIA G. AGNESI 133, DESIO\n</a>"));
        TextView textView2 = (TextView) view.findViewById(R.id.textViewVolley6);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/La+Dominante/@45.600745,9.2609448,17z/data=!3m1!4b1!4m5!3m4!1s0x4786b97cb564f599:0x915e8318c874954c!8m2!3d45.6007413!4d9.2631335\">VIA A. RAMAZZOTTI 19, MONZA\n</a>"));
        TextView textView3 = (TextView) view.findViewById(R.id.textViewVolley9);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        textView3.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Derbymonza/@45.5880156,9.2518136,17z/data=!3m1!4b1!4m5!3m4!1s0x4786b96c89259eb5:0xa675eeef96268b2d!8m2!3d45.5880661!4d9.2539825\">VIALE LOMBARDIA 17, MONZA\n</a>"));
        TextView textView4 = (TextView) view.findViewById(R.id.textViewVolley12);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        textView4.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Planet+Soccer/@45.6194796,9.1321549,17z/data=!3m1!4b1!4m5!3m4!1s0x47869603e29245b7:0x3daf85203f6a9360!8m2!3d45.6194759!4d9.1343436\">VIA ABRUZZI 10, CESANO MADERNO\n</a>"));

        Button callB = (Button)view.findViewById(R.id.callButtonVolley);
        callB.setOnClickListener(new View.OnClickListener(){
            @Override //DESIO
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:3349897502"));
                startActivity(intentB);
            }
        });
        Button callC = (Button)view.findViewById(R.id.callButtonVolley2);
        callC.setOnClickListener(new View.OnClickListener(){
            @Override //LADOMINANTE
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:039321221"));
                startActivity(intentB);
            }
        });
        Button callD = (Button)view.findViewById(R.id.callButtonVolley3);
        callD.setOnClickListener(new View.OnClickListener(){
            @Override //DERBY
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:039733229"));
                startActivity(intentB);
            }
        });
        Button callE = (Button)view.findViewById(R.id.callButtonVolley4);
        callE.setOnClickListener(new View.OnClickListener(){
            @Override //PLANET SOCCER
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:3487089703"));
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