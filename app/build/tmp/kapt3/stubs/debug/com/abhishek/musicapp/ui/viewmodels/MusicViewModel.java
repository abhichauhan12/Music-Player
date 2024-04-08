package com.abhishek.musicapp.ui.viewmodels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010 \u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020\u0019J\u0006\u0010$\u001a\u00020\u0019J\u0006\u0010%\u001a\u00020!J\u0006\u0010&\u001a\u00020!J\u0006\u0010\'\u001a\u00020!J\u0006\u0010(\u001a\u00020!J\b\u0010)\u001a\u00020!H\u0002J\u001c\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00172\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\b\u0010-\u001a\u00020!H\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/abhishek/musicapp/ui/viewmodels/MusicViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_currentlyPlaying", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/abhishek/musicapp/domain/model/PlayingSongMeta;", "_isAudioChanged", "Lcom/abhishek/musicapp/ui/viewmodels/AudioChangeStatus;", "audioList", "", "Lcom/abhishek/musicapp/domain/model/Song;", "getAudioList", "()Ljava/util/List;", "setAudioList", "(Ljava/util/List;)V", "currentlyPlaying", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentlyPlaying", "()Lkotlinx/coroutines/flow/StateFlow;", "isAudioChanged", "mediaItemIndex", "", "playWhenReady", "", "playbackListener", "Landroidx/media3/common/Player$Listener;", "player", "Landroidx/media3/exoplayer/ExoPlayer;", "playerPlaybackTimer", "Landroid/os/CountDownTimer;", "cancelPlayerPlaybackTimer", "", "handlePlayPause", "hasNextItem", "hasPreviousItem", "initializePlayer", "playNext", "playPrevious", "releasePlayer", "startPlayerPlaybackTimer", "updateAudioList", "selectedAudioIndex", "newAudioList", "updateExoplayer", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MusicViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final android.app.Application application = null;
    private boolean playWhenReady = true;
    private int mediaItemIndex = 0;
    private androidx.media3.exoplayer.ExoPlayer player;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.abhishek.musicapp.domain.model.Song> audioList;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.abhishek.musicapp.domain.model.PlayingSongMeta> _currentlyPlaying = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.abhishek.musicapp.domain.model.PlayingSongMeta> currentlyPlaying = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.abhishek.musicapp.ui.viewmodels.AudioChangeStatus> _isAudioChanged = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.abhishek.musicapp.ui.viewmodels.AudioChangeStatus> isAudioChanged = null;
    @org.jetbrains.annotations.NotNull
    private final android.os.CountDownTimer playerPlaybackTimer = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.media3.common.Player.Listener playbackListener = null;
    
    @javax.inject.Inject
    public MusicViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.abhishek.musicapp.domain.model.Song> getAudioList() {
        return null;
    }
    
    public final void setAudioList(@org.jetbrains.annotations.NotNull
    java.util.List<com.abhishek.musicapp.domain.model.Song> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.abhishek.musicapp.domain.model.PlayingSongMeta> getCurrentlyPlaying() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.abhishek.musicapp.ui.viewmodels.AudioChangeStatus> isAudioChanged() {
        return null;
    }
    
    public final void updateAudioList(int selectedAudioIndex, @org.jetbrains.annotations.NotNull
    java.util.List<com.abhishek.musicapp.domain.model.Song> newAudioList) {
    }
    
    private final void updateExoplayer() {
    }
    
    public final void playNext() {
    }
    
    public final boolean hasNextItem() {
        return false;
    }
    
    public final boolean hasPreviousItem() {
        return false;
    }
    
    public final void playPrevious() {
    }
    
    public final void handlePlayPause() {
    }
    
    public final void initializePlayer() {
    }
    
    public final void releasePlayer() {
    }
    
    private final void cancelPlayerPlaybackTimer() {
    }
    
    private final void startPlayerPlaybackTimer() {
    }
}