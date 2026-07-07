package b2;

import a2.a2;
import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import db.h1;
import db.m0;
import db.n0;
import hb.r;
import i4.h0;
import i4.k0;
import i4.o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import m2.a0;
import m2.b0;
import m2.n;
import okhttp3.HttpUrl;
import q2.c0;
import q2.e0;
import q2.f0;
import q2.g0;
import q2.u;
import r1.l0;
import r1.q;
import u1.t;
import u1.y;
import v6.s;
import y2.p;
import yf.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class k implements y2.i, r, z6.e {
    public Object A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1382x;

    /* renamed from: y, reason: collision with root package name */
    public int f1383y;

    /* renamed from: z, reason: collision with root package name */
    public Object f1384z;

    public /* synthetic */ k(byte b10, int i6) {
        this.f1382x = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new j1.f0(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        r16 = (int[]) r0.f6907y;
        r17 = (float[]) r0.f6908z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0268, code lost:
    
        return new b2.k(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.f6907y, (float[]) r0.f6908z);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
    
        if (r25 <= com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0237, code lost:
    
        r20 = (int[]) r0.f6907y;
        r21 = (float[]) r0.f6908z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new j1.f0(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new j1.f0(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static b2.k f(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.k.f(android.content.res.Resources, int, android.content.res.Resources$Theme):b2.k");
    }

    public void A(b0 b0Var) {
        boolean z10;
        String b10 = b0Var.f8436c.b("CSeq");
        b10.getClass();
        int parseInt = Integer.parseInt(b10);
        n nVar = (n) this.A;
        SparseArray sparseArray = nVar.C;
        if (sparseArray.get(parseInt) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.g(z10);
        sparseArray.append(parseInt, b0Var);
        nVar.F.f(a0.f(b0Var));
        this.f1384z = b0Var;
    }

    public List B(CharSequence charSequence) {
        charSequence.getClass();
        a2 a2Var = (a2) this.A;
        a2Var.getClass();
        cb.k kVar = new cb.k(a2Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (kVar.hasNext()) {
            arrayList.add((String) kVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void C(int i6, long j, long j10) {
        n2.g gVar = new n2.g(1, i6, null, 3, null, u1.a0.e0(j), u1.a0.e0(j10));
        c0 c0Var = (c0) this.f1384z;
        c0Var.getClass();
        g(new h0(this, c0Var, gVar, 10));
    }

    @Override // z6.e
    public void a() {
        boolean z10;
        x6.a aVar = (x6.a) this.f1384z;
        Drawable drawable = aVar.f14692y.getDrawable();
        v6.l lVar = (v6.l) this.A;
        Drawable a10 = lVar.a();
        w6.g gVar = lVar.b().f13402x;
        int i6 = this.f1383y;
        boolean z11 = lVar instanceof s;
        if (z11 && ((s) lVar).f13430g) {
            z10 = false;
        } else {
            z10 = true;
        }
        o6.a aVar2 = new o6.a(drawable, a10, gVar, i6, z10);
        if (z11) {
            aVar.b(aVar2);
        } else {
            if (lVar instanceof v6.f) {
                aVar.b(aVar2);
                return;
            }
            throw new RuntimeException();
        }
    }

    public ec.b b() {
        if (HttpUrl.FRAGMENT_ENCODE_SET.isEmpty()) {
            return new ec.b(this.f1383y, (String) this.A, ((Long) this.f1384z).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(HttpUrl.FRAGMENT_ENCODE_SET));
    }

    public n0 c() {
        m0 m0Var = (m0) this.A;
        if (m0Var == null) {
            h1 g10 = h1.g(this.f1383y, (Object[]) this.f1384z, this);
            m0 m0Var2 = (m0) this.A;
            if (m0Var2 == null) {
                return g10;
            }
            throw m0Var2.a();
        }
        throw m0Var.a();
    }

    @Override // y2.i
    public y2.h d(p pVar, long j) {
        long j10;
        switch (this.f1382x) {
            case 3:
                long position = pVar.getPosition();
                long i6 = i(pVar);
                long l10 = pVar.l();
                pVar.o(Math.max(6, ((y2.s) this.f1384z).f14933c));
                long i10 = i(pVar);
                long l11 = pVar.l();
                if (i6 <= j && i10 > j) {
                    return new y2.h(0, -9223372036854775807L, l10);
                }
                if (i10 <= j) {
                    return new y2.h(-2, i10, l11);
                }
                return new y2.h(-1, i6, position);
            default:
                long position2 = pVar.getPosition();
                int min = (int) Math.min(112800, pVar.getLength() - position2);
                t tVar = (t) this.A;
                tVar.H(min);
                pVar.C(tVar.f12811a, 0, min);
                int i11 = tVar.f12813c;
                long j11 = -1;
                long j12 = -1;
                long j13 = -9223372036854775807L;
                while (true) {
                    if (tVar.a() >= 188) {
                        byte[] bArr = tVar.f12811a;
                        int i12 = tVar.f12812b;
                        while (true) {
                            if (i12 < i11) {
                                j10 = -9223372036854775807L;
                                if (bArr[i12] != 71) {
                                    i12++;
                                }
                            } else {
                                j10 = -9223372036854775807L;
                            }
                        }
                        int i13 = i12 + 188;
                        if (i13 <= i11) {
                            long h4 = e9.f.h(tVar, i12, this.f1383y);
                            if (h4 != j10) {
                                long b10 = ((y) this.f1384z).b(h4);
                                if (b10 > j) {
                                    if (j13 == j10) {
                                        return new y2.h(-1, b10, position2);
                                    }
                                    return new y2.h(0, -9223372036854775807L, position2 + j12);
                                }
                                j13 = b10;
                                if (100000 + j13 > j) {
                                    return new y2.h(0, -9223372036854775807L, position2 + i12);
                                }
                                j12 = i12;
                            }
                            tVar.K(i13);
                            j11 = i13;
                        }
                    } else {
                        j10 = -9223372036854775807L;
                    }
                }
                if (j13 != j10) {
                    return new y2.h(-2, j13, position2 + j11);
                }
                return y2.h.f14908d;
        }
    }

    @Override // y2.i
    public void e() {
        switch (this.f1382x) {
            case 3:
                return;
            default:
                t tVar = (t) this.A;
                byte[] bArr = u1.a0.f12751b;
                tVar.getClass();
                tVar.I(bArr.length, bArr);
                return;
        }
    }

    public void g(u1.g gVar) {
        Iterator it = ((CopyOnWriteArrayList) this.A).iterator();
        while (it.hasNext()) {
            q2.h0 h0Var = (q2.h0) it.next();
            u1.a0.U(h0Var.f10887a, new m8.c(1, gVar, h0Var.f10888b));
        }
    }

    public void h(int i6, q qVar, int i10, Object obj, long j) {
        g(new b(19, this, new n2.g(1, i6, qVar, i10, obj, u1.a0.e0(j), -9223372036854775807L)));
    }

    public long i(p pVar) {
        int r10;
        mc.i iVar = (mc.i) this.A;
        y2.s sVar = (y2.s) this.f1384z;
        while (pVar.l() < pVar.getLength() - 6) {
            int i6 = this.f1383y;
            long l10 = pVar.l();
            byte[] bArr = new byte[2];
            int i10 = 0;
            boolean d10 = false;
            pVar.C(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i6) {
                pVar.v();
                pVar.o((int) (l10 - pVar.getPosition()));
            } else {
                t tVar = new t(16);
                System.arraycopy(bArr, 0, tVar.f12811a, 0, 2);
                byte[] bArr2 = tVar.f12811a;
                while (i10 < 14 && (r10 = pVar.r(bArr2, 2 + i10, 14 - i10)) != -1) {
                    i10 += r10;
                }
                tVar.J(i10);
                pVar.v();
                pVar.o((int) (l10 - pVar.getPosition()));
                d10 = y2.a.d(tVar, sVar, i6, iVar);
            }
            if (d10) {
                break;
            }
            pVar.o(1);
        }
        if (pVar.l() >= pVar.getLength() - 6) {
            pVar.o((int) (pVar.getLength() - pVar.l()));
            return sVar.j;
        }
        return iVar.f8812a;
    }

    public Object j(int i6) {
        SparseArray sparseArray = (SparseArray) this.f1384z;
        if (this.f1383y == -1) {
            this.f1383y = 0;
        }
        while (true) {
            int i10 = this.f1383y;
            if (i10 <= 0 || i6 >= sparseArray.keyAt(i10)) {
                break;
            }
            this.f1383y--;
        }
        while (this.f1383y < sparseArray.size() - 1 && i6 >= sparseArray.keyAt(this.f1383y + 1)) {
            this.f1383y++;
        }
        return sparseArray.valueAt(this.f1383y);
    }

    public String k() {
        StringBuilder sb2 = new StringBuilder("$");
        int i6 = this.f1383y + 1;
        for (int i10 = 0; i10 < i6; i10++) {
            Object obj = ((Object[]) this.f1384z)[i10];
            if (obj instanceof uf.g) {
                uf.g gVar = (uf.g) obj;
                if (kotlin.jvm.internal.k.a(gVar.getKind(), uf.j.f13137g)) {
                    if (((int[]) this.A)[i10] != -1) {
                        sb2.append("[");
                        sb2.append(((int[]) this.A)[i10]);
                        sb2.append("]");
                    }
                } else {
                    int i11 = ((int[]) this.A)[i10];
                    if (i11 >= 0) {
                        sb2.append(".");
                        sb2.append(gVar.f(i11));
                    }
                }
            } else if (obj != o.f15078a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.internal.measurement.e5, java.io.IOException] */
    public b0 l(int i6, String str, Map map, Uri uri) {
        n nVar = (n) this.A;
        String str2 = nVar.f8526z;
        int i10 = this.f1383y;
        this.f1383y = i10 + 1;
        k7.c cVar = new k7.c(i10, str2, str);
        if (nVar.K != null) {
            u1.c.h(nVar.G);
            try {
                cVar.u("Authorization", nVar.K.c(nVar.G, uri, i6));
            } catch (l0 e10) {
                n.d(nVar, new IOException(e10));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            cVar.u((String) entry.getKey(), (String) entry.getValue());
        }
        return new b0(uri, i6, new m2.o(cVar), HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public boolean m() {
        ColorStateList colorStateList;
        if (((Shader) this.f1384z) == null && (colorStateList = (ColorStateList) this.A) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void n(u uVar, int i6, int i10, q qVar, int i11, Object obj, long j, long j10) {
        g(new f0(this, uVar, new n2.g(i6, i10, qVar, i11, obj, u1.a0.e0(j), u1.a0.e0(j10)), 1));
    }

    public void o(u uVar, int i6) {
        p(uVar, i6, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // hb.r
    public void onSuccess(Object obj) {
        i4.b0 b0Var = ((o0) this.A).f6473g;
        Handler handler = b0Var.f6311l;
        i4.s sVar = (i4.s) this.f1384z;
        u1.a0.U(handler, new a2.c0(b0Var, sVar, new k0(this, this.f1383y, (List) obj, sVar)));
    }

    public void p(u uVar, int i6, int i10, q qVar, int i11, Object obj, long j, long j10) {
        g(new f0(this, uVar, new n2.g(i6, i10, qVar, i11, obj, u1.a0.e0(j), u1.a0.e0(j10)), 0));
    }

    public void q(u uVar, int i6, int i10, q qVar, int i11, Object obj, long j, long j10, IOException iOException, boolean z10) {
        g(new g0(this, uVar, new n2.g(i6, i10, qVar, i11, obj, u1.a0.e0(j), u1.a0.e0(j10)), iOException, z10));
    }

    public void r(u uVar, int i6, IOException iOException, boolean z10) {
        q(uVar, i6, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
    }

    public void s(u uVar, int i6, int i10, q qVar, int i11, Object obj, long j, long j10, int i12) {
        g(new e0(this, uVar, new n2.g(i6, i10, qVar, i11, obj, u1.a0.e0(j), u1.a0.e0(j10)), i12));
    }

    public String toString() {
        switch (this.f1382x) {
            case 13:
                return k();
            default:
                return super.toString();
        }
    }

    public k u(Object obj, Object obj2) {
        int i6 = (this.f1383y + 1) * 2;
        Object[] objArr = (Object[]) this.f1384z;
        if (i6 > objArr.length) {
            this.f1384z = Arrays.copyOf(objArr, db.e0.f(objArr.length, i6));
        }
        db.r.d(obj, obj2);
        Object[] objArr2 = (Object[]) this.f1384z;
        int i10 = this.f1383y;
        int i11 = i10 * 2;
        objArr2[i11] = obj;
        objArr2[i11 + 1] = obj2;
        this.f1383y = i10 + 1;
        return this;
    }

    public k v(h1 h1Var) {
        return x(h1Var.entrySet());
    }

    public k x(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.f1383y) * 2;
            Object[] objArr = (Object[]) this.f1384z;
            if (size > objArr.length) {
                this.f1384z = Arrays.copyOf(objArr, db.e0.f(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            u(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public void y() {
        int i6 = this.f1383y * 2;
        Object[] copyOf = Arrays.copyOf((Object[]) this.f1384z, i6);
        kotlin.jvm.internal.k.d(copyOf, "copyOf(...)");
        this.f1384z = copyOf;
        int[] iArr = new int[i6];
        for (int i10 = 0; i10 < i6; i10++) {
            iArr[i10] = -1;
        }
        ie.i.f0(0, 14, (int[]) this.A, iArr);
        this.A = iArr;
    }

    public void z() {
        u1.c.h((b0) this.f1384z);
        db.l0 l0Var = ((b0) this.f1384z).f8436c.f8527a;
        HashMap hashMap = new HashMap();
        for (String str : l0Var.A.keySet()) {
            if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                hashMap.put(str, (String) db.r.l(l0Var.d(str)));
            }
        }
        b0 b0Var = (b0) this.f1384z;
        A(l(b0Var.f8435b, ((n) this.A).H, hashMap, b0Var.f8434a));
    }

    public k(x6.a aVar, v6.l lVar, int i6) {
        this.f1382x = 14;
        this.f1384z = aVar;
        this.A = lVar;
        this.f1383y = i6;
        if (i6 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    public k(int i6, m2.o oVar, String str) {
        this.f1382x = 10;
        this.f1383y = i6;
        this.f1384z = oVar;
        this.A = str;
    }

    public k(o5.p pVar) {
        this.f1382x = 12;
        this.f1384z = new SparseArray();
        this.A = pVar;
        this.f1383y = -1;
    }

    public k(Shader shader, ColorStateList colorStateList, int i6) {
        this.f1382x = 8;
        this.f1384z = shader;
        this.A = colorStateList;
        this.f1383y = i6;
    }

    private final /* synthetic */ void t() {
    }

    public k(y2.s sVar, int i6) {
        this.f1382x = 3;
        this.f1384z = sVar;
        this.f1383y = i6;
        this.A = new Object();
    }

    @Override // hb.r
    public void w(Throwable th) {
    }

    public k(int i6, y yVar) {
        this.f1382x = 6;
        this.f1383y = i6;
        this.f1384z = yVar;
        this.A = new t();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.measurement.p4, java.lang.Object] */
    public k(w1.g gVar) {
        this.f1382x = 2;
        ?? obj = new Object();
        obj.f2389b = new Object();
        this.A = obj;
        this.f1384z = gVar;
        this.f1383y = 1;
    }

    public k(a2 a2Var) {
        this.f1382x = 1;
        this.A = a2Var;
        this.f1384z = cb.d.f2005x;
        this.f1383y = Integer.MAX_VALUE;
    }

    public k(CopyOnWriteArrayList copyOnWriteArrayList, int i6, c0 c0Var) {
        this.f1382x = 11;
        this.A = copyOnWriteArrayList;
        this.f1383y = i6;
        this.f1384z = c0Var;
    }

    public k(n nVar) {
        this.f1382x = 9;
        this.A = nVar;
    }

    public k(int i6) {
        this.f1382x = 4;
        this.f1384z = new Object[i6 * 2];
        this.f1383y = 0;
    }

    public k(q qVar, int i6, String str) {
        this.f1382x = 0;
        this.f1384z = qVar;
        this.f1383y = i6;
        this.A = str;
    }

    public k(o0 o0Var, i4.s sVar, int i6) {
        this.f1382x = 7;
        this.A = o0Var;
        this.f1384z = sVar;
        this.f1383y = i6;
    }
}
