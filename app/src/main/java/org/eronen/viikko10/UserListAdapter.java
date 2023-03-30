package org.eronen.viikko10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private Context context;
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<String> degrees = new ArrayList<>();

    public UserListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        this.degrees = users.get(position).getDegrees();

        holder.userName.setText(users.get(position).getFirstName() + " " + users.get(position).getLastName());
        holder.userDegreeProgram.setText(users.get(position).getDegreeProgram());
        holder.userEmail.setText(users.get(position).getEmail());

        if (degrees.size() != 0) {
            holder.userDegrees.setText("Suoritetut tutkinnot:\n");
            for (String s : degrees) {
                holder.userDegrees.append("-" + s + "\n");
            }
        }

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}