package it.sal.disco.unimib.trovacampi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;


public class BasketFragment extends Fragment {


    List<Double> Rating = new ArrayList<>();
    public BasketFragment() {
        // Required empty public constructor
    }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_basket, container, false);
        RatingBar ratingbar1 = (RatingBar) view.findViewById(R.id.ratingBarBasket);
        Button buttonSubmit = (Button) view.findViewById(R.id.buttonBasket);


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

        RatingBar ratingbar2 = (RatingBar) view.findViewById(R.id.ratingBarBasket2);
        Button buttonSubmit2 = (Button) view.findViewById(R.id.buttonBasket2);


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
        RatingBar ratingbar3 = (RatingBar) view.findViewById(R.id.ratingBarBasket3);
        Button buttonSubmit3 = (Button) view.findViewById(R.id.buttonBasket3);


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
        RatingBar ratingbar4 = (RatingBar) view.findViewById(R.id.ratingBarBasket4);
        Button buttonSubmit4 = (Button) view.findViewById(R.id.buttonBasket4);


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

        TextView textView = (TextView) view.findViewById(R.id.textViewBasket3);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Centro+Sportivo+Sportpark/@45.6183641,9.2783404,14z/data=!4m5!3m4!1s0x4786bbcf7934a365:0x9bb080f0b3a79618!8m2!3d45.6153534!4d9.265605\">VIA DEL GINESTRINO 17, CARUGATE\n</a>"));
        TextView textView2 = (TextView) view.findViewById(R.id.textViewBasket6);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Centro+Sportivo+Sportpark/@45.6183641,9.2783404,14z/data=!4m5!3m4!1s0x4786bbcf7934a365:0x9bb080f0b3a79618!8m2!3d45.6153534!4d9.265605\">VIA PIO X 34, CONCOREZZO\n</a>"));
        TextView textView3 = (TextView) view.findViewById(R.id.textViewBasket9);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        textView3.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Centro+Sportivo+Sportpark/@45.6183641,9.2783404,14z/data=!4m5!3m4!1s0x4786bbcf7934a365:0x9bb080f0b3a79618!8m2!3d45.6153534!4d9.265605\">VIA T. CREMONA 7, MONZA\n</a>"));
        TextView textView4 = (TextView) view.findViewById(R.id.textViewBasket12);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        textView4.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Centro+Sportivo+Sportpark/@45.6183641,9.2783404,14z/data=!4m5!3m4!1s0x4786bbcf7934a365:0x9bb080f0b3a79618!8m2!3d45.6153534!4d9.265605\">VIA C. PREMOLI 5, CARNATE\n</a>"));

        Button callB = (Button)view.findViewById(R.id.callButtonBasket);
        callB.setOnClickListener(new View.OnClickListener(){
            @Override //CARUGATE
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:029252111"));
                startActivity(intentB);
            }
        });
        Button callC = (Button)view.findViewById(R.id.callButtonBasket2);
        callC.setOnClickListener(new View.OnClickListener(){
            @Override //INSPORT
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:0396042562"));
                startActivity(intentB);
            }
        });
        Button callD = (Button)view.findViewById(R.id.callButtonBasket3);
        callD.setOnClickListener(new View.OnClickListener(){
            @Override //GERARDIANA
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:3478534436"));
                startActivity(intentB);
            }
        });
        Button callE = (Button)view.findViewById(R.id.callButtonBasket4);
        callE.setOnClickListener(new View.OnClickListener(){
            @Override //CARNATE
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:3478534436"));
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