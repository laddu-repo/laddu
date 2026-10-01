package wc;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import uc.j;

/* loaded from: classes.dex */
public final class b extends e {
    public static final b A = new Object();

    @Override // wc.e
    public final void a(boolean z10) {
        String str;
        Iterator it = Collections.unmodifiableCollection(c.f14279c.f14280a).iterator();
        while (it.hasNext()) {
            yc.a aVar = ((j) it.next()).f13098e;
            if (aVar.f15048b.get() != 0) {
                if (z10) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                g.f14287a.a(aVar.e(), "setState", str, aVar.f15047a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wc.e
    public final boolean b() {
        Iterator it = Collections.unmodifiableCollection(c.f14279c.f14281b).iterator();
        while (it.hasNext()) {
            View view = (View) ((j) it.next()).f13097d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
