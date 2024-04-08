package com.abhishek.musicapp.ui.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0010\u0011B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/abhishek/musicapp/ui/adapters/AudioAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/abhishek/musicapp/domain/model/Song;", "Lcom/abhishek/musicapp/ui/adapters/AudioAdapter$SongItemViewHolder;", "onSongPressed", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SongItemDiffUtil", "SongItemViewHolder", "app_debug"})
public final class AudioAdapter extends androidx.recyclerview.widget.ListAdapter<com.abhishek.musicapp.domain.model.Song, com.abhishek.musicapp.ui.adapters.AudioAdapter.SongItemViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onSongPressed = null;
    
    public AudioAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onSongPressed) {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.abhishek.musicapp.ui.adapters.AudioAdapter.SongItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.abhishek.musicapp.ui.adapters.AudioAdapter.SongItemViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/abhishek/musicapp/ui/adapters/AudioAdapter$SongItemDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/abhishek/musicapp/domain/model/Song;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class SongItemDiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.abhishek.musicapp.domain.model.Song> {
        @org.jetbrains.annotations.NotNull
        public static final com.abhishek.musicapp.ui.adapters.AudioAdapter.SongItemDiffUtil INSTANCE = null;
        
        private SongItemDiffUtil() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        com.abhishek.musicapp.domain.model.Song oldItem, @org.jetbrains.annotations.NotNull
        com.abhishek.musicapp.domain.model.Song newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        com.abhishek.musicapp.domain.model.Song oldItem, @org.jetbrains.annotations.NotNull
        com.abhishek.musicapp.domain.model.Song newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/abhishek/musicapp/ui/adapters/AudioAdapter$SongItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/abhishek/musicapp/databinding/MusicListItemBinding;", "(Lcom/abhishek/musicapp/ui/adapters/AudioAdapter;Lcom/abhishek/musicapp/databinding/MusicListItemBinding;)V", "bind", "", "position", "", "songInfo", "Lcom/abhishek/musicapp/domain/model/Song;", "app_debug"})
    public final class SongItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.abhishek.musicapp.databinding.MusicListItemBinding binding = null;
        
        public SongItemViewHolder(@org.jetbrains.annotations.NotNull
        com.abhishek.musicapp.databinding.MusicListItemBinding binding) {
            super(null);
        }
        
        public final void bind(int position, @org.jetbrains.annotations.NotNull
        com.abhishek.musicapp.domain.model.Song songInfo) {
        }
    }
}