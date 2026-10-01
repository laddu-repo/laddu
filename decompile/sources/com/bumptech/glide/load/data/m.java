package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f2401v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Uri f2402w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ContentResolver f2403x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f2404y;

    public m(ContentResolver contentResolver, Uri uri, boolean z2) {
        this.f2403x = contentResolver;
        this.f2402w = uri;
        this.f2401v = z2;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        Object obj = this.f2404y;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(Object obj);

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, c cVar) {
        try {
            Object objF = f(this.f2403x, this.f2402w);
            this.f2404y = objF;
            cVar.q(objF);
        } catch (FileNotFoundException e7) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e7);
            }
            cVar.k(e7);
        }
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
