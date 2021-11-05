package FirstFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.androit1hw5.R;
import com.example.androit1hw5.databinding.FragmentFirstBinding;

import SecondFragment.SecondFragment;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        forward();
    }

    private void forward() {
        binding.btnForwardFirst.setOnClickListener(v -> {
            SecondFragment secondFragment = new SecondFragment();
            Bundle bundle = new Bundle();
            bundle.putString("key", binding.editTextFirst.getText().toString());
            secondFragment.setArguments(bundle);
            FragmentTransaction ft = getParentFragmentManager().beginTransaction();
            ft.replace(R.id.conteyner,secondFragment);
            ft.commit();
        });
    }
}