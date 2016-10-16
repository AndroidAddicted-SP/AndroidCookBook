package ipiranga.fatec.androidcookbook;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;

public class SnackDialogFragment extends AppCompatDialogFragment {

    public static SnackDialogFragment newInstance() {
        SnackDialogFragment dialog = new SnackDialogFragment();
        return dialog;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(getActivity());
        builder.setTitle(getActivity().getResources().getString(R.string.title_msg))
                .setMessage(getActivity().getResources().getString(R.string.dialog_msg))
                .setPositiveButton(getActivity().getResources().getString(R.string.yes), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://github.com/AndroidAddicted-SP/AndroidCookBook"));
                        startActivity(browserIntent);
                    }
                })
                .setNegativeButton(getActivity().getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        return builder.create();
    }
}
