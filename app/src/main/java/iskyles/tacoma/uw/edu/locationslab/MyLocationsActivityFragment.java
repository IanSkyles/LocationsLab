package iskyles.tacoma.uw.edu.locationslab;

import android.location.Location;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Ian Skyles on 5/16/2016.
 */
public class MyLocationsActivityFragment extends Fragment {

    private TextView mLocationTextView;

    public MyLocationsActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_my_locations, container, false);
        mLocationTextView = (TextView) v.findViewById(R.id.location_text);
        Location location = ((MyLocationsActivity) getActivity()).getCurrentLocation();
        updateView(location);
        return v;
    }

    public void updateView(Location location) {
        if (location != null)
            mLocationTextView.setText(location.toString());
    }

}
