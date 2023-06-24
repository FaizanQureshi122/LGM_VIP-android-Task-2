package com.example.facedetectionmlkit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;


public class ResultDialog extends DialogFragment {

    Button okButton;
    TextView resultTV;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_resultdialog,container,false);


        okButton = view.findViewById(R.id.resultOKButton);
        resultTV = view.findViewById(R.id.resultTextView);

        String resultText = "";

        Bundle bundle = getArguments();

        resultText = bundle.getString(FaceDetection.RESULT_TEXT);
        resultTV.setText(resultText);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });
        return view;
    }

}
