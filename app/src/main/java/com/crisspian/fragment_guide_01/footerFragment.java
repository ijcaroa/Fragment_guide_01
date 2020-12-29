package com.crisspian.fragment_guide_01;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.crisspian.fragment_guide_01.databinding.FragmentQuestionBinding;


public class footerFragment extends Fragment {


    private FragmentQuestionBinding mBinding;

    public footerFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentQuestionBinding.inflate(getLayoutInflater());
        // Inflate the layout for this fragment
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = mBinding.radioGroup.indexOfChild(mBinding.radioGroup.findViewById(checkedId));
                switch (index) {
                    case 0:
                        mBinding.textVquestion.setText("Ingrésela");
                        break;
                    case 1:
                        mBinding.textVquestion.setText("Solicítela");
                        break;
                    default:
                        break;
                }
            }
        });

    }
}