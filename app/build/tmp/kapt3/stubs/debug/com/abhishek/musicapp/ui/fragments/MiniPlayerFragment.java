package com.abhishek.musicapp.ui.fragments;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lcom/abhishek/musicapp/ui/fragments/MiniPlayerFragment;", "Landroidx/fragment/app/Fragment;", "song", "Lcom/abhishek/musicapp/domain/model/Song;", "(Lcom/abhishek/musicapp/domain/model/Song;)V", "binding", "Lcom/abhishek/musicapp/databinding/FragmentMiniPlayerBinding;", "getSong", "()Lcom/abhishek/musicapp/domain/model/Song;", "initUI", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MiniPlayerFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final com.abhishek.musicapp.domain.model.Song song = null;
    private com.abhishek.musicapp.databinding.FragmentMiniPlayerBinding binding;
    
    public MiniPlayerFragment(@org.jetbrains.annotations.NotNull
    com.abhishek.musicapp.domain.model.Song song) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.abhishek.musicapp.domain.model.Song getSong() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUI(com.abhishek.musicapp.domain.model.Song song) {
    }
}