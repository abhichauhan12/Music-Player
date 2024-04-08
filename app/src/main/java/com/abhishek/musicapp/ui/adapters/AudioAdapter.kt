package com.abhishek.musicapp.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.abhishek.musicapp.R
import com.abhishek.musicapp.databinding.MusicListItemBinding
import com.abhishek.musicapp.domain.model.Song
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AudioAdapter(
    private val onSongPressed : (Int) -> Unit
) : ListAdapter<Song, AudioAdapter.SongItemViewHolder>(SongItemDiffUtil) {

    object SongItemDiffUtil : DiffUtil.ItemCallback<Song>() {
        override fun areItemsTheSame(oldItem: Song, newItem: Song): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Song, newItem: Song) = oldItem == newItem
    }

    inner class SongItemViewHolder(private val binding: MusicListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position :Int, songInfo: Song) {
            binding.audioName.text = songInfo.audioName.toString()
            binding.artistName.text = songInfo.artistName.toString()
            binding.executePendingBindings()
            Glide.with(binding.root)
                .load(songInfo.imageUrl)
                .placeholder(R.mipmap.ic_launcher)
                .apply(RequestOptions.circleCropTransform())
                .into(binding.audioThumbnail)

            binding.root.setOnClickListener{ onSongPressed(position) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongItemViewHolder {
        val binding = MusicListItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return SongItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SongItemViewHolder, position: Int) {
        holder.bind(position = position, songInfo = getItem(position))
    }

}