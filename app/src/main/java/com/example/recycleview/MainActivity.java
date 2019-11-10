package com.example.recycleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.recycle);
        rv.setAdapter(new MyAdapter());
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
    public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.list_view,parent,false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 7;
        }
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView flag;
        TextView name;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            flag = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView);
        }
    }
}
