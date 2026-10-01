package h6;

import android.content.Context;
import android.net.Uri;
import g6.s;
import g6.t;
import g6.y;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f6149b;

    public b(Context context, Class cls) {
        this.f6148a = context;
        this.f6149b = cls;
    }

    @Override // g6.t
    public final s a(y yVar) {
        Class cls = this.f6149b;
        return new d(this.f6148a, yVar.b(File.class, cls), yVar.b(Uri.class, cls), cls);
    }
}
