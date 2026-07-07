package i4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: l, reason: collision with root package name */
    public static final String f6366l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f6367m;

    /* renamed from: n, reason: collision with root package name */
    public static final String f6368n;

    /* renamed from: o, reason: collision with root package name */
    public static final String f6369o;

    /* renamed from: p, reason: collision with root package name */
    public static final String f6370p;

    /* renamed from: q, reason: collision with root package name */
    public static final String f6371q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f6372r;
    public static final String s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f6373t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f6374u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f6375v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f6376w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f6377x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f6378y;

    /* renamed from: a, reason: collision with root package name */
    public final k f6379a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f6380b;

    /* renamed from: c, reason: collision with root package name */
    public final r1.q0 f6381c;

    /* renamed from: d, reason: collision with root package name */
    public final r1.q0 f6382d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f6383e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f6384f;

    /* renamed from: g, reason: collision with root package name */
    public final j1 f6385g;

    /* renamed from: h, reason: collision with root package name */
    public final db.k0 f6386h;

    /* renamed from: i, reason: collision with root package name */
    public final db.k0 f6387i;
    public final MediaSession.Token j;

    /* renamed from: k, reason: collision with root package name */
    public final db.k0 f6388k;

    static {
        String str = u1.a0.f12750a;
        f6366l = Integer.toString(0, 36);
        f6367m = Integer.toString(1, 36);
        f6368n = Integer.toString(2, 36);
        f6369o = Integer.toString(9, 36);
        f6370p = Integer.toString(14, 36);
        f6371q = Integer.toString(13, 36);
        f6372r = Integer.toString(3, 36);
        s = Integer.toString(4, 36);
        f6373t = Integer.toString(5, 36);
        f6374u = Integer.toString(6, 36);
        f6375v = Integer.toString(11, 36);
        f6376w = Integer.toString(7, 36);
        f6377x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f6378y = Integer.toString(12, 36);
    }

    public h(k kVar, db.k0 k0Var, db.k0 k0Var2, db.k0 k0Var3, p1 p1Var, r1.q0 q0Var, r1.q0 q0Var2, Bundle bundle, Bundle bundle2, j1 j1Var, MediaSession.Token token) {
        this.f6379a = kVar;
        this.f6386h = k0Var;
        this.f6387i = k0Var2;
        this.f6388k = k0Var3;
        this.f6380b = p1Var;
        this.f6381c = q0Var;
        this.f6382d = q0Var2;
        this.f6383e = bundle;
        this.f6384f = bundle2;
        this.f6385g = j1Var;
        this.j = token;
    }

    public final Bundle a(int i6) {
        Bundle bundle = new Bundle();
        bundle.putInt(f6366l, 1008000300);
        h1 h1Var = (h1) this.f6379a;
        h1Var.getClass();
        bundle.putBinder(f6367m, h1Var);
        bundle.putParcelable(f6368n, null);
        db.k0 k0Var = this.f6386h;
        boolean isEmpty = k0Var.isEmpty();
        String str = f6369o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(k0Var.size());
            Iterator<E> it = k0Var.iterator();
            if (!it.hasNext()) {
                bundle.putParcelableArrayList(str, arrayList);
            } else {
                r4.a.t(it.next());
                throw null;
            }
        }
        db.k0 k0Var2 = this.f6387i;
        if (!k0Var2.isEmpty()) {
            if (i6 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(k0Var2.size());
                Iterator<E> it2 = k0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f6370p, arrayList2);
                } else {
                    r4.a.t(it2.next());
                    throw null;
                }
            } else {
                db.c1 a10 = a.a(k0Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(a10.A);
                db.i0 listIterator = a10.listIterator(0);
                if (!listIterator.hasNext()) {
                    bundle.putParcelableArrayList(str, arrayList3);
                } else {
                    r4.a.t(listIterator.next());
                    throw null;
                }
            }
        }
        db.k0 k0Var3 = this.f6388k;
        if (!k0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(k0Var3.size());
            Iterator<E> it3 = k0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f6371q, arrayList4);
            } else {
                r4.a.t(it3.next());
                throw null;
            }
        }
        p1 p1Var = this.f6380b;
        p1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        db.q1 it4 = p1Var.f6501a.iterator();
        while (it4.hasNext()) {
            o1 o1Var = (o1) it4.next();
            o1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(o1.f6489f, o1Var.f6492a);
            bundle3.putString(o1.f6490g, o1Var.f6493b);
            bundle3.putBundle(o1.f6491h, o1Var.f6494c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(p1.f6500b, arrayList5);
        bundle.putBundle(f6372r, bundle2);
        String str2 = s;
        r1.q0 q0Var = this.f6381c;
        bundle.putBundle(str2, q0Var.b());
        String str3 = f6373t;
        r1.q0 q0Var2 = this.f6382d;
        bundle.putBundle(str3, q0Var2.b());
        bundle.putBundle(f6374u, this.f6383e);
        bundle.putBundle(f6375v, this.f6384f);
        bundle.putBundle(f6376w, this.f6385g.e(lg.c.k(q0Var, q0Var2), false, false).f(i6));
        bundle.putInt(f6377x, 5);
        MediaSession.Token token = this.j;
        if (token != null) {
            bundle.putParcelable(f6378y, token);
        }
        return bundle;
    }
}
