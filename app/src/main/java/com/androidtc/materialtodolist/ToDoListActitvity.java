package com.androidtc.materialtodolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

private EditText mItemInput;
private FloatingActionButton mAddButton;
private ListView mDynamicsListView;
private List <String> mItemList;
private ArrayAdapter <String> mItemListAdapter;


public class ToDoListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list_actitvity);
    }
}
