package w6;

import android.content.Context;
import android.util.DisplayMetrics;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14125a;

    public c(Context context) {
        this.f14125a = context;
    }

    @Override // w6.i
    public final Object a(l6.h hVar) {
        DisplayMetrics displayMetrics = this.f14125a.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new h(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            if (kotlin.jvm.internal.k.a(this.f14125a, ((c) obj).f14125a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14125a.hashCode();
    }
}
