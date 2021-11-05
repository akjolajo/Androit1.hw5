package FourthFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androit1hw5.R;
import com.example.androit1hw5.databinding.FragmentFourBinding;
import com.example.androit1hw5.databinding.FragmentThirdBinding;

import FivethFragment.FivethFragment;

public class FourFragment extends Fragment {
private FragmentFourBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFourBinding.inflate(inflater ,container,false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.editTextFour.setText(getArguments().getString("key3"));
        forward();
    }

    private void forward (){
        binding.btnForwardFour.setOnClickListener(view -> {
            FivethFragment fivethFragment = new FivethFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key4", binding.editTextFour.getText().toString());
            fivethFragment.setArguments(bundle);
            FragmentTransaction ft5 = getParentFragmentManager().beginTransaction();
            ft5.replace(R.id.conteyner,fivethFragment);
            ft5.commit();

        });
    }
}