package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class od implements da.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2962b;

    public /* synthetic */ od(int i, Object obj) {
        this.f2961a = i;
        this.f2962b = obj;
    }

    @Override // da.b0
    public final ListenableFuture apply(Object obj) throws IOException {
        switch (this.f2961a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                td tdVar = (td) this.f2962b;
                int i = ((fc) obj).f2641v;
                if ((i == 29501 || i == 29537 || i == 29538 || i == 29539 || i == 29540 || i == 29541 || i == 29542 || i == 29543 || i == 29544) && !tdVar.f3115h.B()) {
                    tdVar.b();
                }
                return da.r0.f4441w;
            case 1:
                final a7.j jVar = (a7.j) this.f2962b;
                final ne neVar = (ne) obj;
                jVar.getClass();
                Callable callable = new Callable() { // from class: com.google.android.gms.internal.measurement.je
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ne neVar2 = neVar;
                        a7.j jVar2 = jVar;
                        nb nbVar = (nb) jVar2.f203x;
                        f6 f6Var = new f6(5);
                        try {
                            ye yeVar = (ye) nbVar.f.get();
                            Uri uri = (Uri) jVar2.f204y;
                            f6 f6Var2 = new f6(neVar2);
                            f6Var2.f2639x = new f6[]{f6Var};
                            return null;
                        } catch (IOException | RuntimeException e7) {
                            e1.i(Level.WARNING, nbVar.a(), e7, "Failed to update snapshot for %s flags may be stale.", (String) jVar2.f202w);
                            return null;
                        }
                    }
                };
                da.v0 v0VarA = ((nb) jVar.f203x).a();
                da.d1 d1Var = new da.d1(callable);
                ((da.z0) v0VarA).execute(d1Var);
                return d1Var;
            case 2:
                return da.o0.e((ListenableFuture) ((qe) this.f2962b).f3030e.get());
            case 3:
                return da.o0.d(((rd) this.f2962b).apply(obj));
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                return ((rf) this.f2962b).f3058e.w();
            default:
                IOException iOException = (IOException) this.f2962b;
                iOException.addSuppressed((IOException) obj);
                throw iOException;
        }
    }
}
