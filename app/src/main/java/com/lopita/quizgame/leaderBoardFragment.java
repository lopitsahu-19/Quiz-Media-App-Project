package com.lopita.quizgame;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class leaderBoardFragment extends Fragment {

    private TextView totalUsersTextView, totalScoreTextView, rankTextView;
    private RecyclerView usersRecyclerView;
    private UsersAdapter usersAdapter;
    private List<User> usersList;

    public leaderBoardFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.leaderboard_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        totalUsersTextView = view.findViewById(R.id.total_users);
        totalScoreTextView = view.findViewById(R.id.total_score);
        rankTextView = view.findViewById(R.id.rank);
        usersRecyclerView = view.findViewById(R.id.users_view);

        usersList = new ArrayList<>();
        usersAdapter = new UsersAdapter(usersList);

        usersRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        usersRecyclerView.setAdapter(usersAdapter);

        // Simulate loading data from a data source
        loadData();
    }

    private void loadData() {
        // This method should load data from your data source
        // Here we add some dummy data for demonstration purposes
        usersList.add(new User("User 1", 100));
        usersList.add(new User("User 2", 200));
        usersList.add(new User("User 3", 150));
        usersList.add(new User("You", 175));  // Assuming "You" are the fourth user

        // Sort usersList based on score in descending order
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            usersList.sort((u1, u2) -> Integer.compare(u2.getScore(), u1.getScore()));
        }

        usersAdapter.notifyDataSetChanged();

        // Update total users count
        totalUsersTextView.setText("Total Users: " + usersList.size());

        // Update your score and rank
        updateYourScoreAndRank();
    }

    private void updateYourScoreAndRank() {
        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getName().equals("You")) {
                totalScoreTextView.setText("Score: " + usersList.get(i).getScore());
                rankTextView.setText("RANK-" + (i + 1));
                break;
            }
        }
    }

    // User model class
    private static class User {
        private String name;
        private int score;

        public User(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {


            return score;
        }
    }

    // Adapter for RecyclerView
    private class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserViewHolder> {
        private List<User> usersList;

        public UsersAdapter(List<User> usersList) {
            this.usersList = usersList;
        }

        @NonNull
        @Override
        public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
            return new UserViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
            User user = usersList.get(position);
            holder.nameTextView.setText(user.getName());
            holder.scoreTextView.setText("Score: " + user.getScore());
        }

        @Override
        public int getItemCount() {
            return usersList.size();
        }

        class UserViewHolder extends RecyclerView.ViewHolder {
            TextView nameTextView, scoreTextView;

            public UserViewHolder(@NonNull View itemView) {
                super(itemView);
                nameTextView = itemView.findViewById(android.R.id.text1);
                scoreTextView = itemView.findViewById(android.R.id.text2);
            }
        }
    }
}
