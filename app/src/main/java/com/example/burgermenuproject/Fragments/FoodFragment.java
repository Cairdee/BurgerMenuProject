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

public class FoodFragment extends Fragment {

    Adapter adapter;

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycleView);

        List<Item> items = new ArrayList<Item>();

        items.add(new Item("Babi Guling","Babi guling adalah masakan khas Bali, dibuat dari seekor babi utuh dimana sebelum proses penggulingan isi perut dibersihkan terlebih dahulu. Sebabnya disebut dengan babi guling karena dalam proses pembuatannya, diguling-gulingkan di atas bara api.","https://upload.wikimedia.org/wikipedia/commons/0/08/Babi_guling.jpg"));
        items.add(new Item("Ayam Betutu","made of a Chocolatte with milk and iceBetutu merupakan makanan khas Bali. Terbuat dari ayam atau bebek yang dimasak secara utuh menggunakan bumbu rempah khas Bali.","https://indonesiakaya.com/wp-content/uploads/2023/04/ab_Artboard_1.jpg"));
        items.add(new Item("Lawar","Lawar kuwir adalah salah satu modifikasi yang dilakukan terhadap masakan Bali. Masakan ini diolah rajangan halus rebusan daging dan nangka muda, yang dicampur dengan parutan kelapa bakar dan diuleni dengan bumbu lengkap.","https://cdn.idntimes.com/content-images/community/2018/05/lawar-e7d7b0845e91c8f0aa784801b261892d_600x400.jpg"));
        items.add(new Item("Sambal Matah","Sambal matah adalah bumbu tradisional Bali yang dapat ditemukan di seluruh daerah Provinsi Bali. Seperti namanya, sambal matah merupakan jenis sambal mentah yang disajikan tanpa dimasak.","https://assets-a1.kompasiana.com/items/album/2023/07/08/cara-membuat-sambal-matah-64a957af4addee6498454bf2.jpg"));
        items.add(new Item("Sate Lilit","Sate Lilit adalah sebuah varian sate asal Bali. Sate ini terbuat dari daging babi, ikan, ayam, daging sapi, atau bahkan kura-kura yang dicincang, kemudian dicampur dengan parutan kelapa, santan, jeruk nipis, bawang merah, dan merica.","https://www.goodnewsfromindonesia.id/uploads/post/large-sate-lilit-olahan-kuliner-sate-khas-bali-yang-wajib-dicicipi-34fce74024ad3141ca40b15f.jpg"));
        items.add(new Item("Rujak Kuah Pindang Bali","Rujak Kuah Pindang adalah salah satu jenis rujak khas dan populer di Bali. Rujak ini berisi kombinasi dari beberapa buah-buahan segar yang hampir mirip dengan rujak manis atau rujak gula.","https://www.baliekbis.com/wp-content/uploads/2020/05/9-1-RujakKuahPindang-By-madewedastra.jpg"));

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new Adapter(getActivity().getApplicationContext(), items));

        adapter = new Adapter(getActivity(),items);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
