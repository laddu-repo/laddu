package androidx.emoji2.text;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayList;
import java.util.List;
import k8.k4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f908v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f909w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f910x;

    public /* synthetic */ k(int i, int i10, Object obj) {
        this.f908v = i10;
        this.f910x = obj;
        this.f909w = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f908v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ArrayList arrayList = (ArrayList) this.f910x;
                int size = arrayList.size();
                int i = 0;
                if (this.f909w == 1) {
                    while (i < size) {
                        ((j) arrayList.get(i)).b();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((j) arrayList.get(i)).a();
                        i++;
                    }
                }
                break;
            case 1:
                ((com.google.android.material.datepicker.m) this.f910x).A0.j0(this.f909w);
                break;
            case 2:
                k0.b bVar = (k0.b) ((k4) this.f910x).f7607v;
                if (bVar != null) {
                    bVar.h(this.f909w);
                }
                break;
            default:
                ((s7.j) this.f910x).b(this.f909w);
                break;
        }
    }

    public k(List list, int i, Throwable th) {
        this.f908v = 0;
        u1.c.g(list, "initCallbacks cannot be null");
        this.f910x = new ArrayList(list);
        this.f909w = i;
    }
}
