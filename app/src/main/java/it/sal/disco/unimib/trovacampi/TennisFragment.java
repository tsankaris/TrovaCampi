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

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;


public class TennisFragment extends Fragment {


    List<Double> Rating = new ArrayList<>();
    public TennisFragment() {
        // Required empty public constructor
    }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tennis, container, false);
        RatingBar ratingbar1 = (RatingBar) view.findViewById(R.id.ratingBarTennis);
        Button buttonSubmit = (Button) view.findViewById(R.id.buttonTennis);


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

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("tennis_sportpark");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }
        });

        RatingBar ratingbar2 = (RatingBar) view.findViewById(R.id.ratingBarTennis2);
        Button buttonSubmit2 = (Button) view.findViewById(R.id.buttonTennis2);


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

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("tennis_centroBiassono");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }
        });
        RatingBar ratingbar3 = (RatingBar) view.findViewById(R.id.ratingBarTennis3);
        Button buttonSubmit3 = (Button) view.findViewById(R.id.buttonTennis3);


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

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("tennis_playsport");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }
        });
        RatingBar ratingbar4 = (RatingBar) view.findViewById(R.id.ratingBarTennis4);
        Button buttonSubmit4 = (Button) view.findViewById(R.id.buttonTennis4);


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

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("tennis_centroSovico");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }
        });

        TextView textView = (TextView) view.findViewById(R.id.textViewTennis3);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Centro+Sportivo+Sportpark/@45.6183641,9.2783404,14z/data=!4m5!3m4!1s0x4786bbcf7934a365:0x9bb080f0b3a79618!8m2!3d45.6153534!4d9.265605\">VIA VITTORIO ALFIERI 35, VEDANO\n</a>"));
        TextView textView2 = (TextView) view.findViewById(R.id.textViewTennis6);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Cantera+Club+Sport+%26+Restaurant/@45.6305723,9.2835103,17z/data=!3m1!4b1!4m5!3m4!1s0x4786bb4d03095c7d:0x52d8b5ae6fb13b7b!8m2!3d45.6305721!4d9.2856544\">VIA PARCO 51, BIASSONO\n</a>"));
        TextView textView3 = (TextView) view.findViewById(R.id.textViewTennis9);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        textView3.setText(Html.fromHtml("<a href=\"https://www.bing.com/local?lid=YN2000x15716454582749594760&id=YN2000x15716454582749594760&q=Playsport&name=Playsport&cp=45.64289474487305%7e9.303834915161133&ppois=45.64289474487305_9.303834915161133_Playsport\">VIA PETRARCA 2, LESMO</a>"));
        TextView textView4 = (TextView) view.findViewById(R.id.textViewTennis12);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        textView4.setText(Html.fromHtml("<a href=\"https://www.bing.com/local?lid=YN1354x4914129612009534898&id=YN1354x4914129612009534898&q=Centro+Sportivo+Comunale&name=Centro+Sportivo+Comunale&cp=45.651878356933594%7e9.266690254211426&ppois=45.651878356933594_9.266690254211426_Centro+Sportivo+Comunale\">VIA LAMBRO, SOVICO</a>"));

        Button callB = (Button)view.findViewById(R.id.callButtonTennis);
        callB.setOnClickListener(new View.OnClickListener(){
            @Override //SPORTPARK
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:0392494846"));
                startActivity(intentB);
            }
        });
        Button callC = (Button)view.findViewById(R.id.callButtonTennis2);
        callC.setOnClickListener(new View.OnClickListener(){
            @Override //BIASSONO
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:3755667883"));
                startActivity(intentB);
            }
        });
        Button callD = (Button)view.findViewById(R.id.callButtonTennis3);
        callD.setOnClickListener(new View.OnClickListener(){
            @Override //PLAYSPORT
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:0396980021"));
                startActivity(intentB);
            }
        });
        Button callE = (Button)view.findViewById(R.id.callButtonTennis4);
        callE.setOnClickListener(new View.OnClickListener(){
            @Override //SOVICO
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:0392010099"));
                startActivity(intentB);
            }
        });

        FloatingActionButton button = (FloatingActionButton) view.findViewById(R.id.floatingActionButtonT);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uriUrl = Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScrtyp4cQ7QILiA1EeFmkRf3-KZq0Q2lLtRPam4GMKLkUfBwA/viewform?usp=sf_link");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }

        });

        return view;
    }



}