package com.google.android.gms.internal.measurement;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sb implements x9.m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3085v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x9.m f3086w;

    public /* synthetic */ sb(x9.m mVar, int i) {
        this.f3085v = i;
        this.f3086w = mVar;
    }

    @Override // x9.m
    public final Object get() {
        int i = this.f3085v;
        x9.m mVar = this.f3086w;
        switch (i) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                Object obj = nb.f2919j;
                return (he) ((x9.h) mVar.get()).c();
            default:
                da.v0 v0Var = (da.v0) mVar.get();
                v0Var.getClass();
                s7 s7Var = s7.f3079c;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                da.d1 d1Var = new da.d1(s7Var);
                return new da.x0(d1Var, ((da.z0) v0Var).f4465w.schedule(d1Var, 10000L, timeUnit));
        }
    }
}
