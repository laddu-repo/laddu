package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j implements d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f2391v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AssetManager f2392w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f2393x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f2394y;

    public j(AssetManager assetManager, String str, int i) {
        this.f2394y = i;
        this.f2392w = assetManager;
        this.f2391v = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        switch (this.f2394y) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f2393x;
        if (obj == null) {
            return;
        }
        try {
            switch (this.f2394y) {
                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                    ((AssetFileDescriptor) obj).close();
                    break;
                default:
                    ((InputStream) obj).close();
                    break;
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, c cVar) {
        Object objOpenFd;
        try {
            AssetManager assetManager = this.f2392w;
            String str = this.f2391v;
            switch (this.f2394y) {
                case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                    objOpenFd = assetManager.openFd(str);
                    break;
                default:
                    objOpenFd = assetManager.open(str);
                    break;
            }
            this.f2393x = objOpenFd;
            cVar.q(objOpenFd);
        } catch (IOException e7) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e7);
            }
            cVar.k(e7);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
