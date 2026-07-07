package c;

import android.content.Intent;
import android.content.IntentSender;
import android.util.Pair;
import androidx.media3.decoder.DecoderInputBuffer;
import c2.h1;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArraySet;
import o2.d0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1641v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1643x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1644y;

    public /* synthetic */ h(Object obj, int i, Object obj2, int i10) {
        this.f1641v = i10;
        this.f1642w = obj;
        this.f1643x = i;
        this.f1644y = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [h2.l, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1641v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                i iVar = (i) this.f1642w;
                Serializable serializable = (Serializable) ((a9.g) this.f1644y).f273w;
                String str = (String) iVar.f1645a.get(Integer.valueOf(this.f1643x));
                if (str != null) {
                    e.e eVar = (e.e) iVar.f1649e.get(str);
                    if ((eVar != null ? eVar.f4531a : null) == null) {
                        iVar.f1650g.remove(str);
                        iVar.f.put(str, serializable);
                    } else {
                        e.b bVar = eVar.f4531a;
                        if (iVar.f1648d.remove(str)) {
                            bVar.i(serializable);
                        }
                    }
                    break;
                }
                break;
            case 1:
                ((i) this.f1642w).a(this.f1643x, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f1644y));
                break;
            case 2:
                h1 h1Var = (h1) this.f1642w;
                Pair pair = (Pair) this.f1644y;
                ((d2.f) h1Var.f1759w.i).l(((Integer) pair.first).intValue(), (d0) pair.second, this.f1643x);
                break;
            case 3:
                h2.k kVar = (h2.k) this.f1642w;
                this.f1644y.l(kVar.f6095a, kVar.f6096b, this.f1643x);
                break;
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                ((m4.b) ((cf.l) this.f1642w).f2323d).s(this.f1643x, this.f1644y);
                break;
            default:
                CopyOnWriteArraySet<w1.o> copyOnWriteArraySet = (CopyOnWriteArraySet) this.f1642w;
                w1.m mVar = (w1.m) this.f1644y;
                for (w1.o oVar : copyOnWriteArraySet) {
                    if (!oVar.f13719d) {
                        int i = this.f1643x;
                        if (i != -1) {
                            oVar.f13717b.b(i);
                        }
                        oVar.f13718c = true;
                        mVar.a(oVar.f13716a);
                    }
                }
                break;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, int i, int i10) {
        this.f1641v = i10;
        this.f1642w = obj;
        this.f1644y = obj2;
        this.f1643x = i;
    }
}
