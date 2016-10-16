package ipiranga.fatec.androidcookbook;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SomeOtherActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button showSnackButton;
    private Button showDialogButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some_other);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        showDialogButton = (Button) findViewById(R.id.show_dialog);
        showSnackButton = (Button) findViewById(R.id.show_snack);

        toolbar.setTitle("Qualquer Activity");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case android.R.id.home:
                intent = NavUtils.getParentActivityIntent(this);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                NavUtils.navigateUpTo(this, intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.show_snack:
                //AQUI ALÉM DE DEMONSTRAR COMO EXIBIR UMA SNACK BAR, VOU MOSTRAR COMO DAR UMA AÇÃO
                //AO CLICAR NO TEXTO QUE FICA MAIS A DIREITA
                //ISSO É BEM COMUM, MUITAS VEZES NOS APPS AO REALIZARMOS UMA AÇÃO(ALTERAR OU EXCLUIR)
                //SOBE UMA SNACK BAR COM UM TEXTO A RESPEITO DA AÇÃO REALIZADA
                // E LÁ NO CANTO DIREITO UM TEXTO INFORMANDO QUE A AÇÃO PODE SER DESFEITA
                //EM APPS EM INGLÊS VEMOS undo E APPS EM PORT desfazer
                Snackbar.make(v, "Quer ser meu amigo ?", Snackbar.LENGTH_SHORT)
                        .setAction("Sim :)", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                                        Uri.parse("https://www.facebook.com/leonardo.turbiani"));
                                startActivity(browserIntent);
                            }
                        })
                        .show();

                break;
            case R.id.show_dialog:
                new AlertDialog.Builder(this)
                    .setTitle("Caixa de Diálogo")
                    .setMessage("Deseja ver o GitHub deste projeto ?")
                    .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            //O ANDROID TRABALHA COM UM ESQUEMA CHAMADO INTENÇÃO
                            //AQUI ESTOU FALANDO PARA O SO QUE TENHO A INTENÇÃO DE ABRIR O
                            //NAVEGADOR E COM UMA URL ESPECÍFICA
                            //O ANDROID SE ENCARREGA DE ACHAR QUEM TRATARÁ ESSA INTENÇÃO
                            //BEM PROVAVEL ELE ABRIR UMA CAIXA DE DIALOGO PEDINDO PARA QUE O USER
                            //ESCOLHA UMA DAS APLICAÇÕES INSTALADAS CAPAZES E RESOLVER UMA URL

                            Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("https://github.com/AndroidAddicted-SP/AndroidCookBook"));
                            startActivity(browserIntent);
                        }
                    })
                    .setNegativeButton("Não", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    })
                    .create()
                    .show();
                break;
        }


    }
}
