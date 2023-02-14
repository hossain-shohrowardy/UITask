package com.example.uitask.View.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.uitask.Adapter.HomeProductAdapter;
import com.example.uitask.Adapter.HomeProductHighlightAdapter;
import com.example.uitask.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
   private View view;
    private RecyclerView productRecyclerView;
    private RecyclerView favouriteRecyclerView;
    private List productList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_home, container, false);
        productList=new ArrayList<Integer>();
        productList.add(1);
        productList.add(2);
        productList.add(3);
        productList.add(4);
        productList.add(5);
        productList.add(6);
        HomeProductAdapter homeProductAdapter=new HomeProductAdapter(productList);
        HomeProductHighlightAdapter homeProductHighlightAdapter= new HomeProductHighlightAdapter(productList);
        productRecyclerView= (RecyclerView)view.findViewById(R.id.product_recyclerview);
        favouriteRecyclerView= (RecyclerView)view.findViewById(R.id.highlight_recyclerview);

        productRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        productRecyclerView.setAdapter(homeProductAdapter);

        favouriteRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        favouriteRecyclerView.setAdapter(homeProductHighlightAdapter);

        return view;
    }
}