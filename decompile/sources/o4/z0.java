package o4;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final List f9909t = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f9911b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9917j;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public RecyclerView f9925r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b0 f9926s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9912c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9913d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9914e = -1;
    public int f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9915g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z0 f9916h = null;
    public z0 i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f9918k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f9919l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9920m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p0 f9921n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9922o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9923p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9924q = -1;

    public z0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f9910a = view;
    }

    public final void a(int i) {
        this.f9917j = i | this.f9917j;
    }

    public final int b() {
        int i = this.f9915g;
        return i == -1 ? this.f9912c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f9917j & 1024) != 0 || (arrayList = this.f9918k) == null || arrayList.size() == 0) ? f9909t : this.f9919l;
    }

    public final boolean d() {
        View view = this.f9910a;
        return (view.getParent() == null || view.getParent() == this.f9925r) ? false : true;
    }

    public final boolean e() {
        return (this.f9917j & 1) != 0;
    }

    public final boolean f() {
        return (this.f9917j & 4) != 0;
    }

    public final boolean g() {
        if ((this.f9917j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = t0.m0.f11853a;
        return !this.f9910a.hasTransientState();
    }

    public final boolean h() {
        return (this.f9917j & 8) != 0;
    }

    public final boolean i() {
        return this.f9921n != null;
    }

    public final boolean j() {
        return (this.f9917j & 256) != 0;
    }

    public final boolean k() {
        return (this.f9917j & 2) != 0;
    }

    public final void l(int i, boolean z2) {
        if (this.f9913d == -1) {
            this.f9913d = this.f9912c;
        }
        if (this.f9915g == -1) {
            this.f9915g = this.f9912c;
        }
        if (z2) {
            this.f9915g += i;
        }
        this.f9912c += i;
        View view = this.f9910a;
        if (view.getLayoutParams() != null) {
            ((k0) view.getLayoutParams()).f9802c = true;
        }
    }

    public final void m() {
        if (RecyclerView.W0 && j()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f9917j = 0;
        this.f9912c = -1;
        this.f9913d = -1;
        this.f9914e = -1L;
        this.f9915g = -1;
        this.f9920m = 0;
        this.f9916h = null;
        this.i = null;
        ArrayList arrayList = this.f9918k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f9917j &= -1025;
        this.f9923p = 0;
        this.f9924q = -1;
        RecyclerView.l(this);
    }

    public final void n(boolean z2) {
        int i = this.f9920m;
        int i10 = z2 ? i - 1 : i + 1;
        this.f9920m = i10;
        if (i10 < 0) {
            this.f9920m = 0;
            if (RecyclerView.W0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z2 && i10 == 1) {
            this.f9917j |= 16;
        } else if (z2 && i10 == 0) {
            this.f9917j &= -17;
        }
        if (RecyclerView.X0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z2 + ":" + this);
        }
    }

    public final boolean o() {
        return (this.f9917j & 128) != 0;
    }

    public final boolean p() {
        return (this.f9917j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f9912c + " id=" + this.f9914e + ", oldPos=" + this.f9913d + ", pLpos:" + this.f9915g);
        if (i()) {
            sb2.append(" scrap ");
            sb2.append(this.f9922o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb2.append(" invalid");
        }
        if (!e()) {
            sb2.append(" unbound");
        }
        if ((this.f9917j & 2) != 0) {
            sb2.append(" update");
        }
        if (h()) {
            sb2.append(" removed");
        }
        if (o()) {
            sb2.append(" ignored");
        }
        if (j()) {
            sb2.append(" tmpDetached");
        }
        if (!g()) {
            sb2.append(" not recyclable(" + this.f9920m + ")");
        }
        if ((this.f9917j & 512) != 0 || f()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f9910a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
