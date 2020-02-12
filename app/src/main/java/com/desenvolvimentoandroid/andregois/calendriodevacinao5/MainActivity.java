package com.desenvolvimentoandroid.andregois.calendriodevacinao5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.desenvolvimentoandroid.andregois.calendriodevacinao5.calendario.GestanteActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.calendario.SessentaActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.calendario.Setea19Activity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.calendario.Vintea59Activity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.calendario.Zeroa6Activity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.BCGActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.DTActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.DTPActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.DTPaActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.FAActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.HAActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.HBActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.HPVActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.InfluenzaActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.MeningoActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.ObservacoesGeraisActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.PentaActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.Pneumo10Activity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.Pneumo23Activity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.RotavirusActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.SCRActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.TetraViralActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.VIPActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.VOPActivity;
import com.desenvolvimentoandroid.andregois.calendriodevacinao5.vacinas.VaricelaActivity;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();



        if (id == R.id.nav_crianças0a7) {

            startActivity(new Intent(MainActivity.this, Zeroa6Activity.class));

        } else if (id == R.id.nav_7a19) {

            startActivity(new Intent(MainActivity.this, Setea19Activity.class));

        } else if (id == R.id.nav_20a59) {

            startActivity(new Intent(MainActivity.this, Vintea59Activity.class));

        } else if (id == R.id.nav_60oumais) {

            startActivity(new Intent(MainActivity.this, SessentaActivity.class));

        } else if (id == R.id.nav_gestantes) {

           startActivity(new Intent(MainActivity.this, GestanteActivity.class));

        } else if (id == R.id.nav_bcg) {

            startActivity(new Intent(MainActivity.this, BCGActivity.class));

        } else if (id == R.id.nav_hepb) {

            startActivity(new Intent(MainActivity.this, HBActivity.class));

        } else if (id == R.id.nav_penta) {

            startActivity(new Intent(MainActivity.this, PentaActivity.class));

        } else if (id == R.id.nav_penumo) {

           startActivity(new Intent(MainActivity.this,Pneumo10Activity.class));

        } else if (id == R.id.nav_vip) {

           startActivity(new Intent(MainActivity.this, VIPActivity.class));

        } else if (id == R.id.nav_vop) {

           startActivity(new Intent(MainActivity.this, VOPActivity.class));

        } else if (id == R.id.nav_vorh) {

           startActivity(new Intent(MainActivity.this,RotavirusActivity.class));

        } else if (id == R.id.nav_meningo) {

          startActivity(new Intent(MainActivity.this, MeningoActivity.class));

        } else if (id == R.id.nav_fa) {

           startActivity(new Intent(MainActivity.this, FAActivity.class));

        } else if (id == R.id.nav_src) {

           startActivity(new Intent(MainActivity.this,SCRActivity.class));

        } else if (id == R.id.nav_varicela) {

           startActivity(new Intent(MainActivity.this, VaricelaActivity.class));

        } else if (id == R.id.nav_dtp) {

           startActivity(new Intent(MainActivity.this,DTPActivity.class));

        } else if (id == R.id.nav_hepa) {

           startActivity(new Intent(MainActivity.this, HAActivity.class));

        } else if (id == R.id.nav_hpv) {

           startActivity(new Intent(MainActivity.this, HPVActivity.class));

        } else if (id == R.id.nav_dt) {

           startActivity(new Intent(MainActivity.this, DTActivity.class));

        } else if (id == R.id.nav_dtpa) {

           startActivity(new Intent(MainActivity.this, DTPaActivity.class));

        } else if (id == R.id.nav_influenza) {

            startActivity(new Intent(MainActivity.this, InfluenzaActivity.class));

        } else if (id == R.id.nav_tetraviral) {

           startActivity(new Intent(MainActivity.this, TetraViralActivity.class));

        } else if (id == R.id.nav_observacoesGerais) {

            startActivity(new Intent(MainActivity.this, ObservacoesGeraisActivity.class));

        } else if (id == R.id.nav_pneumo23) {

            startActivity(new Intent(MainActivity.this, Pneumo23Activity.class));

        } else if (id == R.id.nav_sobre) {

            startActivity(new Intent(MainActivity.this, SobreActivity.class));

        } else if (id == R.id.nav_feedback) {

            enviarEmail();

        } else if (id == R.id.nav_sair) {

            System.exit(0);
            return true;

        }else if (id == R.id.nav_classificar) {

            classificar();

        }else if (id == R.id.nav_antirrabicaHumana) {

            antirrabicaHumana();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void enviarEmail(){

        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"andreljgois@gmail.com"});
        email.putExtra(Intent.EXTRA_SUBJECT, "Contato sobre o App");
        email.putExtra(Intent.EXTRA_TEXT, "Mensagem automática");

        email.setType("message/rfc822");

        startActivity(Intent.createChooser(email, "Escolha o App de Email"));
    }

    public void classificar(){

        Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.desenvolvimentoandroid.andregois.calendriodevacinao5");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }

    public void antirrabicaHumana(){

        Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.agdessoftware.vacina_antirabica_humana");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }
}


