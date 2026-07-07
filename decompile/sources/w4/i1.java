package w4;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class i1 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f13896t = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f13897a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f13898b;
    public int j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f13913r;
    public k0 s;

    /* renamed from: c, reason: collision with root package name */
    public int f13899c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f13900d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f13901e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f13902f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f13903g = -1;

    /* renamed from: h, reason: collision with root package name */
    public i1 f13904h = null;

    /* renamed from: i, reason: collision with root package name */
    public i1 f13905i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f13906k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f13907l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f13908m = 0;

    /* renamed from: n, reason: collision with root package name */
    public y0 f13909n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13910o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f13911p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f13912q = -1;

    public i1(View view) {
        if (view != null) {
            this.f13897a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i6) {
        this.j = i6 | this.j;
    }

    public final int b() {
        RecyclerView recyclerView;
        k0 adapter;
        int G;
        if (this.s == null || (recyclerView = this.f13913r) == null || (adapter = recyclerView.getAdapter()) == null || (G = this.f13913r.G(this)) == -1 || this.s != adapter) {
            return -1;
        }
        return G;
    }

    public final int c() {
        int i6 = this.f13903g;
        if (i6 == -1) {
            return this.f13899c;
        }
        return i6;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.j & 1024) == 0 && (arrayList = this.f13906k) != null && arrayList.size() != 0) {
            return this.f13907l;
        }
        return f13896t;
    }

    public final boolean e() {
        View view = this.f13897a;
        if (view.getParent() != null && view.getParent() != this.f13913r) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if ((this.j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.j & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.j & 16) == 0) {
            WeakHashMap weakHashMap = t0.q0.f12397a;
            if (!this.f13897a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean i() {
        if ((this.j & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (this.f13909n != null) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if ((this.j & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.j & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void m(int i6, boolean z10) {
        if (this.f13900d == -1) {
            this.f13900d = this.f13899c;
        }
        if (this.f13903g == -1) {
            this.f13903g = this.f13899c;
        }
        if (z10) {
            this.f13903g += i6;
        }
        this.f13899c += i6;
        View view = this.f13897a;
        if (view.getLayoutParams() != null) {
            ((t0) view.getLayoutParams()).f14022c = true;
        }
    }

    public final void n() {
        this.j = 0;
        this.f13899c = -1;
        this.f13900d = -1;
        this.f13901e = -1L;
        this.f13903g = -1;
        this.f13908m = 0;
        this.f13904h = null;
        this.f13905i = null;
        ArrayList arrayList = this.f13906k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.f13911p = 0;
        this.f13912q = -1;
        RecyclerView.j(this);
    }

    public final void o(boolean z10) {
        int i6;
        int i10 = this.f13908m;
        if (z10) {
            i6 = i10 - 1;
        } else {
            i6 = i10 + 1;
        }
        this.f13908m = i6;
        if (i6 < 0) {
            this.f13908m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z10 && i6 == 1) {
            this.j |= 16;
        } else if (z10 && i6 == 0) {
            this.j &= -17;
        }
    }

    public final boolean p() {
        if ((this.j & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if ((this.j & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String simpleName;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f13899c + " id=" + this.f13901e + ", oldPos=" + this.f13900d + ", pLpos:" + this.f13903g);
        if (j()) {
            sb2.append(" scrap ");
            if (this.f13910o) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb2.append(str);
        }
        if (g()) {
            sb2.append(" invalid");
        }
        if (!f()) {
            sb2.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb2.append(" update");
        }
        if (i()) {
            sb2.append(" removed");
        }
        if (p()) {
            sb2.append(" ignored");
        }
        if (k()) {
            sb2.append(" tmpDetached");
        }
        if (!h()) {
            sb2.append(" not recyclable(" + this.f13908m + ")");
        }
        if ((this.j & 512) != 0 || g()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f13897a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
