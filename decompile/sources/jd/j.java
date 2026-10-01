package jd;

import ac.r;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.media3.decoder.DecoderInputBuffer;
import c2.g0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.livxow.tv.room.db.AppDatabase;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p4.u;
import sb.z;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7092v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f7093w;

    public /* synthetic */ j(int i, Object obj) {
        this.f7092v = i;
        this.f7093w = obj;
    }

    private final void a() {
        ad.c cVar = (ad.c) this.f7093w;
        synchronized (((ArrayDeque) cVar.f482z)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) cVar.f479w).edit();
            String str = (String) cVar.f480x;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) cVar.f482z).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) cVar.f481y);
            }
            editorEdit.putString(str, sb2.toString()).apply();
        }
    }

    private final void b() {
        c2.b bVar = (c2.b) this.f7093w;
        Map mapA = null;
        ((AtomicReference) bVar.f1687x).set(null);
        synchronized (bVar) {
            try {
                if (((AtomicMarkableReference) bVar.f1686w).isMarked()) {
                    mapA = ((ua.d) ((AtomicMarkableReference) bVar.f1686w).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) bVar.f1686w;
                    atomicMarkableReference.set((ua.d) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mapA != null) {
            ya.c cVar = (ya.c) bVar.f1688y;
            ((ua.g) cVar.f14649w).h((String) cVar.f14648v, mapA, bVar.f1685v);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005b A[Catch: all -> 0x0021, TryCatch #0 {, blocks: (B:6:0x0017, B:8:0x001b, B:15:0x0026, B:19:0x002c, B:25:0x0038, B:27:0x003c, B:29:0x0042, B:31:0x004c, B:33:0x0056, B:35:0x0067, B:34:0x005b, B:36:0x0069, B:38:0x007d, B:40:0x0084), top: B:48:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f7093w
            w1.r r0 = (w1.r) r0
            java.lang.ref.WeakReference r1 = r0.f13728a
            java.lang.Object r1 = r1.get()
            s2.f r1 = (s2.f) r1
            if (r1 == 0) goto La9
            w1.s r0 = r0.f13730c
            int r0 = r0.b()
            s2.g r2 = r1.f11435a
            monitor-enter(r2)
            int r1 = r2.f11454n     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L24
            boolean r3 = r2.f11447e     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L24
            monitor-exit(r2)
            return
        L21:
            r0 = move-exception
            goto La7
        L24:
            if (r1 != r0) goto L2c
            java.lang.String r1 = r2.f11455o     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L2c
            monitor-exit(r2)
            return
        L2c:
            r2.f11454n = r0     // Catch: java.lang.Throwable -> L21
            r1 = 1
            if (r0 == r1) goto La5
            if (r0 == 0) goto La5
            r1 = 8
            if (r0 != r1) goto L38
            goto La5
        L38:
            java.lang.String r1 = r2.f11455o     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L69
            android.content.Context r1 = r2.f11443a     // Catch: java.lang.Throwable -> L21
            int r3 = w1.b0.f13686a     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L5b
            java.lang.String r3 = "phone"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch: java.lang.Throwable -> L21
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L5b
            java.lang.String r1 = r1.getNetworkCountryIso()     // Catch: java.lang.Throwable -> L21
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L5b
            java.lang.String r1 = com.bumptech.glide.f.V(r1)     // Catch: java.lang.Throwable -> L21
            goto L67
        L5b:
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = r1.getCountry()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = com.bumptech.glide.f.V(r1)     // Catch: java.lang.Throwable -> L21
        L67:
            r2.f11455o = r1     // Catch: java.lang.Throwable -> L21
        L69:
            long r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L21
            r2.f11452l = r0     // Catch: java.lang.Throwable -> L21
            w1.v r0 = r2.f11446d     // Catch: java.lang.Throwable -> L21
            r0.getClass()     // Catch: java.lang.Throwable -> L21
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L21
            int r3 = r2.f11448g     // Catch: java.lang.Throwable -> L21
            r8 = 0
            if (r3 <= 0) goto L83
            long r3 = r2.f11449h     // Catch: java.lang.Throwable -> L21
            long r3 = r0 - r3
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L21
            goto L84
        L83:
            r3 = r8
        L84:
            long r4 = r2.i     // Catch: java.lang.Throwable -> L21
            long r6 = r2.f11452l     // Catch: java.lang.Throwable -> L21
            r2.b(r3, r4, r6)     // Catch: java.lang.Throwable -> L21
            r2.f11449h = r0     // Catch: java.lang.Throwable -> L21
            r0 = 0
            r2.i = r0     // Catch: java.lang.Throwable -> L21
            r2.f11451k = r0     // Catch: java.lang.Throwable -> L21
            r2.f11450j = r0     // Catch: java.lang.Throwable -> L21
            s2.s r0 = r2.f     // Catch: java.lang.Throwable -> L21
            java.util.ArrayList r1 = r0.f11480a     // Catch: java.lang.Throwable -> L21
            r1.clear()     // Catch: java.lang.Throwable -> L21
            r1 = -1
            r0.f11482c = r1     // Catch: java.lang.Throwable -> L21
            r0.f11483d = r8     // Catch: java.lang.Throwable -> L21
            r0.f11484e = r8     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)
            return
        La5:
            monitor-exit(r2)
            return
        La7:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r0
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.j.c():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7092v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ((ce.a) this.f7093w).b();
                return;
            case 1:
                l2.g gVar = (l2.g) this.f7093w;
                synchronized (gVar.f8079a) {
                    try {
                        if (gVar.f8089m) {
                            return;
                        }
                        long j8 = gVar.f8088l - 1;
                        gVar.f8088l = j8;
                        if (j8 > 0) {
                            return;
                        }
                        if (j8 < 0) {
                            gVar.b(new IllegalStateException());
                            return;
                        } else {
                            gVar.a();
                            return;
                        }
                    } finally {
                    }
                }
            case 2:
                mc.k kVar = (mc.k) this.f7093w;
                new Handler(Looper.getMainLooper()).post(new androidx.fragment.app.d(27, kVar, (List) b8.h.D((u) AppDatabase.r(kVar.I()).q().f11786w, true, false, new r(5))));
                return;
            case 3:
                p9.d dVar = (p9.d) this.f7093w;
                dVar.f10439c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) dVar.f10441e;
                b1.e eVar = sideSheetBehavior.i;
                if (eVar != null && eVar.f()) {
                    dVar.a(dVar.f10438b);
                    return;
                } else {
                    if (sideSheetBehavior.f3493h == 2) {
                        sideSheetBehavior.r(dVar.f10438b);
                        return;
                    }
                    return;
                }
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                a();
                return;
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                z zVar = (z) this.f7093w;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + zVar.f11782a.getAction() + " finishing.");
                zVar.f11783b.c(null);
                return;
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                ((t9.d) this.f7093w).s(true);
                return;
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                t9.k kVar2 = (t9.k) this.f7093w;
                boolean zIsPopupShowing = kVar2.f12448h.isPopupShowing();
                kVar2.s(zIsPopupShowing);
                kVar2.f12452m = zIsPopupShowing;
                return;
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                ((TextInputLayout) this.f7093w).f3565z.requestLayout();
                return;
            case 9:
                ((u2.c) this.f7093w).f12701g.o();
                return;
            case 10:
                u2.r rVar = (u2.r) this.f7093w;
                rVar.f12777k--;
                return;
            case 11:
                b();
                return;
            case 12:
                v2.k kVar3 = (v2.k) this.f7093w;
                Surface surface = kVar3.C;
                if (surface != null) {
                    Iterator it = kVar3.f13119v.iterator();
                    while (it.hasNext()) {
                        ((g0) it.next()).f1743v.k0(null);
                    }
                }
                SurfaceTexture surfaceTexture = kVar3.B;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kVar3.B = null;
                kVar3.C = null;
                return;
            case 13:
                w0.e eVar2 = ((w0.g) this.f7093w).f13676a;
                ViewParent parent = eVar2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(eVar2);
                    return;
                }
                return;
            case 14:
                c();
                return;
            case 15:
                MaterialButton.a((MaterialButton) this.f7093w);
                return;
            default:
                ((CarouselLayoutManager) this.f7093w).p0();
                return;
        }
    }
}
