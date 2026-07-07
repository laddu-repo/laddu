package a2;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.j5;
import com.playfy.tv.R;
import com.playfy.tv.activities.MainActivity;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import n9.m2;
import n9.p3;
import org.json.JSONArray;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p.j3;
import p.t3;
import p.u3;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class a2 implements c2.q, u2.j, ea.i, t0.s, f.b, kf.h, ma.g, i8.b, o.j, u2.q, s2.d, v3.d {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f161x;

    /* renamed from: y, reason: collision with root package name */
    public Object f162y;

    public /* synthetic */ a2(Object obj, int i6) {
        this.f161x = i6;
        this.f162y = obj;
    }

    public static boolean K(Bundle bundle) {
        if (!UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(bundle.getString("gcm.n.e")) && !UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.google.android.gms.internal.measurement.e5, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v4, types: [u2.q, java.lang.Object] */
    private final void M(u2.l lVar, long j, long j10) {
        int size;
        int i6;
        long j11;
        u2.r rVar = (u2.r) lVar;
        d2.g gVar = (d2.g) this.f162y;
        long j12 = rVar.f12871x;
        Uri uri = rVar.A.f13560z;
        q2.u uVar = new q2.u(j10);
        gVar.J.getClass();
        gVar.N.o(uVar, rVar.f12873z);
        e2.c cVar = (e2.c) rVar.C;
        e2.c cVar2 = gVar.f3722e0;
        if (cVar2 == null) {
            size = 0;
        } else {
            size = cVar2.f4225m.size();
        }
        long j13 = cVar.b(0).f4245b;
        int i10 = 0;
        while (i10 < size && gVar.f3722e0.b(i10).f4245b < j13) {
            i10++;
        }
        if (cVar.f4217d) {
            if (size - i10 > cVar.f4225m.size()) {
                u1.a.p("DashMediaSource", "Loaded out of sync manifest");
            } else {
                j11 = -9223372036854775807L;
                long j14 = gVar.f3728k0;
                if (j14 != -9223372036854775807L) {
                    i6 = i10;
                    if (cVar.f4221h * 1000 <= j14) {
                        u1.a.p("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f4221h + ", " + gVar.f3728k0);
                    }
                } else {
                    i6 = i10;
                }
                gVar.f3727j0 = 0;
            }
            int i11 = gVar.f3727j0;
            gVar.f3727j0 = i11 + 1;
            if (i11 < gVar.J.f(rVar.f12873z)) {
                gVar.f3718a0.postDelayed(gVar.S, Math.min((gVar.f3727j0 - 1) * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION));
                return;
            } else {
                gVar.Z = new IOException();
                return;
            }
        }
        i6 = i10;
        j11 = -9223372036854775807L;
        gVar.f3722e0 = cVar;
        gVar.f3723f0 = cVar.f4217d & gVar.f3723f0;
        gVar.f3724g0 = j - j10;
        gVar.f3725h0 = j;
        gVar.f3729l0 += i6;
        synchronized (gVar.Q) {
            if (rVar.f12872y.f13542a.equals(gVar.f3720c0)) {
                Uri uri2 = gVar.f3722e0.f4223k;
                if (uri2 == null) {
                    uri2 = j5.s(rVar.A.f13560z);
                }
                gVar.f3720c0 = uri2;
            }
        }
        e2.c cVar3 = gVar.f3722e0;
        if (cVar3.f4217d && gVar.f3726i0 == j11) {
            e2.u uVar2 = cVar3.f4222i;
            if (uVar2 != null) {
                String str = uVar2.f4281b;
                if (!Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
                    if (!Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                            if (!Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                gVar.A(new IOException("Unsupported UTC timing scheme"));
                                return;
                            } else {
                                gVar.x();
                                return;
                            }
                        }
                        gVar.D(uVar2, new w8.l(7));
                        return;
                    }
                    gVar.D(uVar2, new Object());
                    return;
                }
                try {
                    gVar.f3726i0 = u1.a0.T(uVar2.f4282c) - gVar.f3725h0;
                    gVar.B(true);
                    return;
                } catch (r1.l0 e10) {
                    gVar.A(e10);
                    return;
                }
            }
            gVar.x();
            return;
        }
        gVar.B(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int R(r1.q r5) {
        /*
            java.lang.String r0 = r5.f11670n
            r1 = 0
            if (r0 == 0) goto L86
            boolean r0 = r1.k0.m(r0)
            if (r0 != 0) goto Ld
            goto L86
        Ld:
            java.lang.String r5 = r5.f11670n
            java.lang.String r0 = u1.a0.f12750a
            r5.getClass()
            int r0 = r5.hashCode()
            r2 = 4
            r3 = 1
            r4 = -1
            switch(r0) {
                case -1487656890: goto L61;
                case -1487464693: goto L56;
                case -1487464690: goto L4b;
                case -1487394660: goto L40;
                case -1487018032: goto L35;
                case -879272239: goto L2a;
                case -879258763: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L6b
        L1f:
            java.lang.String r0 = "image/png"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L28
            goto L6b
        L28:
            r4 = 6
            goto L6b
        L2a:
            java.lang.String r0 = "image/bmp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L33
            goto L6b
        L33:
            r4 = 5
            goto L6b
        L35:
            java.lang.String r0 = "image/webp"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3e
            goto L6b
        L3e:
            r4 = 4
            goto L6b
        L40:
            java.lang.String r0 = "image/jpeg"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L49
            goto L6b
        L49:
            r4 = 3
            goto L6b
        L4b:
            java.lang.String r0 = "image/heif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L54
            goto L6b
        L54:
            r4 = 2
            goto L6b
        L56:
            java.lang.String r0 = "image/heic"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5f
            goto L6b
        L5f:
            r4 = 1
            goto L6b
        L61:
            java.lang.String r0 = "image/avif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L6a
            goto L6b
        L6a:
            r4 = 0
        L6b:
            switch(r4) {
                case 0: goto L76;
                case 1: goto L6f;
                case 2: goto L6f;
                case 3: goto L7c;
                case 4: goto L7c;
                case 5: goto L7c;
                case 6: goto L7c;
                default: goto L6e;
            }
        L6e:
            goto L81
        L6f:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r5 < r0) goto L81
            goto L7c
        L76:
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r5 < r0) goto L81
        L7c:
            int r5 = r4.a.d(r2, r1, r1, r1)
            return r5
        L81:
            int r5 = r4.a.d(r3, r1, r1, r1)
            return r5
        L86:
            int r5 = r4.a.d(r1, r1, r1, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.a2.R(r1.q):int");
    }

    public static String S(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    @Override // c2.q
    public void A(c2.n nVar) {
        j4.b0 b0Var = ((c2.k0) this.f162y).f1865f1;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new c2.k(b0Var, nVar, 9));
        }
    }

    public u0.c B(int i6) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    @Override // u2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ef.g C(u2.l r4, long r5, long r7, java.io.IOException r9, int r10) {
        /*
            r3 = this;
            int r5 = r3.f161x
            switch(r5) {
                case 4: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r4 = r3.f162y
            lc.c r4 = (lc.c) r4
            java.lang.Object r4 = r4.f8328x
            d2.g r4 = (d2.g) r4
            r4.A(r9)
            ef.g r4 = u2.o.B
            return r4
        L13:
            u2.r r4 = (u2.r) r4
            java.lang.Object r5 = r3.f162y
            d2.g r5 = (d2.g) r5
            q2.u r6 = new q2.u
            long r0 = r4.f12871x
            w1.z r0 = r4.A
            android.net.Uri r0 = r0.f13560z
            r6.<init>(r7)
            int r4 = r4.f12873z
            o5.e0 r7 = r5.J
            r7.getClass()
            boolean r7 = r9 instanceof r1.l0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto L64
            boolean r7 = r9 instanceof java.io.FileNotFoundException
            if (r7 != 0) goto L64
            boolean r7 = r9 instanceof w1.s
            if (r7 != 0) goto L64
            boolean r7 = r9 instanceof u2.n
            if (r7 != 0) goto L64
            int r7 = w1.j.f13537y
            r7 = r9
        L43:
            if (r7 == 0) goto L58
            boolean r8 = r7 instanceof w1.j
            if (r8 == 0) goto L53
            r8 = r7
            w1.j r8 = (w1.j) r8
            int r8 = r8.f13538x
            r2 = 2008(0x7d8, float:2.814E-42)
            if (r8 != r2) goto L53
            goto L64
        L53:
            java.lang.Throwable r7 = r7.getCause()
            goto L43
        L58:
            int r10 = r10 + (-1)
            int r10 = r10 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r7 = java.lang.Math.min(r10, r7)
            long r7 = (long) r7
            goto L65
        L64:
            r7 = r0
        L65:
            int r10 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r10 != 0) goto L6c
            ef.g r7 = u2.o.C
            goto L73
        L6c:
            ef.g r10 = new ef.g
            r0 = 0
            r10.<init>(r0, r7, r0)
            r7 = r10
        L73:
            boolean r8 = r7.a()
            r8 = r8 ^ 1
            b2.k r5 = r5.N
            r5.r(r6, r4, r9, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.a2.C(u2.l, long, long, java.io.IOException, int):ef.g");
    }

    @Override // c2.q
    public void D() {
        q0 q0Var = ((c2.k0) this.f162y).f7116d0;
        if (q0Var != null) {
            q0Var.a();
        }
    }

    public boolean E(String str) {
        String J = J(str);
        if (!UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(J) && !Boolean.parseBoolean(J)) {
            return false;
        }
        return true;
    }

    public Integer F(String str) {
        String J = J(str);
        if (!TextUtils.isEmpty(J)) {
            try {
                return Integer.valueOf(Integer.parseInt(J));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + S(str) + "(" + J + ") into an int");
                return null;
            }
        }
        return null;
    }

    @Override // o.j
    public void G(o.l lVar) {
        u5.r rVar = ((ActionMenuView) this.f162y).R;
        if (rVar != null) {
            rVar.G(lVar);
        }
    }

    public JSONArray H(String str) {
        String J = J(str);
        if (!TextUtils.isEmpty(J)) {
            try {
                return new JSONArray(J);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + S(str) + ": " + J + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public String I(Resources resources, String str, String str2) {
        String[] strArr;
        String J = J(str2);
        if (!TextUtils.isEmpty(J)) {
            return J;
        }
        String J2 = J(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(J2)) {
            return null;
        }
        int identifier = resources.getIdentifier(J2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", S(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray H = H(str2.concat("_loc_args"));
        if (H == null) {
            strArr = null;
        } else {
            int length = H.length();
            strArr = new String[length];
            for (int i6 = 0; i6 < length; i6++) {
                strArr[i6] = H.optString(i6);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + S(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e10);
            return null;
        }
    }

    public String J(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f162y;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle O() {
        Bundle bundle = (Bundle) this.f162y;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public boolean P(int i6, int i10, Bundle bundle) {
        return false;
    }

    public void Q(int i6) {
        RecyclerView recyclerView = (RecyclerView) this.f162y;
        View childAt = recyclerView.getChildAt(i6);
        if (childAt != null) {
            RecyclerView.J(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i6);
    }

    public void T() {
        p3 p3Var = (p3) this.f162y;
        p3Var.d1();
        n9.n1 n1Var = (n9.n1) p3Var.f4301y;
        n9.c1 c1Var = n1Var.B;
        n9.n1.e(c1Var);
        a9.a aVar = n1Var.H;
        aVar.getClass();
        if (c1Var.n1(System.currentTimeMillis())) {
            n9.c1 c1Var2 = n1Var.B;
            n9.n1.e(c1Var2);
            c1Var2.J.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                n9.u0 u0Var = n1Var.C;
                n9.n1.g(u0Var);
                u0Var.L.a("Detected application was in foreground");
                aVar.getClass();
                W(System.currentTimeMillis());
            }
        }
    }

    public void U(int i6, String str, List list, boolean z10, boolean z11) {
        n9.s0 s0Var;
        n9.h1 h1Var = (n9.h1) this.f162y;
        int i10 = i6 - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        n9.u0 u0Var = ((n9.n1) h1Var.f4301y).C;
                        n9.n1.g(u0Var);
                        s0Var = u0Var.J;
                    } else if (z10) {
                        n9.u0 u0Var2 = ((n9.n1) h1Var.f4301y).C;
                        n9.n1.g(u0Var2);
                        s0Var = u0Var2.H;
                    } else if (!z11) {
                        n9.u0 u0Var3 = ((n9.n1) h1Var.f4301y).C;
                        n9.n1.g(u0Var3);
                        s0Var = u0Var3.I;
                    } else {
                        n9.u0 u0Var4 = ((n9.n1) h1Var.f4301y).C;
                        n9.n1.g(u0Var4);
                        s0Var = u0Var4.G;
                    }
                } else {
                    n9.u0 u0Var5 = ((n9.n1) h1Var.f4301y).C;
                    n9.n1.g(u0Var5);
                    s0Var = u0Var5.L;
                }
            } else if (z10) {
                n9.u0 u0Var6 = ((n9.n1) h1Var.f4301y).C;
                n9.n1.g(u0Var6);
                s0Var = u0Var6.E;
            } else if (!z11) {
                n9.u0 u0Var7 = ((n9.n1) h1Var.f4301y).C;
                n9.n1.g(u0Var7);
                s0Var = u0Var7.F;
            } else {
                n9.u0 u0Var8 = ((n9.n1) h1Var.f4301y).C;
                n9.n1.g(u0Var8);
                s0Var = u0Var8.D;
            }
        } else {
            n9.u0 u0Var9 = ((n9.n1) h1Var.f4301y).C;
            n9.n1.g(u0Var9);
            s0Var = u0Var9.K;
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    s0Var.a(str);
                    return;
                } else {
                    s0Var.d(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            s0Var.c(list.get(0), list.get(1), str);
            return;
        }
        s0Var.b(list.get(0), str);
    }

    public void V(long j) {
        p3 p3Var = (p3) this.f162y;
        p3Var.d1();
        p3Var.h1();
        n9.n1 n1Var = (n9.n1) p3Var.f4301y;
        n9.c1 c1Var = n1Var.B;
        n9.n1.e(c1Var);
        if (c1Var.n1(j)) {
            n9.n1.e(c1Var);
            c1Var.J.b(true);
            n1Var.l().i1();
        }
        n9.n1.e(c1Var);
        c1Var.N.h(j);
        if (c1Var.J.a()) {
            W(j);
        }
    }

    public void W(long j) {
        p3 p3Var = (p3) this.f162y;
        p3Var.d1();
        n9.n1 n1Var = (n9.n1) p3Var.f4301y;
        if (n1Var.a()) {
            n9.c1 c1Var = n1Var.B;
            n9.n1.e(c1Var);
            c1Var.N.h(j);
            n1Var.H.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            n9.u0 u0Var = n1Var.C;
            n9.n1.g(u0Var);
            u0Var.L.b(Long.valueOf(elapsedRealtime), "Session started, time");
            long j10 = j / 1000;
            Long valueOf = Long.valueOf(j10);
            m2 m2Var = n1Var.J;
            n9.n1.f(m2Var);
            m2Var.o1(j, valueOf, "auto", "_sid");
            n9.n1.e(c1Var);
            c1Var.O.h(j10);
            c1Var.J.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j10);
            n9.n1.f(m2Var);
            m2Var.l1(j, bundle, "auto", "_s");
            String l10 = c1Var.T.l();
            if (!TextUtils.isEmpty(l10)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", l10);
                n9.n1.f(m2Var);
                m2Var.l1(j, bundle2, "auto", "_ssr");
            }
        }
    }

    @Override // c2.q
    public void a(int i6) {
        androidx.lifecycle.j1 j1Var;
        c2.k0 k0Var = (c2.k0) this.f162y;
        if (Build.VERSION.SDK_INT >= 35 && (j1Var = k0Var.f1867h1) != null) {
            j1Var.D(i6);
        }
        j4.b0 b0Var = k0Var.f1865f1;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new o0(i6, 1, b0Var));
        }
    }

    public ua.d b(ua.d dVar) {
        if (dVar instanceof ua.j) {
            return dVar;
        }
        return new ua.b(-((ua.i) this.f162y).j(), dVar);
    }

    @Override // v3.d
    public int c(long j) {
        if (j < 0) {
            return 0;
        }
        return -1;
    }

    @Override // kf.h
    public Object collect(kf.i iVar, le.c cVar) {
        dd.c cVar2 = new dd.c((kf.p) this.f162y, iVar, (le.c) null, 6);
        gf.b2 b2Var = new gf.b2(cVar.getContext(), cVar, 1);
        Object x10 = bf.y.x(b2Var, b2Var, cVar2);
        if (x10 == me.a.f8833x) {
            return x10;
        }
        return he.y.f6101a;
    }

    @Override // c2.q
    public void d(boolean z10) {
        j4.b0 b0Var = ((c2.k0) this.f162y).f1865f1;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new c2.l(b0Var, z10));
        }
    }

    @Override // v3.d
    public long e(int i6) {
        boolean z10;
        if (i6 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        u1.c.b(z10);
        return 0L;
    }

    @Override // c2.q
    public void f(long j) {
        j4.b0 b0Var = ((c2.k0) this.f162y).f1865f1;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new c2.k(b0Var, j));
        }
    }

    @Override // f.b
    public void g(Object obj) {
        f.a aVar = (f.a) obj;
        j1.p0 p0Var = (j1.p0) this.f162y;
        j1.k0 k0Var = (j1.k0) p0Var.F.pollLast();
        if (k0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = k0Var.f6925x;
        int i6 = k0Var.f6926y;
        j1.y j = p0Var.f6945c.j(str);
        if (j == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        j.q(i6, aVar.f4587x, aVar.f4588y);
    }

    @Override // ge.a
    public Object get() {
        return new n8.i(Integer.valueOf(n8.i.A).intValue(), (Context) ((ge.a) this.f162y).get(), "com.google.android.datatransport.events");
    }

    @Override // u2.q
    public Object h(Uri uri, w1.k kVar) {
        try {
            XmlPullParser newPullParser = ((XmlPullParserFactory) this.f162y).newPullParser();
            newPullParser.setInput(kVar, null);
            return (p2.c) new p2.f(uri.toString()).h(newPullParser);
        } catch (XmlPullParserException e10) {
            throw r1.l0.b(null, e10);
        }
    }

    @Override // c2.q
    public void i() {
        ((c2.k0) this.f162y).f1876q1 = true;
    }

    @Override // c2.q
    public void j() {
        q0 q0Var = ((c2.k0) this.f162y).f7116d0;
        if (q0Var != null) {
            q0Var.f365a.f471n0 = true;
        }
    }

    @Override // u2.j
    public void k(u2.l lVar, long j, long j10) {
        boolean z10;
        switch (this.f161x) {
            case 4:
                M(lVar, j, j10);
                return;
            default:
                lc.c cVar = (lc.c) this.f162y;
                synchronized (v2.b.f13258b) {
                    z10 = v2.b.f13259c;
                }
                if (!z10) {
                    ((d2.g) cVar.f8328x).A(new IOException(new ConcurrentModificationException()));
                    return;
                } else {
                    cVar.J();
                    return;
                }
        }
    }

    @Override // o.j
    public boolean n(o.l lVar, MenuItem menuItem) {
        p.n nVar = ((ActionMenuView) this.f162y).W;
        if (nVar != null) {
            Toolbar toolbar = (Toolbar) ((lc.c) nVar).f8328x;
            if (!toolbar.f821g0.a()) {
                j3 j3Var = toolbar.f823i0;
                if (j3Var != null) {
                    MainActivity mainActivity = ((fd.i) j3Var).f5191x;
                    bf.o[] oVarArr = MainActivity.J;
                    int itemId = menuItem.getItemId();
                    if (itemId == R.id.refresh_btn) {
                        j1.y D = mainActivity.z().D(mainActivity.T().f3147c.getId());
                        kotlin.jvm.internal.k.c(D, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                        List m9 = ((NavHostFragment) D).c().f6945c.m();
                        kotlin.jvm.internal.k.d(m9, "getFragments(...)");
                        j1.y yVar = (j1.y) ie.j.I(0, m9);
                        if (yVar != null) {
                            if (yVar instanceof nd.d) {
                                ((nd.d) yVar).P().getData();
                                return true;
                            }
                            if (yVar instanceof nd.e) {
                                ((nd.e) yVar).O();
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    if (itemId == R.id.fav_btn) {
                        l4.x U = mainActivity.U();
                        l4.u f3 = U.f8199b.f();
                        if (f3 == null || f3.f8195y.f9924a != R.id.favFragment) {
                            U.c(R.id.action_global_favFragment, null, null);
                            return true;
                        }
                        return true;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @Override // u2.j
    public void o(u2.l lVar, long j, long j10, boolean z10) {
        switch (this.f161x) {
            case 4:
                ((d2.g) this.f162y).y((u2.r) lVar, j10);
                return;
            default:
                return;
        }
    }

    @Override // v3.d
    public List p(long j) {
        if (j >= 0) {
            return (List) this.f162y;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // c2.q
    public void q(int i6, long j, long j10) {
        j4.b0 b0Var = ((c2.k0) this.f162y).f1865f1;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new c2.k(b0Var, i6, j, j10));
        }
    }

    @Override // v3.d
    public int s() {
        return 1;
    }

    public u0.c t(int i6) {
        return null;
    }

    @Override // c2.q
    public void u() {
        t2.q qVar;
        c2.k0 k0Var = (c2.k0) this.f162y;
        synchronized (k0Var.f244x) {
            qVar = k0Var.O;
        }
        if (qVar != null) {
            qVar.h();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // t0.s
    public t0.w1 v(View view, t0.w1 w1Var) {
        boolean z10;
        t0.w1 w1Var2;
        char c10;
        int b10;
        int c11;
        boolean z11;
        int c12;
        int d10 = w1Var.d();
        i.b0 b0Var = (i.b0) this.f162y;
        Context context = b0Var.H;
        int d11 = w1Var.d();
        ActionBarContextView actionBarContextView = b0Var.S;
        int i6 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b0Var.S.getLayoutParams();
            boolean z12 = true;
            if (b0Var.S.isShown()) {
                if (b0Var.A0 == null) {
                    b0Var.A0 = new Rect();
                    b0Var.B0 = new Rect();
                }
                Rect rect = b0Var.A0;
                Rect rect2 = b0Var.B0;
                rect.set(w1Var.b(), w1Var.d(), w1Var.c(), w1Var.a());
                ViewGroup viewGroup = b0Var.Y;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z13 = u3.f10392a;
                    t3.a(viewGroup, rect, rect2);
                } else {
                    if (!u3.f10392a) {
                        u3.f10392a = true;
                        c10 = 0;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            u3.f10393b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                u3.f10393b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    } else {
                        c10 = 0;
                    }
                    Method method = u3.f10393b;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[2];
                            objArr[c10] = rect;
                            objArr[1] = rect2;
                            method.invoke(viewGroup, objArr);
                        } catch (Exception e10) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                        }
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                t0.w1 i13 = t0.q0.i(b0Var.Y);
                if (i13 == null) {
                    b10 = 0;
                } else {
                    b10 = i13.b();
                }
                if (i13 == null) {
                    c11 = 0;
                } else {
                    c11 = i13.c();
                }
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 > 0 && b0Var.f6130a0 == null) {
                    View view2 = new View(context);
                    b0Var.f6130a0 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c11;
                    b0Var.Y.addView(b0Var.f6130a0, -1, layoutParams);
                } else {
                    View view3 = b0Var.f6130a0;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c11) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c11;
                            b0Var.f6130a0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = b0Var.f6130a0;
                if (view4 == null) {
                    z12 = false;
                }
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = b0Var.f6130a0;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        c12 = i0.f.c(context, R.color.abc_decor_view_status_guard_light);
                    } else {
                        c12 = i0.f.c(context, R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(c12);
                }
                if (!b0Var.f6135f0 && z12) {
                    d11 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                b0Var.S.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view6 = b0Var.f6130a0;
        if (view6 != null) {
            if (z10) {
                i6 = 0;
            }
            view6.setVisibility(i6);
        }
        if (d10 != d11) {
            w1Var2 = w1Var.f(w1Var.b(), d11, w1Var.c(), w1Var.a());
        } else {
            w1Var2 = w1Var;
        }
        return t0.q0.m(view, w1Var2);
    }

    @Override // c2.q
    public void w(Exception exc) {
        u1.a.h("MediaCodecAudioRenderer", "Audio sink error", exc);
        j4.b0 b0Var = ((c2.k0) this.f162y).f1865f1;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new c2.k(b0Var, exc, 5));
        }
    }

    @Override // c2.q
    public void x(c2.n nVar) {
        j4.b0 b0Var = ((c2.k0) this.f162y).f1865f1;
        Handler handler = (Handler) b0Var.f7158x;
        if (handler != null) {
            handler.post(new c2.k(b0Var, nVar, 1));
        }
    }

    @Override // c2.q
    public void y() {
        ((c2.k0) this.f162y).f1874o1 = true;
    }

    @Override // u2.j
    public void z(u2.l lVar, long j, long j10, int i6) {
        q2.u uVar;
        switch (this.f161x) {
            case 4:
                u2.r rVar = (u2.r) lVar;
                d2.g gVar = (d2.g) this.f162y;
                if (i6 == 0) {
                    long j11 = rVar.f12871x;
                    uVar = new q2.u(rVar.f12872y);
                } else {
                    long j12 = rVar.f12871x;
                    Uri uri = rVar.A.f13560z;
                    uVar = new q2.u(j10);
                }
                gVar.N.s(uVar, rVar.f12873z, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i6);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [u5.r, java.lang.Object, t0.z] */
    public a2(View view) {
        this.f161x = 23;
        if (Build.VERSION.SDK_INT >= 30) {
            ?? rVar = new u5.r(view, 24);
            rVar.f12429z = view;
            this.f162y = rVar;
            return;
        }
        this.f162y = new u5.r(view, 24);
    }

    public a2(Bundle bundle) {
        this.f161x = 10;
        this.f162y = new Bundle(bundle);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, j4.b0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.text.Editable$Factory, g1.a] */
    public a2(EditText editText) {
        this.f161x = 6;
        ?? obj = new Object();
        obj.f7158x = editText;
        g1.i iVar = new g1.i(editText);
        obj.f7159y = iVar;
        editText.addTextChangedListener(iVar);
        if (g1.a.f5281b == null) {
            synchronized (g1.a.f5280a) {
                try {
                    if (g1.a.f5281b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            g1.a.f5282c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, g1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        g1.a.f5281b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(g1.a.f5281b);
        this.f162y = obj;
    }

    public a2(int i6) {
        this.f161x = i6;
        switch (i6) {
            case 1:
                this.f162y = new HashSet();
                return;
            case 7:
                this.f162y = new SparseArray();
                return;
            case 20:
                try {
                    this.f162y = XmlPullParserFactory.newInstance();
                    return;
                } catch (XmlPullParserException e10) {
                    throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
                }
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.BANNER_SIZE_FIELD_NUMBER /* 22 */:
                this.f162y = new Object();
                return;
            case 24:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f162y = new u0.d(this);
                    return;
                } else {
                    this.f162y = new u0.d(this);
                    return;
                }
            default:
                return;
        }
    }

    public a2(Context context, j4.b0 b0Var) {
        this.f161x = 12;
        j4.a0 a0Var = ((j4.u) b0Var.f7158x).f7210c;
        Collections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f162y = new j4.l(context, a0Var);
        } else {
            this.f162y = new j4.l(context, a0Var);
        }
    }

    private final void L(u2.l lVar, long j, long j10, boolean z10) {
    }

    private final /* synthetic */ void N(u2.l lVar, long j, long j10, int i6) {
    }
}
