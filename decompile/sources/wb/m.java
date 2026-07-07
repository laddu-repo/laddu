package wb;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f14015c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14017b;

    public m(Context context, String str) {
        this.f14016a = context;
        this.f14017b = str;
    }

    public final synchronized void a() {
        this.f14016a.deleteFile(this.f14017b);
    }
}
