package com.prakriti.simplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity implements AdapterView.OnItemClickListener {
// extends from ListActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        String[] courses = new String[] {"Android Developer Course", "Java Developer Course", "Linux Mastery Course", "C++ For Beginners",
                "Python Programming Course", "Web Developer Course For Beginners"};
        // pass the layout with the textview as resource parameter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.activity_main, courses);
        setListAdapter(adapter);

        // assign listview to an object to set listener
        ListView listView = getListView();
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String clickedItem = parent.getItemAtPosition(position).toString();
        // parent refers to the listview -> adapter view
        Toast.makeText(this, "Course added: " + clickedItem, Toast.LENGTH_SHORT).show();;
    }

}