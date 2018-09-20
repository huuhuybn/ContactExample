package vn.edu.poly.contactexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import vn.edu.poly.contactexample.adapter.ContactAdapter;
import vn.edu.poly.contactexample.model.MyContact;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class ContactActivity extends AppCompatActivity {

    private Button btnLoadContacts;
    private RecyclerView lvListContact;

    private ContactAdapter contactAdapter;
    private List<MyContact> myContacts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        initViews();
        initData();


    }

    private void initData() {
        // khoi tao du lieu fake test RecycleView
        myContacts = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            MyContact myContact = new MyContact();
            myContact.name = "Huy Nguyen";
            myContact.phone = "0919030190";

            // Bo MyContact vao arrayList
            myContacts.add(myContact);
        }
        contactAdapter = new ContactAdapter(this, myContacts);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        lvListContact.setLayoutManager(linearLayoutManager);
        lvListContact.setAdapter(contactAdapter);

    }


    public void initViews() {
        btnLoadContacts = findViewById(R.id.btnLoadContacts);
        lvListContact = findViewById(R.id.lvListContact);

    }

}
