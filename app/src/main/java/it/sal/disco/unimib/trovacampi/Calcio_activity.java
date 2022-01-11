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
        textView.setText(Html.fromHtml("<a href=\"https://www.bing.com/maps/directions?rtp=adr.~pos.45.615020751953125_9.26572036743164_Via+Vittorio+Alfieri+32+-+20057+Vedano+Al+Lambro+(MI)_Sportpark_039+249+4846\">VIA VITTORIO ALFIERI 32, VEDANO\n</a>"));

        TextView textView1 = (TextView) findViewById(R.id.textView9);
        textView1.setMovementMethod(LinkMovementMethod.getInstance());
        textView1.setText(Html.fromHtml("<a href=\"https://www.bing.com/local?lid=YN1354x18269578375755280536&id=YN1354x18269578375755280536&q=Cantera+Club+Sport+%26+Restaurant&name=Cantera+Club+Sport+%26+Restaurant&cp=45.63228988647461%7e9.296019554138184&ppois=45.63228988647461_9.296019554138184_Cantera+Club+Sport+%26+Restaurant\">VIA PARCO 51, BIASSONO\n</a>"));

        /*TextView textView = (TextView) findViewById(R.id.TextView01);
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