package com.example.simpleeshop.ui.signup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.simpleeshop.R;

public class SignUpFragment extends Fragment {

    private SignUpViewModel signUpViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        signUpViewModel =
//                ViewModelProviders.of(this).get(SignUpViewModel.class);
        View root = inflater.inflate(R.layout.fragment_signup, container, false);
//        final TextView textView = root.findViewById(R.id.text_account_title);
        /*
        signUpViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        */

        return root;
    }


}