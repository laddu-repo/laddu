package o5;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public final View f10001b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f10000a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10002c = new ArrayList();

    public z(View view) {
        this.f10001b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f10001b == zVar.f10001b && this.f10000a.equals(zVar.f10000a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10000a.hashCode() + (this.f10001b.hashCode() * 31);
    }

    public final String toString() {
        String c10 = w8.k.c(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f10001b + "\n", "    values:");
        HashMap hashMap = this.f10000a;
        for (String str : hashMap.keySet()) {
            c10 = c10 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return c10;
    }
}
