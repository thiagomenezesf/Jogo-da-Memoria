package com.example.jogodamemria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Runnable{
    private ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    private Button b17;
    private ArrayList<Carta> lista;
    private Handler handler;
    private int contadorJogada, contCerto=0, contErrado=0;
    private ImageButton primeiroBotaoTocado;
    private TextView t1, t2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primeiroBotaoTocado = new ImageButton(this);

        b1 = (ImageButton) findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2 = (ImageButton) findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3 = (ImageButton) findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4 = (ImageButton) findViewById(R.id.b4);
        b4.setOnClickListener(this);
        b5 = (ImageButton) findViewById(R.id.b5);
        b5.setOnClickListener(this);
        b6 = (ImageButton) findViewById(R.id.b6);
        b6.setOnClickListener(this);
        b7 = (ImageButton) findViewById(R.id.b7);
        b7.setOnClickListener(this);
        b8 = (ImageButton) findViewById(R.id.b8);
        b8.setOnClickListener(this);
        b9 = (ImageButton) findViewById(R.id.b9);
        b9.setOnClickListener(this);
        b10 = (ImageButton) findViewById(R.id.b10);
        b10.setOnClickListener(this);
        b11 = (ImageButton) findViewById(R.id.b11);
        b11.setOnClickListener(this);
        b12 = (ImageButton) findViewById(R.id.b12);
        b12.setOnClickListener(this);
        b13 = (ImageButton) findViewById(R.id.b13);
        b13.setOnClickListener(this);
        b14 = (ImageButton) findViewById(R.id.b14);
        b14.setOnClickListener(this);
        b15 = (ImageButton) findViewById(R.id.b15);
        b15.setOnClickListener(this);
        b16 = (ImageButton) findViewById(R.id.b16);
        b16.setOnClickListener(this);
        b17 = (Button) findViewById(R.id.b17);
        b17.setOnClickListener(this);


        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);

        lista = new ArrayList<Carta>();

        preparaJogo();
        carregaCartasBotao();
        contadorJogada=0;
    }

    public void preparaJogo(){
        Carta a1 = new Carta();
        a1.setTag("match1");
        a1.setImg(R.drawable.algas90);
        lista.add(a1);
        Carta a2 = new Carta();
        a2.setTag("match1");
        a2.setImg(R.drawable.algas90);
        lista.add(a2);

        Carta a3 = new Carta();
        a3.setTag("match2");
        a3.setImg(R.drawable.reflorestamento90);
        lista.add(a3);
        Carta a4 = new Carta();
        a4.setTag("match2");
        a4.setImg(R.drawable.reflorestamento90);
        lista.add(a4);

        Carta a5 = new Carta();
        a5.setTag("match3");
        a5.setImg(R.drawable.sustentabilidade90);
        lista.add(a5);
        Carta a6 = new Carta();
        a6.setTag("match3");
        a6.setImg(R.drawable.sustentabilidade90);
        lista.add(a6);

        Carta a7 = new Carta();
        a7.setTag("match4");
        a7.setImg(R.drawable.carroeletrico90);
        lista.add(a7);
        Carta a8 = new Carta();
        a8.setTag("match4");
        a8.setImg(R.drawable.carroeletrico90);
        lista.add(a8);

        Carta a9 = new Carta();
        a9.setTag("match5");
        a9.setImg(R.drawable.bicicleta90);
        lista.add(a9);
        Carta a10 = new Carta();
        a10.setTag("match5");
        a10.setImg(R.drawable.bicicleta90);
        lista.add(a10);

        Carta a11 = new Carta();
        a11.setTag("match6");
        a11.setImg(R.drawable.energiasolar90);
        lista.add(a11);
        Carta a12 = new Carta();
        a12.setTag("match6");
        a12.setImg(R.drawable.energiasolar90);
        lista.add(a12);

        Carta a13 = new Carta();
        a13.setTag("match7");
        a13.setImg(R.drawable.reciclagem90);
        lista.add(a13);
        Carta a14 = new Carta();
        a14.setTag("match7");
        a14.setImg(R.drawable.reciclagem90);
        lista.add(a14);

        Carta a15 = new Carta();
        a15.setTag("match8");
        a15.setImg(R.drawable.telhadoverde90);
        lista.add(a15);
        Carta a16 = new Carta();
        a16.setTag("match8");
        a16.setImg(R.drawable.telhadoverde90);
        lista.add(a16);
    }

    public void carregaCartasBotao(){
        Collections.shuffle(lista);

        b1.setImageResource(lista.get(0).getImg());
        b1.setTag(lista.get(0).getTag());
        b1.setBackgroundColor(Color.WHITE);

        b2.setImageResource(lista.get(1).getImg());
        b2.setTag(lista.get(1).getTag());
        b2.setBackgroundColor(Color.WHITE);

        b3.setImageResource(lista.get(2).getImg());
        b3.setTag(lista.get(2).getTag());
        b3.setBackgroundColor(Color.WHITE);

        b4.setImageResource(lista.get(3).getImg());
        b4.setTag(lista.get(3).getTag());
        b4.setBackgroundColor(Color.WHITE);

        b5.setImageResource(lista.get(4).getImg());
        b5.setTag(lista.get(4).getTag());
        b5.setBackgroundColor(Color.WHITE);

        b6.setImageResource(lista.get(5).getImg());
        b6.setTag(lista.get(5).getTag());
        b6.setBackgroundColor(Color.WHITE);

        b7.setImageResource(lista.get(6).getImg());
        b7.setTag(lista.get(6).getTag());
        b7.setBackgroundColor(Color.WHITE);

        b8.setImageResource(lista.get(7).getImg());
        b8.setTag(lista.get(7).getTag());
        b8.setBackgroundColor(Color.WHITE);

        b9.setImageResource(lista.get(8).getImg());
        b9.setTag(lista.get(8).getTag());
        b9.setBackgroundColor(Color.WHITE);

        b10.setImageResource(lista.get(9).getImg());
        b10.setTag(lista.get(9).getTag());
        b10.setBackgroundColor(Color.WHITE);

        b11.setImageResource(lista.get(10).getImg());
        b11.setTag(lista.get(10).getTag());
        b11.setBackgroundColor(Color.WHITE);

        b12.setImageResource(lista.get(11).getImg());
        b12.setTag(lista.get(11).getTag());
        b12.setBackgroundColor(Color.WHITE);

        b13.setImageResource(lista.get(12).getImg());
        b13.setTag(lista.get(12).getTag());
        b13.setBackgroundColor(Color.WHITE);

        b14.setImageResource(lista.get(13).getImg());
        b14.setTag(lista.get(13).getTag());
        b14.setBackgroundColor(Color.WHITE);

        b15.setImageResource(lista.get(14).getImg());
        b15.setTag(lista.get(14).getTag());
        b15.setBackgroundColor(Color.WHITE);

        b16.setImageResource(lista.get(15).getImg());
        b16.setTag(lista.get(15).getTag());
        b16.setBackgroundColor(Color.WHITE);

        handler = new Handler();
        handler.postDelayed(this, 1500);
    }

    public void travaBotoes(){
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b10.setEnabled(false);
        b11.setEnabled(false);
        b12.setEnabled(false);
        b13.setEnabled(false);
        b14.setEnabled(false);
        b15.setEnabled(false);
        b16.setEnabled(false);
    }

    public void destravarBotoes(){
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b10.setEnabled(true);
        b11.setEnabled(true);
        b12.setEnabled(true);
        b13.setEnabled(true);
        b14.setEnabled(true);
        b15.setEnabled(true);
        b16.setEnabled(true);
    }

    @Override
    public void onClick(View view) {
        contadorJogada++;
        if(view==b17){
            Intent i = new Intent(this, Explicacao.class);
            startActivity(i);
        }
        else if(contadorJogada>2){
            travaBotoes();
        }else{
            if(view==b1){
                b1.setImageResource(lista.get(0).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b1;
                }else{
                    comparaJogada(primeiroBotaoTocado, b1);
                }
            }
            if(view==b2){
                b2.setImageResource(lista.get(1).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b2;
                }else{
                    comparaJogada(primeiroBotaoTocado, b2);
                }
            }
            if(view==b3){
                b3.setImageResource(lista.get(2).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b3;
                }else{
                    comparaJogada(primeiroBotaoTocado, b3);
                }
            }
            if(view==b4){
                b4.setImageResource(lista.get(3).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b4;
                }else{
                    comparaJogada(primeiroBotaoTocado, b4);
                }
            }
            if(view==b5){
                b5.setImageResource(lista.get(4).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b5;
                }else{
                    comparaJogada(primeiroBotaoTocado, b5);
                }
            }
            if(view==b6){
                b6.setImageResource(lista.get(5).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b6;
                }else{
                    comparaJogada(primeiroBotaoTocado, b6);
                }
            }
            if(view==b7){
                b7.setImageResource(lista.get(6).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b7;
                }else{
                    comparaJogada(primeiroBotaoTocado, b7);
                }
            }
            if(view==b8){
                b8.setImageResource(lista.get(7).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b8;
                }else{
                    comparaJogada(primeiroBotaoTocado, b8);
                }
            }
            if(view==b9){
                b9.setImageResource(lista.get(8).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b9;
                }else{
                    comparaJogada(primeiroBotaoTocado, b9);
                }
            }
            if(view==b10){
                b10.setImageResource(lista.get(9).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b10;
                }else{
                    comparaJogada(primeiroBotaoTocado, b10);
                }
            }
            if(view==b11){
                b11.setImageResource(lista.get(10).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b11;
                }else{
                    comparaJogada(primeiroBotaoTocado, b11);
                }
            }
            if(view==b12){
                b12.setImageResource(lista.get(11).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b12;
                }else{
                    comparaJogada(primeiroBotaoTocado, b12);
                }
            }
            if(view==b13){
                b13.setImageResource(lista.get(12).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b13;
                }else{
                    comparaJogada(primeiroBotaoTocado, b13);
                }
            }
            if(view==b14){
                b14.setImageResource(lista.get(13).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b14;
                }else{
                    comparaJogada(primeiroBotaoTocado, b14);
                }
            }
            if(view==b15){
                b15.setImageResource(lista.get(14).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b15;
                }else{
                    comparaJogada(primeiroBotaoTocado, b15);
                }
            }
            if(view==b16){
                b16.setImageResource(lista.get(15).getImg());
                if (contadorJogada==1){
                    primeiroBotaoTocado=b16;
                }else{
                    comparaJogada(primeiroBotaoTocado, b16);
                }
            }
        }
        t1.setText(String.valueOf(contCerto));
        t2.setText(String.valueOf(contErrado));
    }

    public void comparaJogada(ImageButton primeiro, ImageButton segundo){
        if (primeiro.getTag().toString().compareToIgnoreCase(segundo.getTag().toString())==0 && primeiro!=segundo){
            primeiro.setEnabled(false);
            segundo.setEnabled(false);
            primeiro.setBackgroundColor(Color.GREEN);
            segundo.setBackgroundColor(Color.GREEN);
            contCerto++;
        }else{
            primeiro.setBackgroundColor(Color.RED);
            segundo.setBackgroundColor(Color.RED);
            contErrado++;
            Handler h = new Handler();
            h.postDelayed(new Runnable() {
                @Override
                public void run() {
                    primeiro.setImageResource(R.drawable.fundo);
                    segundo.setImageResource(R.drawable.fundo);
                    primeiro.setBackgroundColor(Color.WHITE);
                    segundo.setBackgroundColor(Color.WHITE);
                }
            }, 500);
        }
        contadorJogada = 0;
    }

    @Override
    public void run() {
        b1.setImageResource(R.drawable.fundo);
        b2.setImageResource(R.drawable.fundo);
        b3.setImageResource(R.drawable.fundo);
        b4.setImageResource(R.drawable.fundo);
        b5.setImageResource(R.drawable.fundo);
        b6.setImageResource(R.drawable.fundo);
        b7.setImageResource(R.drawable.fundo);
        b8.setImageResource(R.drawable.fundo);
        b9.setImageResource(R.drawable.fundo);
        b10.setImageResource(R.drawable.fundo);
        b11.setImageResource(R.drawable.fundo);
        b12.setImageResource(R.drawable.fundo);
        b13.setImageResource(R.drawable.fundo);
        b14.setImageResource(R.drawable.fundo);
        b15.setImageResource(R.drawable.fundo);
        b16.setImageResource(R.drawable.fundo);
        contadorJogada=0;
        destravarBotoes();
    }

}