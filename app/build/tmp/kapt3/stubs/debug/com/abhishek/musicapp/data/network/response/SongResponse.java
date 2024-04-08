package com.abhishek.musicapp.data.network.response;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010#\u001a\u00020\u000bJ\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010%\u001a\u00020&J\t\u0010\'\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017\u00a8\u0006("}, d2 = {"Lcom/abhishek/musicapp/data/network/response/SongResponse;", "", "id", "", "audioStatus", "", "audioName", "artistName", "backgroundColor", "imageId", "isTopTrack", "", "audioUrl", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getArtistName", "()Ljava/lang/String;", "getAudioName", "getAudioStatus", "getAudioUrl", "getBackgroundColor", "getId", "()I", "getImageId", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hasValidAudioUrl", "hashCode", "toSong", "Lcom/abhishek/musicapp/domain/model/Song;", "toString", "app_debug"})
public final class SongResponse {
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @com.google.gson.annotations.SerializedName(value = "status")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String audioStatus = null;
    @com.google.gson.annotations.SerializedName(value = "name")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String audioName = null;
    @com.google.gson.annotations.SerializedName(value = "artist")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String artistName = null;
    @com.google.gson.annotations.SerializedName(value = "accent")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String backgroundColor = null;
    @com.google.gson.annotations.SerializedName(value = "cover")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String imageId = null;
    @com.google.gson.annotations.SerializedName(value = "top_track")
    private final boolean isTopTrack = false;
    @com.google.gson.annotations.SerializedName(value = "url")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String audioUrl = null;
    
    public SongResponse(int id, @org.jetbrains.annotations.NotNull
    java.lang.String audioStatus, @org.jetbrains.annotations.NotNull
    java.lang.String audioName, @org.jetbrains.annotations.NotNull
    java.lang.String artistName, @org.jetbrains.annotations.NotNull
    java.lang.String backgroundColor, @org.jetbrains.annotations.NotNull
    java.lang.String imageId, boolean isTopTrack, @org.jetbrains.annotations.NotNull
    java.lang.String audioUrl) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAudioStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAudioName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getArtistName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBackgroundColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImageId() {
        return null;
    }
    
    public final boolean isTopTrack() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAudioUrl() {
        return null;
    }
    
    public final boolean hasValidAudioUrl() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.abhishek.musicapp.domain.model.Song toSong() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.abhishek.musicapp.data.network.response.SongResponse copy(int id, @org.jetbrains.annotations.NotNull
    java.lang.String audioStatus, @org.jetbrains.annotations.NotNull
    java.lang.String audioName, @org.jetbrains.annotations.NotNull
    java.lang.String artistName, @org.jetbrains.annotations.NotNull
    java.lang.String backgroundColor, @org.jetbrains.annotations.NotNull
    java.lang.String imageId, boolean isTopTrack, @org.jetbrains.annotations.NotNull
    java.lang.String audioUrl) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}