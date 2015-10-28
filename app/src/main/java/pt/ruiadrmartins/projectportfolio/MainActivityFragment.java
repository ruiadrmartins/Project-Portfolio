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

    final private String message = "This button will launch ";
    @Bind({ R.id.spotifyStreamerButton, R.id.scoresAppButton, R.id.libraryAppButton, R.id.buildItBiggerButton, R.id.xyzReaderButton, R.id.capstoneButton })
    List<Button> buttons;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }

    @OnClick({ R.id.spotifyStreamerButton, R.id.scoresAppButton, R.id.libraryAppButton, R.id.buildItBiggerButton, R.id.xyzReaderButton, R.id.capstoneButton })
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.spotifyStreamerButton:
                Toast.makeText(getActivity(), message + getResources().getString(R.string.spotifyStreamerProject), Toast.LENGTH_SHORT).show();
                break;
            case R.id.scoresAppButton:
                Toast.makeText(getActivity(), message + getResources().getString(R.string.scoresAppProject), Toast.LENGTH_SHORT).show();
                break;
            case R.id.libraryAppButton:
                Toast.makeText(getActivity(), message + getResources().getString(R.string.libraryAppProject), Toast.LENGTH_SHORT).show();
                break;
            case R.id.buildItBiggerButton:
                Toast.makeText(getActivity(), message + getResources().getString(R.string.buildItBiggerProject), Toast.LENGTH_SHORT).show();
                break;
            case R.id.xyzReaderButton:
                Toast.makeText(getActivity(), message + getResources().getString(R.string.xyzReaderProject), Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstoneButton:
                Toast.makeText(getActivity(), message + getResources().getString(R.string.capstoneProject), Toast.LENGTH_SHORT).show();
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
