package ThirdFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androit1hw5.R;
import com.example.androit1hw5.databinding.FragmentFirstBinding;
import com.example.androit1hw5.databinding.FragmentThirdBinding;

import FourthFragment.FourFragment;

public class ThirdFragment extends Fragment {
private FragmentThirdBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentThirdBinding.inflate(inflater ,container,false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.editTextThird.setText(getArguments().getString("key2"));
        forward();
    }

    private void forward (){
        binding.btnForwardThird.setOnClickListener(view -> {
            FourFragment fourFragment = new FourFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key3",binding.editTextThird.getText().toString());
            fourFragment.setArguments(bundle);
            FragmentTransaction ft = getParentFragmentManager().beginTransaction();
            ft.replace(R.id.conteyner,fourFragment);
            ft.commit();
        });
    }
}
