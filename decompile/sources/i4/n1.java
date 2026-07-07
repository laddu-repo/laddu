package i4;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6462a;

    /* renamed from: b, reason: collision with root package name */
    public int f6463b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6464c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6465d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6466e;

    public n1() {
        this.f6462a = 0;
        this.f6465d = new Object();
        this.f6466e = new v.l(0);
    }

    public void a(int i6) {
        switch (this.f6462a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f6466e;
                WeakReference weakReference = sideSheetBehavior.f2734p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f6463b = i6;
                    if (!this.f6464c) {
                        ((View) sideSheetBehavior.f2734p.get()).postOnAnimation((j2.h) this.f6465d);
                        this.f6464c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f6466e;
                WeakReference weakReference2 = bottomSheetBehavior.W;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f6463b = i6;
                    if (!this.f6464c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((v8.i) this.f6465d);
                        this.f6464c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public m1 b(Object obj) {
        m1 m1Var;
        synchronized (this.f6465d) {
            try {
                int c10 = c();
                m1Var = new m1(c10, obj);
                if (this.f6464c) {
                    m1Var.m();
                } else {
                    ((v.e) this.f6466e).put(Integer.valueOf(c10), m1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m1Var;
    }

    public int c() {
        int i6;
        synchronized (this.f6465d) {
            i6 = this.f6463b;
            this.f6463b = i6 + 1;
        }
        return i6;
    }

    public void d() {
        ArrayList arrayList;
        synchronized (this.f6465d) {
            this.f6464c = true;
            arrayList = new ArrayList(((v.e) this.f6466e).values());
            ((v.e) this.f6466e).clear();
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((m1) obj).m();
        }
    }

    public void e(int i6, s1 s1Var) {
        synchronized (this.f6465d) {
            try {
                m1 m1Var = (m1) ((v.e) this.f6466e).remove(Integer.valueOf(i6));
                if (m1Var != null) {
                    if (m1Var.F.getClass() == s1.class) {
                        m1Var.k(s1Var);
                    } else {
                        u1.a.p("SequencedFutureManager", "Type mismatch, expected " + m1Var.F.getClass() + ", but was " + s1.class);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public n1(SideSheetBehavior sideSheetBehavior) {
        this.f6462a = 1;
        this.f6466e = sideSheetBehavior;
        this.f6465d = new j2.h(this, 13);
    }

    public n1(BottomSheetBehavior bottomSheetBehavior) {
        this.f6462a = 2;
        this.f6466e = bottomSheetBehavior;
        this.f6465d = new v8.i(this, 8);
    }
}
