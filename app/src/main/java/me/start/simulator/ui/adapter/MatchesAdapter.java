package me.start.simulator.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import me.start.simulator.databinding.MatchItemBinding;
import me.start.simulator.domain.Match;

public class MatchesAdapter extends RecyclerView.Adapter<MatchesAdapter.ViewHolder> {

    private List<Match> matches;

    public MatchesAdapter(List<Match> matches) {
        this.matches = matches;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        MatchItemBinding binding = MatchItemBinding.inflate(layoutInflater, parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Context context = holder.itemView.getContext();
        Match match = matches.get(position);

        //Adaptar os dados da partida (Pegas pela Api) para o Layout
        Glide.with(context).load(match.getTeamOne().getImage()).circleCrop().into(holder.binding.ivTeamOne);
        holder.binding.tvTeamOneName.setText(match.getTeamOne().getName());

        Glide.with(context).load(match.getTeamTwo().getImage()).circleCrop().into(holder.binding.ivTeamTwo);
        holder.binding.tvTeamTwoName.setText(match.getTeamTwo().getName());

    }

    @Override
    public int getItemCount() {
        return matches.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final MatchItemBinding binding;

        public ViewHolder(MatchItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
