package ipiranga.fatec.androidcookbook;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SomeOtherActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_FRAGMENT = "alert";

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
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.show_snack:
                Snackbar.make(view, "Quer ser meu amigo ?", Snackbar.LENGTH_SHORT)
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
                FragmentManager fm = getSupportFragmentManager();
                SnackDialogFragment fragment = SnackDialogFragment.newInstance();
                fragment.show(fm, EXTRA_FRAGMENT);
                break;
        }


    }
}
