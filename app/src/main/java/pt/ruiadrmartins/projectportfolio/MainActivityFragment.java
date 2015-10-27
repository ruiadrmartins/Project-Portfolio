package pt.ruiadrmartins.projectportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    final private String message = "This button will launch ";

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        button1 = (Button) rootView.findViewById(R.id.button1);
        button2 = (Button) rootView.findViewById(R.id.button2);
        button3 = (Button) rootView.findViewById(R.id.button3);
        button4 = (Button) rootView.findViewById(R.id.button4);
        button5 = (Button) rootView.findViewById(R.id.button5);
        button6 = (Button) rootView.findViewById(R.id.button6);

        //
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

        return rootView;
    }

    @Override
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
}
