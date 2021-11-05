package FivethFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androit1hw5.R;
import com.example.androit1hw5.databinding.FragmentFirstBinding;
import com.example.androit1hw5.databinding.FragmentFivethBinding;
import com.example.androit1hw5.databinding.FragmentFourBinding;

public class FivethFragment extends Fragment {
private FragmentFivethBinding binding ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFivethBinding.inflate(inflater ,container,false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       binding.editTextFive.setText(getArguments().getString("key4"));
        }
    }
