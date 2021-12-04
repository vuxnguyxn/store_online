package com.example.store_online.dialog;import android.app.Activity;import android.graphics.drawable.ColorDrawable;import android.view.LayoutInflater;import android.view.View;import android.widget.Button;import android.widget.TextView;import androidx.appcompat.app.AlertDialog;import androidx.constraintlayout.widget.ConstraintLayout;import com.example.store_online.R;public class NotificationDialog {    private Activity activity;    private AlertDialog dialog;    private View view;    public NotificationDialog(Activity myActivity) {        activity = myActivity;    }    public void startErrorDialog(String message) {        AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.AlerDialogTheme);        view = LayoutInflater.from(activity).inflate(                R.layout.dialog_error,activity.findViewById(R.id.layoutCustomizeDialog));        builder.setView(view);        TextView txtMessage = view.findViewById(R.id.txtMessage_dialog);        builder.setCancelable(false);        txtMessage.setText(message);        dialog = builder.create();        Button btnError = view.findViewById(R.id.btn_error_dialog);        btnError.setOnClickListener(new View.OnClickListener() {            @Override            public void onClick(View v) {                dialog.dismiss();            }        });        if (dialog.getWindow() != null) {            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));        }        dialog.show();    }    public void startSuccessfulDialog(String message) {        AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.AlerDialogTheme);        view = LayoutInflater.from(activity).inflate(                R.layout.dialog_successful,activity.findViewById(R.id.layoutCustomizeDialog));        builder.setView(view);        TextView txtMessage = view.findViewById(R.id.txtMessage_dialog);        builder.setCancelable(false);        txtMessage.setText(message);        dialog = builder.create();        Button btnError = view.findViewById(R.id.btn_error_dialog);        btnError.setOnClickListener(new View.OnClickListener() {            @Override            public void onClick(View v) {                dialog.dismiss();            }        });        if (dialog.getWindow() != null) {            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));        }        dialog.show();    }    public void startLoadingDialog() {        AlertDialog.Builder builder = new AlertDialog.Builder(activity);        LayoutInflater inflater = activity.getLayoutInflater();        builder.setView(inflater.inflate(R.layout.dialog_loading, null));        builder.setCancelable(false);        dialog = builder.create();        if (dialog.getWindow() != null) {            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));        }        dialog.show();    }    public void endLoadingDialog() {        dialog.dismiss();    }}