package com.deva.gurugeektutors;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TutorAdapter extends RecyclerView.Adapter<TutorAdapter.TutorRowHolder> {
    ArrayList<Tutor> tutorData;
    Context context;
    MyClickIterface myClickIterface;



    public TutorAdapter(ArrayList<Tutor> tutorData, Context context, MyClickIterface myClickIterface){
        this.context = context;
        this.tutorData = tutorData;
        this.myClickIterface = myClickIterface;
    }

    public TutorRowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(context).inflate(R.layout.activity_tutor_row,  parent, false);
          return new TutorRowHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull TutorRowHolder holder, int position) {
        holder.txtTutorName.setText(tutorData.get(position).getTutorName());
        holder.imgTutor.setImageResource(tutorData.get(position).getTutorImage());

    }

    @Override
    public int getItemCount() {
        return tutorData.size();
    }

    class TutorRowHolder extends RecyclerView.ViewHolder{

        TextView txtTutorName;
        ImageView imgTutor;



        public TutorRowHolder(@NonNull View itemView) {
            super(itemView);

            txtTutorName = itemView.findViewById(R.id.tutor_name);
            imgTutor = itemView.findViewById(R.id.img_tutor);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myClickIterface.onItemClick(getAdapterPosition());
                }
            });

        }
    }

    interface  MyClickIterface{
        void onItemClick(int positonOfTheTutor);
    }
}

//In summary, the TutorAdapter class serves as a connector between your list of tutors and the RecyclerView. It manages the creation of ViewHolder objects, binds data to them, and determines the number of items in the list. This allows you to display your list of tutors efficiently in a RecyclerView.
