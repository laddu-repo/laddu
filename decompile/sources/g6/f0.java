package g6;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f5667b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f5668a;

    public f0(s sVar) {
        this.f5668a = sVar;
    }

    @Override // g6.s
    public final boolean a(Object obj) {
        return f5667b.contains(((Uri) obj).getScheme());
    }

    @Override // g6.s
    public final r b(Object obj, int i, int i10, a6.i iVar) {
        return this.f5668a.b(new i(((Uri) obj).toString()), i, i10, iVar);
    }
}
