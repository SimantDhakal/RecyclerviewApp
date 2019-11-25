package com.simant.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Tom Cruise", "9861169270", R.drawable.tom));
        contactsList.add(new Contacts("Hritik Roshan", "9845216619", R.drawable.hritik));
        contactsList.add(new Contacts("John Snow", "9845427361", R.drawable.john));
        contactsList.add(new Contacts("Tom Cruise", "9861169270", R.drawable.tom));
        contactsList.add(new Contacts("Hritik Roshan", "9845216619", R.drawable.hritik));
        contactsList.add(new Contacts("John Snow", "9845427361", R.drawable.john));
        contactsList.add(new Contacts("Tom Cruise", "9861169270", R.drawable.tom));
        contactsList.add(new Contacts("Hritik Roshan", "9845216619", R.drawable.hritik));
        contactsList.add(new Contacts("John Snow", "9845427361", R.drawable.john));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
