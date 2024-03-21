package com.example.diabetessolution.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.diabetessolution.R;

public class FragHome extends Fragment {
    private View view;

    private String TAG = "프래그먼트";

    private TextView textView1;

    private String userID,name=null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView");
        view = inflater.inflate(R.layout.frag_home, container, false);
        
        textView1 = view.findViewById(R.id.textView1); //환영인사
        
        //유저 이름하고, 아이디 (이메일)받는 방법
        Intent intent = requireActivity().getIntent();
        name = intent.getStringExtra("UserName");
        userID = intent.getStringExtra("UserID");

        textView1.setText(name + "님 안녕하세요");


        return view;
    }

}
