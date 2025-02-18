package com.example.jogodamemria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Explicacao extends AppCompatActivity implements View.OnClickListener {
    private ImageButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8;
    private Button bt0;
    private TextView tx1;
    private ImageView imgv1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explicacao);

        imgv1 = (ImageView) findViewById(R.id.imgv1);

        tx1 = (TextView) findViewById(R.id.tx1);

        bt0 = (Button) findViewById(R.id.bt0);
        bt0.setOnClickListener(this);

        bt1 = (ImageButton) findViewById(R.id.bt1);
        bt1.setOnClickListener(this);
        bt2 = (ImageButton) findViewById(R.id.bt2);
        bt2.setOnClickListener(this);
        bt3 = (ImageButton) findViewById(R.id.bt3);
        bt3.setOnClickListener(this);
        bt4 = (ImageButton) findViewById(R.id.bt4);
        bt4.setOnClickListener(this);
        bt5 = (ImageButton) findViewById(R.id.bt5);
        bt5.setOnClickListener(this);
        bt6 = (ImageButton) findViewById(R.id.bt6);
        bt6.setOnClickListener(this);
        bt7 = (ImageButton) findViewById(R.id.bt7);
        bt7.setOnClickListener(this);
        bt8 = (ImageButton) findViewById(R.id.bt8);
        bt8.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view==bt0){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }else if (view==bt1){
            imgv1.setImageResource(R.drawable.algasfundo);
            tx1.setText("As algas são responsáveis por produzir até 90% do oxigênio do planeta. Além disso, algumas espécies capturam carbono, outras são fontes de proteínas e polissacarídeos para seres que vivem no ambiente aquático. Ainda, as algas podem ser importantes comercialmente. Por todos esses motivos, a sua existência deve ser preservada.");
        }else if (view==bt2){
            imgv1.setImageResource(R.drawable.reflorestamentofundo);
            tx1.setText("O reflorestamento é uma ótima prática sustentável. Em áreas urbanas ele melhora o clima, uma vez que espaços verdes combatem o calor e aumentam as áreas de sombra. Além disso, o reflorestamento melhora a qualidade do ar das cidades, pois as árvores resgatam o CO2 liberado pelos carros no tráfego e evita o aquecimento global.");
        }else if (view==bt3){
            imgv1.setImageResource(R.drawable.sustentabilidadefundo);
            tx1.setText("Sustentabilidade é a capacidade de uso consciente dos recursos naturais sem comprometer o bem-estar das gerações futuras. Seu objetivo principal é encontrar o equilíbrio entre o desenvolvimento econômico e a preservação ambiental.");
        }else if (view==bt4){
            imgv1.setImageResource(R.drawable.carroeletricofundo);
            tx1.setText("Os veículos elétricos e suas baterias são um passo crucial para um futuro mais sustentável no transporte, pois oferecem uma alternativa mais limpa e ecológica aos carros tradicionais com motor de combustão. A operação em resulta em significativamente menos emissões de gases de efeito estufa.");
        }else if (view==bt5){
            imgv1.setImageResource(R.drawable.bicicletafundo);
            tx1.setText("A bicicleta é meio de transporte sustentável, econômico e eficiente. Esta ajuda a diminuir a emissão de gases poluentes, trazendo hábitos saudáveis para as pessoas que usam esse meio de transporte, diminuindo o fluxo de carros e facilitando a locomoção.");
        }else if (view==bt6){
            imgv1.setImageResource(R.drawable.energiasolarfundo);
            tx1.setText("A energia solar é uma ótima alternativa para a sustentabilidade, já que sua matéria prima é originada da natureza, ou seja, a captação de energia elétrica é feita pela luz do sol. Desta forma, os recursos naturais podem ser usados de forma abundante e renovável, não afetando o meio ambiente.");
        }else if (view==bt7){
            imgv1.setImageResource(R.drawable.reciclagemfundo);
            tx1.setText("A reciclagem é o processo de reaproveitamento de resíduos para a produção de um novo produto. Dessa forma, ele serve de matéria-prima, fechando seu ciclo de fabricação. Esse procedimento tem como objetivo a redução de resíduos, por isso é de tamanha importância, apesar de não ser a única medida para isso.");
        }else if (view==bt8){
        imgv1.setImageResource(R.drawable.telhadoverdefundo);
        tx1.setText("Telhado verde é uma cobertura de plantas e um telhado ecológico que tem ganhado cada vez mais espaço nas construções. Composto por vegetação, ele é mais que uma cobertura verde e envolve técnicas de impermeabilização e de plantio que devem ser feitas por um profissional qualificado.");
        }
    }
}
