package com.hfad.secret_message;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EncryptFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_encrypt, container, false);

        String message = EncryptFragmentArgs.fromBundle(requireArguments()).getMessage();

        String reversed = "";

        for (int i = message.length() - 1; i >= 0; i--)
            reversed +=message.charAt(i);

        TextView tvEncMessage = view.findViewById(R.id.encrypted_message);

        tvEncMessage.setText(reversed);

        return view;
    }
}