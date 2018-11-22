package com.example.anuradha.assig;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class firstFragment extends Fragment {

    ListView listView;
    String data[]={"premchandra","mahatma gandhi","tulsidas"};
public firstFragment()
{

}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_first, container, false);
        listView= (ListView) v.findViewById(R.id.list);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                                //thirdFragment sc=new thirdFragment();
                                                Bundle b = new Bundle();
                                                b.putInt("name key", position);
                                                secondFragment o = new secondFragment();
                                                o.setArguments(b);
                                                FragmentManager fm = getFragmentManager();
                                                FragmentTransaction ft = fm.beginTransaction();
                                                ft.replace(R.id.myLayout);
                                                ft.commit();
                                            }
                                        });

               /* if(position==0)
                {
                    secondFragment sec=new secondFragment();
                    sec.setArguments(b);
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.myLayout,sec);
                    ft.addToBackStack(null);
                    ft.commit();

                }
                if(position==1);
                {
                    thirdFragment sc=new thirdFragment();
                    sc.setArguments(b);
                    FragmentManager fm=getFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.myLayout,sc);
                    ft.addToBackStack(null);
                    ft.commit();

                }

            }
        });
        return v;
    }


}
