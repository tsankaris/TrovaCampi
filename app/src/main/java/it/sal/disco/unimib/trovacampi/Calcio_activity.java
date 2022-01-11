package it.sal.disco.unimib.trovacampi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class Calcio_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcio);
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
     /*
        TextView textView = (TextView) findViewById(R.id.TextView01);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml("<a href=\"http://www.mrwebmaster.it\">Mr.Webmaster</a>"));

        TextView textView = (TextView) findViewById(R.id.TextView01);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml("<a href=\"http://www.mrwebmaster.it\">Mr.Webmaster</a>"));

        TextView textView = (TextView) findViewById(R.id.TextView01);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml("<a href=\"http://www.mrwebmaster.it\">Mr.Webmaster</a>"));

        TextView textView = (TextView) findViewById(R.id.TextView01);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml("<a href=\"http://www.mrwebmaster.it\">Mr.Webmaster</a>"));

        TextView textView = (TextView) findViewById(R.id.TextView01);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml("<a href=\"http://www.mrwebmaster.it\">Mr.Webmaster</a>"));

        TextView textView = (TextView) findViewById(R.id.TextView01);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Html.fromHtml("<a href=\"http://www.mrwebmaster.it\">Mr.Webmaster</a>"));*/
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