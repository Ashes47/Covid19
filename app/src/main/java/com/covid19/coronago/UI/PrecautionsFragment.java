package com.covid19.coronago.UI;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.covid19.coronago.Adapters.ImgAdapter;
import com.covid19.coronago.Models.Img;
import com.covid19.coronago.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrecautionsFragment extends Fragment {

    public PrecautionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_precautions, container, false);

        final ArrayList<Img> imgArrayList = new ArrayList<>();
        imgArrayList.add(new Img(R.drawable.safe_greetings, "https://www.who.int/images/default-source/health-topics/coronavirus/safe-greetings.png"));
        imgArrayList.add(new Img(R.drawable.handshaking, "https://www.who.int/images/default-source/health-topics/coronavirus/handshaking.png"));
        imgArrayList.add(new Img(R.drawable.wearinggloves, "https://www.who.int/images/default-source/health-topics/coronavirus/wearing-gloves.png"));
        imgArrayList.add(new Img(R.drawable.blue1, "https://www.who.int/images/default-source/health-topics/coronavirus/social-media-squares/blue-1.png"));
        imgArrayList.add(new Img(R.drawable.blue2, "https://www.who.int/images/default-source/health-topics/coronavirus/social-media-squares/blue-2.png"));
        imgArrayList.add(new Img(R.drawable.blue3, "https://www.who.int/images/default-source/health-topics/coronavirus/social-media-squares/blue-3.png"));
        imgArrayList.add(new Img(R.drawable.blue4, "https://www.who.int/images/default-source/health-topics/coronavirus/social-media-squares/blue-4.png"));
        imgArrayList.add(new Img(R.drawable.stress1, "https://www.who.int/docs/default-source/coronaviruse/coping-with-stress.pdf"));
        imgArrayList.add(new Img(R.drawable.stress2, "https://www.who.int/docs/default-source/coronaviruse/helping-children-cope-with-stress-print.pdf"));
        imgArrayList.add(new Img(R.drawable.travel1, "https://www.who.int/images/default-source/health-topics/coronavirus/social-media-squares/1.png"));
        imgArrayList.add(new Img(R.drawable.travel2, "https://www.who.int/images/default-source/health-topics/coronavirus/social-media-squares/2.png"));
        imgArrayList.add(new Img(R.drawable.travel3, "https://www.who.int/images/default-source/health-topics/coronavirus/social-media-squares/3.png"));
        imgArrayList.add(new Img(R.drawable.travel4, "https://www.who.int/images/default-source/health-topics/coronavirus/social-media-squares/4.png"));
        imgArrayList.add(new Img(R.drawable.parent1, "https://www.who.int/docs/default-source/coronaviruse/healthy-parenting/english-tipsheet1-updated.pdf"));
        imgArrayList.add(new Img(R.drawable.parent2, "https://www.who.int/docs/default-source/coronaviruse/healthy-parenting/english-tip-2-covid-19-parenting.pdf"));
        imgArrayList.add(new Img(R.drawable.parent3, "https://www.who.int/docs/default-source/coronaviruse/healthy-parenting/english-tip-3-covid-19-parenting.pdf"));
        imgArrayList.add(new Img(R.drawable.parent4, "https://www.who.int/docs/default-source/coronaviruse/healthy-parenting/english-tip-4-covid-19-parenting.pdf"));
        imgArrayList.add(new Img(R.drawable.parent5, "https://www.who.int/docs/default-source/coronaviruse/healthy-parenting/english-tip-5-covid-19-parenting.pdf"));
        imgArrayList.add(new Img(R.drawable.parent6, "https://www.who.int/docs/default-source/coronaviruse/healthy-parenting/english-tip-6-covid-19-parenting.pdf"));
        imgArrayList.add(new Img(R.drawable.questions, "https://api.whatsapp.com/send?phone=41794752209&text=hi&source=&data="));

        ListView view = v.findViewById(R.id.recycler);
        ImgAdapter adapter = new ImgAdapter(getActivity(), imgArrayList);
        view.setAdapter(adapter);
        return v;
    }
}
