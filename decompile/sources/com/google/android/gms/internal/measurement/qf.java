package com.google.android.gms.internal.measurement;

import androidx.media3.decoder.DecoderInputBuffer;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qf implements da.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3033a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ be f3034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3036d;

    public /* synthetic */ qf(be beVar, int i, ArrayList arrayList) {
        this.f3034b = beVar;
        this.f3036d = i;
        this.f3035c = arrayList;
    }

    @Override // da.b0
    public final ListenableFuture apply(Object obj) {
        switch (this.f3033a) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                int i = this.f3036d;
                ArrayList arrayList = new ArrayList(i);
                for (int i10 = 0; i10 < i; i10++) {
                    if (((Boolean) da.o0.b((Future) this.f3035c.get(i10))).booleanValue()) {
                        ((List) this.f3034b.f2515b).get(i10).getClass();
                        throw new ClassCastException();
                    }
                }
                y9.f0 f0VarL = y9.f0.l(arrayList);
                da.c0 c0Var = new da.c0();
                da.e0 e0Var = new da.e0(f0VarL, true);
                e0Var.I = new da.d0(e0Var, c0Var);
                e0Var.s();
                return e0Var;
            default:
                ArrayList arrayList2 = this.f3035c;
                y9.f0 f0VarL2 = y9.f0.l(arrayList2);
                be beVar = this.f3034b;
                f6 f6VarA = zg.a(new p7.m(beVar, (m0) obj, this.f3036d, arrayList2));
                Executor executor = (Executor) beVar.f2516c;
                da.e0 e0Var2 = new da.e0(f0VarL2, false);
                e0Var2.I = new da.d0(e0Var2, f6VarA, executor);
                e0Var2.s();
                return e0Var2;
        }
    }

    public /* synthetic */ qf(be beVar, ArrayList arrayList, int i) {
        this.f3034b = beVar;
        this.f3035c = arrayList;
        this.f3036d = i;
    }
}
