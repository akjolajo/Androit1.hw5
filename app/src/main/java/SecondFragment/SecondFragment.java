package SecondFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androit1hw5.R;
import com.example.androit1hw5.databinding.FragmentFirstBinding;
import com.example.androit1hw5.databinding.FragmentSecondBinding;
import com.example.androit1hw5.databinding.FragmentThirdBinding;

import ThirdFragment.ThirdFragment;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.editTextSecond.setText(getArguments().getString("key"));
        forward();
    }


    private void forward() {
        binding.btnForwardSecond.setOnClickListener(view -> {
            ThirdFragment thirdFragment = new ThirdFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key2",binding.editTextSecond.getText().toString());
            thirdFragment.setArguments(bundle);
            FragmentTransaction ft2 = getParentFragmentManager().beginTransaction();
            ft2.replace(R.id.conteyner,thirdFragment);
            ft2.commit();
        });
}
}