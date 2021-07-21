package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.dbdemo.adapter.RecyclerViewAdapter;
import com.example.dbdemo.data.MyDbHandler;
import com.example.dbdemo.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private  ArrayList<Contact> contactArrayList;
    private ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyDbHandler db = new MyDbHandler(MainActivity.this);

        // Creating a contact object for the db
        Contact harry = new Contact();
        harry.setPhoneNumber("9090909090");
        harry.setName("Harry");

        // Adding a contact to the db
        db.addContact(harry);

        // Creating a contact object for the db
        Contact larry = new Contact();
        larry.setPhoneNumber("9090459090");
        larry.setName("Larry");

        Contact harry2 = new Contact();
        harry2.setPhoneNumber("8090909090");
        harry2.setName("Rachel");

        // Adding a contact to the db
        db.addContact(harry2);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);
        db.addContact(harry);

//
//        // Adding a contact to the db
//        db.addContact(larry);
//
//        // Creating a contact object for the db
//        Contact tehri = new Contact();
//        tehri.setPhoneNumber("9090675409");
//        tehri.setName("Tehri");
//
//        // Adding a contact to the db
//        db.addContact(tehri);
//        Log.d("dbharry", "Id for tehri and larry are successfully added to the db");
//
//        tehri.setId(46);
//        tehri.setName("Changed Tehri");
//        tehri.setPhoneNumber("0000000000");
//        int affectedRows = db.updateContact(tehri);
//        Log.d("dbharry", "No of affected rows are: " + affectedRows);


        contactArrayList = new ArrayList<>();


        // Get all contacts
        List<Contact> contactList = db.getAllContacts();
        for(Contact contact: contactList){

            Log.d("dbharry", "\nId: " + contact.getId() + "\n" +
                    "Name: " + contact.getName() + "\n"+
                    "Phone Number: " + contact.getPhoneNumber() + "\n" );

            contactArrayList.add(contact);
        }
        //        Use your recyclerView
        recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this, contactArrayList);
        recyclerView.setAdapter(recyclerViewAdapter);


//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,contacts);
//        listView.setAdapter(arrayAdapter);
      //  Log.d("dbved","total "+db.getCount());
    }
}