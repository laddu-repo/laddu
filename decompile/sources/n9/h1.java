package n9;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.a6;
import com.google.android.gms.internal.measurement.v5;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h1 extends z3 implements f {
    public final v.e B;
    public final v.e C;
    public final v.e D;
    public final v.e E;
    public final v.e F;
    public final v.e G;
    public final e1 H;
    public final a2.a2 I;
    public final v.e J;
    public final v.e K;
    public final v.e L;

    /* JADX WARN: Type inference failed for: r2v1, types: [v.l, v.e] */
    /* JADX WARN: Type inference failed for: r2v2, types: [v.l, v.e] */
    /* JADX WARN: Type inference failed for: r2v3, types: [v.l, v.e] */
    /* JADX WARN: Type inference failed for: r2v4, types: [v.l, v.e] */
    /* JADX WARN: Type inference failed for: r2v5, types: [v.l, v.e] */
    /* JADX WARN: Type inference failed for: r2v6, types: [v.l, v.e] */
    /* JADX WARN: Type inference failed for: r2v7, types: [v.l, v.e] */
    /* JADX WARN: Type inference failed for: r2v8, types: [v.l, v.e] */
    /* JADX WARN: Type inference failed for: r2v9, types: [v.l, v.e] */
    public h1(e4 e4Var) {
        super(e4Var);
        this.B = new v.l(0);
        this.C = new v.l(0);
        this.D = new v.l(0);
        this.E = new v.l(0);
        this.F = new v.l(0);
        this.J = new v.l(0);
        this.K = new v.l(0);
        this.L = new v.l(0);
        this.G = new v.l(0);
        this.H = new e1(this);
        this.I = new a2.a2(this, 17);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [v.l, v.e] */
    public static final v.e n1(com.google.android.gms.internal.measurement.g2 g2Var) {
        ?? lVar = new v.l(0);
        for (com.google.android.gms.internal.measurement.k2 k2Var : g2Var.t()) {
            lVar.put(k2Var.p(), k2Var.q());
        }
        return lVar;
    }

    public static final y1 o1(int i6) {
        int i10 = i6 - 1;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        return null;
                    }
                    return y1.AD_PERSONALIZATION;
                }
                return y1.AD_USER_DATA;
            }
            return y1.ANALYTICS_STORAGE;
        }
        return y1.AD_STORAGE;
    }

    @Override // n9.f
    public final String c0(String str, String str2) {
        d1();
        j1(str);
        Map map = (Map) this.B.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final w1 h1(String str, y1 y1Var) {
        d1();
        j1(str);
        com.google.android.gms.internal.measurement.b2 y12 = y1(str);
        if (y12 != null) {
            Iterator it = y12.u().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.gms.internal.measurement.y1 y1Var2 = (com.google.android.gms.internal.measurement.y1) it.next();
                if (o1(y1Var2.p()) == y1Var) {
                    int q9 = y1Var2.q() - 1;
                    if (q9 != 1) {
                        if (q9 == 2) {
                            return w1.DENIED;
                        }
                    } else {
                        return w1.GRANTED;
                    }
                }
            }
        }
        return w1.UNINITIALIZED;
    }

    public final boolean i1(String str) {
        d1();
        j1(str);
        com.google.android.gms.internal.measurement.b2 y12 = y1(str);
        if (y12 == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.y1 y1Var : y12.p()) {
            if (y1Var.p() == 3 && y1Var.r() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void j1(String str) {
        e1();
        d1();
        w8.x.d(str);
        v.e eVar = this.F;
        if (eVar.get(str) == null) {
            o oVar = this.f9511z.f9303z;
            e4.P(oVar);
            j l22 = oVar.l2(str);
            v.e eVar2 = this.L;
            v.e eVar3 = this.K;
            v.e eVar4 = this.J;
            v.e eVar5 = this.B;
            if (l22 == null) {
                eVar5.put(str, null);
                this.D.put(str, null);
                this.C.put(str, null);
                this.E.put(str, null);
                eVar.put(str, null);
                eVar4.put(str, null);
                eVar3.put(str, null);
                eVar2.put(str, null);
                this.G.put(str, null);
                return;
            }
            com.google.android.gms.internal.measurement.f2 f2Var = (com.google.android.gms.internal.measurement.f2) m1(str, (byte[]) l22.f9355y).i();
            k1(str, f2Var);
            eVar5.put(str, n1((com.google.android.gms.internal.measurement.g2) f2Var.e()));
            eVar.put(str, (com.google.android.gms.internal.measurement.g2) f2Var.e());
            l1(str, (com.google.android.gms.internal.measurement.g2) f2Var.e());
            eVar4.put(str, ((com.google.android.gms.internal.measurement.g2) f2Var.f2337y).A());
            eVar3.put(str, (String) l22.f9356z);
            eVar2.put(str, (String) l22.A);
        }
    }

    public final void k1(String str, com.google.android.gms.internal.measurement.f2 f2Var) {
        n1 n1Var = (n1) this.f4301y;
        HashSet hashSet = new HashSet();
        v.l lVar = new v.l(0);
        v.l lVar2 = new v.l(0);
        v.l lVar3 = new v.l(0);
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.g2) f2Var.f2337y).z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.c2) it.next()).p());
        }
        for (int i6 = 0; i6 < ((com.google.android.gms.internal.measurement.g2) f2Var.f2337y).u(); i6++) {
            com.google.android.gms.internal.measurement.d2 d2Var = (com.google.android.gms.internal.measurement.d2) ((com.google.android.gms.internal.measurement.g2) f2Var.f2337y).v(i6).i();
            if (d2Var.h().isEmpty()) {
                u0 u0Var = n1Var.C;
                n1.g(u0Var);
                u0Var.G.a("EventConfig contained null event name");
            } else {
                String h4 = d2Var.h();
                String g10 = a2.g(d2Var.h(), a2.f9157a, a2.f9159c);
                if (!TextUtils.isEmpty(g10)) {
                    d2Var.b();
                    ((com.google.android.gms.internal.measurement.e2) d2Var.f2337y).w(g10);
                    f2Var.b();
                    ((com.google.android.gms.internal.measurement.g2) f2Var.f2337y).H(i6, (com.google.android.gms.internal.measurement.e2) d2Var.e());
                }
                if (((com.google.android.gms.internal.measurement.e2) d2Var.f2337y).q() && ((com.google.android.gms.internal.measurement.e2) d2Var.f2337y).r()) {
                    lVar.put(h4, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.e2) d2Var.f2337y).s() && ((com.google.android.gms.internal.measurement.e2) d2Var.f2337y).t()) {
                    lVar2.put(d2Var.h(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.e2) d2Var.f2337y).u()) {
                    if (((com.google.android.gms.internal.measurement.e2) d2Var.f2337y).v() >= 2 && ((com.google.android.gms.internal.measurement.e2) d2Var.f2337y).v() <= 65535) {
                        lVar3.put(d2Var.h(), Integer.valueOf(((com.google.android.gms.internal.measurement.e2) d2Var.f2337y).v()));
                    } else {
                        u0 u0Var2 = n1Var.C;
                        n1.g(u0Var2);
                        u0Var2.G.c(d2Var.h(), Integer.valueOf(((com.google.android.gms.internal.measurement.e2) d2Var.f2337y).v()), "Invalid sampling rate. Event name, sample rate");
                    }
                }
            }
        }
        this.C.put(str, hashSet);
        this.D.put(str, lVar);
        this.E.put(str, lVar2);
        this.G.put(str, lVar3);
    }

    public final void l1(String str, com.google.android.gms.internal.measurement.g2 g2Var) {
        n1 n1Var = (n1) this.f4301y;
        int y9 = g2Var.y();
        e1 e1Var = this.H;
        if (y9 != 0) {
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            u0Var.L.b(Integer.valueOf(g2Var.y()), "EES programs found");
            com.google.android.gms.internal.measurement.w3 w3Var = (com.google.android.gms.internal.measurement.w3) g2Var.x().get(0);
            try {
                com.google.android.gms.internal.measurement.e0 e0Var = new com.google.android.gms.internal.measurement.e0();
                c6.h hVar = e0Var.f2192a;
                ((HashMap) ((a6) hVar.A).f2145a).put("internal.remoteConfig", new f1(this, str, 2));
                ((HashMap) ((a6) hVar.A).f2145a).put("internal.appMetadata", new f1(this, str, 0));
                ((HashMap) ((a6) hVar.A).f2145a).put("internal.logger", new g1(this, 0));
                e0Var.b(w3Var);
                e1Var.l(str, e0Var);
                n1.g(u0Var);
                s0 s0Var = u0Var.L;
                s0Var.c(str, Integer.valueOf(w3Var.q().q()), "EES program loaded for appId, activities");
                for (com.google.android.gms.internal.measurement.v3 v3Var : w3Var.q().p()) {
                    n1.g(u0Var);
                    s0Var.b(v3Var.p(), "EES program activity");
                }
                return;
            } catch (com.google.android.gms.internal.measurement.r0 unused) {
                u0 u0Var2 = n1Var.C;
                n1.g(u0Var2);
                u0Var2.D.b(str, "Failed to load EES program. appId");
                return;
            }
        }
        e1Var.m(str);
    }

    public final com.google.android.gms.internal.measurement.g2 m1(String str, byte[] bArr) {
        Long l10;
        n1 n1Var = (n1) this.f4301y;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.g2.G();
        }
        try {
            com.google.android.gms.internal.measurement.g2 g2Var = (com.google.android.gms.internal.measurement.g2) ((com.google.android.gms.internal.measurement.f2) y0.Q1(com.google.android.gms.internal.measurement.g2.F(), bArr)).e();
            u0 u0Var = n1Var.C;
            n1.g(u0Var);
            s0 s0Var = u0Var.L;
            String str2 = null;
            if (g2Var.p()) {
                l10 = Long.valueOf(g2Var.q());
            } else {
                l10 = null;
            }
            if (g2Var.r()) {
                str2 = g2Var.s();
            }
            s0Var.c(l10, str2, "Parsed config. version, gmp_app_id");
            return g2Var;
        } catch (v5 e10) {
            u0 u0Var2 = n1Var.C;
            n1.g(u0Var2);
            u0Var2.G.c(u0.l1(str), e10, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.g2.G();
        } catch (RuntimeException e11) {
            u0 u0Var3 = n1Var.C;
            n1.g(u0Var3);
            u0Var3.G.c(u0.l1(str), e11, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.g2.G();
        }
    }

    public final com.google.android.gms.internal.measurement.g2 p1(String str) {
        e1();
        d1();
        w8.x.d(str);
        j1(str);
        return (com.google.android.gms.internal.measurement.g2) this.F.get(str);
    }

    public final String q1(String str) {
        d1();
        j1(str);
        return (String) this.J.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0485, code lost:
    
        r1 = r24;
        r3 = r25;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0342, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0326, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02cf, code lost:
    
        r0 = r14.C;
        n9.n1.g(r0);
        r0 = r0.G;
        r3 = n9.u0.l1(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02e4, code lost:
    
        if (r8.p() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e6, code lost:
    
        r5 = java.lang.Integer.valueOf(r8.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02f5, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02f4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0386, code lost:
    
        r27 = r6;
        r5 = r5.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0396, code lost:
    
        if (r5.hasNext() == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0398, code lost:
    
        r6 = (com.google.android.gms.internal.measurement.w1) r5.next();
        r9.e1();
        r9.d1();
        w8.x.d(r30);
        w8.x.g(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03b2, code lost:
    
        if (r6.r().isEmpty() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03de, code lost:
    
        r8 = r6.a();
        r23 = r5;
        r5 = new android.content.ContentValues();
        r5.put(r3, r30);
        r26 = r3;
        r5.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03f9, code lost:
    
        if (r6.p() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03fb, code lost:
    
        r3 = java.lang.Integer.valueOf(r6.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0405, code lost:
    
        r5.put(r0, r3);
        r28 = r0;
        r5.put("property_name", r6.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0417, code lost:
    
        if (r6.v() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0419, code lost:
    
        r3 = java.lang.Boolean.valueOf(r6.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0423, code lost:
    
        r5.put("session_scoped", r3);
        r5.put(com.unity3d.services.core.device.reader.JsonStorageKeyNames.DATA_KEY, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0435, code lost:
    
        if (r9.U1().insertWithOnConflict("property_filters", null, r5, 5) != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x044a, code lost:
    
        r5 = r23;
        r3 = r26;
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0437, code lost:
    
        r0 = r14.C;
        n9.n1.g(r0);
        r0.D.b(n9.u0.l1(r30), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0448, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0452, code lost:
    
        r1 = r14.C;
        n9.n1.g(r1);
        r1.D.c(n9.u0.l1(r30), r0, "Error storing property filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0422, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0404, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03b4, code lost:
    
        r0 = r14.C;
        n9.n1.g(r0);
        r0 = r0.G;
        r3 = n9.u0.l1(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03c9, code lost:
    
        if (r6.p() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03cb, code lost:
    
        r5 = java.lang.Integer.valueOf(r6.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03d5, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03d4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0264, code lost:
    
        r0 = r5.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0270, code lost:
    
        if (r0.hasNext() == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027c, code lost:
    
        if (((com.google.android.gms.internal.measurement.w1) r0.next()).p() != false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x027e, code lost:
    
        r0 = r14.C;
        n9.n1.g(r0);
        r0.G.c(n9.u0.l1(r30), java.lang.Integer.valueOf(r7), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0293, code lost:
    
        r0 = r5.u().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x029b, code lost:
    
        r8 = r0.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x029f, code lost:
    
        r23 = r0;
        r0 = "filter_id";
        r24 = r1;
        r25 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02b1, code lost:
    
        if (r8 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02b3, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.p1) r23.next();
        r9.e1();
        r9.d1();
        w8.x.d(r30);
        w8.x.g(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02cd, code lost:
    
        if (r8.r().isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0300, code lost:
    
        r26 = r5;
        r5 = r8.a();
        r27 = r6;
        r6 = new android.content.ContentValues();
        r6.put("app_id", r30);
        r6.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x031b, code lost:
    
        if (r8.p() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x031d, code lost:
    
        r1 = java.lang.Integer.valueOf(r8.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0327, code lost:
    
        r6.put("filter_id", r1);
        r6.put("event_name", r8.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0337, code lost:
    
        if (r8.z() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0339, code lost:
    
        r0 = java.lang.Boolean.valueOf(r8.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0343, code lost:
    
        r6.put("session_scoped", r0);
        r6.put(com.unity3d.services.core.device.reader.JsonStorageKeyNames.DATA_KEY, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0355, code lost:
    
        if (r9.U1().insertWithOnConflict("event_filters", null, r6, 5) != (-1)) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0357, code lost:
    
        r0 = r14.C;
        n9.n1.g(r0);
        r0.D.b(n9.u0.l1(r30), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0367, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0373, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0374, code lost:
    
        r1 = r14.C;
        n9.n1.g(r1);
        r1.D.c(n9.u0.l1(r30), r0, "Error storing event filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0462, code lost:
    
        r9.e1();
        r9.d1();
        w8.x.d(r30);
        r0 = r9.U1();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05f2 A[Catch: SQLiteException -> 0x0603, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0603, blocks: (B:180:0x05db, B:182:0x05f2), top: B:179:0x05db }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r1(java.lang.String r30, java.lang.String r31, java.lang.String r32, byte[] r33) {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.h1.r1(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final boolean s1(String str, String str2) {
        Boolean bool;
        d1();
        j1(str);
        if (!UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(c0(str, "measurement.upload.blacklist_internal")) || !j4.C1(str2)) {
            if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(c0(str, "measurement.upload.blacklist_public")) && j4.c2(str2)) {
                return true;
            }
            Map map = (Map) this.D.get(str);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final boolean t1(String str, String str2) {
        Boolean bool;
        d1();
        j1(str);
        if (!"ecommerce_purchase".equals(str2) && !"purchase".equals(str2) && !"refund".equals(str2)) {
            Map map = (Map) this.E.get(str);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final int u1(String str, String str2) {
        Integer num;
        d1();
        j1(str);
        Map map = (Map) this.G.get(str);
        if (map != null && (num = (Integer) map.get(str2)) != null) {
            return num.intValue();
        }
        return 1;
    }

    public final boolean v1(String str) {
        d1();
        j1(str);
        v.e eVar = this.C;
        if (eVar.get(str) != null) {
            if (((Set) eVar.get(str)).contains("os_version") || ((Set) eVar.get(str)).contains("device_info")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean w1(String str) {
        d1();
        j1(str);
        v.e eVar = this.C;
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    public final boolean x1(String str, y1 y1Var) {
        d1();
        j1(str);
        com.google.android.gms.internal.measurement.b2 y12 = y1(str);
        if (y12 != null) {
            for (com.google.android.gms.internal.measurement.y1 y1Var2 : y12.p()) {
                if (y1Var == o1(y1Var2.p())) {
                    if (y1Var2.q() == 2) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.b2 y1(String str) {
        d1();
        j1(str);
        com.google.android.gms.internal.measurement.g2 p12 = p1(str);
        if (p12 != null && p12.B()) {
            return p12.C();
        }
        return null;
    }

    @Override // n9.z3
    public final void g1() {
    }
}
