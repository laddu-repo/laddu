package d1;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x0 implements me.h0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3960v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3961w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3962x;

    public /* synthetic */ x0(int i, Object obj, Object obj2) {
        this.f3960v = i;
        this.f3961w = obj;
        this.f3962x = obj2;
    }

    @Override // me.h0
    public final void b() {
        switch (this.f3960v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                String str = (String) this.f3961w;
                y0 y0Var = (y0) this.f3962x;
                synchronized (z0.f3969b) {
                    LinkedHashMap linkedHashMap = z0.f3970c;
                    z0 z0Var = (z0) linkedHashMap.get(str);
                    if (z0Var != null) {
                        z0Var.f3971a.remove(y0Var);
                        if (z0Var.f3971a.isEmpty()) {
                            linkedHashMap.remove(str);
                            z0Var.stopWatching();
                        }
                    }
                    break;
                }
                return;
            default:
                ne.c cVar = (ne.c) this.f3961w;
                cVar.f9110x.removeCallbacks((me.m1) this.f3962x);
                return;
        }
    }
}
