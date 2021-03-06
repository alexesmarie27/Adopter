package apresswood.com.adopter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import apresswood.com.adopter.data.PetProfile;

public class AnimalListAdapter extends BaseAdapter {
    private List<PetProfile> petProfiles;
    private MainActivity mainActivity;

    AnimalListAdapter(List<PetProfile> petProfiles, MainActivity mainActivity) {
        this.petProfiles = petProfiles;
        this.mainActivity = mainActivity;
    }

    @Override
    public int getCount() {
        return petProfiles.size();
    }

    @Override
    public Object getItem(int position) {
        return petProfiles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        PetProfile petProfile = petProfiles.get(position);
        View rowView = convertView;
        ImageView cardImage;
        TextView cardDescription;
        TextView cardName;
        TextView cardAge;
        TextView cardLocation;

        if (rowView == null) {
            LayoutInflater inflater = mainActivity.getLayoutInflater();
            rowView = inflater.inflate(R.layout.item, parent, false);

            cardImage = rowView.findViewById(R.id.card_image);
            cardDescription = rowView.findViewById(R.id.card_description);
            cardName = rowView.findViewById(R.id.name);
            cardAge = rowView.findViewById(R.id.age);
            cardLocation = rowView.findViewById(R.id.location);

            cardImage.setImageDrawable(petProfile.getProfilePicture());
            cardDescription.setText(petProfile.getDescription());
            cardName.setText(petProfile.getName() + ",");
            cardAge.setText(Integer.toString(petProfile.getAge()));
            cardLocation.setText(petProfile.getLocation());

            Glide.with(mainActivity);//.load(petProfile.getProfilePicture()).into(cardImage);
        }

        return rowView;
    }
}
