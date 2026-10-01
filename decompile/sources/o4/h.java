package o4;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.f0;
import androidx.lifecycle.p1;
import cf.p;
import cf.t;
import com.google.android.gms.internal.measurement.k4;
import he.y;
import ie.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kf.f1;
import kf.t0;
import kf.x0;
import kf.y0;
import kotlin.jvm.internal.s;
import l4.j0;
import l4.k0;
import l4.m;
import l4.u;
import l4.v;
import l4.x;
import l4.z;
import s8.n;
import ve.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    public final x f9899a;

    /* renamed from: b */
    public final l4.j f9900b;

    /* renamed from: c */
    public v f9901c;

    /* renamed from: d */
    public Bundle f9902d;

    /* renamed from: e */
    public Bundle[] f9903e;

    /* renamed from: f */
    public final ie.h f9904f = new ie.h();

    /* renamed from: g */
    public final f1 f9905g;

    /* renamed from: h */
    public final f1 f9906h;

    /* renamed from: i */
    public final LinkedHashMap f9907i;
    public final LinkedHashMap j;

    /* renamed from: k */
    public final LinkedHashMap f9908k;

    /* renamed from: l */
    public final LinkedHashMap f9909l;

    /* renamed from: m */
    public f0 f9910m;

    /* renamed from: n */
    public m f9911n;

    /* renamed from: o */
    public final ArrayList f9912o;

    /* renamed from: p */
    public androidx.lifecycle.x f9913p;

    /* renamed from: q */
    public final f5.a f9914q;

    /* renamed from: r */
    public final k0 f9915r;
    public final LinkedHashMap s;

    /* renamed from: t */
    public l f9916t;

    /* renamed from: u */
    public e f9917u;

    /* renamed from: v */
    public final LinkedHashMap f9918v;

    /* renamed from: w */
    public int f9919w;

    /* renamed from: x */
    public final ArrayList f9920x;

    /* renamed from: y */
    public final x0 f9921y;

    public h(x xVar, l4.j jVar) {
        this.f9899a = xVar;
        this.f9900b = jVar;
        r rVar = r.f6846x;
        this.f9905g = y0.c(rVar);
        this.f9906h = y0.c(rVar);
        this.f9907i = new LinkedHashMap();
        this.j = new LinkedHashMap();
        this.f9908k = new LinkedHashMap();
        this.f9909l = new LinkedHashMap();
        this.f9912o = new ArrayList();
        this.f9913p = androidx.lifecycle.x.f992y;
        this.f9914q = new f5.a(this, 2);
        this.f9915r = new k0();
        this.s = new LinkedHashMap();
        this.f9918v = new LinkedHashMap();
        this.f9920x = new ArrayList();
        this.f9921y = y0.b(1, 2);
    }

    public static u d(int i6, u uVar, u uVar2, boolean z10) {
        v vVar;
        if (uVar.f8195y.f9924a == i6 && (uVar2 == null || (uVar.equals(uVar2) && kotlin.jvm.internal.k.a(uVar.f8196z, uVar2.f8196z)))) {
            return uVar;
        }
        if (uVar instanceof v) {
            vVar = (v) uVar;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            vVar = uVar.f8196z;
            kotlin.jvm.internal.k.b(vVar);
        }
        return vVar.D.b(i6, vVar, uVar2, z10);
    }

    public static /* synthetic */ void o(h hVar, l4.h hVar2) {
        hVar.n(hVar2, false, new ie.h());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a3, code lost:
    
        r7.addFirst(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a6, code lost:
    
        r2 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        if (r2.hasNext() == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b0, code lost:
    
        r4 = (l4.h) r2.next();
        r5 = r16.s.get(r16.f9915r.b(r4.f8141y.f8194x));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c6, code lost:
    
        if (r5 == null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c8, code lost:
    
        ((l4.k) r5).a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e6, code lost:
    
        throw new java.lang.IllegalStateException(r4.a.o(new java.lang.StringBuilder("NavigatorBackStack for "), r17.f8194x, " should already be created").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e7, code lost:
    
        r10.addAll(r7);
        r10.addLast(r19);
        r1 = ie.j.Q(r7, r19);
        r2 = r1.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f6, code lost:
    
        if (r8 >= r2) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f8, code lost:
    
        r3 = r1.get(r8);
        r8 = r8 + 1;
        r3 = (l4.h) r3;
        r4 = r3.f8141y.f8196z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0204, code lost:
    
        if (r4 == null) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0206, code lost:
    
        j(r3, e(r4.f8195y.f9924a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0212, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x015b, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00a3, code lost:
    
        r11 = ((l4.h) r7.first()).f8141y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r7 = new ie.h();
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if ((r17 instanceof l4.v) == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        kotlin.jvm.internal.k.b(r11);
        r11 = r11.f8196z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r11 == null) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        r13 = r20.listIterator(r20.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r13.hasPrevious() == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r14 = r13.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (kotlin.jvm.internal.k.a(((l4.h) r14).f8141y, r11) == false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        r14 = (l4.h) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r14 != null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        r14 = l4.h0.a(r5, r11, r18, h(), r16.f9911n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        r7.addFirst(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (r10.isEmpty() != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0016, code lost:
    
        if (r7 == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (((l4.h) r10.last()).f8141y != r11) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        o(r16, (l4.h) r10.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        if (r11 == null) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        if (r11 != r17) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        if (r7.isEmpty() == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
    
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (r11 == null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if (c(r11.f8195y.f9924a, r11) == r11) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
    
        r11 = r11.f8196z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b9, code lost:
    
        if (r11 == null) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bb, code lost:
    
        if (r18 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r10.isEmpty() != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        if (r18.isEmpty() != true) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c6, code lost:
    
        r14 = r20.listIterator(r20.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d2, code lost:
    
        if (r14.hasPrevious() == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d4, code lost:
    
        r15 = r14.previous();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e1, code lost:
    
        if (kotlin.jvm.internal.k.a(((l4.h) r15).f8141y, r11) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e7, code lost:
    
        r15 = (l4.h) r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e9, code lost:
    
        if (r15 != null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00eb, code lost:
    
        r15 = l4.h0.a(r5, r11, r11.a(r13), h(), r16.f9911n);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f9, code lost:
    
        r7.addFirst(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e6, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c5, code lost:
    
        r13 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if ((((l4.h) r10.last()).f8141y instanceof l4.e) == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0102, code lost:
    
        if (r7.isEmpty() == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0105, code lost:
    
        r6 = ((l4.h) r7.first()).f8141y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0111, code lost:
    
        if (r10.isEmpty() != false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x011d, code lost:
    
        if ((((l4.h) r10.last()).f8141y instanceof l4.v) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011f, code lost:
    
        r8 = ((l4.h) r10.last()).f8141y;
        kotlin.jvm.internal.k.c(r8, "null cannot be cast to non-null type androidx.navigation.NavGraph");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x013c, code lost:
    
        if (((v.m) ((l4.v) r8).D.f12261c).c(r6.f8195y.f9924a) != null) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013e, code lost:
    
        o(r16, (l4.h) r10.last());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0148, code lost:
    
        r6 = (l4.h) r10.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014e, code lost:
    
        if (r6 != null) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0150, code lost:
    
        r6 = (l4.h) r7.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0156, code lost:
    
        if (r6 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0158, code lost:
    
        r6 = r6.f8141y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0162, code lost:
    
        if (kotlin.jvm.internal.k.a(r6, r16.f9901c) != false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (m(((l4.h) r10.last()).f8141y.f8195y.f9924a, true, false) != false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0164, code lost:
    
        r4 = r20.listIterator(r20.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0170, code lost:
    
        if (r4.hasPrevious() == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0172, code lost:
    
        r6 = r4.previous();
        r8 = ((l4.h) r6).f8141y;
        r9 = r16.f9901c;
        kotlin.jvm.internal.k.b(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0184, code lost:
    
        if (kotlin.jvm.internal.k.a(r8, r9) == false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0186, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0187, code lost:
    
        r12 = (l4.h) r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0189, code lost:
    
        if (r12 != null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018b, code lost:
    
        r4 = r16.f9901c;
        kotlin.jvm.internal.k.b(r4);
        r6 = r16.f9901c;
        kotlin.jvm.internal.k.b(r6);
        r12 = l4.h0.a(r5, r4, r6.a(r18), h(), r16.f9911n);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(l4.u r17, android.os.Bundle r18, l4.h r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.h.a(l4.u, android.os.Bundle, l4.h, java.util.List):void");
    }

    public final boolean b() {
        ie.h hVar;
        while (true) {
            hVar = this.f9904f;
            if (hVar.isEmpty() || !(((l4.h) hVar.last()).f8141y instanceof v)) {
                break;
            }
            o(this, (l4.h) hVar.last());
        }
        l4.h hVar2 = (l4.h) hVar.g();
        ArrayList arrayList = this.f9920x;
        if (hVar2 != null) {
            arrayList.add(hVar2);
        }
        this.f9919w++;
        t();
        int i6 = this.f9919w - 1;
        this.f9919w = i6;
        if (i6 == 0) {
            ArrayList a02 = ie.j.a0(arrayList);
            arrayList.clear();
            int size = a02.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = a02.get(i10);
                i10++;
                l4.h hVar3 = (l4.h) obj;
                Iterator it = ie.j.Z(this.f9912o).iterator();
                while (it.hasNext()) {
                    ((l4.l) it.next()).a(this.f9899a, hVar3.f8141y, hVar3.E.a());
                }
                this.f9921y.m(hVar3);
            }
            ArrayList a03 = ie.j.a0(hVar);
            f1 f1Var = this.f9905g;
            f1Var.getClass();
            f1Var.h(null, a03);
            ArrayList p10 = p();
            f1 f1Var2 = this.f9906h;
            f1Var2.getClass();
            f1Var2.h(null, p10);
        }
        if (hVar2 != null) {
            return true;
        }
        return false;
    }

    public final u c(int i6, u uVar) {
        u uVar2;
        v vVar = this.f9901c;
        if (vVar == null) {
            return null;
        }
        if (vVar.f8195y.f9924a == i6) {
            if (uVar != null) {
                if (kotlin.jvm.internal.k.a(vVar, uVar) && uVar.f8196z == null) {
                    return this.f9901c;
                }
            } else {
                return vVar;
            }
        }
        l4.h hVar = (l4.h) this.f9904f.g();
        if (hVar == null || (uVar2 = hVar.f8141y) == null) {
            uVar2 = this.f9901c;
            kotlin.jvm.internal.k.b(uVar2);
        }
        return d(i6, uVar2, uVar, false);
    }

    public final l4.h e(int i6) {
        Object obj;
        ie.h hVar = this.f9904f;
        ListIterator<E> listIterator = hVar.listIterator(hVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((l4.h) obj).f8141y.f8195y.f9924a == i6) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        l4.h hVar2 = (l4.h) obj;
        if (hVar2 != null) {
            return hVar2;
        }
        StringBuilder n10 = h8.c.n(i6, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        n10.append(f());
        throw new IllegalArgumentException(n10.toString().toString());
    }

    public final u f() {
        l4.h hVar = (l4.h) this.f9904f.g();
        if (hVar != null) {
            return hVar.f8141y;
        }
        return null;
    }

    public final v g() {
        v vVar = this.f9901c;
        if (vVar != null) {
            kotlin.jvm.internal.k.c(vVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            return vVar;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public final androidx.lifecycle.x h() {
        if (this.f9910m == null) {
            return androidx.lifecycle.x.f993z;
        }
        return this.f9913p;
    }

    public final v i() {
        u uVar;
        v vVar;
        l4.h hVar = (l4.h) this.f9904f.g();
        if (hVar == null || (uVar = hVar.f8141y) == null) {
            uVar = this.f9901c;
            kotlin.jvm.internal.k.b(uVar);
        }
        if (uVar instanceof v) {
            vVar = (v) uVar;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            v vVar2 = uVar.f8196z;
            kotlin.jvm.internal.k.b(vVar2);
            return vVar2;
        }
        return vVar;
    }

    public final void j(l4.h hVar, l4.h hVar2) {
        this.f9907i.put(hVar, hVar2);
        LinkedHashMap linkedHashMap = this.j;
        if (linkedHashMap.get(hVar2) == null) {
            linkedHashMap.put(hVar2, new a());
        }
        Object obj = linkedHashMap.get(hVar2);
        kotlin.jvm.internal.k.b(obj);
        ((a) obj).f9874a.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f6, code lost:
    
        if (r13.equals(r3) == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0108, code lost:
    
        r3 = new ie.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0111, code lost:
    
        if (ie.k.s(r12) < r14) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0113, code lost:
    
        r6 = (l4.h) ie.p.B(r12);
        s(r6);
        r23 = r4;
        r15 = new l4.h(r6.f8140x, r6.f8141y, r6.f8141y.a(r26), r6.A, r6.B, r6.C, r6.D);
        r4 = r6.A;
        r8 = r15.E;
        r8.getClass();
        kotlin.jvm.internal.k.e(r4, "<set-?>");
        r8.f9879d = r4;
        r4 = r6.E.f9885k;
        kotlin.jvm.internal.k.e(r4, "maxState");
        r8.f9885k = r4;
        r8.b();
        r3.addFirst(r15);
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0166, code lost:
    
        r23 = r4;
        r4 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0170, code lost:
    
        if (r4.hasNext() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0172, code lost:
    
        r6 = (l4.h) r4.next();
        r7 = r6.f8141y.f8196z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017c, code lost:
    
        if (r7 == null) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017e, code lost:
    
        j(r6, e(r7.f8195y.f9924a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0189, code lost:
    
        r12.addLast(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018d, code lost:
    
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
    
        if (r3.hasNext() == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0197, code lost:
    
        r4 = (l4.h) r3.next();
        r11.b(r4.f8141y.f8194x).f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0106, code lost:
    
        if (r3.f9924a == r6.f8195y.f9924a) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01e8 A[LOOP:1: B:19:0x01e2->B:21:0x01e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x008f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(final l4.u r25, android.os.Bundle r26, l4.z r27) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.h.k(l4.u, android.os.Bundle, l4.z):void");
    }

    public final boolean l(int i6, boolean z10) {
        if (!m(i6, z10, false) || !b()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.s, java.lang.Object] */
    public final boolean m(int i6, boolean z10, boolean z11) {
        u uVar;
        boolean z12;
        String str;
        ie.h hVar = this.f9904f;
        final int i10 = 0;
        if (hVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ie.j.R(hVar).iterator();
        while (true) {
            if (it.hasNext()) {
                u uVar2 = ((l4.h) it.next()).f8141y;
                String str2 = uVar2.f8194x;
                j jVar = uVar2.f8195y;
                j0 b10 = this.f9915r.b(str2);
                if (z10 || jVar.f9924a != i6) {
                    arrayList.add(b10);
                }
                if (jVar.f9924a == i6) {
                    uVar = uVar2;
                    break;
                }
            } else {
                uVar = null;
                break;
            }
        }
        if (uVar == null) {
            int i11 = u.C;
            String message = "Ignoring popBackStack to destination " + k4.j(this.f9899a.f8200c, i6) + " as it was not found on the current back stack";
            kotlin.jvm.internal.k.e(message, "message");
            Log.i("NavController", message);
            return false;
        }
        ?? obj = new Object();
        ie.h hVar2 = new ie.h();
        int size = arrayList.size();
        int i12 = 0;
        while (true) {
            if (i12 < size) {
                int i13 = i12 + 1;
                j0 navigator = (j0) arrayList.get(i12);
                ?? obj2 = new Object();
                l4.h popUpTo = (l4.h) hVar.last();
                z12 = z11;
                e eVar = new e(obj2, obj, this, z12, hVar2);
                kotlin.jvm.internal.k.e(navigator, "navigator");
                kotlin.jvm.internal.k.e(popUpTo, "popUpTo");
                this.f9917u = eVar;
                navigator.i(popUpTo, z12);
                this.f9917u = null;
                if (!obj2.f8051x) {
                    break;
                }
                i12 = i13;
            } else {
                z12 = z11;
                break;
            }
        }
        if (z12) {
            LinkedHashMap linkedHashMap = this.f9908k;
            if (!z10) {
                cf.f fVar = new cf.f(new t(cf.l.M(new p(24), uVar), new l(this) { // from class: o4.f

                    /* renamed from: y, reason: collision with root package name */
                    public final /* synthetic */ h f9895y;

                    {
                        this.f9895y = this;
                    }

                    @Override // ve.l
                    public final Object invoke(Object obj3) {
                        boolean containsKey;
                        u destination = (u) obj3;
                        switch (i10) {
                            case 0:
                                kotlin.jvm.internal.k.e(destination, "destination");
                                containsKey = this.f9895y.f9908k.containsKey(Integer.valueOf(destination.f8195y.f9924a));
                                break;
                            default:
                                kotlin.jvm.internal.k.e(destination, "destination");
                                containsKey = this.f9895y.f9908k.containsKey(Integer.valueOf(destination.f8195y.f9924a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (fVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((u) fVar.next()).f8195y.f9924a);
                    l4.i iVar = (l4.i) hVar2.e();
                    if (iVar != null) {
                        str = (String) iVar.f8143a.f12260b;
                    } else {
                        str = null;
                    }
                    linkedHashMap.put(valueOf, str);
                }
            }
            if (!hVar2.isEmpty()) {
                n nVar = ((l4.i) hVar2.first()).f8143a;
                final int i14 = 1;
                cf.f fVar2 = new cf.f(new t(cf.l.M(new p(25), c(nVar.f12259a, null)), new l(this) { // from class: o4.f

                    /* renamed from: y, reason: collision with root package name */
                    public final /* synthetic */ h f9895y;

                    {
                        this.f9895y = this;
                    }

                    @Override // ve.l
                    public final Object invoke(Object obj3) {
                        boolean containsKey;
                        u destination = (u) obj3;
                        switch (i14) {
                            case 0:
                                kotlin.jvm.internal.k.e(destination, "destination");
                                containsKey = this.f9895y.f9908k.containsKey(Integer.valueOf(destination.f8195y.f9924a));
                                break;
                            default:
                                kotlin.jvm.internal.k.e(destination, "destination");
                                containsKey = this.f9895y.f9908k.containsKey(Integer.valueOf(destination.f8195y.f9924a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (fVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((u) fVar2.next()).f8195y.f9924a), (String) nVar.f12260b);
                }
                if (linkedHashMap.values().contains((String) nVar.f12260b)) {
                    this.f9909l.put((String) nVar.f12260b, hVar2);
                }
            }
        }
        this.f9900b.invoke();
        return obj.f8051x;
    }

    public final void n(l4.h popUpTo, boolean z10, ie.h hVar) {
        m mVar;
        t0 t0Var;
        Set set;
        kotlin.jvm.internal.k.e(popUpTo, "popUpTo");
        ie.h hVar2 = this.f9904f;
        l4.h hVar3 = (l4.h) hVar2.last();
        if (kotlin.jvm.internal.k.a(hVar3, popUpTo)) {
            ie.p.B(hVar2);
            l4.k kVar = (l4.k) this.s.get(this.f9915r.b(hVar3.f8141y.f8194x));
            boolean z11 = true;
            if ((kVar == null || (t0Var = kVar.f8153f) == null || (set = (Set) ((f1) t0Var.f8014x).getValue()) == null || !set.contains(hVar3)) && !this.j.containsKey(hVar3)) {
                z11 = false;
            }
            androidx.lifecycle.x xVar = hVar3.E.j.f929d;
            androidx.lifecycle.x xVar2 = androidx.lifecycle.x.f993z;
            if (xVar.compareTo(xVar2) >= 0) {
                if (z10) {
                    hVar3.a(xVar2);
                    hVar.addFirst(new l4.i(hVar3));
                }
                if (!z11) {
                    hVar3.a(androidx.lifecycle.x.f991x);
                    s(hVar3);
                } else {
                    hVar3.a(xVar2);
                }
            }
            if (!z10 && !z11 && (mVar = this.f9911n) != null) {
                String backStackEntryId = hVar3.C;
                kotlin.jvm.internal.k.e(backStackEntryId, "backStackEntryId");
                p1 p1Var = (p1) mVar.f8161b.remove(backStackEntryId);
                if (p1Var != null) {
                    p1Var.a();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + popUpTo.f8141y + ", which is not the top of the back stack (" + hVar3.f8141y + ')').toString());
    }

    public final ArrayList p() {
        androidx.lifecycle.x xVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.s.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            xVar = androidx.lifecycle.x.A;
            if (!hasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((f1) ((l4.k) it.next()).f8153f.f8014x).getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                l4.h hVar = (l4.h) obj;
                if (!arrayList.contains(hVar) && hVar.E.f9885k.compareTo(xVar) < 0) {
                    arrayList2.add(obj);
                }
            }
            ie.p.z(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f9904f.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            l4.h hVar2 = (l4.h) next;
            if (!arrayList.contains(hVar2) && hVar2.E.f9885k.compareTo(xVar) >= 0) {
                arrayList3.add(next);
            }
        }
        ie.p.z(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj2 = arrayList.get(i6);
            i6++;
            if (!(((l4.h) obj2).f8141y instanceof v)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.s, java.lang.Object] */
    public final boolean q(int i6, final Bundle bundle, z zVar) {
        u g10;
        String str;
        l4.h hVar;
        u uVar;
        Bundle bundle2;
        Integer valueOf = Integer.valueOf(i6);
        LinkedHashMap linkedHashMap = this.f9908k;
        int i10 = 0;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str2 = (String) linkedHashMap.get(Integer.valueOf(i6));
        Collection values = linkedHashMap.values();
        kotlin.jvm.internal.k.e(values, "<this>");
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.k.a((String) it.next(), str2)) {
                it.remove();
            }
        }
        LinkedHashMap linkedHashMap2 = this.f9909l;
        kotlin.jvm.internal.z.b(linkedHashMap2);
        ie.h hVar2 = (ie.h) linkedHashMap2.remove(str2);
        e1.m context = this.f9899a.f8200c;
        ArrayList arrayList = new ArrayList();
        l4.h hVar3 = (l4.h) this.f9904f.g();
        if (hVar3 == null || (g10 = hVar3.f8141y) == null) {
            g10 = g();
        }
        if (hVar2 != null) {
            Iterator it2 = hVar2.iterator();
            while (it2.hasNext()) {
                l4.i iVar = (l4.i) it2.next();
                n nVar = iVar.f8143a;
                n nVar2 = iVar.f8143a;
                u d10 = d(nVar.f12259a, g10, null, true);
                if (d10 != null) {
                    androidx.lifecycle.x hostLifecycleState = h();
                    m mVar = this.f9911n;
                    kotlin.jvm.internal.k.e(context, "context");
                    kotlin.jvm.internal.k.e(hostLifecycleState, "hostLifecycleState");
                    Bundle bundle3 = (Bundle) nVar2.f12261c;
                    if (bundle3 != null) {
                        bundle3.setClassLoader(context.f4172a.getClassLoader());
                        bundle2 = bundle3;
                    } else {
                        bundle2 = null;
                    }
                    String id2 = (String) nVar2.f12260b;
                    Bundle bundle4 = (Bundle) nVar2.f12262d;
                    kotlin.jvm.internal.k.e(id2, "id");
                    arrayList.add(new l4.h(context, d10, bundle2, hostLifecycleState, mVar, id2, bundle4));
                    g10 = d10;
                } else {
                    int i11 = u.C;
                    throw new IllegalStateException(("Restore State failed: destination " + k4.j(context, nVar2.f12259a) + " cannot be found from the current destination " + g10).toString());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            if (!(((l4.h) obj).f8141y instanceof v)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList3.get(i13);
            i13++;
            l4.h hVar4 = (l4.h) obj2;
            List list = (List) ie.j.N(arrayList2);
            if (list != null && (hVar = (l4.h) ie.j.M(list)) != null && (uVar = hVar.f8141y) != null) {
                str = uVar.f8194x;
            } else {
                str = null;
            }
            if (kotlin.jvm.internal.k.a(str, hVar4.f8141y.f8194x)) {
                list.add(hVar4);
            } else {
                arrayList2.add(ie.k.u(hVar4));
            }
        }
        final ?? obj3 = new Object();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj4 = arrayList2.get(i10);
            i10++;
            List list2 = (List) obj4;
            j0 b10 = this.f9915r.b(((l4.h) ie.j.G(list2)).f8141y.f8194x);
            final ?? obj5 = new Object();
            final ArrayList arrayList4 = arrayList;
            this.f9916t = new l() { // from class: o4.g
                @Override // ve.l
                public final Object invoke(Object obj6) {
                    List list3;
                    l4.h entry = (l4.h) obj6;
                    kotlin.jvm.internal.k.e(entry, "entry");
                    s.this.f8051x = true;
                    ArrayList arrayList5 = arrayList4;
                    int indexOf = arrayList5.indexOf(entry);
                    if (indexOf != -1) {
                        kotlin.jvm.internal.u uVar2 = obj5;
                        int i14 = indexOf + 1;
                        list3 = arrayList5.subList(uVar2.f8053x, i14);
                        uVar2.f8053x = i14;
                    } else {
                        list3 = r.f6846x;
                    }
                    this.a(entry.f8141y, bundle, entry, list3);
                    return y.f6101a;
                }
            };
            b10.d(list2, zVar);
            this.f9916t = null;
            arrayList = arrayList4;
        }
        return obj3.f8051x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0275  */
    /* JADX WARN: Type inference failed for: r18v0, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v18, types: [l4.v, l4.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(l4.v r35, android.os.Bundle r36) {
        /*
            Method dump skipped, instructions count: 1446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.h.r(l4.v, android.os.Bundle):void");
    }

    public final void s(l4.h child) {
        Integer num;
        kotlin.jvm.internal.k.e(child, "child");
        l4.h hVar = (l4.h) this.f9907i.remove(child);
        if (hVar != null) {
            LinkedHashMap linkedHashMap = this.j;
            a aVar = (a) linkedHashMap.get(hVar);
            if (aVar != null) {
                num = Integer.valueOf(aVar.f9874a.decrementAndGet());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                l4.k kVar = (l4.k) this.s.get(this.f9915r.b(hVar.f8141y.f8194x));
                if (kVar != null) {
                    kVar.c(hVar);
                }
                linkedHashMap.remove(hVar);
            }
        }
    }

    public final void t() {
        Boolean bool;
        a aVar;
        t0 t0Var;
        Set set;
        ArrayList a02 = ie.j.a0(this.f9904f);
        if (!a02.isEmpty()) {
            int i6 = 0;
            ArrayList u3 = ie.k.u(((l4.h) ie.j.M(a02)).f8141y);
            ArrayList arrayList = new ArrayList();
            if (ie.j.M(u3) instanceof l4.e) {
                Iterator it = ie.j.R(a02).iterator();
                while (it.hasNext()) {
                    u uVar = ((l4.h) it.next()).f8141y;
                    arrayList.add(uVar);
                    if (!(uVar instanceof l4.e) && !(uVar instanceof v)) {
                        break;
                    }
                }
            }
            HashMap hashMap = new HashMap();
            for (l4.h hVar : ie.j.R(a02)) {
                androidx.lifecycle.x xVar = hVar.E.f9885k;
                u uVar2 = hVar.f8141y;
                u uVar3 = (u) ie.j.H(u3);
                androidx.lifecycle.x xVar2 = androidx.lifecycle.x.B;
                androidx.lifecycle.x xVar3 = androidx.lifecycle.x.A;
                if (uVar3 != null && uVar3.f8195y.f9924a == uVar2.f8195y.f9924a) {
                    if (xVar != xVar2) {
                        l4.k kVar = (l4.k) this.s.get(this.f9915r.b(hVar.f8141y.f8194x));
                        if (kVar != null && (t0Var = kVar.f8153f) != null && (set = (Set) ((f1) t0Var.f8014x).getValue()) != null) {
                            bool = Boolean.valueOf(set.contains(hVar));
                        } else {
                            bool = null;
                        }
                        if (!kotlin.jvm.internal.k.a(bool, Boolean.TRUE) && ((aVar = (a) this.j.get(hVar)) == null || aVar.f9874a.get() != 0)) {
                            hashMap.put(hVar, xVar2);
                        } else {
                            hashMap.put(hVar, xVar3);
                        }
                    }
                    u uVar4 = (u) ie.j.H(arrayList);
                    if (uVar4 != null && uVar4.f8195y.f9924a == uVar2.f8195y.f9924a) {
                        ie.p.A(arrayList);
                    }
                    ie.p.A(u3);
                    v vVar = uVar2.f8196z;
                    if (vVar != null) {
                        u3.add(vVar);
                    }
                } else if (!arrayList.isEmpty() && uVar2.f8195y.f9924a == ((u) ie.j.G(arrayList)).f8195y.f9924a) {
                    u uVar5 = (u) ie.p.A(arrayList);
                    if (xVar == xVar2) {
                        hVar.a(xVar3);
                    } else if (xVar != xVar3) {
                        hashMap.put(hVar, xVar3);
                    }
                    v vVar2 = uVar5.f8196z;
                    if (vVar2 != null && !arrayList.contains(vVar2)) {
                        arrayList.add(vVar2);
                    }
                } else {
                    hVar.a(androidx.lifecycle.x.f993z);
                }
            }
            int size = a02.size();
            while (i6 < size) {
                Object obj = a02.get(i6);
                i6++;
                l4.h hVar2 = (l4.h) obj;
                androidx.lifecycle.x xVar4 = (androidx.lifecycle.x) hashMap.get(hVar2);
                if (xVar4 != null) {
                    hVar2.a(xVar4);
                } else {
                    hVar2.E.b();
                }
            }
        }
    }
}
