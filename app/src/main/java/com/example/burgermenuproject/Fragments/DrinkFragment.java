package com.example.burgermenuproject.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.burgermenuproject.Adapter;
import com.example.burgermenuproject.R;
import com.example.burgermenuproject.Item;

import java.util.ArrayList;
import java.util.List;

public class DrinkFragment extends Fragment {

    Adapter adapter;

    public DrinkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycleView);

        List<Item> items = new ArrayList<Item>();

        items.add(new Item("Es Tambring","Tambring adalah sebuah minuman khas Bali yang berbahan dasar serutan kelapa muda yang dikombinasi dengan rasa asam jawa. Rasa segar dari air kelapa apa lagi jika di  tambahkan sirup asam jawa yang dicampur putih telur membuat minuman ini terasa sangat khas.","https://www.kintamani.id/wp-content/uploads/Es-Tambring-Khas-Bali-2.jpg"));
        items.add(new Item("Es Daluman","Es daluman adalah es cincau khas Bali yang rasanya manis dan segar. Seperti es cincau pada umumnya, es daluman juga mencampur potongan cincau dengan santan segar, gula merah, sirup, dan serutan es.","https://asset.kompas.com/crops/fehrlKmc4cWZ4AcMot5J6WpWDGU=/0x0:1000x667/750x500/data/photo/2022/04/07/624e3ecea29ac.jpg"));
        items.add(new Item("LohLoh CemCem","Loloh cemcem adalah minuman tradisional berupa jamu khas daerah Bali yang terbuat dari sari daun cemcem atau kedongdong hutan.","https://sonorabali.com/wp-content/uploads/2020/12/Loloh-Cemcem-by-balikami.jpg"));
        items.add(new Item("Es Kuwut","Es kuwut merupakan sejenis minuman koktail dingin khas Bali yang terbuat dari air kelapa yang dicampur dengan serutan kelapa, serutan melon atau timun, biji selasih, perasan jeruk nipis, sirup melon, es batu dan terkadang ditambahkan susu, santan, atau nata de Coco.","https://img-global.cpcdn.com/recipes/9450dfdd9a53cd04/680x482cq70/es-kuwut-timun-natadecoco-foto-resep-utama.jpg"));
        items.add(new Item("Tuak Manis","Tuak merupakan minuman yang di sadap dari pohon enau yang di didiamkan beberapa jam. Adakalanya tuak ini terasa manis dan tidak memabukkan.","https://cdn.zonatimes.com/2021/01/manfaat-tuak-manis-dan-cara-sederhana-membuatnya.jpg"));
        items.add(new Item("Kopi Bali","Kopi Bali adalah biji kopi yang berasal dari pegunungan Kintamani di Bali pada ketinggian ±1500 masl","https://www.nescafe.com/id/sites/default/files/Kopi%20Kintamani%20Kopi%20Arabika%20dengan%20Cita%20Rasa%20yang%20Unik.jpg"));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new Adapter(getActivity().getApplicationContext(), items));

        adapter = new Adapter(getActivity(),items);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
