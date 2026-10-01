package e5;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f4840b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4839a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f4841c = new ArrayList();

    public x(View view) {
        this.f4840b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f4840b == xVar.f4840b && this.f4839a.equals(xVar.f4839a);
    }

    public final int hashCode() {
        return this.f4839a.hashCode() + (this.f4840b.hashCode() * 31);
    }

    public final String toString() {
        String strC = u5.a.c(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f4840b + "\n", "    values:");
        HashMap map = this.f4839a;
        for (String str : map.keySet()) {
            strC = strC + "    " + str + ": " + map.get(str) + "\n";
        }
        return strC;
    }
}
