package nc;

import android.content.Context;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f9670c = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f9671a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9672b;

    public p(Context context, String str) {
        this.f9671a = context;
        this.f9672b = str;
    }

    public final synchronized void a() {
        this.f9671a.deleteFile(this.f9672b);
    }
}
