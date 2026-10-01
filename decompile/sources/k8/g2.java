package k8;

import android.R;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.le;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.livxow.tv.activities.SupportActivity;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import k8.g2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class g2 implements n.j, o.m, o4.j1, o8.e, o8.d, o8.b, o8.a, pe.c, qa.b, ra.a, o8.g, t0.e, t7.d, u0.m, u2.e0, o8.c, w8.b, w4.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7545v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f7546w;

    public /* synthetic */ g2(int i, Object obj) {
        this.f7545v = i;
        this.f7546w = obj;
    }

    public static boolean J(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String N(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public static String P(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // w4.e
    public void A(w4.d dVar) {
        y4.e eVar = (y4.e) this.f7546w;
        int length = eVar.f14454y.length;
        for (int i = 1; i < length; i++) {
            int i10 = eVar.f14454y[i];
            if (i10 == 1) {
                dVar.N(i, eVar.f14455z[i]);
            } else if (i10 == 2) {
                dVar.C(i, eVar.A[i]);
            } else if (i10 == 3) {
                String str = eVar.B[i];
                de.i.b(str);
                dVar.t(i, str);
            } else if (i10 == 4) {
                byte[] bArr = eVar.C[i];
                de.i.b(bArr);
                dVar.X(i, bArr);
            } else if (i10 == 5) {
                dVar.e(i);
            }
        }
    }

    @Override // qa.b
    public void B(String str, Bundle bundle) {
        sa.n nVar = (sa.n) this.f7546w;
        if (nVar != null) {
            try {
                final String str2 = "$A$:" + N(str, bundle);
                final sa.q qVar = nVar.f11647a;
                final long jCurrentTimeMillis = System.currentTimeMillis() - qVar.f11658d;
                qVar.f11667o.f12520a.b(new Callable() { // from class: sa.o
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        q qVar2 = qVar;
                        return qVar2.f11667o.f12521b.a(new p(qVar2, jCurrentTimeMillis, str2));
                    }
                });
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // o8.g
    public o8.o C(Object obj) {
        ab.d dVar = (ab.d) obj;
        ob.d dVar2 = (ob.d) this.f7546w;
        if (dVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return b8.h.o(null);
        }
        sa.l lVar = (sa.l) dVar2.f10106x;
        sa.l.a(lVar);
        lVar.f11639m.r(null, lVar.f11633e.f12520a);
        lVar.f11643q.c(null);
        return b8.h.o(null);
    }

    public boolean D(String str) {
        String strH = H(str);
        return "1".equals(strH) || Boolean.parseBoolean(strH);
    }

    public Integer E(String str) {
        String strH = H(str);
        if (TextUtils.isEmpty(strH)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strH));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + P(str) + "(" + strH + ") into an int");
            return null;
        }
    }

    public JSONArray F(String str) {
        String strH = H(str);
        if (TextUtils.isEmpty(strH)) {
            return null;
        }
        try {
            return new JSONArray(strH);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + P(str) + ": " + strH + ", falling back to default");
            return null;
        }
    }

    public String G(Resources resources, String str, String str2) {
        String[] strArr;
        String strH = H(str2);
        if (!TextUtils.isEmpty(strH)) {
            return strH;
        }
        String strH2 = H(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strH2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strH2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", P(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayF = F(str2.concat("_loc_args"));
        if (jSONArrayF == null) {
            strArr = null;
        } else {
            int length = jSONArrayF.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayF.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e7) {
            Log.w("NotificationParams", "Missing format argument for " + P(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e7);
            return null;
        }
    }

    public String H(String str) {
        Bundle bundle = (Bundle) this.f7546w;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public void I() {
        View view = (View) this.f7546w;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public Bundle K() {
        Bundle bundle = (Bundle) this.f7546w;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public synchronized void L(y5.c cVar) {
        cVar.f14478b = null;
        cVar.f14479c = null;
        ((ArrayDeque) this.f7546w).offer(cVar);
    }

    public void M(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f7546w;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.M(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void O() {
        View viewFindViewById;
        View view = (View) this.f7546w;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new i9.o(viewFindViewById, 1));
    }

    public void Q() {
        long jElapsedRealtime;
        x3 x3Var = (x3) this.f7546w;
        x3Var.D();
        p1 p1Var = (p1) x3Var.f2053w;
        d1 d1Var = p1Var.f7696z;
        p1.j(d1Var);
        x7.a aVar = p1Var.F;
        aVar.getClass();
        if (d1Var.M(System.currentTimeMillis())) {
            d1 d1Var2 = p1Var.f7696z;
            p1.j(d1Var2);
            d1Var2.H.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                v0 v0Var = p1Var.A;
                p1.l(v0Var);
                v0Var.J.a("Detected application was in foreground");
                aVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (p1Var.f7695y.O(null, f0.f7493f1)) {
                    aVar.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    jElapsedRealtime = 0;
                }
                T(jCurrentTimeMillis, jElapsedRealtime);
            }
        }
    }

    public boolean R() {
        v0 v0Var = ((p1) this.f7546w).A;
        p1.l(v0Var);
        return Log.isLoggable(v0Var.N(), 3);
    }

    public void S(long j8, long j9) {
        x3 x3Var = (x3) this.f7546w;
        x3Var.D();
        x3Var.H();
        p1 p1Var = (p1) x3Var.f2053w;
        d1 d1Var = p1Var.f7696z;
        p1.j(d1Var);
        if (d1Var.M(j8)) {
            p1.j(d1Var);
            d1Var.H.b(true);
            p1Var.q().I();
        }
        p1.j(d1Var);
        d1Var.L.h(j8);
        if (d1Var.H.a()) {
            T(j8, j9);
        }
    }

    public void T(long j8, long j9) {
        x3 x3Var = (x3) this.f7546w;
        x3Var.D();
        p1 p1Var = (p1) x3Var.f2053w;
        if (p1Var.b()) {
            d1 d1Var = p1Var.f7696z;
            p1.j(d1Var);
            d1Var.L.h(j8);
            p1Var.F.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            v0 v0Var = p1Var.A;
            p1.l(v0Var);
            v0Var.J.b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j10 = j8 / 1000;
            Long lValueOf = Long.valueOf(j10);
            u2 u2Var = p1Var.H;
            p1.k(u2Var);
            u2Var.O(j8, lValueOf, "auto", "_sid");
            p1.j(d1Var);
            d1Var.M.h(j10);
            d1Var.H.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j10);
            p1.k(u2Var);
            u2Var.L(j8, j9, bundle, "auto", "_s");
            String strS = d1Var.R.s();
            if (TextUtils.isEmpty(strS)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strS);
            p1.k(u2Var);
            u2Var.L(j8, j9, bundle2, "auto", "_ssr");
        }
    }

    @Override // t7.d
    public void a(q7.b bVar) {
        t7.e eVar = (t7.e) this.f7546w;
        if (bVar.f10894w == 0) {
            eVar.k(null, eVar.l());
            return;
        }
        t7.c cVar = eVar.f12327p;
        if (cVar != null) {
            cVar.c(bVar);
        }
    }

    @Override // t0.e
    public int c() {
        return ((ContentInfo) this.f7546w).getSource();
    }

    @Override // o8.a
    public /* bridge */ /* synthetic */ Object d(o8.o oVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List) this.f7546w);
        return b8.h.o(arrayList);
    }

    @Override // t0.e
    public ClipData e() {
        return ((ContentInfo) this.f7546w).getClip();
    }

    @Override // u0.m
    public boolean f(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f7546w;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f3342d;
        int width = (!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = t0.m0.f11853a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [ce.p, ud.h] */
    @Override // pe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(pe.d r6, ud.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof pe.a
            if (r0 == 0) goto L13
            r0 = r7
            pe.a r0 = (pe.a) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            pe.a r0 = new pe.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f10555z
            int r1 = r0.B
            od.l r2 = od.l.f10126a
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2b
            qe.f r6 = r0.f10554y
            fa.b.z(r7)     // Catch: java.lang.Throwable -> L29
            goto L56
        L29:
            r7 = move-exception
            goto L60
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            fa.b.z(r7)
            qe.f r7 = new qe.f
            sd.h r1 = r0.f12977w
            de.i.b(r1)
            r7.<init>(r6, r1)
            r0.f10554y = r7     // Catch: java.lang.Throwable -> L5e
            r0.B = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = r5.f7546w     // Catch: java.lang.Throwable -> L5e
            ud.h r6 = (ud.h) r6     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = r6.i(r7, r0)     // Catch: java.lang.Throwable -> L5e
            td.a r0 = td.a.f12544v
            if (r6 != r0) goto L51
            goto L52
        L51:
            r6 = r2
        L52:
            if (r6 != r0) goto L55
            return r0
        L55:
            r6 = r7
        L56:
            r6.p()
            return r2
        L5a:
            r4 = r7
            r7 = r6
            r6 = r4
            goto L60
        L5e:
            r6 = move-exception
            goto L5a
        L60:
            r6.p()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.g2.g(pe.d, ud.c):java.lang.Object");
    }

    @Override // u2.e0
    public void h() {
        u2.k kVar = (u2.k) this.f7546w;
        Surface surface = kVar.f12745s1;
        if (surface != null) {
            kVar.e1.o(surface);
            kVar.f12748v1 = true;
        }
    }

    @Override // o4.j1
    public int i() {
        o4.j0 j0Var = (o4.j0) this.f7546w;
        return j0Var.f9774n - j0Var.E();
    }

    @Override // u2.e0
    public void j() {
        u2.k kVar = (u2.k) this.f7546w;
        if (kVar.f12745s1 != null) {
            kVar.N0(0, 1);
        }
    }

    @Override // o4.j1
    public int k(View view) {
        return (view.getLeft() - ((o4.k0) view.getLayoutParams()).f9801b.left) - ((ViewGroup.MarginLayoutParams) ((o4.k0) view.getLayoutParams())).leftMargin;
    }

    @Override // w4.e
    public String l() {
        return ((y4.e) this.f7546w).f14457w;
    }

    @Override // o8.b
    public void m() {
        ((CountDownLatch) this.f7546w).countDown();
    }

    @Override // o8.e
    public void n(Object obj) {
        ((CountDownLatch) this.f7546w).countDown();
    }

    @Override // u2.e0
    public void o() {
        c2.m0 m0Var = ((u2.k) this.f7546w).f8122c0;
        if (m0Var != null) {
            m0Var.a();
        }
    }

    @Override // t0.e
    public int p() {
        return ((ContentInfo) this.f7546w).getFlags();
    }

    @Override // n.j
    public boolean q(n.l lVar, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        o.m mVar = ((ActionMenuView) this.f7546w).V;
        if (mVar != null) {
            Toolbar toolbar = (Toolbar) ((g2) mVar).f7546w;
            Iterator it = ((CopyOnWriteArrayList) toolbar.f668e0.f6280x).iterator();
            while (true) {
                if (!it.hasNext()) {
                    o.h3 h3Var = toolbar.f670g0;
                    zOnMenuItemSelected = h3Var != null ? ((h.k0) ((s5.c) h3Var).f11492w).f.onMenuItemSelected(0, menuItem) : false;
                } else if (((androidx.fragment.app.j0) it.next()).f1037a.o()) {
                    zOnMenuItemSelected = true;
                    break;
                }
            }
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // n.j
    public void r(n.l lVar) {
        n.j jVar = ((ActionMenuView) this.f7546w).Q;
        if (jVar != null) {
            jVar.r(lVar);
        }
    }

    @Override // t0.e
    public ContentInfo s() {
        return (ContentInfo) this.f7546w;
    }

    @Override // o4.j1
    public View t(int i) {
        return ((o4.j0) this.f7546w).u(i);
    }

    public String toString() {
        switch (this.f7545v) {
            case 19:
                return "ContentInfoCompat{" + ((ContentInfo) this.f7546w) + "}";
            default:
                return super.toString();
        }
    }

    @Override // o8.c
    public void u(o8.o oVar) {
        Exception excG = oVar.g();
        if (excG != null) {
            ((me.h) this.f7546w).g(fa.b.i(excG));
        } else if (oVar.f9985d) {
            ((me.h) this.f7546w).q(null);
        } else {
            ((me.h) this.f7546w).g(oVar.h());
        }
    }

    @Override // o4.j1
    public int v() {
        return ((o4.j0) this.f7546w).D();
    }

    @Override // ra.a
    public void w(sa.n nVar) {
        this.f7546w = nVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // o4.j1
    public int x(View view) {
        return view.getRight() + ((o4.k0) view.getLayoutParams()).f9801b.right + ((ViewGroup.MarginLayoutParams) ((o4.k0) view.getLayoutParams())).rightMargin;
    }

    @Override // o8.d
    public void z(Exception exc) {
        ((CountDownLatch) this.f7546w).countDown();
    }

    public /* synthetic */ g2(int i, boolean z2) {
        this.f7545v = i;
    }

    public g2(le leVar, s7.f fVar) {
        this.f7545v = 16;
        this.f7546w = leVar;
    }

    public g2(h2 h2Var, p1 p1Var) {
        this.f7545v = 0;
        this.f7546w = p1Var;
    }

    public g2(t7.e eVar) {
        this.f7545v = 22;
        Objects.requireNonNull(eVar);
        this.f7546w = eVar;
    }

    public g2(SupportActivity supportActivity, androidx.fragment.app.d1 d1Var) {
        this.f7545v = 2;
        Dialog dialog = new Dialog(supportActivity);
        this.f7546w = dialog;
        dialog.requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(supportActivity).inflate(fc.m.dialog_ad_error, (ViewGroup) null, false);
        int i = fc.l.btnDialogClose;
        ImageView imageView = (ImageView) a.a.k(viewInflate, i);
        if (imageView != null) {
            i = fc.l.btnDialogReload;
            TextView textView = (TextView) a.a.k(viewInflate, i);
            if (textView != null) {
                i = fc.l.btnReOpenAds;
                LinearLayout linearLayout = (LinearLayout) a.a.k(viewInflate, i);
                if (linearLayout != null) {
                    i = fc.l.tvDialogTitle;
                    if (((TextView) a.a.k(viewInflate, i)) != null) {
                        dialog.setContentView((CardView) viewInflate);
                        dialog.setCancelable(false);
                        dialog.setCanceledOnTouchOutside(false);
                        if (dialog.getWindow() != null) {
                            dialog.getWindow().setBackgroundDrawableResource(R.color.transparent);
                            dialog.getWindow().setLayout(-1, -2);
                        }
                        final int i10 = 0;
                        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: kc.a

                            /* JADX INFO: renamed from: w, reason: collision with root package name */
                            public final /* synthetic */ g2 f7902w;

                            {
                                this.f7902w = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                        ((Dialog) this.f7902w.f7546w).dismiss();
                                        break;
                                    default:
                                        ((Dialog) this.f7902w.f7546w).dismiss();
                                        break;
                                }
                            }
                        });
                        final int i11 = 1;
                        textView.setOnClickListener(new View.OnClickListener(this) { // from class: kc.a

                            /* JADX INFO: renamed from: w, reason: collision with root package name */
                            public final /* synthetic */ g2 f7902w;

                            {
                                this.f7902w = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i11) {
                                    case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                        ((Dialog) this.f7902w.f7546w).dismiss();
                                        break;
                                    default:
                                        ((Dialog) this.f7902w.f7546w).dismiss();
                                        break;
                                }
                            }
                        });
                        linearLayout.setOnClickListener(new gc.r(4, this, d1Var));
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public g2(t1.c cVar) {
        this.f7545v = 21;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i >= 32) {
            usage.setSpatializationBehavior(0);
            usage.setIsContentSpatialized(false);
        }
        this.f7546w = usage.build();
    }

    @Override // u2.e0
    public void b(t1.d1 d1Var) {
    }

    public g2(Bundle bundle) {
        this.f7545v = 18;
        this.f7546w = new Bundle(bundle);
    }

    public g2(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f7545v = 25;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f7546w = new v0.f(uri, clipDescription, uri2);
        } else {
            this.f7546w = new hd.a(uri, clipDescription, uri2, 27);
        }
    }

    public g2(int i) {
        this.f7545v = i;
        switch (i) {
            case 10:
                this.f7546w = new CountDownLatch(1);
                break;
            case 27:
                this.f7546w = new w1.t(10);
                break;
            default:
                char[] cArr = v6.m.f13232a;
                this.f7546w = new ArrayDeque(0);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g2(ce.p pVar) {
        this.f7545v = 13;
        this.f7546w = (ud.h) pVar;
    }

    public g2(ContentInfo contentInfo) {
        this.f7545v = 19;
        contentInfo.getClass();
        this.f7546w = e2.t.o(contentInfo);
    }
}
