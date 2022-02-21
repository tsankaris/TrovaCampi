package it.sal.disco.unimib.trovacampi.ui.home;

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

import it.sal.disco.unimib.trovacampi.R;
import it.sal.disco.unimib.trovacampi.login;


public class Calcio_activity extends Fragment {



    List<Double> Rating = new ArrayList<>();
    public Calcio_activity(){}
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_calcio, container, false);
        RatingBar ratingbar1= (RatingBar) view.findViewById(R.id.ratingBar1);
        Button buttonSubmit = (Button) view.findViewById(R.id.buttonSP1);


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

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("calcio_sportpark");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }});


        RatingBar ratingbar2 = (RatingBar) view.findViewById(R.id.ratingBar);
        Button buttonSubmit2 = (Button) view.findViewById(R.id.button12);


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

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("calcio_cantera");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }});

        RatingBar ratingbar3 = (RatingBar) view.findViewById(R.id.ratingBar2);
        Button buttonSubmit3 = (Button) view.findViewById(R.id.buttonCantera);


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

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("calcio_derby");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }});

        RatingBar ratingbar4 = (RatingBar) view.findViewById(R.id.ratingBar3);
        Button buttonSubmit4 = (Button) view.findViewById(R.id.buttonT);


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

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("calcio_tijuana");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            } });

        RatingBar ratingbar5 = (RatingBar) view.findViewById(R.id.ratingBar4);
        Button buttonSubmit5 = (Button) view.findViewById(R.id.buttonPlaysport1);


        buttonSubmit5.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the toast
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user != null) {
                    String rating = String.valueOf(ratingbar5.getRating());
                    Toast.makeText(requireActivity(), rating, Toast.LENGTH_LONG).show();

                    Double numStelle = Double.valueOf(ratingbar5.getRating());
                    Rating.add(numStelle);

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("calcio_playsport");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }});

        RatingBar ratingbar6 = (RatingBar) view.findViewById(R.id.ratingBar5);
        Button buttonSubmit6 = (Button) view.findViewById(R.id.buttonPL);


        buttonSubmit6.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the toast
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user != null) {
                    String rating = String.valueOf(ratingbar6.getRating());
                    Toast.makeText(requireActivity(), rating, Toast.LENGTH_LONG).show();

                    Double numStelle = Double.valueOf(ratingbar6.getRating());
                    Rating.add(numStelle);

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("calcio_piscineLissone");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }});

        RatingBar ratingbar7 = (RatingBar) view.findViewById(R.id.ratingBar6);
        Button buttonSubmit7 = (Button) view.findViewById(R.id.buttonInSport);


        buttonSubmit7.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the toast
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user != null) {
                    String rating = String.valueOf(ratingbar7.getRating());
                    Toast.makeText(requireActivity(), rating, Toast.LENGTH_LONG).show();

                    Double numStelle = Double.valueOf(ratingbar7.getRating());
                    Rating.add(numStelle);

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("calcio_inSport");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }});

        RatingBar ratingbar8 = (RatingBar) view.findViewById(R.id.ratingBar7);
        Button buttonSubmit8 = (Button) view.findViewById(R.id.buttonLeonArena);


        buttonSubmit8.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the toast
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user != null) {
                    String rating = String.valueOf(ratingbar8.getRating());
                    Toast.makeText(requireActivity(), rating, Toast.LENGTH_LONG).show();

                    Double numStelle = Double.valueOf(ratingbar8.getRating());
                    Rating.add(numStelle);

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("calcio_leonArena");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }});

        RatingBar ratingbar9 = (RatingBar) view.findViewById(R.id.ratingBar9);
        Button buttonSubmit9 = (Button) view.findViewById(R.id.button7);


        buttonSubmit9.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the toast
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user != null) {
                    String rating = String.valueOf(ratingbar9.getRating());
                    Toast.makeText(requireActivity(), rating, Toast.LENGTH_LONG).show();

                    Double numStelle = Double.valueOf(ratingbar9.getRating());
                    Rating.add(numStelle);

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("calcio_openSport");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }});

        RatingBar ratingbar10 = (RatingBar) view.findViewById(R.id.ratingBar8);
        Button buttonSubmit10 = (Button) view.findViewById(R.id.button6);


        buttonSubmit10.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View arg0) {
                //Getting the rating and displaying it on the toast
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user != null) {
                    String rating = String.valueOf(ratingbar10.getRating());
                    Toast.makeText(requireActivity(), rating, Toast.LENGTH_LONG).show();

                    Double numStelle = Double.valueOf(ratingbar10.getRating());
                    Rating.add(numStelle);

                    DatabaseReference mediDatabase = FirebaseDatabase.getInstance("https://trovacampi-4634e-default-rtdb.europe-west1.firebasedatabase.app/").getReference("calcio_laDominante");
                    mediDatabase.push().setValue(numStelle);


                } else {
                    String errore = " Non Hai Effettuato Il Login";
                    Toast.makeText(requireActivity(), errore, Toast.LENGTH_LONG).show();
                }
            }});








        TextView textView = (TextView) view.findViewById(R.id.textView3);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Centro+Sportivo+Sportpark/@45.6183641,9.2783404,14z/data=!4m5!3m4!1s0x4786bbcf7934a365:0x9bb080f0b3a79618!8m2!3d45.6153534!4d9.265605\">VIA VITTORIO ALFIERI 32, VEDANO\n</a>"));



        TextView textView1 = (TextView) view.findViewById(R.id.textView9);
        textView1.setMovementMethod(LinkMovementMethod.getInstance());
        textView1.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Cantera+Club+Sport+%26+Restaurant/@45.6305723,9.2835103,17z/data=!3m1!4b1!4m5!3m4!1s0x4786bb4d03095c7d:0x52d8b5ae6fb13b7b!8m2!3d45.6305721!4d9.2856544\">VIA PARCO 51, BIASSONO\n</a>"));

        TextView textView2 = (TextView) view.findViewById(R.id.textView10);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Derbymonza/@45.5885864,9.2537131,17z/data=!4m12!1m6!3m5!1s0x4786b96c89259eb5:0xa675eeef96268b2d!2sDerbymonza!8m2!3d45.5880661!4d9.2539825!3m4!1s0x4786b96c89259eb5:0xa675eeef96268b2d!8m2!3d45.5880661!4d9.2539825\">VIALE LOMBARDIA 17, MONZA</a>"));

        TextView textView3 = (TextView) view.findViewById(R.id.textView11);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        textView3.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Centro+Sportivo+comunale/@45.6624473,9.3026963,17z/data=!3m1!5s0x4786badc82cceb27:0xc487fcf930678914!4m12!1m6!3m5!1s0x4786badd50cc30f9:0x1ba179c508f550e6!2sTijuana+Correzzana!8m2!3d45.6624473!4d9.304885!3m4!1s0x4786badc9b6b9081:0xad250d61ba31393d!8m2!3d45.6623993!4d9.3045858\">VIA PRINCIPALE 38, CORREZZANA</a>"));

        TextView textView4 = (TextView) view.findViewById(R.id.textView12);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        textView4.setText(Html.fromHtml("<a href=\"https://www.bing.com/local?lid=YN2000x15716454582749594760&id=YN2000x15716454582749594760&q=Playsport&name=Playsport&cp=45.64289474487305%7e9.303834915161133&ppois=45.64289474487305_9.303834915161133_Playsport\">VIA PETRARCA 2, LESMO</a>"));

        TextView textView5 = (TextView) view.findViewById(R.id.textView13);
        textView5.setMovementMethod(LinkMovementMethod.getInstance());
        textView5.setText(Html.fromHtml("<a href=\"https://www.bing.com/maps/directions?rtp=adr.~pos.45.60810852050781_9.227869987487793_Via+Cilea+2+-+20851+Lissone+(MB)_Piscine+Lissone_039+262+2048\">VIA CILEA 2, LISSONE</a>"));

        TextView textView6 = (TextView) view.findViewById(R.id.textView14);
        textView6.setMovementMethod(LinkMovementMethod.getInstance());
        textView6.setText(Html.fromHtml("<a href=\"https://www.bing.com/local?lid=YN1354x13423815843057878173&id=YN1354x13423815843057878173&q=Centro+Sportivo+Comunale+-+In+Sport+Arcore&name=Centro+Sportivo+Comunale+-+In+Sport+Arcore&cp=45.625728607177734%7e9.316149711608887&ppois=45.625728607177734_9.316149711608887_Centro+Sportivo+Comunale+-+In+Sport+Arcore\">VIA S. MARTINO 7 , ARCORE</a>"));

        TextView textView7 = (TextView) view.findViewById(R.id.textView15);
        textView7.setMovementMethod(LinkMovementMethod.getInstance());
        textView7.setText(Html.fromHtml("<a href=\"https://www.bing.com/local?lid=YN1354x6773450279965000438&id=YN1354x6773450279965000438&q=Ac+Leon+Monza+e+Brianza+(Leon+Arena)&name=Ac+Leon+Monza+e+Brianza+(Leon+Arena)&cp=45.60702133178711%7e9.373299598693848&ppois=45.60702133178711_9.373299598693848_Ac+Leon+Monza+e+Brianza+(Leon+Arena)\">VIA DEGLI ATLETI, VIMERCATE</a>"));

        TextView textView8 = (TextView) view.findViewById(R.id.textView18);
        textView8.setMovementMethod(LinkMovementMethod.getInstance());
        textView8.setText(Html.fromHtml("<a href=\"https://www.bing.com/local?lid=YN1354x4914129612009534898&id=YN1354x4914129612009534898&q=Centro+Sportivo+Comunale&name=Centro+Sportivo+Comunale&cp=45.651878356933594%7e9.266690254211426&ppois=45.651878356933594_9.266690254211426_Centro+Sportivo+Comunale\">VIA LAMBRO, SOVICO</a>"));

        TextView textView9 = (TextView) view.findViewById(R.id.textView17);
        textView9.setMovementMethod(LinkMovementMethod.getInstance());
        textView9.setText(Html.fromHtml("<a href=\"https://www.bing.com/local?lid=YN1354x5271279973866090072&id=YN1354x5271279973866090072&q=Societ%c3%a0+Sportiva+La+Dominante&name=Societ%c3%a0+Sportiva+La+Dominante&cp=45.60129928588867%7e9.263500213623047&ppois=45.60129928588867_9.263500213623047_Societ%c3%a0+Sportiva+La+Dominante\"> VIA A. RAMAZZOTTI 19, MONZA</a>"));

        Button callB = (Button)view.findViewById(R.id.callButton);
        callB.setOnClickListener(new View.OnClickListener(){
            @Override //CANTERA
            public void onClick(View v){
                Intent intentB= new Intent(Intent.ACTION_DIAL);
                intentB.setData(Uri.parse("tel:3755667883"));
                startActivity(intentB);
            }
        });

        Button callA = (Button) view.findViewById(R.id.callButtonA);
        callA.setOnClickListener(new View.OnClickListener(){
            @Override //SPORTPARK
            public void onClick(View v){
                Intent intentA= new Intent(Intent.ACTION_DIAL);
                intentA.setData(Uri.parse("tel:0392494846"));
                startActivity(intentA);
            }
        });

        Button callOp = (Button) view.findViewById(R.id.callButtonC);
        callOp.setOnClickListener(new View.OnClickListener(){
            @Override //opensport
            public void onClick(View v){
                Intent intentC= new Intent(Intent.ACTION_DIAL);
                intentC.setData(Uri.parse("tel:3897874334"));
                startActivity(intentC);
            }
        });
        Button callTi = (Button) view.findViewById(R.id.callButtonD);
        callTi.setOnClickListener(new View.OnClickListener(){
            @Override //tijuana
            public void onClick(View v){
                Intent intentD= new Intent(Intent.ACTION_DIAL);
                intentD.setData(Uri.parse("tel:3386360999"));
                startActivity(intentD);
            }
        });

        Button callDe = (Button) view.findViewById(R.id.callButtonE);
        callDe.setOnClickListener(new View.OnClickListener(){
            @Override //derby
            public void onClick(View v){
                Intent intentE= new Intent(Intent.ACTION_DIAL);
                intentE.setData(Uri.parse("tel:039733229"));
                startActivity(intentE);
            }
        });
        Button callPiL = (Button) view.findViewById(R.id.callButtonF);
        callPiL.setOnClickListener(new View.OnClickListener(){
            @Override //piscine lissone
            public void onClick(View v){
                Intent intentF= new Intent(Intent.ACTION_DIAL);
                intentF.setData(Uri.parse("tel:0392622048"));
                startActivity(intentF);
            }
        });

        Button callLaD = (Button) view.findViewById(R.id.callButtonG);
        callLaD.setOnClickListener(new View.OnClickListener(){
            @Override //la dominante
            public void onClick(View v){
                Intent intentG= new Intent(Intent.ACTION_DIAL);
                intentG.setData(Uri.parse("tel:039321221"));
                startActivity(intentG);
            }
        });

        Button callInS = (Button) view.findViewById(R.id.callButtonH);
        callInS.setOnClickListener(new View.OnClickListener(){
            @Override //Insport
            public void onClick(View v){
                Intent intentH= new Intent(Intent.ACTION_DIAL);
                intentH.setData(Uri.parse("tel:039617831"));
                startActivity(intentH);
            }
        });

        Button callPlaysport = (Button) view.findViewById(R.id.callButtonI);
        callPlaysport.setOnClickListener(new View.OnClickListener(){
            @Override //playsport
            public void onClick(View v){
                Intent intentI= new Intent(Intent.ACTION_DIAL);
                intentI.setData(Uri.parse("tel:0396980021"));
                startActivity(intentI);
            }
        });

        Button callLeon = (Button) view.findViewById(R.id.callButtonJ);
        callLeon.setOnClickListener(new View.OnClickListener(){
            @Override //Leonareana
            public void onClick(View v){
                Intent intentJ= new Intent(Intent.ACTION_DIAL);
                intentJ.setData(Uri.parse("tel:3488207614"));
                startActivity(intentJ);
            }
        });

    FloatingActionButton button = (FloatingActionButton) view.findViewById(R.id.floatingActionButton3);
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