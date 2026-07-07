package k8;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.ka;
import com.google.android.gms.internal.measurement.la;
import com.google.android.gms.internal.measurement.n8;
import com.google.android.gms.internal.measurement.p6;
import com.google.android.gms.internal.measurement.q6;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.r8;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.u8;
import com.google.android.gms.internal.measurement.v8;
import com.google.android.gms.internal.measurement.z8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends h4 implements f {
    public final v.e A;
    public final v.e B;
    public final v.e C;
    public final v.e D;
    public final v.e E;
    public final v.e F;
    public final g1 G;
    public final s5.c H;
    public final v.e I;
    public final v.e J;
    public final v.e K;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final v.e f7588z;

    public j1(n4 n4Var) {
        super(n4Var);
        this.f7588z = new v.e(0);
        this.A = new v.e(0);
        this.B = new v.e(0);
        this.C = new v.e(0);
        this.D = new v.e(0);
        this.E = new v.e(0);
        this.I = new v.e(0);
        this.J = new v.e(0);
        this.K = new v.e(0);
        this.F = new v.e(0);
        this.G = new g1(this);
        this.H = new s5.c(28, this);
    }

    public static final v.e N(v8 v8Var) {
        v.e eVar = new v.e(0);
        for (z8 z8Var : v8Var.y()) {
            eVar.put(z8Var.u(), z8Var.v());
        }
        return eVar;
    }

    public static final c2 O(int i) {
        int i10 = i - 1;
        if (i10 == 1) {
            return c2.f7422w;
        }
        if (i10 == 2) {
            return c2.f7423x;
        }
        if (i10 == 3) {
            return c2.f7424y;
        }
        if (i10 != 4) {
            return null;
        }
        return c2.f7425z;
    }

    public final a2 H(String str, c2 c2Var) {
        D();
        J(str);
        q8 q8VarZ = Z(str);
        if (q8VarZ != null) {
            Iterator it = q8VarZ.z().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                n8 n8Var = (n8) it.next();
                if (O(n8Var.u()) == c2Var) {
                    int iV = n8Var.v() - 1;
                    if (iV == 1) {
                        return a2.f7376z;
                    }
                    if (iV == 2) {
                        return a2.f7375y;
                    }
                }
            }
        }
        return a2.f7373w;
    }

    public final boolean I(String str) {
        D();
        J(str);
        q8 q8VarZ = Z(str);
        if (q8VarZ == null) {
            return false;
        }
        for (n8 n8Var : q8VarZ.u()) {
            if (n8Var.u() == 3 && n8Var.w() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void J(String str) {
        E();
        D();
        t7.y.d(str);
        v.e eVar = this.E;
        if (eVar.get(str) == null) {
            n nVar = this.f7447x.f7658x;
            n4.T(nVar);
            hd.a aVarL0 = nVar.L0(str);
            v.e eVar2 = this.K;
            v.e eVar3 = this.J;
            v.e eVar4 = this.I;
            v.e eVar5 = this.f7588z;
            if (aVarL0 != null) {
                u8 u8Var = (u8) M(str, (byte[]) aVarL0.f6279w).l();
                K(str, u8Var);
                eVar5.put(str, N((v8) u8Var.e()));
                eVar.put(str, (v8) u8Var.e());
                L(str, (v8) u8Var.e());
                eVar4.put(str, ((v8) u8Var.f2653w).F());
                eVar3.put(str, (String) aVarL0.f6280x);
                eVar2.put(str, (String) aVarL0.f6281y);
                return;
            }
            eVar5.put(str, null);
            this.B.put(str, null);
            this.A.put(str, null);
            this.C.put(str, null);
            this.D.put(str, null);
            eVar.put(str, null);
            eVar4.put(str, null);
            eVar3.put(str, null);
            eVar2.put(str, null);
            this.F.put(str, null);
        }
    }

    public final void K(String str, u8 u8Var) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        v.e eVar = new v.e(0);
        v.e eVar2 = new v.e(0);
        v.e eVar3 = new v.e(0);
        Iterator it = Collections.unmodifiableList(((v8) u8Var.f2653w).E()).iterator();
        while (it.hasNext()) {
            hashSet.add(((r8) it.next()).u());
        }
        p1 p1Var = (p1) this.f2053w;
        g gVar = p1Var.f7695y;
        v0 v0Var = p1Var.A;
        e0 e0Var = f0.W0;
        if (gVar.O(null, e0Var)) {
            arrayList2.addAll(Collections.unmodifiableList(((v8) u8Var.f2653w).K()));
        }
        while (i < ((v8) u8Var.f2653w).z()) {
            s8 s8Var = (s8) ((v8) u8Var.f2653w).A(i).l();
            if (s8Var.h().isEmpty()) {
                p1.l(v0Var);
                v0Var.E.a("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String strH = s8Var.h();
                arrayList = arrayList2;
                String strG = e2.g(s8Var.h(), e2.f7460a, e2.f);
                if (!TextUtils.isEmpty(strG)) {
                    s8Var.b();
                    ((t8) s8Var.f2653w).B(strG);
                    u8Var.b();
                    ((v8) u8Var.f2653w).N(i, (t8) s8Var.e());
                }
                if (((t8) s8Var.f2653w).v() && ((t8) s8Var.f2653w).w()) {
                    eVar.put(strH, Boolean.TRUE);
                }
                if (((t8) s8Var.f2653w).x() && ((t8) s8Var.f2653w).y()) {
                    eVar2.put(s8Var.h(), Boolean.TRUE);
                }
                if (((t8) s8Var.f2653w).z()) {
                    if (((t8) s8Var.f2653w).A() < 2 || ((t8) s8Var.f2653w).A() > 65535) {
                        p1.l(v0Var);
                        v0Var.E.c(s8Var.h(), Integer.valueOf(((t8) s8Var.f2653w).A()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        eVar3.put(s8Var.h(), Integer.valueOf(((t8) s8Var.f2653w).A()));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.A.put(str, hashSet);
        if (p1Var.f7695y.O(null, e0Var)) {
            this.D.put(str, arrayList3);
        }
        this.B.put(str, eVar);
        this.C.put(str, eVar2);
        this.F.put(str, eVar3);
    }

    public final void L(String str, v8 v8Var) {
        Object objRemove;
        if (v8Var.D() == 0) {
            g1 g1Var = this.G;
            g1Var.getClass();
            de.i.e(str, "key");
            synchronized (((w.b) g1Var.f9750g)) {
                k4 k4Var = (k4) g1Var.f;
                k4Var.getClass();
                objRemove = ((LinkedHashMap) k4Var.f7607v).remove(str);
                if (objRemove != null) {
                    int i = g1Var.f9747c;
                    o4.h1.m(str, objRemove);
                    g1Var.f9747c = i - 1;
                }
            }
            if (objRemove != null) {
                g1Var.d(false, str, objRemove, null);
                return;
            }
            return;
        }
        p1 p1Var = (p1) this.f2053w;
        v0 v0Var = p1Var.A;
        p1.l(v0Var);
        v0Var.J.b(Integer.valueOf(v8Var.D()), "EES programs found");
        la laVar = (la) v8Var.C().get(0);
        try {
            q6 q6Var = new q6();
            ((HashMap) ((p6) q6Var.f3009a.f3285z).f2983w).put("internal.remoteConfig", new h1(this, str, 2));
            ((HashMap) ((p6) q6Var.f3009a.f3285z).f2983w).put("internal.appMetadata", new h1(this, str, 0));
            ((HashMap) ((p6) q6Var.f3009a.f3285z).f2983w).put("internal.logger", new i1(0, this));
            q6Var.b(laVar);
            this.G.l(str, q6Var);
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.J.c(str, Integer.valueOf(laVar.v().v()), "EES program loaded for appId, activities");
            for (ka kaVar : laVar.v().u()) {
                v0 v0Var3 = p1Var.A;
                p1.l(v0Var3);
                v0Var3.J.b(kaVar.u(), "EES program activity");
            }
        } catch (f7 unused) {
            v0 v0Var4 = ((p1) this.f2053w).A;
            p1.l(v0Var4);
            v0Var4.B.b(str, "Failed to load EES program. appId");
        }
    }

    public final v8 M(String str, byte[] bArr) {
        p1 p1Var = (p1) this.f2053w;
        if (bArr == null) {
            return v8.M();
        }
        try {
            v8 v8Var = (v8) ((u8) p4.o0(v8.L(), bArr)).e();
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.J.c(v8Var.u() ? Long.valueOf(v8Var.v()) : null, v8Var.w() ? v8Var.x() : null, "Parsed config. version, gmp_app_id");
            return v8Var;
        } catch (com.google.android.gms.internal.measurement.u1 e7) {
            v0 v0Var2 = p1Var.A;
            p1.l(v0Var2);
            v0Var2.E.c(v0.L(str), e7, "Unable to merge remote config. appId");
            return v8.M();
        } catch (RuntimeException e10) {
            v0 v0Var3 = p1Var.A;
            p1.l(v0Var3);
            v0Var3.E.c(v0.L(str), e10, "Unable to merge remote config. appId");
            return v8.M();
        }
    }

    public final v8 P(String str) {
        E();
        D();
        t7.y.d(str);
        J(str);
        return (v8) this.E.get(str);
    }

    public final String Q(String str) {
        D();
        J(str);
        return (String) this.I.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03e0, code lost:
    
        r8 = r6.a();
        r23 = r5;
        r5 = new android.content.ContentValues();
        r5.put(r3, r30);
        r26 = r3;
        r5.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x03fb, code lost:
    
        if (r6.u() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x03fd, code lost:
    
        r3 = java.lang.Integer.valueOf(r6.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0406, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0407, code lost:
    
        r5.put(r0, r3);
        r28 = r0;
        r5.put("property_name", r6.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0419, code lost:
    
        if (r6.A() == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x041b, code lost:
    
        r3 = java.lang.Boolean.valueOf(r6.B());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0424, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0425, code lost:
    
        r5.put("session_scoped", r3);
        r5.put("data", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0437, code lost:
    
        if (r9.u0().insertWithOnConflict("property_filters", null, r5, 5) != (-1)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0439, code lost:
    
        r0 = r14.A;
        k8.p1.l(r0);
        r0.B.b(k8.v0.L(r30), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x044a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x044c, code lost:
    
        r5 = r23;
        r3 = r26;
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0454, code lost:
    
        r1 = r14.A;
        k8.p1.l(r1);
        r1.B.c(k8.v0.L(r30), r0, "Error storing property filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0464, code lost:
    
        r9.E();
        r9.D();
        t7.y.d(r30);
        r0 = r9.u0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0487, code lost:
    
        r1 = r24;
        r3 = r25;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0264, code lost:
    
        r0 = r5.w().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0270, code lost:
    
        if (r0.hasNext() == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x027c, code lost:
    
        if (((com.google.android.gms.internal.measurement.l8) r0.next()).u() != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027e, code lost:
    
        r0 = r14.A;
        k8.p1.l(r0);
        r0.E.c(k8.v0.L(r30), java.lang.Integer.valueOf(r7), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0293, code lost:
    
        r0 = r5.z().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029b, code lost:
    
        r8 = r0.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029f, code lost:
    
        r23 = r0;
        r0 = "filter_id";
        r24 = r1;
        r25 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02b1, code lost:
    
        if (r8 == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02b3, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.f8) r23.next();
        r9.E();
        r9.D();
        t7.y.d(r30);
        t7.y.g(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02cd, code lost:
    
        if (r8.w().isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02cf, code lost:
    
        r0 = r14.A;
        k8.p1.l(r0);
        r0 = r0.E;
        r3 = k8.v0.L(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02e4, code lost:
    
        if (r8.u() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02e6, code lost:
    
        r5 = java.lang.Integer.valueOf(r8.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02f4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02f5, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0300, code lost:
    
        r26 = r5;
        r5 = r8.a();
        r27 = r6;
        r6 = new android.content.ContentValues();
        r6.put("app_id", r30);
        r6.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x031b, code lost:
    
        if (r8.u() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x031d, code lost:
    
        r1 = java.lang.Integer.valueOf(r8.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0326, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0327, code lost:
    
        r6.put("filter_id", r1);
        r6.put("event_name", r8.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0337, code lost:
    
        if (r8.E() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0339, code lost:
    
        r0 = java.lang.Boolean.valueOf(r8.F());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0342, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0343, code lost:
    
        r6.put("session_scoped", r0);
        r6.put("data", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0355, code lost:
    
        if (r9.u0().insertWithOnConflict("event_filters", null, r6, 5) != (-1)) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0357, code lost:
    
        r0 = r14.A;
        k8.p1.l(r0);
        r0.B.b(k8.v0.L(r30), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0368, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x036a, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0376, code lost:
    
        r1 = r14.A;
        k8.p1.l(r1);
        r1.B.c(k8.v0.L(r30), r0, "Error storing event filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0388, code lost:
    
        r27 = r6;
        r5 = r5.w().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0398, code lost:
    
        if (r5.hasNext() == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x039a, code lost:
    
        r6 = (com.google.android.gms.internal.measurement.l8) r5.next();
        r9.E();
        r9.D();
        t7.y.d(r30);
        t7.y.g(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03b4, code lost:
    
        if (r6.w().isEmpty() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03b6, code lost:
    
        r0 = r14.A;
        k8.p1.l(r0);
        r0 = r0.E;
        r3 = k8.v0.L(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03cb, code lost:
    
        if (r6.u() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03cd, code lost:
    
        r5 = java.lang.Integer.valueOf(r6.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03d6, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03d7, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(java.lang.String r30, java.lang.String r31, java.lang.String r32, byte[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.j1.R(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final boolean S(String str, String str2) {
        Boolean bool;
        D();
        J(str);
        if ("1".equals(b(str, "measurement.upload.blacklist_internal")) && t4.i0(str2)) {
            return true;
        }
        if ("1".equals(b(str, "measurement.upload.blacklist_public")) && t4.E0(str2)) {
            return true;
        }
        Map map = (Map) this.B.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean T(String str, String str2) {
        Boolean bool;
        D();
        J(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.C.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final List U(String str) {
        D();
        J(str);
        return (List) this.D.get(str);
    }

    public final int V(String str, String str2) {
        Integer num;
        D();
        J(str);
        Map map = (Map) this.F.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean W(String str) {
        D();
        J(str);
        v.e eVar = this.A;
        if (eVar.get(str) != null) {
            return ((Set) eVar.get(str)).contains("os_version") || ((Set) eVar.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean X(String str) {
        D();
        J(str);
        v.e eVar = this.A;
        return eVar.get(str) != null && ((Set) eVar.get(str)).contains("app_instance_id");
    }

    public final boolean Y(String str, c2 c2Var) {
        D();
        J(str);
        q8 q8VarZ = Z(str);
        if (q8VarZ == null) {
            return false;
        }
        for (n8 n8Var : q8VarZ.u()) {
            if (c2Var == O(n8Var.u())) {
                return n8Var.v() == 2;
            }
        }
        return false;
    }

    public final q8 Z(String str) {
        D();
        J(str);
        v8 v8VarP = P(str);
        if (v8VarP == null || !v8VarP.G()) {
            return null;
        }
        return v8VarP.H();
    }

    @Override // k8.f
    public final String b(String str, String str2) {
        D();
        J(str);
        Map map = (Map) this.f7588z.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // k8.h4
    public final void G() {
    }
}
