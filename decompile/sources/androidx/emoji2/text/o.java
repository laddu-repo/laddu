package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class o extends p4.v {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p4.v f924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f925k;

    public o(p4.v vVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f924j = vVar;
        this.f925k = threadPoolExecutor;
    }

    @Override // p4.v
    public final void E(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f925k;
        try {
            this.f924j.E(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p4.v
    public final void F(sb.p pVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f925k;
        try {
            this.f924j.F(pVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
