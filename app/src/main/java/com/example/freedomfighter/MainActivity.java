package com.example.freedomfighter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview);
        final ArrayList<String> arrayList=new ArrayList<>();
        final ArrayList<String> urlsList = new ArrayList<String>();

        arrayList.add("SardarVallabhbhai Patel");
        arrayList.add("Jawaharlal Nehru");
        arrayList.add("Mahatma Gandhi");
        arrayList.add("Tantia Tope");
        arrayList.add("Nana Sahib");
        arrayList.add("Lal Bahadur Shastri");
        arrayList.add("Subhash Chandra Bose");
        arrayList.add("Sukhdev");
        arrayList.add("Kunwar Singh");
        arrayList.add("Rani Lakshmi Bai");
        arrayList.add("Bal Gangadhar Tilak");
        arrayList.add("LalaLajpat Rai");
        arrayList.add("Mangal Pandey");
        arrayList.add("Vinayak Damodar Savarkar");
        arrayList.add("C. Rajagopalachari");
        arrayList.add("Bhagat Singh");
        arrayList.add("Dadabhai Naoroji");
        arrayList.add("Ram Prasad Bismil");
        arrayList.add("K. M. Munshi");
        arrayList.add("Bipin Chandra Pal");

        urlsList.add("https://en.wikipedia.org/wiki/Vallabhbhai_Patel");
        urlsList.add("https://en.wikipedia.org/wiki/Jawaharlal_Nehru");
        urlsList.add("https://en.wikipedia.org/wiki/Mahatma_Gandhi");
        urlsList.add("https://en.wikipedia.org/wiki/Tatya_Tope");
        urlsList.add("https://en.wikipedia.org/wiki/Nana_Saheb");
        urlsList.add("https://en.wikipedia.org/wiki/Lal_Bahadur_Shastri");
        urlsList.add("https://en.wikipedia.org/wiki/Subhas_Chandra_Bose");
        urlsList.add("https://en.wikipedia.org/wiki/Sukhdev_Thapar");
        urlsList.add("https://en.wikipedia.org/wiki/Kunwar_Singh");
        urlsList.add("https://en.wikipedia.org/wiki/Rani_of_Jhansi");
        urlsList.add("https://en.wikipedia.org/wiki/Bal_Gangadhar_Tilak");
        urlsList.add("https://en.wikipedia.org/wiki/Lajpat_Nagar");
        urlsList.add("https://en.wikipedia.org/wiki/Mangal_Pandey");
        urlsList.add("https://en.wikipedia.org/wiki/Vinayak_Damodar_Savarkar");
        urlsList.add("https://en.wikipedia.org/wiki/C._Rajagopalachari");
        urlsList.add("https://en.wikipedia.org/wiki/Bhagat_Singh");
        urlsList.add("https://en.wikipedia.org/wiki/Dadabhai_Naoroji");
        urlsList.add("https://en.wikipedia.org/wiki/Ram_Prasad_Bismil");
        urlsList.add("https://en.wikipedia.org/wiki/Kanaiyalal_Maneklal_Munshi");
        urlsList.add("https://en.wikipedia.org/wiki/Bipin_Chandra_Pal");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                String url = urlsList.get(i);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}