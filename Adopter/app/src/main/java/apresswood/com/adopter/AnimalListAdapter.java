package apresswood.com.adopter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class AnimalListAdapter extends BaseAdapter {


    private List<PetProfile> petProfile;
    private MainActivity mainActivity;

    private AnimalListAdapter(List<PetProfile> petProfile, MainActivity mainActivity) {
        this.petProfile = petProfile;
        this.mainActivity = mainActivity;
    }

    @Override
    public int getCount() {
        return petProfile.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View rowView = convertView;

        //TODO: lots of stuff

        return rowView;
    }
}
