package com.kayosystem.honki.chapter02.flashcardplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Card> mCards;
    CardAdapter mCardAdapter;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView)findViewById(R.id.listView);
        mCards = new ArrayList<Card>();

        mCards.add(new Card(R.drawable.angry, getString(R.string.angry_title),
                getString(R.string.angry_content), getString(R.string.angry_meaning)));
        mCards.add(new Card(R.drawable.sorry), getString(R.string.sorry_title),
                getString(R.string.sorry_content), getString(R.string.sorry_meaning));

        mCardAdapter = new CardAdapter(this, R.layout.card, mCards);
        mListView.setAdapter(mCardAdapter);
    }
}
