package k8;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.k5;
import com.google.android.gms.internal.measurement.mb;
import com.google.android.gms.internal.measurement.n5;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class c0 implements w, l2.k, m4.b, m5.b, a6.l, p2.m, qf.l, sd.g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7416v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ c0 f7412w = new c0(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ c0 f7413x = new c0(1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ c0 f7414y = new c0(2);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ c0 f7415z = new c0(3);
    public static final /* synthetic */ c0 A = new c0(4);
    public static final /* synthetic */ c0 B = new c0(5);
    public static final /* synthetic */ c0 C = new c0(6);
    public static final /* synthetic */ c0 D = new c0(7);
    public static final /* synthetic */ c0 E = new c0(8);
    public static final /* synthetic */ c0 F = new c0(9);
    public static final /* synthetic */ c0 G = new c0(10);
    public static final /* synthetic */ c0 H = new c0(11);
    public static final /* synthetic */ c0 I = new c0(12);
    public static final /* synthetic */ c0 J = new c0(13);
    public static final /* synthetic */ c0 K = new c0(14);
    public static final /* synthetic */ c0 L = new c0(15);

    public /* synthetic */ c0(int i) {
        this.f7416v = i;
    }

    public static final String o(vf.f fVar, vf.f[] fVarArr, int i) {
        int i10;
        boolean z2;
        int i11;
        int i12;
        vf.f fVar2 = sf.a.f11798b;
        int iA = fVar.a();
        int i13 = 0;
        while (i13 < iA) {
            int i14 = (i13 + iA) / 2;
            while (i14 > -1 && fVar.d(i14) != 10) {
                i14--;
            }
            int i15 = i14 + 1;
            int i16 = 1;
            while (true) {
                i10 = i15 + i16;
                if (fVar.d(i10) == 10) {
                    break;
                }
                i16++;
            }
            int i17 = i10 - i15;
            int i18 = i;
            boolean z10 = false;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (z10) {
                    i11 = 46;
                    z2 = false;
                } else {
                    byte bD = fVarArr[i18].d(i19);
                    byte[] bArr = ff.d.f5397a;
                    int i21 = bD & 255;
                    z2 = z10;
                    i11 = i21;
                }
                byte bD2 = fVar.d(i15 + i20);
                byte[] bArr2 = ff.d.f5397a;
                i12 = i11 - (bD2 & 255);
                if (i12 != 0) {
                    break;
                }
                i20++;
                i19++;
                if (i20 == i17) {
                    break;
                }
                if (fVarArr[i18].a() != i19) {
                    z10 = z2;
                } else {
                    if (i18 == fVarArr.length - 1) {
                        break;
                    }
                    i18++;
                    i19 = -1;
                    z10 = true;
                }
            }
            if (i12 >= 0) {
                if (i12 <= 0) {
                    int i22 = i17 - i20;
                    int iA2 = fVarArr[i18].a() - i19;
                    int length = fVarArr.length;
                    for (int i23 = i18 + 1; i23 < length; i23++) {
                        iA2 += fVarArr[i23].a();
                    }
                    if (iA2 >= i22) {
                        if (iA2 <= i22) {
                            return fVar.h(i15, i17 + i15).g(ke.a.f7954a);
                        }
                    }
                }
                i13 = i10 + 1;
            }
            iA = i14;
        }
        return null;
    }

    public static RectF p(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f3515c0 || !(view instanceof s9.j)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        s9.j jVar = (s9.j) view;
        int contentWidth = jVar.getContentWidth();
        int contentHeight = jVar.getContentHeight();
        int iA = (int) i9.n.a(jVar.getContext(), 24);
        if (contentWidth < iA) {
            contentWidth = iA;
        }
        int right = (jVar.getRight() + jVar.getLeft()) / 2;
        int bottom = (jVar.getBottom() + jVar.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public static MediaCodec q(mb mbVar) throws IOException {
        String str = ((l2.o) mbVar.f2888b).f8099a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    public static vf.f r(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i10 = i * 2;
            bArr[i] = (byte) (wf.b.a(str.charAt(i10 + 1)) + (wf.b.a(str.charAt(i10)) << 4));
        }
        return new vf.f(bArr);
    }

    public static byte[] t(y9.f0 f0Var, long j8) {
        c2.q qVar = new c2.q(11);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(f0Var.size());
        int size = f0Var.size();
        int i = 0;
        while (i < size) {
            Object obj = f0Var.get(i);
            i++;
            arrayList.add((Bundle) qVar.apply(obj));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j8);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static vf.f u(String str) {
        de.i.e(str, "<this>");
        byte[] bytes = str.getBytes(ke.a.f7954a);
        de.i.d(bytes, "getBytes(...)");
        vf.f fVar = new vf.f(bytes);
        fVar.f13607x = str;
        return fVar;
    }

    public static e4.e v(s2.h hVar, c6.i iVar) {
        IOException iOException = (IOException) iVar.f2195x;
        if (!(iOException instanceof y1.u)) {
            return null;
        }
        int i = ((y1.u) iOException).f14394y;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return null;
        }
        if (hVar.a(1)) {
            return new e4.e(1, 300000L);
        }
        if (hVar.a(2)) {
            return new e4.e(2, 60000L);
        }
        return null;
    }

    public static long x(c6.i iVar) {
        Throwable cause = (IOException) iVar.f2195x;
        if ((cause instanceof t1.g0) || (cause instanceof FileNotFoundException) || (cause instanceof y1.r) || (cause instanceof s2.m)) {
            return -9223372036854775807L;
        }
        int i = y1.i.f14370w;
        while (cause != null) {
            if ((cause instanceof y1.i) && ((y1.i) cause).f14371v == 2008) {
                return -9223372036854775807L;
            }
            cause = cause.getCause();
        }
        return Math.min((iVar.f2194w - 1) * 1000, 5000);
    }

    @Override // k8.w
    public Object a() {
        switch (this.f7416v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                List list = f0.f7479a;
                com.google.android.gms.internal.measurement.q4.f3007w.get();
                return (Long) com.google.android.gms.internal.measurement.s4.f3073a.g(4, -1L, "measurement.test.long_flag").get();
            case 1:
                List list2 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(21, 50L, "measurement.experiment.max_ids").get()).longValue());
            case 2:
                List list3 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (Long) com.google.android.gms.internal.measurement.g3.f2655a.g(61, 604800000L, "measurement.sdk.attribution.cache.ttl").get();
            case 3:
                List list4 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(18, 1L, "measurement.dma_consent.max_daily_dcu_realtime_events").get()).longValue());
            case g1.g.LONG_FIELD_NUMBER /* 4 */:
                List list5 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (Long) com.google.android.gms.internal.measurement.g3.f2655a.g(12, 3600000L, "measurement.session.engagement_interval").get();
            case g1.g.STRING_FIELD_NUMBER /* 5 */:
                List list6 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (String) com.google.android.gms.internal.measurement.g3.f2655a.i(59, "measurement.rb.attribution.query_parameters_to_remove", "").get();
            case g1.g.STRING_SET_FIELD_NUMBER /* 6 */:
                List list7 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(55, 90L, "measurement.rb.attribution.client.min_time_after_boot_seconds").get()).longValue());
            case g1.g.DOUBLE_FIELD_NUMBER /* 7 */:
                List list8 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return (Boolean) com.google.android.gms.internal.measurement.g3.f2655a.b("measurement.config.notify_trigger_uris_on_backgrounded", true, 31).get();
            case g1.g.BYTES_FIELD_NUMBER /* 8 */:
                List list9 = f0.f7479a;
                com.google.android.gms.internal.measurement.e3.f2605w.get();
                return Integer.valueOf((int) ((Long) com.google.android.gms.internal.measurement.g3.f2655a.g(66, 65536L, "measurement.upload.max_bundle_size").get()).longValue());
            case 9:
                List list10 = f0.f7479a;
                return (Boolean) com.google.android.gms.internal.measurement.l4.f2850a.get();
            case 10:
                List list11 = f0.f7479a;
                return (Boolean) com.google.android.gms.internal.measurement.z3.f3270a.get();
            case 11:
                List list12 = f0.f7479a;
                return (Boolean) n5.f2912a.get();
            case 12:
                List list13 = f0.f7479a;
                com.google.android.gms.internal.measurement.t4.f3103w.get();
                return (Boolean) com.google.android.gms.internal.measurement.v4.f3159a.b("measurement.rb.attribution.enable_trigger_redaction", true, 7).get();
            case 13:
                List list14 = f0.f7479a;
                return (Boolean) b5.f2505b.get();
            case 14:
                return new Boolean(((Boolean) com.google.android.gms.internal.measurement.i4.f2712a.get()).booleanValue());
            default:
                return new Boolean(((Boolean) k5.f2822a.get()).booleanValue());
        }
    }

    @Override // qf.l
    public boolean b(SSLSocket sSLSocket) {
        return ke.p.B(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // p2.m
    public long c() {
        throw new NoSuchElementException();
    }

    @Override // qf.l
    public qf.n d(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new qf.e(superclass);
    }

    @Override // m5.b
    public float e() {
        return 1.0f;
    }

    @Override // m5.b
    public boolean f(float f) {
        throw new IllegalStateException("not implemented");
    }

    @Override // a6.l
    public int g(a6.i iVar) {
        return 1;
    }

    @Override // m5.b
    public float h() {
        return 0.0f;
    }

    @Override // m5.b
    public w5.a i() {
        throw new IllegalStateException("not implemented");
    }

    @Override // m5.b
    public boolean isEmpty() {
        return true;
    }

    @Override // p2.m
    public long j() {
        throw new NoSuchElementException();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // l2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l2.l k(com.google.android.gms.internal.measurement.mb r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 0
            android.media.MediaCodec r0 = q(r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "configureCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r1 = r6.f2891e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.view.Surface r1 = (android.view.Surface) r1     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r1 != 0) goto L25
            java.lang.Object r2 = r6.f2888b     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            l2.o r2 = (l2.o) r2     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            boolean r2 = r2.f8105h     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r2 == 0) goto L25
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r3 = 35
            if (r2 < r3) goto L25
            r2 = 8
            goto L26
        L21:
            r6 = move-exception
            goto L49
        L23:
            r6 = move-exception
            goto L49
        L25:
            r2 = 0
        L26:
            java.lang.Object r3 = r6.f2889c     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaFormat r3 = (android.media.MediaFormat) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r4 = r6.f     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaCrypto r4 = (android.media.MediaCrypto) r4     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.configure(r3, r1, r4, r2)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r1 = "startCodec"
            android.os.Trace.beginSection(r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.start()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            sc.b r1 = new sc.b     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r6 = r6.f2892g     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            hd.a r6 = (hd.a) r6     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r1.<init>(r0, r6)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r1
        L49:
            if (r0 == 0) goto L4e
            r0.release()
        L4e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.c0.k(com.google.android.gms.internal.measurement.mb):l2.l");
    }

    @Override // a6.b
    public boolean l(Object obj, File file, a6.i iVar) throws Throwable {
        try {
            v6.b.d(((n6.g) ((n6.b) ((c6.b0) obj).get()).f8979v.f5232b).f8992a.f14484d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e7) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e7);
            return false;
        }
    }

    @Override // m5.b
    public boolean n(float f) {
        return false;
    }

    @Override // p2.m
    public boolean next() {
        return false;
    }

    public int w(int i) {
        return i == 7 ? 6 : 3;
    }

    public void y(p2.c cVar, float f) {
        u.a aVar = (u.a) ((Drawable) cVar.f10196w);
        CardView cardView = (CardView) cVar.f10197x;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != aVar.f12587e || aVar.f != useCompatPadding || aVar.f12588g != preventCornerOverlap) {
            aVar.f12587e = f;
            aVar.f = useCompatPadding;
            aVar.f12588g = preventCornerOverlap;
            aVar.b(null);
            aVar.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            cVar.p(0, 0, 0, 0);
            return;
        }
        u.a aVar2 = (u.a) ((Drawable) cVar.f10196w);
        float f4 = aVar2.f12587e;
        float f10 = aVar2.f12583a;
        int iCeil = (int) Math.ceil(u.b.a(f4, f10, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(u.b.b(f4, f10, cardView.getPreventCornerOverlap()));
        cVar.p(iCeil, iCeil2, iCeil, iCeil2);
    }

    public void z(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFP = p(tabLayout, view);
        RectF rectFP2 = p(tabLayout, view2);
        drawable.setBounds(q8.a.c(f, (int) rectFP.left, (int) rectFP2.left), drawable.getBounds().top, q8.a.c(f, (int) rectFP.right, (int) rectFP2.right), drawable.getBounds().bottom);
    }

    @Override // m4.b
    public void m() {
    }

    @Override // m4.b
    public void s(int i, Object obj) {
    }
}
