package it.sal.disco.unimib.trovacampi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class Calcio_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcio);

        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                toolbar.setVisibility(View.VISIBLE);// show the searchbox and bla bla...
            }
        });

        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Centro+Sportivo+Sportpark/@45.6183641,9.2783404,14z/data=!4m5!3m4!1s0x4786bbcf7934a365:0x9bb080f0b3a79618!8m2!3d45.6153534!4d9.265605\">VIA VITTORIO ALFIERI 32, VEDANO\n</a>"));



        TextView textView1 = (TextView) findViewById(R.id.textView9);
        textView1.setMovementMethod(LinkMovementMethod.getInstance());
        textView1.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Cantera+Club+Sport+%26+Restaurant/@45.6305723,9.2835103,17z/data=!3m1!4b1!4m5!3m4!1s0x4786bb4d03095c7d:0x52d8b5ae6fb13b7b!8m2!3d45.6305721!4d9.2856544\">VIA PARCO 51, BIASSONO\n</a>"));

        TextView textView2 = (TextView) findViewById(R.id.textView10);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Derbymonza/@45.5885864,9.2537131,17z/data=!4m12!1m6!3m5!1s0x4786b96c89259eb5:0xa675eeef96268b2d!2sDerbymonza!8m2!3d45.5880661!4d9.2539825!3m4!1s0x4786b96c89259eb5:0xa675eeef96268b2d!8m2!3d45.5880661!4d9.2539825\">VIALE LOMBARDIA 17, MONZA</a>"));

        TextView textView3 = (TextView) findViewById(R.id.textView11);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        textView3.setText(Html.fromHtml("<a href=\"https://www.google.it/maps/place/Centro+Sportivo+comunale/@45.6624473,9.3026963,17z/data=!3m1!5s0x4786badc82cceb27:0xc487fcf930678914!4m12!1m6!3m5!1s0x4786badd50cc30f9:0x1ba179c508f550e6!2sTijuana+Correzzana!8m2!3d45.6624473!4d9.304885!3m4!1s0x4786badc9b6b9081:0xad250d61ba31393d!8m2!3d45.6623993!4d9.3045858\">VIA PRINCIPALE 38, CORREZZANA</a>"));

        TextView textView4 = (TextView) findViewById(R.id.textView12);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        textView4.setText(Html.fromHtml("<a href=\"https://www.bing.com/local?lid=YN2000x15716454582749594760&id=YN2000x15716454582749594760&q=Playsport&name=Playsport&cp=45.64289474487305%7e9.303834915161133&ppois=45.64289474487305_9.303834915161133_Playsport\">VIA PETRARCA 2, LESMO</a>"));

        TextView textView5 = (TextView) findViewById(R.id.textView13);
        textView5.setMovementMethod(LinkMovementMethod.getInstance());
        textView5.setText(Html.fromHtml("<a href=\"https://www.bing.com/maps/directions?rtp=adr.~pos.45.60810852050781_9.227869987487793_Via+Cilea+2+-+20851+Lissone+(MB)_Piscine+Lissone_039+262+2048\">VIA CILEA 2, LISSONE</a>"));

        TextView textView6 = (TextView) findViewById(R.id.textView14);
        textView6.setMovementMethod(LinkMovementMethod.getInstance());
        textView6.setText(Html.fromHtml("<a href=\"https://www.bing.com/local?lid=YN1354x13423815843057878173&id=YN1354x13423815843057878173&q=Centro+Sportivo+Comunale+-+In+Sport+Arcore&name=Centro+Sportivo+Comunale+-+In+Sport+Arcore&cp=45.625728607177734%7e9.316149711608887&ppois=45.625728607177734_9.316149711608887_Centro+Sportivo+Comunale+-+In+Sport+Arcore\">VIA S. MARTINO 7 , ARCORE</a>"));

        TextView textView7 = (TextView) findViewById(R.id.textView15);
        textView7.setMovementMethod(LinkMovementMethod.getInstance());
        textView7.setText(Html.fromHtml("<a href=\"https://www.bing.com/local?lid=YN1354x6773450279965000438&id=YN1354x6773450279965000438&q=Ac+Leon+Monza+e+Brianza+(Leon+Arena)&name=Ac+Leon+Monza+e+Brianza+(Leon+Arena)&cp=45.60702133178711%7e9.373299598693848&ppois=45.60702133178711_9.373299598693848_Ac+Leon+Monza+e+Brianza+(Leon+Arena)\">VIA DEGLI ATLETI, VIMERCATE</a>"));

        TextView textView8 = (TextView) findViewById(R.id.textView18);
        textView8.setMovementMethod(LinkMovementMethod.getInstance());
        textView8.setText(Html.fromHtml("<a href=\"https://www.bing.com/local?lid=YN1354x4914129612009534898&id=YN1354x4914129612009534898&q=Centro+Sportivo+Comunale&name=Centro+Sportivo+Comunale&cp=45.651878356933594%7e9.266690254211426&ppois=45.651878356933594_9.266690254211426_Centro+Sportivo+Comunale\">VIA LAMBRO, SOVICO</a>"));

        TextView textView9 = (TextView) findViewById(R.id.textView17);
        textView9.setMovementMethod(LinkMovementMethod.getInstance());
        textView9.setText(Html.fromHtml("<a href=\"https://www.bing.com/local?lid=YN1354x5271279973866090072&id=YN1354x5271279973866090072&q=Societ%c3%a0+Sportiva+La+Dominante&name=Societ%c3%a0+Sportiva+La+Dominante&cp=45.60129928588867%7e9.263500213623047&ppois=45.60129928588867_9.263500213623047_Societ%c3%a0+Sportiva+La+Dominante\"> VIA A. RAMAZZOTTI 19, MONZA</a>"));
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