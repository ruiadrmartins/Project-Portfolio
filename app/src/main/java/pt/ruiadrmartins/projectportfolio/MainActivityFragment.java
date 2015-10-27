package pt.ruiadrmartins.projectportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    @Bind({ R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6 })
    List<Button> buttons;

    final private String message = "This button will launch ";

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }

    @OnClick({ R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6 })
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button1:
                Toast.makeText(getActivity(), message + getResources().getString(R.string.proj1), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(getActivity(), message + getResources().getString(R.string.proj2), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(getActivity(), message + getResources().getString(R.string.proj3), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(getActivity(), message + getResources().getString(R.string.proj4), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(getActivity(), message + getResources().getString(R.string.proj5), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                Toast.makeText(getActivity(), message + getResources().getString(R.string.proj6), Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
