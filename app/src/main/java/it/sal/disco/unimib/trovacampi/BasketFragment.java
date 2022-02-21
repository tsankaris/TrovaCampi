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

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("basket_Carugate");
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

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("basket_inSport");
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

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("basket_gerardiana");
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

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("basket_carnate");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }
        });

        TextView textView = (TextView) view.findViewById(R.id.textViewBasket3);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Parcheggio+carugate/@45.5528468,9.3463836,18.08z/data=!4m13!1m7!3m6!1s0x4786b7aea1cfd2ff:0x2b8c8bbec8794476!2sVia+del+Ginestrino,+17,+20061+Carugate+MI!3b1!8m2!3d45.553337!4d9.3468443!3m4!1s0x4786b7ac4ee22e4b:0x39ce92ebcf363aaa!8m2!3d45.5526955!4d9.3482065\">VIA D.GINESTRINO 17, CARUGATE\n</a>"));
        TextView textView2 = (TextView) view.findViewById(R.id.textViewBasket6);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/IN+SPORT+S.R.L.+S.S.D.+%E2%80%93+Centro+Sportivo+Concorezzo/@45.5834006,9.3337774,17z/data=!3m1!4b1!4m5!3m4!1s0x4786b741250df905:0xc02db8aa9631e195!8m2!3d45.5833969!4d9.3359661\">VIA PIO X 34, CONCOREZZO\n</a>"));
        TextView textView3 = (TextView) view.findViewById(R.id.textViewBasket9);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        textView3.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Gerardiana+Monza/@45.584788,9.2858083,18.08z/data=!4m13!1m7!3m6!1s0x4786b9966567a8c5:0xff73d7d16927a0e2!2sVia+Cremona,+7,+20900+Monza+MB!3b1!8m2!3d45.5849845!4d9.2865013!3m4!1s0x4786b9967da58763:0xa59140921eb93ea0!8m2!3d45.5854782!4d9.2868324\">VIA T. CREMONA 7, MONZA\n</a>"));
        TextView textView4 = (TextView) view.findViewById(R.id.textViewBasket12);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        textView4.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Via+C.+Premoli,+5,+20866+Carnate+MB/@45.6491026,9.3779691,18.63z/data=!4m5!3m4!1s0x4786b04bd667dbf9:0xdf13221c50880505!8m2!3d45.6491372!4d9.3788604\">VIA C. PREMOLI 5, CARNATE\n</a>"));

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

        FloatingActionButton button = (FloatingActionButton) view.findViewById(R.id.floatingActionButtonB);
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