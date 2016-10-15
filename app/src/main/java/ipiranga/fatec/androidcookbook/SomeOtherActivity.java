package ipiranga.fatec.androidcookbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NavUtils;
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
                //colocar a snackBar aqui nessa ação plisssss :)
                break;
            case R.id.show_dialog:
                //colocar dialog aqui nessa ação plisssss :)
                break;
        }


    }
}
