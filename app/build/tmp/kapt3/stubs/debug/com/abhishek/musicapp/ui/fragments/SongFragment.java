package com.abhishek.musicapp.ui.fragments;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\u001a\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/abhishek/musicapp/ui/fragments/SongFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/abhishek/musicapp/databinding/FragmentSongBinding;", "isPagerManuallySwiped", "", "musicViewModel", "Lcom/abhishek/musicapp/ui/viewmodels/MusicViewModel;", "getMusicViewModel", "()Lcom/abhishek/musicapp/ui/viewmodels/MusicViewModel;", "musicViewModel$delegate", "Lkotlin/Lazy;", "pageChangeCallbackListener", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "pagerAdapter", "Lcom/abhishek/musicapp/ui/adapters/MusicPagerAdapter;", "attachObservers", "", "buttonsCheck", "initPager", "initUi", "onResume", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "updateUi", "songMeta", "Lcom/abhishek/musicapp/domain/model/PlayingSongMeta;", "app_debug"})
public final class SongFragment extends androidx.fragment.app.Fragment {
    private com.abhishek.musicapp.databinding.FragmentSongBinding binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy musicViewModel$delegate = null;
    private com.abhishek.musicapp.ui.adapters.MusicPagerAdapter pagerAdapter;
    private boolean isPagerManuallySwiped = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback pageChangeCallbackListener = null;
    
    public SongFragment() {
        super();
    }
    
    private final com.abhishek.musicapp.ui.viewmodels.MusicViewModel getMusicViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUi() {
    }
    
    private final void initPager() {
    }
    
    private final void buttonsCheck() {
    }
    
    private final void attachObservers() {
    }
    
    private final void updateUi(com.abhishek.musicapp.domain.model.PlayingSongMeta songMeta) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
}