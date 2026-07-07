package j4;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f7160c = g0.f7169b;

    /* renamed from: a, reason: collision with root package name */
    public Context f7161a;

    /* renamed from: b, reason: collision with root package name */
    public ContentResolver f7162b;

    public final boolean a(f0 f0Var, String str) {
        Context context = this.f7161a;
        int i6 = f0Var.f7166b;
        if (i6 < 0) {
            if (context.getPackageManager().checkPermission(str, f0Var.f7165a) == 0) {
                return true;
            }
            return false;
        }
        if (context.checkPermission(str, i6, f0Var.f7167c) == 0) {
            return true;
        }
        return false;
    }
}
