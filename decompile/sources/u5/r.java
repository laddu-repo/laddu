package u5;

import a2.d2;
import a2.q0;
import android.R;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.j1;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import db.i0;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import j1.h0;
import j1.k0;
import j1.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import n9.c1;
import n9.e0;
import n9.l1;
import n9.n1;
import o.d0;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import q2.a1;
import q2.b1;
import q2.k1;
import r1.e1;
import r1.l0;
import r1.p1;
import w2.f0;
import w4.i1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class r implements WebMessageListenerBoundaryInterface, f2.y, a1, i8.b, f.b, o.w, o.j, s2.a, f0 {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f12915x;

    /* renamed from: y, reason: collision with root package name */
    public Object f12916y;

    public /* synthetic */ r(int i6, boolean z10) {
        this.f12915x = i6;
    }

    public static r w(int i6, int i10, int i11, int i12, boolean z10) {
        return new r(AccessibilityNodeInfo.CollectionItemInfo.obtain(i6, i10, i11, i12, false, z10), 25);
    }

    public r A(int i6) {
        if (i6 == 16) {
            i6 = 12;
        }
        ((AudioAttributes.Builder) this.f12916y).setUsage(i6);
        return this;
    }

    public /* bridge */ void B(int i6) {
        A(i6);
    }

    public void C() {
        View view;
        View view2 = (View) this.f12916y;
        if (view2 != null) {
            if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
                view = view2.getRootView().findFocus();
            } else {
                view2.requestFocus();
                view = view2;
            }
            if (view == null) {
                view = view2.getRootView().findViewById(R.id.content);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new ma.o(view, 1));
            }
        }
    }

    public void D(String str, Bundle bundle) {
        String uri;
        n1 n1Var = (n1) this.f12916y;
        l1 l1Var = n1Var.D;
        c1 c1Var = n1Var.B;
        n1.g(l1Var);
        l1Var.d1();
        if (!n1Var.a()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                n1.e(c1Var);
                c1Var.U.m(uri);
                d2 d2Var = c1Var.V;
                n1Var.H.getClass();
                d2Var.h(System.currentTimeMillis());
            }
        }
    }

    public boolean E() {
        if (F()) {
            n1 n1Var = (n1) this.f12916y;
            n1Var.H.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            c1 c1Var = n1Var.B;
            n1.e(c1Var);
            if (currentTimeMillis - c1Var.V.c() > n1Var.A.k1(null, e0.f9255k0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean F() {
        c1 c1Var = ((n1) this.f12916y).B;
        n1.e(c1Var);
        if (c1Var.V.c() > 0) {
            return true;
        }
        return false;
    }

    @Override // o.j
    public void G(o.l lVar) {
        Toolbar toolbar = (Toolbar) this.f12916y;
        p.j jVar = toolbar.f832x.Q;
        if (jVar != null && jVar.h()) {
            return;
        }
        Iterator it = toolbar.f821g0.f12372b.iterator();
        while (it.hasNext()) {
            ((h0) ((t0.n) it.next())).f6917a.t();
        }
    }

    @Override // w2.f0
    public void a() {
        w2.k kVar = (w2.k) this.f12916y;
        Surface surface = kVar.f13666u1;
        if (surface != null) {
            kVar.f13652g1.w(surface);
            kVar.f13669x1 = true;
        }
    }

    @Override // s2.a
    public long c(long j) {
        ArrayList arrayList = (ArrayList) this.f12916y;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((v3.a) arrayList.get(0)).f13262b) {
            return ((v3.a) arrayList.get(0)).f13262b;
        }
        for (int i6 = 1; i6 < arrayList.size(); i6++) {
            v3.a aVar = (v3.a) arrayList.get(i6);
            long j10 = aVar.f13262b;
            long j11 = aVar.f13262b;
            if (j < j10) {
                long j12 = ((v3.a) arrayList.get(i6 - 1)).f13264d;
                if (j12 != -9223372036854775807L && j12 > j && j12 < j11) {
                    return j12;
                }
                return j11;
            }
        }
        long j13 = ((v3.a) db.r.l(arrayList)).f13264d;
        if (j13 == -9223372036854775807L || j >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override // s2.a
    public void clear() {
        ((ArrayList) this.f12916y).clear();
    }

    @Override // f2.y
    public byte[] d(UUID uuid, f2.r rVar) {
        return (byte[]) this.f12916y;
    }

    @Override // o.w
    public void e(o.l lVar, boolean z10) {
        if (lVar instanceof d0) {
            ((d0) lVar).f9761z.k().c(false);
        }
        o.w wVar = ((p.j) this.f12916y).B;
        if (wVar != null) {
            wVar.e(lVar, z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // s2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(v3.a r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f12916y
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            long r1 = r11.f13262b
            r3 = 0
            r4 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L13
            r7 = 1
            goto L14
        L13:
            r7 = 0
        L14:
            u1.c.b(r7)
            int r7 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r7 > 0) goto L27
            long r7 = r11.f13264d
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 == 0) goto L25
            int r5 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r5 >= 0) goto L27
        L25:
            r5 = 1
            goto L28
        L27:
            r5 = 0
        L28:
            int r6 = r0.size()
            int r6 = r6 - r4
        L2d:
            if (r6 < 0) goto L50
            java.lang.Object r7 = r0.get(r6)
            v3.a r7 = (v3.a) r7
            long r7 = r7.f13262b
            int r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r9 < 0) goto L40
            int r6 = r6 + r4
            r0.add(r6, r11)
            return r5
        L40:
            java.lang.Object r7 = r0.get(r6)
            v3.a r7 = (v3.a) r7
            long r7 = r7.f13262b
            int r9 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r9 > 0) goto L4d
            r5 = 0
        L4d:
            int r6 = r6 + (-1)
            goto L2d
        L50:
            r0.add(r3, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.r.f(v3.a, long):boolean");
    }

    @Override // f.b
    public void g(Object obj) {
        int i6;
        Map map = (Map) obj;
        p0 p0Var = (p0) this.f12916y;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((Boolean) arrayList.get(i10)).booleanValue()) {
                i6 = 0;
            } else {
                i6 = -1;
            }
            iArr[i10] = i6;
        }
        k0 k0Var = (k0) p0Var.F.pollFirst();
        if (k0Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = k0Var.f6925x;
            if (p0Var.f6945c.j(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    @Override // ge.a
    public Object get() {
        switch (this.f12915x) {
            case 9:
                return new j1((Context) ((lc.c) this.f12916y).f8328x, new Object(), new Object(), 21);
            default:
                String packageName = ((Context) ((ge.a) this.f12916y).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    @Override // f2.y
    public byte[] h(f2.s sVar) {
        throw new UnsupportedOperationException();
    }

    @Override // s2.a
    public db.k0 i(long j) {
        int s = s(j);
        if (s == 0) {
            i0 i0Var = db.k0.f4008y;
            return db.c1.B;
        }
        v3.a aVar = (v3.a) ((ArrayList) this.f12916y).get(s - 1);
        long j10 = aVar.f13264d;
        if (j10 != -9223372036854775807L && j >= j10) {
            i0 i0Var2 = db.k0.f4008y;
            return db.c1.B;
        }
        return aVar.f13261a;
    }

    @Override // q2.a1
    public void j(b1 b1Var) {
        g2.k kVar = (g2.k) this.f12916y;
        kVar.N.j(kVar);
    }

    @Override // w2.f0
    public void l() {
        w2.k kVar = (w2.k) this.f12916y;
        if (kVar.f13666u1 != null) {
            kVar.N0(0, 1);
        }
    }

    @Override // w2.f0
    public void m() {
        q0 q0Var = ((w2.k) this.f12916y).f7116d0;
        if (q0Var != null) {
            q0Var.a();
        }
    }

    @Override // o.j
    public boolean n(o.l lVar, MenuItem menuItem) {
        ((Toolbar) this.f12916y).getClass();
        return false;
    }

    @Override // s2.a
    public long o(long j) {
        ArrayList arrayList = (ArrayList) this.f12916y;
        if (arrayList.isEmpty() || j < ((v3.a) arrayList.get(0)).f13262b) {
            return -9223372036854775807L;
        }
        for (int i6 = 1; i6 < arrayList.size(); i6++) {
            long j10 = ((v3.a) arrayList.get(i6)).f13262b;
            if (j == j10) {
                return j10;
            }
            if (j < j10) {
                v3.a aVar = (v3.a) arrayList.get(i6 - 1);
                long j11 = aVar.f13264d;
                if (j11 != -9223372036854775807L && j11 <= j) {
                    return j11;
                }
                return aVar.f13262b;
            }
        }
        v3.a aVar2 = (v3.a) db.r.l(arrayList);
        long j12 = aVar2.f13264d;
        if (j12 != -9223372036854775807L && j >= j12) {
            return j12;
        }
        return aVar2.f13262b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPostMessage(android.webkit.WebView r9, java.lang.reflect.InvocationHandler r10, android.net.Uri r11, boolean r12, java.lang.reflect.InvocationHandler r13) {
        /*
            r8 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r10 = dg.b.d(r0, r10)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r10 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r10
            java.lang.reflect.InvocationHandler[] r0 = r10.getPorts()
            int r1 = r0.length
            s8.l[] r1 = new s8.l[r1]
            r2 = 0
        L10:
            int r3 = r0.length
            if (r2 >= r3) goto L2b
            s8.l r3 = new s8.l
            r4 = r0[r2]
            r5 = 7
            r6 = 0
            r3.<init>(r5, r6)
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r5 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r4 = dg.b.d(r5, r4)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r4 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r4
            r3.f12252z = r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L2b:
            u5.b r0 = u5.u.f12923d
            boolean r0 = r0.b()
            if (r0 == 0) goto L60
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r10 = r10.getMessagePayload()
            java.lang.Object r10 = dg.b.d(r0, r10)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r10 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r10
            int r0 = r10.getType()
            if (r0 == 0) goto L56
            r2 = 1
            if (r0 == r2) goto L4b
            r10 = 0
            r4 = r10
            goto L6a
        L4b:
            t5.d r0 = new t5.d
            byte[] r10 = r10.getAsArrayBuffer()
            r0.<init>(r10, r1)
        L54:
            r4 = r0
            goto L6a
        L56:
            t5.d r0 = new t5.d
            java.lang.String r10 = r10.getAsString()
            r0.<init>(r10, r1)
            goto L54
        L60:
            t5.d r0 = new t5.d
            java.lang.String r10 = r10.getData()
            r0.<init>(r10, r1)
            goto L54
        L6a:
            if (r4 == 0) goto L9b
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r10 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r10 = dg.b.d(r10, r13)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r10 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r10
            n9.g1 r13 = new n9.g1
            r0 = 2
            r13.<init>(r10, r0)
            java.lang.Object r10 = r10.getOrCreatePeer(r13)
            r7 = r10
            u5.o r7 = (u5.o) r7
            java.lang.Object r10 = r8.f12916y
            com.unity3d.services.core.webview.a r10 = (com.unity3d.services.core.webview.a) r10
            int r13 = r10.f3414a
            switch(r13) {
                case 0: goto L93;
                default: goto L8a;
            }
        L8a:
            com.unity3d.services.core.webview.bridge.WebViewBridgeInterface r2 = r10.f3415b
            r3 = r9
            r5 = r11
            r6 = r12
            r2.onHandleCallback(r3, r4, r5, r6, r7)
            goto L9b
        L93:
            r3 = r9
            r5 = r11
            r6 = r12
            com.unity3d.services.core.webview.bridge.WebViewBridgeInterface r2 = r10.f3415b
            r2.onHandleInvocation(r3, r4, r5, r6, r7)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.r.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override // s2.a
    public void p(long j) {
        ArrayList arrayList = (ArrayList) this.f12916y;
        int s = s(j);
        if (s == 0) {
            return;
        }
        long j10 = ((v3.a) arrayList.get(s - 1)).f13264d;
        if (j10 == -9223372036854775807L || j10 >= j) {
            s--;
        }
        arrayList.subList(0, s).clear();
    }

    public void q(int i6, int i10, y2.p pVar) {
        char c10;
        char c11;
        long j;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        q3.d dVar = (q3.d) this.f12916y;
        q3.e eVar = dVar.f11055b;
        SparseArray sparseArray = dVar.f11057c;
        u1.t tVar = dVar.f11067k;
        u1.t tVar2 = dVar.f11066i;
        int i16 = 1;
        int i17 = 0;
        if (i6 != 161 && i6 != 163) {
            if (i6 != 165) {
                if (i6 != 16877) {
                    if (i6 != 16981) {
                        if (i6 != 18402) {
                            if (i6 != 21419) {
                                if (i6 != 25506) {
                                    if (i6 == 30322) {
                                        dVar.e(i6);
                                        byte[] bArr = new byte[i10];
                                        dVar.f11079x.f11044x = bArr;
                                        pVar.readFully(bArr, 0, i10);
                                        return;
                                    }
                                    throw l0.a(null, "Unexpected id: " + i6);
                                }
                                dVar.e(i6);
                                byte[] bArr2 = new byte[i10];
                                dVar.f11079x.f11033l = bArr2;
                                pVar.readFully(bArr2, 0, i10);
                                return;
                            }
                            Arrays.fill(tVar.f12811a, (byte) 0);
                            pVar.readFully(tVar.f12811a, 4 - i10, i10);
                            tVar.K(0);
                            dVar.f11081z = (int) tVar.A();
                            return;
                        }
                        byte[] bArr3 = new byte[i10];
                        pVar.readFully(bArr3, 0, i10);
                        dVar.e(i6);
                        dVar.f11079x.f11032k = new y2.e0(1, bArr3, 0, 0);
                        return;
                    }
                    dVar.e(i6);
                    byte[] bArr4 = new byte[i10];
                    dVar.f11079x.j = bArr4;
                    pVar.readFully(bArr4, 0, i10);
                    return;
                }
                dVar.e(i6);
                q3.c cVar = dVar.f11079x;
                int i18 = cVar.f11030h;
                if (i18 != 1685485123 && i18 != 1685480259) {
                    pVar.w(i10);
                    return;
                }
                byte[] bArr5 = new byte[i10];
                cVar.P = bArr5;
                pVar.readFully(bArr5, 0, i10);
                return;
            }
            if (dVar.J == 2) {
                q3.c cVar2 = (q3.c) sparseArray.get(dVar.P);
                int i19 = dVar.S;
                u1.t tVar3 = dVar.f11072p;
                if (i19 == 4 && "V_VP9".equals(cVar2.f11024c)) {
                    tVar3.H(i10);
                    pVar.readFully(tVar3.f12811a, 0, i10);
                    return;
                } else {
                    pVar.w(i10);
                    return;
                }
            }
            return;
        }
        if (dVar.J == 0) {
            dVar.P = (int) eVar.b(pVar, false, true, 8);
            dVar.Q = eVar.f11085c;
            dVar.L = -9223372036854775807L;
            dVar.J = 1;
            tVar2.H(0);
        }
        q3.c cVar3 = (q3.c) sparseArray.get(dVar.P);
        if (cVar3 == null) {
            pVar.w(i10 - dVar.Q);
            dVar.J = 0;
            return;
        }
        cVar3.f11021a0.getClass();
        if (dVar.J == 1) {
            dVar.k(pVar, 3);
            int i20 = (tVar2.f12811a[2] & 6) >> 1;
            byte b10 = 255;
            if (i20 == 0) {
                dVar.N = 1;
                int[] iArr = dVar.O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.O = iArr;
                iArr[0] = (i10 - dVar.Q) - 3;
            } else {
                dVar.k(pVar, 4);
                int i21 = (tVar2.f12811a[3] & 255) + 1;
                dVar.N = i21;
                int[] iArr2 = dVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i21];
                } else if (iArr2.length < i21) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i21)];
                }
                dVar.O = iArr2;
                if (i20 == 2) {
                    int i22 = (i10 - dVar.Q) - 4;
                    int i23 = dVar.N;
                    Arrays.fill(iArr2, 0, i23, i22 / i23);
                } else if (i20 == 1) {
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 4;
                    while (true) {
                        i12 = dVar.N - 1;
                        if (i24 >= i12) {
                            break;
                        }
                        dVar.O[i24] = 0;
                        while (true) {
                            i13 = i26 + 1;
                            dVar.k(pVar, i13);
                            int i27 = tVar2.f12811a[i26] & 255;
                            int[] iArr3 = dVar.O;
                            i14 = iArr3[i24] + i27;
                            iArr3[i24] = i14;
                            if (i27 != 255) {
                                break;
                            } else {
                                i26 = i13;
                            }
                        }
                        i25 += i14;
                        i24++;
                        i26 = i13;
                    }
                    dVar.O[i12] = ((i10 - dVar.Q) - i26) - i25;
                } else {
                    if (i20 == 3) {
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 4;
                        while (true) {
                            int i31 = dVar.N - i16;
                            if (i28 < i31) {
                                dVar.O[i28] = i17;
                                int i32 = i30 + 1;
                                dVar.k(pVar, i32);
                                if (tVar2.f12811a[i30] != 0) {
                                    int i33 = 0;
                                    while (true) {
                                        if (i33 < 8) {
                                            int i34 = 1 << (7 - i33);
                                            if ((tVar2.f12811a[i30] & i34) != 0) {
                                                i11 = i32 + i33;
                                                dVar.k(pVar, i11);
                                                j = tVar2.f12811a[i30] & b10 & (~i34);
                                                while (i32 < i11) {
                                                    j = (j << 8) | (tVar2.f12811a[i32] & b10);
                                                    i32++;
                                                    b10 = 255;
                                                }
                                                if (i28 > 0) {
                                                    j -= (1 << ((i33 * 7) + 6)) - 1;
                                                }
                                            } else {
                                                i33++;
                                                b10 = 255;
                                            }
                                        } else {
                                            j = 0;
                                            i11 = i32;
                                            break;
                                        }
                                    }
                                    if (j < -2147483648L || j > 2147483647L) {
                                        break;
                                    }
                                    int i35 = (int) j;
                                    int[] iArr4 = dVar.O;
                                    if (i28 != 0) {
                                        i35 += iArr4[i28 - 1];
                                    }
                                    iArr4[i28] = i35;
                                    i29 += i35;
                                    i28++;
                                    i30 = i11;
                                    b10 = 255;
                                    i16 = 1;
                                    i17 = 0;
                                } else {
                                    throw l0.a(null, "No valid varint length mask found");
                                }
                            } else {
                                c10 = 1;
                                c11 = 0;
                                dVar.O[i31] = ((i10 - dVar.Q) - i30) - i29;
                                break;
                            }
                        }
                        throw l0.a(null, "EBML lacing sample size out of range.");
                    }
                    throw l0.a(null, "Unexpected lacing value: " + i20);
                }
            }
            c10 = 1;
            c11 = 0;
            byte[] bArr6 = tVar2.f12811a;
            dVar.K = dVar.n((bArr6[c10] & 255) | (bArr6[c11] << 8)) + dVar.E;
            if (cVar3.f11027e != 2 && (i6 != 163 || (tVar2.f12811a[2] & 128) != 128)) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            dVar.R = i15;
            dVar.J = 2;
            dVar.M = 0;
        }
        if (i6 == 163) {
            while (true) {
                int i36 = dVar.M;
                if (i36 < dVar.N) {
                    dVar.g(cVar3, ((dVar.M * cVar3.f11028f) / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT) + dVar.K, dVar.R, dVar.o(pVar, cVar3, dVar.O[i36], false), 0);
                    dVar.M++;
                } else {
                    dVar.J = 0;
                    return;
                }
            }
        } else {
            while (true) {
                int i37 = dVar.M;
                if (i37 < dVar.N) {
                    int[] iArr5 = dVar.O;
                    iArr5[i37] = dVar.o(pVar, cVar3, iArr5[i37], true);
                    dVar.M++;
                } else {
                    return;
                }
            }
        }
    }

    public j4.a r() {
        return new j4.a(((AudioAttributes.Builder) this.f12916y).build());
    }

    public int s(long j) {
        ArrayList arrayList = (ArrayList) this.f12916y;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            if (j < ((v3.a) arrayList.get(i6)).f13262b) {
                return i6;
            }
        }
        return arrayList.size();
    }

    public void t() {
        View view = (View) this.f12916y;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void u(int i6, long j) {
        q3.d dVar = (q3.d) this.f12916y;
        if (i6 != 20529) {
            if (i6 != 20530) {
                boolean z10 = false;
                switch (i6) {
                    case 131:
                        dVar.e(i6);
                        dVar.f11079x.f11027e = (int) j;
                        return;
                    case 136:
                        dVar.e(i6);
                        q3.c cVar = dVar.f11079x;
                        if (j == 1) {
                            z10 = true;
                        }
                        cVar.Y = z10;
                        return;
                    case 155:
                        dVar.L = dVar.n(j);
                        return;
                    case 159:
                        dVar.e(i6);
                        dVar.f11079x.Q = (int) j;
                        return;
                    case 176:
                        dVar.e(i6);
                        dVar.f11079x.f11035n = (int) j;
                        return;
                    case 179:
                        dVar.b(i6);
                        dVar.F.e(dVar.n(j));
                        return;
                    case 186:
                        dVar.e(i6);
                        dVar.f11079x.f11036o = (int) j;
                        return;
                    case 215:
                        dVar.e(i6);
                        dVar.f11079x.f11026d = (int) j;
                        return;
                    case 231:
                        dVar.E = dVar.n(j);
                        return;
                    case 238:
                        dVar.S = (int) j;
                        return;
                    case 241:
                        if (!dVar.H) {
                            dVar.b(i6);
                            dVar.G.e(j);
                            dVar.H = true;
                            return;
                        }
                        return;
                    case 251:
                        dVar.T = true;
                        return;
                    case 16871:
                        dVar.e(i6);
                        dVar.f11079x.f11030h = (int) j;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw l0.a(null, "ContentCompAlgo " + j + " not supported");
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw l0.a(null, "DocTypeReadVersion " + j + " not supported");
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw l0.a(null, "EBMLReadVersion " + j + " not supported");
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw l0.a(null, "ContentEncAlgo " + j + " not supported");
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw l0.a(null, "AESSettingsCipherMode " + j + " not supported");
                        }
                        return;
                    case 21420:
                        dVar.A = j + dVar.s;
                        return;
                    case 21432:
                        int i10 = (int) j;
                        dVar.e(i6);
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 != 3) {
                                    if (i10 == 15) {
                                        dVar.f11079x.f11045y = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f11079x.f11045y = 1;
                                return;
                            }
                            dVar.f11079x.f11045y = 2;
                            return;
                        }
                        dVar.f11079x.f11045y = 0;
                        return;
                    case 21680:
                        dVar.e(i6);
                        dVar.f11079x.f11038q = (int) j;
                        return;
                    case 21682:
                        dVar.e(i6);
                        dVar.f11079x.s = (int) j;
                        return;
                    case 21690:
                        dVar.e(i6);
                        dVar.f11079x.f11039r = (int) j;
                        return;
                    case 21930:
                        dVar.e(i6);
                        q3.c cVar2 = dVar.f11079x;
                        if (j == 1) {
                            z10 = true;
                        }
                        cVar2.X = z10;
                        return;
                    case 21938:
                        dVar.e(i6);
                        q3.c cVar3 = dVar.f11079x;
                        cVar3.f11046z = true;
                        cVar3.f11037p = (int) j;
                        return;
                    case 21998:
                        dVar.e(i6);
                        dVar.f11079x.f11029g = (int) j;
                        return;
                    case 22186:
                        dVar.e(i6);
                        dVar.f11079x.T = j;
                        return;
                    case 22203:
                        dVar.e(i6);
                        dVar.f11079x.U = j;
                        return;
                    case 25188:
                        dVar.e(i6);
                        dVar.f11079x.R = (int) j;
                        return;
                    case 30114:
                        dVar.U = j;
                        return;
                    case 30321:
                        dVar.e(i6);
                        int i11 = (int) j;
                        if (i11 != 0) {
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 == 3) {
                                        dVar.f11079x.f11040t = 3;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f11079x.f11040t = 2;
                                return;
                            }
                            dVar.f11079x.f11040t = 1;
                            return;
                        }
                        dVar.f11079x.f11040t = 0;
                        return;
                    case 2352003:
                        dVar.e(i6);
                        dVar.f11079x.f11028f = (int) j;
                        return;
                    case 2807729:
                        dVar.f11075t = j;
                        return;
                    default:
                        switch (i6) {
                            case 21945:
                                dVar.e(i6);
                                int i12 = (int) j;
                                if (i12 != 1) {
                                    if (i12 == 2) {
                                        dVar.f11079x.C = 1;
                                        return;
                                    }
                                    return;
                                }
                                dVar.f11079x.C = 2;
                                return;
                            case 21946:
                                dVar.e(i6);
                                int g10 = r1.h.g((int) j);
                                if (g10 != -1) {
                                    dVar.f11079x.B = g10;
                                    return;
                                }
                                return;
                            case 21947:
                                dVar.e(i6);
                                dVar.f11079x.f11046z = true;
                                int f3 = r1.h.f((int) j);
                                if (f3 != -1) {
                                    dVar.f11079x.A = f3;
                                    return;
                                }
                                return;
                            case 21948:
                                dVar.e(i6);
                                dVar.f11079x.D = (int) j;
                                return;
                            case 21949:
                                dVar.e(i6);
                                dVar.f11079x.E = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            }
            if (j != 1) {
                throw l0.a(null, "ContentEncodingScope " + j + " not supported");
            }
            return;
        }
        if (j == 0) {
            return;
        }
        throw l0.a(null, "ContentEncodingOrder " + j + " not supported");
    }

    @Override // o.w
    public boolean v(o.l lVar) {
        p.j jVar = (p.j) this.f12916y;
        if (lVar == jVar.f10273z) {
            return false;
        }
        ((d0) lVar).A.getClass();
        jVar.getClass();
        o.w wVar = jVar.B;
        if (wVar == null) {
            return false;
        }
        return wVar.v(lVar);
    }

    public void x() {
        g2.k kVar = (g2.k) this.f12916y;
        int i6 = kVar.O - 1;
        kVar.O = i6;
        if (i6 > 0) {
            return;
        }
        int i10 = 0;
        for (g2.q qVar : kVar.Q) {
            qVar.b();
            i10 += qVar.f5366f0.f10909a;
        }
        e1[] e1VarArr = new e1[i10];
        int i11 = 0;
        for (g2.q qVar2 : kVar.Q) {
            qVar2.b();
            int i12 = qVar2.f5366f0.f10909a;
            int i13 = 0;
            while (i13 < i12) {
                qVar2.b();
                e1VarArr[i11] = qVar2.f5366f0.a(i13);
                i13++;
                i11++;
            }
        }
        kVar.P = new k1(e1VarArr);
        kVar.N.k(kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y(w4.i1 r9, b2.j r10, b2.j r11) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f12916y
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.getClass()
            r1 = 0
            r9.o(r1)
            w4.o0 r1 = r0.f1133l0
            r2 = r1
            w4.m r2 = (w4.m) r2
            if (r10 == 0) goto L22
            r2.getClass()
            int r4 = r10.f1380a
            int r6 = r11.f1380a
            if (r4 != r6) goto L24
            int r1 = r10.f1381b
            int r3 = r11.f1381b
            if (r1 == r3) goto L22
            goto L24
        L22:
            r3 = r9
            goto L2e
        L24:
            int r5 = r10.f1381b
            int r7 = r11.f1381b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            goto L3d
        L2e:
            r2.l(r3)
            android.view.View r9 = r3.f13897a
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.f13943i
            r9.add(r3)
            r9 = 1
        L3d:
            if (r9 == 0) goto L42
            r0.T()
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.r.y(w4.i1, b2.j, b2.j):void");
    }

    public void z(i1 i1Var, b2.j jVar, b2.j jVar2) {
        int i6;
        int i10;
        boolean z10;
        RecyclerView recyclerView = (RecyclerView) this.f12916y;
        recyclerView.f1148z.m(i1Var);
        recyclerView.f(i1Var);
        i1Var.o(false);
        w4.m mVar = (w4.m) recyclerView.f1133l0;
        mVar.getClass();
        int i11 = jVar.f1380a;
        int i12 = jVar.f1381b;
        View view = i1Var.f13897a;
        if (jVar2 == null) {
            i6 = view.getLeft();
        } else {
            i6 = jVar2.f1380a;
        }
        int i13 = i6;
        if (jVar2 == null) {
            i10 = view.getTop();
        } else {
            i10 = jVar2.f1381b;
        }
        int i14 = i10;
        if (!i1Var.i() && (i11 != i13 || i12 != i14)) {
            view.layout(i13, i14, view.getWidth() + i13, view.getHeight() + i14);
            z10 = mVar.g(i1Var, i11, i12, i13, i14);
        } else {
            mVar.l(i1Var);
            mVar.f13942h.add(i1Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.T();
        }
    }

    public /* synthetic */ r(Object obj, int i6) {
        this.f12915x = i6;
        this.f12916y = obj;
    }

    public r(int i6) {
        this.f12915x = i6;
        switch (i6) {
            case HeaderBiddingTokenOuterClass.HeaderBiddingToken.MEDIATION_AD_UNIT_ID_FIELD_NUMBER /* 23 */:
                this.f12916y = new ArrayList();
                return;
            default:
                this.f12916y = new AudioAttributes.Builder();
                return;
        }
    }

    @Override // w2.f0
    public void b(p1 p1Var) {
    }
}
