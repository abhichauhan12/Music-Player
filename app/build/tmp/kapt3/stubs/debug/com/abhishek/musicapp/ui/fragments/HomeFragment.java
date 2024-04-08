package com.abhishek.musicapp.ui.fragments;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u001a\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/abhishek/musicapp/ui/fragments/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "homeBinding", "Lcom/abhishek/musicapp/databinding/FragmentHomeBinding;", "isPagerManuallySwiped", "", "miniPlayerAdapter", "Lcom/abhishek/musicapp/ui/adapters/MusicPagerAdapter;", "musicViewModel", "Lcom/abhishek/musicapp/ui/viewmodels/MusicViewModel;", "getMusicViewModel", "()Lcom/abhishek/musicapp/ui/viewmodels/MusicViewModel;", "musicViewModel$delegate", "Lkotlin/Lazy;", "pageChangeCallbackListener", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "pagerAdapter", "attachObservers", "", "initUI", "onResume", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "updateMiniPlayerPager", "updateUi", "playingSongMeta", "Lcom/abhishek/musicapp/domain/model/PlayingSongMeta;", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.abhishek.musicapp.databinding.FragmentHomeBinding homeBinding;
    private com.abhishek.musicapp.ui.adapters.MusicPagerAdapter pagerAdapter;
    private com.abhishek.musicapp.ui.adapters.MusicPagerAdapter miniPlayerAdapter;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy musicViewModel$delegate = null;
    private boolean isPagerManuallySwiped = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback pageChangeCallbackListener = null;
    
    public HomeFragment() {
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
    
    private final void initUI() {
    }
    
    private final void updateMiniPlayerPager() {
    }
    
    private final void attachObservers() {
    }
    
    private final void updateUi(com.abhishek.musicapp.domain.model.PlayingSongMeta playingSongMeta) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
}