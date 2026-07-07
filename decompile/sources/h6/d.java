package h6;

import a6.i;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import b8.h;
import g6.r;
import g6.s;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class d implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f6156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f6157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f6158d;

    public d(Context context, s sVar, s sVar2, Class cls) {
        this.f6155a = context.getApplicationContext();
        this.f6156b = sVar;
        this.f6157c = sVar2;
        this.f6158d = cls;
    }

    @Override // g6.s
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && h.B((Uri) obj);
    }

    @Override // g6.s
    public final r b(Object obj, int i, int i10, i iVar) {
        Uri uri = (Uri) obj;
        return new r(new u6.b(uri), new c(this.f6155a, this.f6156b, this.f6157c, uri, i, i10, iVar, this.f6158d));
    }
}
