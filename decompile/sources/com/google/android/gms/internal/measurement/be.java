package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class be implements da.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2516c;

    public /* synthetic */ be(int i, Object obj, Object obj2) {
        this.f2514a = i;
        this.f2515b = obj;
        this.f2516c = obj2;
    }

    @Override // da.b0
    public final ListenableFuture apply(Object obj) throws IOException {
        switch (this.f2514a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                de deVar = (de) this.f2515b;
                return ((hc) deVar.f2575d.get()).a(new f6(deVar, (he) this.f2516c));
            case 1:
                List list = (List) this.f2515b;
                wf wfVar = (wf) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw d0.d.g(it);
                }
                be beVarB = zg.b(new qf(this, arrayList, size));
                da.f0 f0Var = da.f0.f4407v;
                da.u uVarF = da.o0.f(da.o0.e(wfVar.f3205a.f3058e.w()), zg.b(new be(3, wfVar, beVarB)), f0Var);
                x9.g gVar = new x9.g();
                int i = da.w.F;
                da.v vVar = new da.v(uVarF, gVar);
                uVarF.f(vVar, va.t1.l(f0Var, vVar));
                return da.o0.f(vVar, zg.b(new qf(this, size, arrayList)), f0Var);
            case 2:
                a7.h hVar = (a7.h) this.f2515b;
                da.u uVar = (da.u) this.f2516c;
                hVar.e((Uri) da.o0.b((ListenableFuture) hVar.f185b), obj);
                synchronized (hVar.f190h) {
                    hVar.f191j = uVar;
                    break;
                }
                return da.o0.d(obj);
            case 3:
                return ((wf) this.f2515b).f3205a.f3056c.c((be) this.f2516c, da.f0.f4407v);
            default:
                yg ygVar = (yg) this.f2515b;
                de.i.b(ygVar);
                yg ygVarA = jg.a(jg.b(), ygVar);
                try {
                    ListenableFuture listenableFutureApply = ((da.b0) this.f2516c).apply(obj);
                    if (listenableFutureApply != null) {
                        return listenableFutureApply;
                    }
                    throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
                } finally {
                }
        }
    }

    public String toString() {
        switch (this.f2514a) {
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                da.b0 b0Var = (da.b0) this.f2516c;
                StringBuilder sb2 = new StringBuilder(b0Var.toString().length() + 14);
                sb2.append("propagating=[");
                sb2.append(b0Var);
                sb2.append("]");
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
