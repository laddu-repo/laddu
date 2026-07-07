package r1;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: g, reason: collision with root package name */
    public static final e0 f11372g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f11373h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f11374i;
    public static final String j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f11375k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f11376l;

    /* renamed from: m, reason: collision with root package name */
    public static final String f11377m;

    /* renamed from: a, reason: collision with root package name */
    public final String f11378a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f11379b;

    /* renamed from: c, reason: collision with root package name */
    public final z f11380c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f11381d;

    /* renamed from: e, reason: collision with root package name */
    public final x f11382e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f11383f;

    /* JADX WARN: Type inference failed for: r4v0, types: [r1.w, r1.x] */
    static {
        v vVar = new v();
        db.i0 i0Var = db.k0.f4008y;
        db.c1 c1Var = db.c1.B;
        List list = Collections.EMPTY_LIST;
        db.c1 c1Var2 = db.c1.B;
        e2.t tVar = new e2.t();
        f11372g = new e0(HttpUrl.FRAGMENT_ENCODE_SET, new w(vVar), null, new z(tVar), h0.K, b0.f11307d);
        f11373h = Integer.toString(0, 36);
        f11374i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        f11375k = Integer.toString(3, 36);
        f11376l = Integer.toString(4, 36);
        f11377m = Integer.toString(5, 36);
    }

    public e0(String str, x xVar, a0 a0Var, z zVar, h0 h0Var, b0 b0Var) {
        this.f11378a = str;
        this.f11379b = a0Var;
        this.f11380c = zVar;
        this.f11381d = h0Var;
        this.f11382e = xVar;
        this.f11383f = b0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [r1.p0, java.lang.Object] */
    public static e0 a(Bundle bundle) {
        z zVar;
        h0 b10;
        boolean z10;
        boolean z11;
        boolean z12;
        w wVar;
        b0 b0Var;
        Map a10;
        Cloneable cloneable;
        y yVar;
        u uVar;
        db.c1 g10;
        db.c1 j10;
        a0 a0Var;
        String string = bundle.getString(f11373h, HttpUrl.FRAGMENT_ENCODE_SET);
        string.getClass();
        Bundle bundle2 = bundle.getBundle(f11374i);
        if (bundle2 == null) {
            zVar = z.f11763f;
        } else {
            e2.t tVar = new e2.t();
            String str = z.f11764g;
            z zVar2 = z.f11763f;
            tVar.f4275a = bundle2.getLong(str, zVar2.f11768a);
            tVar.f4276b = bundle2.getLong(z.f11765h, zVar2.f11769b);
            tVar.f4277c = bundle2.getLong(z.f11766i, zVar2.f11770c);
            tVar.f4278d = bundle2.getFloat(z.j, zVar2.f11771d);
            tVar.f4279e = bundle2.getFloat(z.f11767k, zVar2.f11772e);
            zVar = new z(tVar);
        }
        z zVar3 = zVar;
        Bundle bundle3 = bundle.getBundle(j);
        if (bundle3 == null) {
            b10 = h0.K;
        } else {
            b10 = h0.b(bundle3);
        }
        h0 h0Var = b10;
        Bundle bundle4 = bundle.getBundle(f11375k);
        if (bundle4 == null) {
            wVar = x.f11740r;
        } else {
            v vVar = new v();
            String str2 = w.j;
            w wVar2 = w.f11720i;
            long j11 = wVar2.f11728a;
            long j12 = wVar2.f11731d;
            long j13 = wVar2.f11729b;
            long Q = u1.a0.Q(bundle4.getLong(str2, j11));
            boolean z13 = true;
            if (Q >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u1.c.b(z10);
            vVar.f11713a = Q;
            long Q2 = u1.a0.Q(bundle4.getLong(w.f11721k, wVar2.f11730c));
            if (Q2 != Long.MIN_VALUE && Q2 < 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            u1.c.b(z11);
            vVar.f11714b = Q2;
            vVar.f11715c = bundle4.getBoolean(w.f11722l, wVar2.f11732e);
            vVar.f11716d = bundle4.getBoolean(w.f11723m, wVar2.f11733f);
            vVar.f11717e = bundle4.getBoolean(w.f11724n, wVar2.f11734g);
            vVar.f11718f = bundle4.getBoolean(w.f11727q, wVar2.f11735h);
            long j14 = bundle4.getLong(w.f11725o, j13);
            if (j14 != j13) {
                if (j14 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                u1.c.b(z12);
                vVar.f11713a = j14;
            }
            long j15 = bundle4.getLong(w.f11726p, j12);
            if (j15 != j12) {
                if (j15 != Long.MIN_VALUE && j15 < 0) {
                    z13 = false;
                }
                u1.c.b(z13);
                vVar.f11714b = j15;
            }
            wVar = new w(vVar);
        }
        x xVar = wVar;
        Bundle bundle5 = bundle.getBundle(f11376l);
        if (bundle5 == null) {
            b0Var = b0.f11307d;
        } else {
            n9.j jVar = new n9.j(9);
            jVar.f9355y = (Uri) bundle5.getParcelable(b0.f11308e);
            jVar.f9356z = bundle5.getString(b0.f11309f);
            jVar.A = bundle5.getBundle(b0.f11310g);
            b0Var = new b0(jVar);
        }
        b0 b0Var2 = b0Var;
        Bundle bundle6 = bundle.getBundle(f11377m);
        if (bundle6 == null) {
            a0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(a0.f11277k);
            if (bundle7 == null) {
                yVar = null;
            } else {
                String string2 = bundle7.getString(y.f11744i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(y.j);
                String str3 = y.f11745k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    a10 = db.h1.D;
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str4 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str4);
                            if (string3 != null) {
                                hashMap.put(str4, string3);
                            }
                        }
                    }
                    a10 = db.n0.a(hashMap);
                }
                boolean z14 = bundle7.getBoolean(y.f11746l, false);
                boolean z15 = bundle7.getBoolean(y.f11747m, false);
                boolean z16 = bundle7.getBoolean(y.f11748n, false);
                String str5 = y.f11749o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                db.k0 k8 = db.k0.k(arrayList);
                byte[] byteArray = bundle7.getByteArray(y.f11750p);
                f5.b bVar = new f5.b(fromString);
                bVar.f5022e = uri;
                bVar.f5023f = db.n0.a(a10);
                bVar.f5018a = z14;
                bVar.f5020c = z16;
                bVar.f5019b = z15;
                bVar.f5024g = db.k0.k(k8);
                if (byteArray != null) {
                    cloneable = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    cloneable = null;
                }
                bVar.f5025h = cloneable;
                yVar = new y(bVar);
            }
            Bundle bundle10 = bundle6.getBundle(a0.f11278l);
            if (bundle10 == null) {
                uVar = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(u.f11711b);
                uri2.getClass();
                ?? obj = new Object();
                obj.f11625a = uri2;
                uVar = new u(obj);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(a0.f11279m);
            if (parcelableArrayList == null) {
                db.i0 i0Var = db.k0.f4008y;
                g10 = db.c1.B;
            } else {
                db.h0 j16 = db.k0.j();
                int i6 = 0;
                while (i6 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i6);
                    bundle11.getClass();
                    j16.a(new x0(bundle11.getInt(x0.A, 0), bundle11.getInt(x0.B, 0), bundle11.getInt(x0.C, 0)));
                    i6++;
                    parcelableArrayList = parcelableArrayList;
                }
                g10 = j16.g();
            }
            db.c1 c1Var = g10;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(a0.f11281o);
            if (parcelableArrayList2 == null) {
                db.i0 i0Var2 = db.k0.f4008y;
                j10 = db.c1.B;
            } else {
                j10 = u1.c.j(new o5.p(11), parcelableArrayList2);
            }
            db.c1 c1Var2 = j10;
            long j17 = bundle6.getLong(a0.f11282p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(a0.f11276i);
            uri3.getClass();
            a0Var = new a0(uri3, bundle6.getString(a0.j), yVar, uVar, c1Var, bundle6.getString(a0.f11280n), c1Var2, j17);
        }
        return new e0(string, xVar, a0Var, zVar3, h0Var, b0Var2);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [r1.w, r1.x] */
    public static e0 b(String str) {
        Uri parse;
        boolean z10;
        a0 a0Var;
        v vVar = new v();
        f5.b bVar = new f5.b();
        List list = Collections.EMPTY_LIST;
        db.c1 c1Var = db.c1.B;
        e2.t tVar = new e2.t();
        b0 b0Var = b0.f11307d;
        if (str == null) {
            parse = null;
        } else {
            parse = Uri.parse(str);
        }
        if (((Uri) bVar.f5022e) != null && ((UUID) bVar.f5021d) == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        u1.c.g(z10);
        y yVar = null;
        if (parse != null) {
            if (((UUID) bVar.f5021d) != null) {
                yVar = new y(bVar);
            }
            a0Var = new a0(parse, null, yVar, null, list, null, c1Var, -9223372036854775807L);
        } else {
            a0Var = null;
        }
        return new e0(HttpUrl.FRAGMENT_ENCODE_SET, new w(vVar), a0Var, new z(tVar), h0.K, b0Var);
    }

    public final Bundle c(boolean z10) {
        a0 a0Var;
        Bundle bundle = new Bundle();
        String str = this.f11378a;
        if (!str.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
            bundle.putString(f11373h, str);
        }
        z zVar = z.f11763f;
        z zVar2 = this.f11380c;
        if (!zVar2.equals(zVar)) {
            bundle.putBundle(f11374i, zVar2.b());
        }
        h0 h0Var = h0.K;
        h0 h0Var2 = this.f11381d;
        if (!h0Var2.equals(h0Var)) {
            bundle.putBundle(j, h0Var2.c());
        }
        w wVar = w.f11720i;
        x xVar = this.f11382e;
        if (!xVar.equals(wVar)) {
            Bundle bundle2 = new Bundle();
            long j10 = xVar.f11728a;
            if (j10 != wVar.f11728a) {
                bundle2.putLong(w.j, j10);
            }
            long j11 = xVar.f11730c;
            if (j11 != wVar.f11730c) {
                bundle2.putLong(w.f11721k, j11);
            }
            long j12 = xVar.f11729b;
            if (j12 != wVar.f11729b) {
                bundle2.putLong(w.f11725o, j12);
            }
            long j13 = xVar.f11731d;
            if (j13 != wVar.f11731d) {
                bundle2.putLong(w.f11726p, j13);
            }
            boolean z11 = xVar.f11732e;
            if (z11 != wVar.f11732e) {
                bundle2.putBoolean(w.f11722l, z11);
            }
            boolean z12 = xVar.f11733f;
            if (z12 != wVar.f11733f) {
                bundle2.putBoolean(w.f11723m, z12);
            }
            boolean z13 = xVar.f11734g;
            if (z13 != wVar.f11734g) {
                bundle2.putBoolean(w.f11724n, z13);
            }
            boolean z14 = xVar.f11735h;
            if (z14 != wVar.f11735h) {
                bundle2.putBoolean(w.f11727q, z14);
            }
            bundle.putBundle(f11375k, bundle2);
        }
        b0 b0Var = b0.f11307d;
        b0 b0Var2 = this.f11383f;
        if (!b0Var2.equals(b0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = b0Var2.f11311a;
            if (uri != null) {
                bundle3.putParcelable(b0.f11308e, uri);
            }
            String str2 = b0Var2.f11312b;
            if (str2 != null) {
                bundle3.putString(b0.f11309f, str2);
            }
            Bundle bundle4 = b0Var2.f11313c;
            if (bundle4 != null) {
                bundle3.putBundle(b0.f11310g, bundle4);
            }
            bundle.putBundle(f11376l, bundle3);
        }
        if (z10 && (a0Var = this.f11379b) != null) {
            db.k0 k0Var = a0Var.f11289g;
            List list = a0Var.f11287e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(a0.f11276i, a0Var.f11283a);
            String str3 = a0Var.f11284b;
            if (str3 != null) {
                bundle5.putString(a0.j, str3);
            }
            y yVar = a0Var.f11285c;
            if (yVar != null) {
                String str4 = a0.f11277k;
                db.k0 k0Var2 = yVar.f11757g;
                db.n0 n0Var = yVar.f11753c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(y.f11744i, yVar.f11751a.toString());
                Uri uri2 = yVar.f11752b;
                if (uri2 != null) {
                    bundle6.putParcelable(y.j, uri2);
                }
                if (!n0Var.isEmpty()) {
                    String str5 = y.f11745k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : n0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = yVar.f11754d;
                if (z15) {
                    bundle6.putBoolean(y.f11746l, z15);
                }
                boolean z16 = yVar.f11755e;
                if (z16) {
                    bundle6.putBoolean(y.f11747m, z16);
                }
                boolean z17 = yVar.f11756f;
                if (z17) {
                    bundle6.putBoolean(y.f11748n, z17);
                }
                if (!k0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(y.f11749o, new ArrayList<>(k0Var2));
                }
                byte[] bArr = yVar.f11758h;
                if (bArr != null) {
                    bundle6.putByteArray(y.f11750p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            u uVar = a0Var.f11286d;
            if (uVar != null) {
                String str6 = a0.f11278l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(u.f11711b, uVar.f11712a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(a0.f11279m, u1.c.p(list, new o5.p(9)));
            }
            String str7 = a0Var.f11288f;
            if (str7 != null) {
                bundle5.putString(a0.f11280n, str7);
            }
            if (!k0Var.isEmpty()) {
                bundle5.putParcelableArrayList(a0.f11281o, u1.c.p(k0Var, new o5.p(10)));
            }
            long j14 = a0Var.f11290h;
            if (j14 != -9223372036854775807L) {
                bundle5.putLong(a0.f11282p, j14);
            }
            bundle.putBundle(f11377m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e0) {
                e0 e0Var = (e0) obj;
                if (Objects.equals(this.f11378a, e0Var.f11378a) && this.f11382e.equals(e0Var.f11382e) && Objects.equals(this.f11379b, e0Var.f11379b) && Objects.equals(this.f11380c, e0Var.f11380c) && Objects.equals(this.f11381d, e0Var.f11381d) && Objects.equals(this.f11383f, e0Var.f11383f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i6;
        int hashCode = this.f11378a.hashCode() * 31;
        a0 a0Var = this.f11379b;
        if (a0Var != null) {
            i6 = a0Var.hashCode();
        } else {
            i6 = 0;
        }
        return this.f11383f.hashCode() + ((this.f11381d.hashCode() + ((this.f11382e.hashCode() + ((this.f11380c.hashCode() + ((hashCode + i6) * 31)) * 31)) * 31)) * 31);
    }
}
