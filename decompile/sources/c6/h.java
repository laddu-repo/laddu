package c6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.a6;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.o;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.v9;
import com.google.android.gms.internal.measurement.x3;
import com.playfy.tv.R;
import com.playfy.tv.activities.SplashActivity;
import com.unity3d.services.UnityAdsConstants;
import db.r;
import df.j;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gf.c0;
import gf.f0;
import ic.s;
import j1.p0;
import j1.r0;
import j1.v0;
import j1.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.zip.Inflater;
import kotlin.jvm.internal.k;
import n9.c1;
import n9.e0;
import n9.n1;
import n9.u0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qb.p;
import u1.a0;
import u1.t;
import v.i;
import v.l;
import v3.m;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements qb.c, m {
    public static h B;
    public Object A;

    /* renamed from: x, reason: collision with root package name */
    public Object f1981x;

    /* renamed from: y, reason: collision with root package name */
    public Object f1982y;

    /* renamed from: z, reason: collision with root package name */
    public Object f1983z;

    public h(int i6) {
        switch (i6) {
            case 3:
                Random random = new Random();
                this.f1983z = new HashMap();
                this.A = random;
                this.f1981x = new HashMap();
                this.f1982y = new HashMap();
                return;
            case 7:
                this.f1981x = new ArrayList();
                this.f1982y = new HashMap();
                this.f1983z = new HashMap();
                return;
            case 11:
                this.f1981x = new l(0);
                this.f1982y = new SparseArray();
                this.f1983z = new i();
                this.A = new l(0);
                return;
            case 13:
                this.f1981x = new t();
                this.f1982y = new t();
                this.f1983z = new y3.a();
                return;
            default:
                com.google.android.gms.internal.measurement.t tVar = new com.google.android.gms.internal.measurement.t(0);
                this.f1981x = tVar;
                s sVar = new s((s) null, tVar);
                this.f1983z = sVar;
                this.f1982y = sVar.C();
                a6 a6Var = new a6(1);
                this.A = a6Var;
                sVar.E("require", new v9(a6Var));
                ((HashMap) a6Var.f2145a).put("internal.platform", f1.f2204a);
                sVar.E("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(0.0d)));
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [c6.h, java.lang.Object] */
    public static synchronized h p(Context context, h6.a aVar) {
        h hVar;
        synchronized (h.class) {
            try {
                if (B == null) {
                    ?? obj = new Object();
                    Context applicationContext = context.getApplicationContext();
                    obj.f1981x = new c(applicationContext, aVar);
                    obj.f1982y = new c(applicationContext, aVar);
                    obj.f1983z = new f(applicationContext, aVar);
                    obj.A = new c(applicationContext, aVar);
                    B = obj;
                }
                hVar = B;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public static void v(long j, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            hashMap.remove(arrayList.get(i6));
        }
    }

    public Bundle A(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.f1983z;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    @Override // v3.m
    public int B() {
        return 2;
    }

    public Bundle C() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        c1 c1Var = (c1) this.A;
        if (((Bundle) this.f1983z) == null) {
            String str = (String) this.f1981x;
            SharedPreferences h12 = c1Var.h1();
            n1 n1Var = (n1) c1Var.f4301y;
            String string3 = h12.getString(str, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i6);
                            string = jSONObject.getString("n");
                            string2 = jSONObject.getString("t");
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            u0 u0Var = n1Var.C;
                            n1.g(u0Var);
                            u0Var.D.a("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string2.equals("la")) {
                                            t8.a();
                                            if (n1Var.A.n1(null, e0.R0)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i10 = 0; i10 < length; i10++) {
                                                    jArr[i10] = jSONArray2.optLong(i10);
                                                }
                                                bundle.putLongArray(string, jArr);
                                            }
                                        }
                                    } else if (string2.equals("ia")) {
                                        t8.a();
                                        if (n1Var.A.n1(null, e0.R0)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i11 = 0; i11 < length2; i11++) {
                                                iArr[i11] = jSONArray3.optInt(i11);
                                            }
                                            bundle.putIntArray(string, iArr);
                                        }
                                    }
                                } else if (string2.equals("s")) {
                                    bundle.putString(string, jSONObject.getString("v"));
                                }
                            } else if (string2.equals("l")) {
                                bundle.putLong(string, Long.parseLong(jSONObject.getString("v")));
                            }
                        } else if (string2.equals("d")) {
                            bundle.putDouble(string, Double.parseDouble(jSONObject.getString("v")));
                        }
                        u0 u0Var2 = n1Var.C;
                        n1.g(u0Var2);
                        u0Var2.D.b(string2, "Unrecognized persisted bundle type. Type");
                    }
                    this.f1983z = bundle;
                } catch (JSONException unused2) {
                    u0 u0Var3 = n1Var.C;
                    n1.g(u0Var3);
                    u0Var3.D.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f1983z) == null) {
                this.f1983z = (Bundle) this.f1982y;
            }
        }
        Bundle bundle2 = (Bundle) this.f1983z;
        x.g(bundle2);
        return new Bundle(bundle2);
    }

    public n D(s sVar, x3... x3VarArr) {
        n nVar = n.f2352a;
        for (x3 x3Var : x3VarArr) {
            nVar = a8.b.q(x3Var);
            a8.a.G((s) this.f1983z);
            if ((nVar instanceof o) || (nVar instanceof com.google.android.gms.internal.measurement.m)) {
                nVar = ((com.google.android.gms.internal.measurement.t) this.f1981x).c(sVar, nVar);
            }
        }
        return nVar;
    }

    public void E(Bundle bundle) {
        Bundle bundle2;
        String str = (String) this.f1981x;
        c1 c1Var = (c1) this.A;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        SharedPreferences h12 = c1Var.h1();
        n1 n1Var = (n1) c1Var.f4301y;
        SharedPreferences.Editor edit = h12.edit();
        if (bundle2.size() == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        t8.a();
                        if (n1Var.A.n1(null, e0.R0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                u0 u0Var = n1Var.C;
                                n1.g(u0Var);
                                u0Var.D.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                u0 u0Var2 = n1Var.C;
                                n1.g(u0Var2);
                                u0Var2.D.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        u0 u0Var3 = n1Var.C;
                        n1.g(u0Var3);
                        u0Var3.D.b(e10, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f1983z = bundle2;
    }

    @Override // qb.c
    public Object a(Class cls) {
        if (((Set) this.f1981x).contains(p.a(cls))) {
            Object a10 = ((qb.c) this.A).a(cls);
            if (!cls.equals(yb.b.class)) {
                return a10;
            }
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // qb.c
    public Set b(p pVar) {
        if (((Set) this.f1983z).contains(pVar)) {
            return ((qb.c) this.A).b(pVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + pVar + ">.");
    }

    @Override // qb.c
    public bc.a c(Class cls) {
        return e(p.a(cls));
    }

    @Override // qb.c
    public Object d(p pVar) {
        if (((Set) this.f1981x).contains(pVar)) {
            return ((qb.c) this.A).d(pVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + pVar + ".");
    }

    @Override // qb.c
    public bc.a e(p pVar) {
        if (((Set) this.f1982y).contains(pVar)) {
            return ((qb.c) this.A).e(pVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + pVar + ">.");
    }

    public void f(y yVar) {
        if (!((ArrayList) this.f1981x).contains(yVar)) {
            synchronized (((ArrayList) this.f1981x)) {
                ((ArrayList) this.f1981x).add(yVar);
            }
            yVar.I = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + yVar);
    }

    @Override // v3.m
    public /* synthetic */ v3.d g(byte[] bArr, int i6, int i10) {
        return h8.c.a(this, bArr, i10);
    }

    public ArrayList h(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f1981x;
        v(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f1982y;
        v(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            e2.b bVar = (e2.b) list.get(i6);
            if (!hashMap.containsKey(bVar.f4211b) && !hashMap2.containsKey(Integer.valueOf(bVar.f4212c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public y i(String str) {
        v0 v0Var = (v0) ((HashMap) this.f1982y).get(str);
        if (v0Var != null) {
            return v0Var.f6992c;
        }
        return null;
    }

    public y j(String str) {
        for (v0 v0Var : ((HashMap) this.f1982y).values()) {
            if (v0Var != null) {
                y yVar = v0Var.f6992c;
                if (!str.equals(yVar.C)) {
                    yVar = yVar.U.f6945c.j(str);
                }
                if (yVar != null) {
                    return yVar;
                }
            }
        }
        return null;
    }

    public ArrayList k() {
        ArrayList arrayList = new ArrayList();
        for (v0 v0Var : ((HashMap) this.f1982y).values()) {
            if (v0Var != null) {
                arrayList.add(v0Var);
            }
        }
        return arrayList;
    }

    public ArrayList l() {
        ArrayList arrayList = new ArrayList();
        for (v0 v0Var : ((HashMap) this.f1982y).values()) {
            if (v0Var != null) {
                arrayList.add(v0Var.f6992c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List m() {
        ArrayList arrayList;
        if (((ArrayList) this.f1981x).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f1981x)) {
            arrayList = new ArrayList((ArrayList) this.f1981x);
        }
        return arrayList;
    }

    public List n() {
        if (((df.i) this.A) == null) {
            this.A = new df.i(this);
        }
        df.i iVar = (df.i) this.A;
        k.b(iVar);
        return iVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0084. Please report as an issue. */
    @Override // v3.m
    public void o(byte[] bArr, int i6, int i10, v3.l lVar, u1.g gVar) {
        t1.b bVar;
        int i11;
        int i12;
        int y9;
        int i13;
        boolean z10;
        int B2;
        y3.a aVar = (y3.a) this.f1983z;
        t tVar = (t) this.f1982y;
        t tVar2 = (t) this.f1981x;
        tVar2.I(i6 + i10, bArr);
        tVar2.K(i6);
        if (((Inflater) this.A) == null) {
            this.A = new Inflater();
        }
        Inflater inflater = (Inflater) this.A;
        String str = a0.f12750a;
        if (tVar2.a() > 0 && tVar2.h() == 120 && a0.J(tVar2, tVar, inflater)) {
            tVar2.I(tVar.f12813c, tVar.f12811a);
        }
        int i14 = 0;
        aVar.f14975d = 0;
        int[] iArr = aVar.f14973b;
        t tVar3 = aVar.f14972a;
        aVar.f14976e = 0;
        aVar.f14977f = 0;
        aVar.f14978g = 0;
        aVar.f14979h = 0;
        aVar.f14980i = 0;
        tVar3.H(0);
        aVar.f14974c = false;
        ArrayList arrayList = new ArrayList();
        while (tVar2.a() >= 3) {
            int i15 = tVar2.f12813c;
            int y10 = tVar2.y();
            int E = tVar2.E();
            int i16 = tVar2.f12812b + E;
            if (i16 > i15) {
                tVar2.K(i15);
                bVar = null;
            } else {
                if (y10 != 128) {
                    switch (y10) {
                        case 20:
                            if (E % 5 == 2) {
                                tVar2.L(2);
                                Arrays.fill(iArr, i14);
                                int i17 = E / 5;
                                int i18 = 0;
                                while (i18 < i17) {
                                    int y11 = tVar2.y();
                                    double y12 = tVar2.y();
                                    double y13 = tVar2.y() - 128;
                                    double y14 = tVar2.y() - 128;
                                    iArr[y11] = a0.i((int) ((y14 * 1.772d) + y12), 0, 255) | (tVar2.y() << 24) | (a0.i((int) ((1.402d * y13) + y12), 0, 255) << 16) | (a0.i((int) ((y12 - (0.34414d * y14)) - (y13 * 0.71414d)), 0, 255) << 8);
                                    i18++;
                                    aVar = aVar;
                                }
                                aVar.f14974c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (E >= 4) {
                                tVar2.L(3);
                                if ((128 & tVar2.y()) != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                int i19 = E - 4;
                                if (z10) {
                                    if (i19 >= 7 && (B2 = tVar2.B()) >= 4) {
                                        aVar.f14979h = tVar2.E();
                                        aVar.f14980i = tVar2.E();
                                        tVar3.H(B2 - 4);
                                        i19 = E - 11;
                                    }
                                }
                                int i20 = tVar3.f12812b;
                                int i21 = tVar3.f12813c;
                                if (i20 < i21 && i19 > 0) {
                                    int min = Math.min(i19, i21 - i20);
                                    tVar2.i(tVar3.f12811a, i20, min);
                                    tVar3.K(i20 + min);
                                    break;
                                }
                            }
                            break;
                        case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                            if (E >= 19) {
                                aVar.f14975d = tVar2.E();
                                aVar.f14976e = tVar2.E();
                                tVar2.L(11);
                                aVar.f14977f = tVar2.E();
                                aVar.f14978g = tVar2.E();
                                break;
                            }
                            break;
                    }
                    bVar = null;
                } else {
                    if (aVar.f14975d != 0 && aVar.f14976e != 0 && aVar.f14979h != 0 && aVar.f14980i != 0 && (i11 = tVar3.f12813c) != 0 && tVar3.f12812b == i11 && aVar.f14974c) {
                        tVar3.K(0);
                        int i22 = aVar.f14979h * aVar.f14980i;
                        int[] iArr2 = new int[i22];
                        int i23 = 0;
                        while (i23 < i22) {
                            int y15 = tVar3.y();
                            if (y15 != 0) {
                                i12 = i23 + 1;
                                iArr2[i23] = iArr[y15];
                            } else {
                                int y16 = tVar3.y();
                                if (y16 != 0) {
                                    if ((y16 & 64) == 0) {
                                        y9 = y16 & 63;
                                    } else {
                                        y9 = ((y16 & 63) << 8) | tVar3.y();
                                    }
                                    if ((y16 & 128) == 0) {
                                        i13 = iArr[0];
                                    } else {
                                        i13 = iArr[tVar3.y()];
                                    }
                                    i12 = y9 + i23;
                                    Arrays.fill(iArr2, i23, i12, i13);
                                }
                            }
                            i23 = i12;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.f14979h, aVar.f14980i, Bitmap.Config.ARGB_8888);
                        float f3 = aVar.f14977f;
                        float f10 = aVar.f14975d;
                        float f11 = f3 / f10;
                        float f12 = aVar.f14978g;
                        float f13 = aVar.f14976e;
                        bVar = new t1.b(null, null, null, createBitmap, f12 / f13, 0, 0, f11, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.f14979h / f10, aVar.f14980i / f13, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                    } else {
                        bVar = null;
                    }
                    aVar.f14975d = 0;
                    aVar.f14976e = 0;
                    aVar.f14977f = 0;
                    aVar.f14978g = 0;
                    aVar.f14979h = 0;
                    aVar.f14980i = 0;
                    tVar3.H(0);
                    aVar.f14974c = false;
                }
                tVar2.K(i16);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i14 = 0;
        }
        gVar.accept(new v3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public af.c q() {
        Matcher matcher = (Matcher) this.f1981x;
        return android.support.v4.media.session.b.w(matcher.start(), matcher.end());
    }

    public void r(v0 v0Var) {
        y yVar = v0Var.f6992c;
        String str = yVar.C;
        HashMap hashMap = (HashMap) this.f1982y;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(yVar.C, v0Var);
        if (yVar.f7020c0) {
            if (yVar.f7019b0) {
                ((r0) this.A).f(yVar);
            } else {
                ((r0) this.A).j(yVar);
            }
            yVar.f7020c0 = false;
        }
        if (p0.L(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + yVar);
        }
    }

    public void s(v0 v0Var) {
        HashMap hashMap = (HashMap) this.f1982y;
        y yVar = v0Var.f6992c;
        if (yVar.f7019b0) {
            ((r0) this.A).j(yVar);
        }
        if (hashMap.get(yVar.C) == v0Var && ((v0) hashMap.put(yVar.C, null)) != null && p0.L(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + yVar);
        }
    }

    public h t() {
        int i6;
        CharSequence charSequence = (CharSequence) this.f1982y;
        Matcher matcher = (Matcher) this.f1981x;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        int i10 = end + i6;
        if (i10 > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        k.d(matcher2, "matcher(...)");
        if (!matcher2.find(i10)) {
            return null;
        }
        return new h(matcher2, charSequence);
    }

    public void u(b1.p pVar) {
        Object h4 = ((jf.h) this.f1983z).h(pVar);
        if (h4 instanceof jf.m) {
            Throwable th = ((jf.m) h4).f7474a;
            if (th == null) {
                throw new IllegalStateException("Channel was closed normally");
            }
            throw th;
        }
        if (!(h4 instanceof jf.n)) {
            if (((AtomicInteger) this.A).getAndIncrement() == 0) {
                f0.w((c0) this.f1981x, null, new androidx.lifecycle.c(this, null, 3), 3);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [he.j] */
    public String w(String str) {
        String str2;
        SplashActivity splashActivity = (SplashActivity) this.f1981x;
        try {
            ApplicationInfo applicationInfo = splashActivity.getPackageManager().getApplicationInfo(str, 0);
            k.d(applicationInfo, "getApplicationInfo(...)");
            str2 = splashActivity.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable th) {
            str2 = he.a.b(th);
        }
        if (he.k.a(str2) == null) {
            str = str2;
        }
        return str;
    }

    public Drawable x(String str) {
        Object b10;
        SplashActivity splashActivity = (SplashActivity) this.f1981x;
        try {
            b10 = splashActivity.getPackageManager().getApplicationIcon(str);
        } catch (Throwable th) {
            b10 = he.a.b(th);
        }
        if (he.k.a(b10) != null) {
            b10 = splashActivity.getDrawable(R.mipmap.ic_launcher_round);
            k.b(b10);
        }
        return (Drawable) b10;
    }

    public e2.b y(List list) {
        e2.b bVar;
        HashMap hashMap = (HashMap) this.f1983z;
        ArrayList h4 = h(list);
        if (h4.size() < 2) {
            return (e2.b) r.k(h4, null);
        }
        int i6 = 0;
        Collections.sort(h4, new d2.a(i6));
        ArrayList arrayList = new ArrayList();
        int i10 = ((e2.b) h4.get(0)).f4212c;
        int i11 = 0;
        while (true) {
            if (i11 >= h4.size()) {
                break;
            }
            e2.b bVar2 = (e2.b) h4.get(i11);
            if (i10 != bVar2.f4212c) {
                if (arrayList.size() == 1) {
                    return (e2.b) h4.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar2.f4211b, Integer.valueOf(bVar2.f4213d)));
                i11++;
            }
        }
        e2.b bVar3 = (e2.b) hashMap.get(arrayList);
        if (bVar3 == null) {
            List subList = h4.subList(0, arrayList.size());
            int i12 = 0;
            for (int i13 = 0; i13 < subList.size(); i13++) {
                i12 += ((e2.b) subList.get(i13)).f4213d;
            }
            int nextInt = ((Random) this.A).nextInt(i12);
            int i14 = 0;
            while (true) {
                if (i6 < subList.size()) {
                    bVar = (e2.b) subList.get(i6);
                    i14 += bVar.f4213d;
                    if (nextInt < i14) {
                        break;
                    }
                    i6++;
                } else {
                    bVar = (e2.b) r.l(subList);
                    break;
                }
            }
            hashMap.put(arrayList, bVar);
            return bVar;
        }
        return bVar3;
    }

    public Set z(Class cls) {
        return b(p.a(cls));
    }

    @Override // v3.m
    public /* synthetic */ void reset() {
    }

    public h(c1 c1Var, String str) {
        this.A = c1Var;
        x.d(str);
        this.f1981x = str;
        this.f1982y = new Bundle();
    }

    public h(Matcher matcher, CharSequence input) {
        k.e(input, "input");
        this.f1981x = matcher;
        this.f1982y = input;
        this.f1983z = new j(this);
    }
}
