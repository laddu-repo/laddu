package sa;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f11625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f11626b;

    public k(l lVar, long j8) {
        this.f11626b = lVar;
        this.f11625a = j8;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f11625a);
        this.f11626b.f11637k.l(bundle);
        return null;
    }
}
