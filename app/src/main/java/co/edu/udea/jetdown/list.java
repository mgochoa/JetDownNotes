package co.edu.udea.jetdown;


import android.app.ListFragment;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class list extends android.support.v4.app.ListFragment implements AdapterView.OnItemClickListener {


    //Lista del root
    String[] rootDirectory= Environment.getRootDirectory().list();
    public list() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //Create adapter with array-string form a normal array
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, rootDirectory);


        //Set adapter
        setListAdapter(adapter);
        //Set event onClick
        getListView().setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String planetName = rootDirectory[position];

        //Show message in toast
        Toast.makeText(getActivity(), "This planet is: " + planetName, Toast.LENGTH_SHORT).show();
        Log.d("Hi","This planet is: " + planetName );

    }
}
