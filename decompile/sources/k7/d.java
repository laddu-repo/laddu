package k7;

import android.content.ClipData;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.Window;
import androidx.profileinstaller.ProfileInstallReceiver;
import b7.d0;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.tasks.Task;
import com.playfy.tv.R;
import com.playfy.tv.activities.PlayerActivity;
import com.playfy.tv.ui.fragments.PlaylistsFragment;
import d2.h;
import ef.g;
import h5.e;
import h5.f;
import he.i;
import he.y;
import i.b0;
import j1.f0;
import j2.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.BindException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import k4.h0;
import m2.p;
import m2.v;
import n9.b2;
import n9.e4;
import n9.n1;
import n9.u0;
import n9.w0;
import n9.w1;
import n9.z1;
import nd.a0;
import o.w;
import okhttp3.HttpUrl;
import p.v2;
import q2.u;
import q2.x0;
import r1.k0;
import r1.q;
import s9.n;
import u2.j;
import u2.l;
import u2.o;
import u2.r;
import v6.k;
import v6.s;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d implements f, j, h, v2, w, m, h0, kf.h, x0, w0, org.chromium.net.c, o.j, q0.a, s9.c, t0.f, u4.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f7746x;

    /* renamed from: y, reason: collision with root package name */
    public Object f7747y;

    public /* synthetic */ d(int i6) {
        this.f7746x = i6;
    }

    public static s P(q6.j jVar, k kVar, t6.a aVar, t6.b bVar) {
        String str;
        boolean z10;
        boolean z11;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(kVar.f13381a.getResources(), bVar.f12614a);
        Map map = bVar.f12615b;
        Object obj = map.get("coil#disk_cache_key");
        Boolean bool = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = map.get("coil#is_sampled");
        if (obj2 instanceof Boolean) {
            bool = (Boolean) obj2;
        }
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        Bitmap.Config[] configArr = a7.f.f595a;
        if (jVar != null && jVar.f11133g) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new s(bitmapDrawable, kVar, m6.h.f8661x, aVar, str, z10, z11);
    }

    public static d W(String str) {
        w1 w1Var;
        if (!TextUtils.isEmpty(str) && str.length() <= 1) {
            w1Var = z1.e(str.charAt(0));
        } else {
            w1Var = w1.UNINITIALIZED;
        }
        return new d(w1Var, 17);
    }

    @Override // t0.f
    public int A() {
        int source;
        source = ((ContentInfo) this.f7747y).getSource();
        return source;
    }

    @Override // d2.h
    public long B() {
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [com.google.android.gms.internal.measurement.e5, java.io.IOException] */
    @Override // u2.j
    public g C(l lVar, long j, long j10, IOException iOException, int i6) {
        switch (this.f7746x) {
            case 5:
                r rVar = (r) lVar;
                d2.g gVar = (d2.g) this.f7747y;
                b2.k kVar = gVar.N;
                long j11 = rVar.f12871x;
                Uri uri = rVar.A.f13560z;
                kVar.r(new u(j10), rVar.f12873z, iOException, true);
                gVar.J.getClass();
                gVar.A(iOException);
                return o.B;
            default:
                m2.f fVar = (m2.f) lVar;
                m2.s sVar = (m2.s) this.f7747y;
                if (!sVar.P) {
                    sVar.H = iOException;
                } else if (iOException.getCause() instanceof BindException) {
                    int i10 = sVar.R;
                    sVar.R = i10 + 1;
                    if (i10 < 3) {
                        return o.A;
                    }
                } else {
                    sVar.I = new IOException(fVar.f8466y.f8545b.toString(), iOException);
                }
                return o.B;
        }
    }

    @Override // q2.x0
    public void D() {
        m2.s sVar = (m2.s) this.f7747y;
        sVar.f8541y.post(new p(sVar, 1));
    }

    @Override // d2.h
    public long E(long j) {
        return 1L;
    }

    @Override // d2.h
    public long F(long j, long j10) {
        return 1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String H(r1.q r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.f11661d
            java.lang.String r1 = r8.f11659b
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = ""
            if (r2 != 0) goto L37
            java.lang.String r2 = "und"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L15
            goto L37
        L15:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            java.lang.String r2 = u1.a0.f12750a
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r2 < r4) goto L29
            j2.e.n()
            java.util.Locale r2 = j2.e.o()
            goto L2d
        L29:
            java.util.Locale r2 = java.util.Locale.getDefault()
        L2d:
            java.lang.String r0 = r0.getDisplayName(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L39
        L37:
            r0 = r3
            goto L5c
        L39:
            r4 = 1
            r5 = 0
            int r4 = r0.offsetByCodePoints(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L5b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L5b
            r6.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L5b
            java.lang.String r5 = r0.substring(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L5b
            java.lang.String r2 = r5.toUpperCase(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L5b
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L5b
            java.lang.String r2 = r0.substring(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L5b
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L5b
            java.lang.String r0 = r6.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L5b
            goto L5c
        L5b:
        L5c:
            java.lang.String r8 = r7.I(r8)
            java.lang.String[] r8 = new java.lang.String[]{r0, r8}
            java.lang.String r8 = r7.N(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L76
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 == 0) goto L75
            r1 = r3
        L75:
            r8 = r1
        L76:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.d.H(r1.q):java.lang.String");
    }

    public String I(q qVar) {
        String str;
        Resources resources = (Resources) this.f7747y;
        int i6 = qVar.f11663f;
        int i10 = qVar.f11663f;
        if ((i6 & 2) != 0) {
            str = resources.getString(R.string.exo_track_role_alternate);
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if ((i10 & 4) != 0) {
            str = N(str, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i10 & 8) != 0) {
            str = N(str, resources.getString(R.string.exo_track_role_commentary));
        }
        if ((i10 & 1088) != 0) {
            return N(str, resources.getString(R.string.exo_track_role_closed_captions));
        }
        return str;
    }

    public d0 J(Context context, String str, InputStream inputStream, String str2, String str3) {
        d0 g10;
        d0 d0Var;
        b bVar;
        c cVar = (c) this.f7747y;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            if (!str2.contains("application/gzip") && !str2.contains("application/x-gzip") && !str.split("\\?")[0].endsWith(".tgs")) {
                n7.c.a();
                bVar = b.JSON;
                if (str3 != null) {
                    d0Var = b7.o.d(new FileInputStream(cVar.H(str, inputStream, bVar).getAbsolutePath()), str);
                } else {
                    d0Var = b7.o.d(inputStream, null);
                }
            } else {
                n7.c.a();
                bVar = b.GZIP;
                if (str3 != null) {
                    d0Var = b7.o.d(new GZIPInputStream(new FileInputStream(cVar.H(str, inputStream, bVar))), str);
                } else {
                    d0Var = b7.o.d(new GZIPInputStream(inputStream), null);
                }
            }
        } else {
            n7.c.a();
            b bVar2 = b.ZIP;
            if (str3 != null) {
                g10 = b7.o.g(context, new ZipInputStream(new FileInputStream(cVar.H(str, inputStream, bVar2))), str);
            } else {
                g10 = b7.o.g(context, new ZipInputStream(inputStream), null);
            }
            d0Var = g10;
            bVar = bVar2;
        }
        if (str3 != null && d0Var.f1517a != null) {
            File file = new File(cVar.A(), c.y(str, bVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", HttpUrl.FRAGMENT_ENCODE_SET));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            n7.c.a();
            if (!renameTo) {
                n7.c.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return d0Var;
    }

    @Override // h5.f
    public String K() {
        return ((a5.f) this.f7747y).f577y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ac, code lost:
    
        if (r7 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0147, code lost:
    
        if (r0 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014e, code lost:
    
        if (r7 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0133, code lost:
    
        if (r1 <= 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x013f, code lost:
    
        if (java.lang.Math.abs(r2 - r5) > r9) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0155 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t6.b L(v6.k r18, t6.a r19, w6.h r20, w6.g r21) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.d.L(v6.k, t6.a, w6.h, w6.g):t6.b");
    }

    public String M(q qVar) {
        String H;
        String str;
        String str2;
        Resources resources = (Resources) this.f7747y;
        String str3 = qVar.f11670n;
        int i6 = qVar.j;
        int i10 = qVar.F;
        int i11 = qVar.f11677v;
        int i12 = qVar.f11676u;
        String str4 = qVar.f11667k;
        int i13 = k0.i(str3);
        if (i13 == -1) {
            if (k0.j(str4) == null) {
                if (k0.b(str4) == null) {
                    if (i12 == -1 && i11 == -1) {
                        if (i10 == -1 && qVar.G == -1) {
                            i13 = -1;
                        }
                    }
                }
                i13 = 1;
            }
            i13 = 2;
        }
        String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (i13 == 2) {
            String I = I(qVar);
            if (i12 != -1 && i11 != -1) {
                str2 = resources.getString(R.string.exo_track_resolution, Integer.valueOf(i12), Integer.valueOf(i11));
            } else {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (i6 != -1) {
                str5 = resources.getString(R.string.exo_track_bitrate, Float.valueOf(i6 / 1000000.0f));
            }
            H = N(I, str2, str5);
        } else if (i13 == 1) {
            String H2 = H(qVar);
            if (i10 != -1 && i10 >= 1) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 6 && i10 != 7) {
                            if (i10 != 8) {
                                str = resources.getString(R.string.exo_track_surround);
                            } else {
                                str = resources.getString(R.string.exo_track_surround_7_point_1);
                            }
                        } else {
                            str = resources.getString(R.string.exo_track_surround_5_point_1);
                        }
                    } else {
                        str = resources.getString(R.string.exo_track_stereo);
                    }
                } else {
                    str = resources.getString(R.string.exo_track_mono);
                }
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (i6 != -1) {
                str5 = resources.getString(R.string.exo_track_bitrate, Float.valueOf(i6 / 1000000.0f));
            }
            H = N(H2, str, str5);
        } else {
            H = H(qVar);
        }
        if (!H.isEmpty()) {
            return H;
        }
        String str6 = qVar.f11661d;
        if (str6 != null && !str6.trim().isEmpty()) {
            return resources.getString(R.string.exo_track_unknown_name, str6);
        }
        return resources.getString(R.string.exo_track_unknown);
    }

    public String N(String... strArr) {
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        for (String str2 : strArr) {
            if (!str2.isEmpty()) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = ((Resources) this.f7747y).getString(R.string.exo_item_list, str, str2);
                }
            }
        }
        return str;
    }

    public t6.a O(k kVar, Object obj, v6.o oVar, l6.c cVar) {
        String str;
        Map linkedHashMap;
        kVar.getClass();
        List list = kVar.f13387g;
        List list2 = ((l6.k) this.f7747y).f8252h.f8223c;
        int size = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 < size) {
                i iVar = (i) list2.get(i6);
                r6.b bVar = (r6.b) iVar.f6076x;
                if (((Class) iVar.f6077y).isAssignableFrom(obj.getClass())) {
                    kotlin.jvm.internal.k.c(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                    str = bVar.a(obj, oVar);
                    if (str != null) {
                        break;
                    }
                }
                i6++;
            } else {
                str = null;
                break;
            }
        }
        if (str == null) {
            return null;
        }
        Map map = kVar.f13403y.f13423x;
        boolean isEmpty = map.isEmpty();
        ie.s sVar = ie.s.f6847x;
        if (isEmpty) {
            linkedHashMap = sVar;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
        }
        if (list.isEmpty() && linkedHashMap.isEmpty()) {
            return new t6.a(str, sVar);
        }
        LinkedHashMap E = ie.w.E(linkedHashMap);
        if (!list.isEmpty()) {
            if (list.size() <= 0) {
                E.put("coil#transformation_size", oVar.f13410d.toString());
            } else {
                list.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return new t6.a(str, E);
    }

    public void S(e5 e5Var) {
        m2.s sVar = (m2.s) this.f7747y;
        if ((e5Var instanceof m2.u) && !sVar.S) {
            m2.s.j(sVar);
        } else {
            sVar.I = e5Var;
        }
    }

    public void T(long j, db.k0 k0Var) {
        m2.f fVar;
        ArrayList arrayList = new ArrayList(k0Var.size());
        for (int i6 = 0; i6 < k0Var.size(); i6++) {
            String path = ((m2.d0) k0Var.get(i6)).f8453c.getPath();
            path.getClass();
            arrayList.add(path);
        }
        for (int i10 = 0; i10 < ((m2.s) this.f7747y).C.size(); i10++) {
            if (!arrayList.contains(((m2.q) ((m2.s) this.f7747y).C.get(i10)).f8531b.f8466y.f8545b.getPath())) {
                v vVar = (v) ((m2.s) this.f7747y).D.f8328x;
                vVar.J = false;
                vVar.x();
                if (((m2.s) this.f7747y).k()) {
                    m2.s sVar = (m2.s) this.f7747y;
                    sVar.N = true;
                    sVar.K = -9223372036854775807L;
                    sVar.J = -9223372036854775807L;
                    sVar.L = -9223372036854775807L;
                }
            }
        }
        for (int i11 = 0; i11 < k0Var.size(); i11++) {
            m2.d0 d0Var = (m2.d0) k0Var.get(i11);
            m2.s sVar2 = (m2.s) this.f7747y;
            Uri uri = d0Var.f8453c;
            ArrayList arrayList2 = sVar2.B;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    if (!((m2.r) arrayList2.get(i12)).f8537d) {
                        m2.q qVar = ((m2.r) arrayList2.get(i12)).f8534a;
                        if (qVar.f8531b.f8466y.f8545b.equals(uri)) {
                            fVar = qVar.f8531b;
                            break;
                        }
                    }
                    i12++;
                } else {
                    fVar = null;
                    break;
                }
            }
            if (fVar != null) {
                long j10 = d0Var.f8451a;
                if (j10 != -9223372036854775807L) {
                    m2.g gVar = fVar.E;
                    gVar.getClass();
                    if (!gVar.f8486h) {
                        fVar.E.f8487i = j10;
                    }
                }
                int i13 = d0Var.f8452b;
                m2.g gVar2 = fVar.E;
                gVar2.getClass();
                if (!gVar2.f8486h) {
                    fVar.E.j = i13;
                }
                if (((m2.s) this.f7747y).k()) {
                    m2.s sVar3 = (m2.s) this.f7747y;
                    if (sVar3.K == sVar3.J) {
                        long j11 = d0Var.f8451a;
                        fVar.H = j;
                        fVar.I = j11;
                    }
                }
            }
        }
        if (((m2.s) this.f7747y).k()) {
            m2.s sVar4 = (m2.s) this.f7747y;
            long j12 = sVar4.K;
            long j13 = sVar4.J;
            if (j12 == j13) {
                sVar4.K = -9223372036854775807L;
                sVar4.J = -9223372036854775807L;
                return;
            } else {
                sVar4.K = -9223372036854775807L;
                sVar4.h(j13);
                return;
            }
        }
        m2.s sVar5 = (m2.s) this.f7747y;
        long j14 = sVar5.L;
        if (j14 != -9223372036854775807L && sVar5.S) {
            sVar5.h(j14);
            ((m2.s) this.f7747y).L = -9223372036854775807L;
        }
    }

    public void U(String str, IOException iOException) {
        IOException iOException2;
        m2.s sVar = (m2.s) this.f7747y;
        if (iOException == null) {
            iOException2 = new IOException(str);
        } else {
            iOException2 = new IOException(str, iOException);
        }
        sVar.H = iOException2;
    }

    public boolean V() {
        u0 u0Var = ((n1) this.f7747y).C;
        n1.g(u0Var);
        return Log.isLoggable(u0Var.n1(), 3);
    }

    @Override // t0.f
    public ClipData a() {
        ClipData clip;
        clip = ((ContentInfo) this.f7747y).getClip();
        return clip;
    }

    @Override // d2.h
    public long b(long j) {
        return 0L;
    }

    @Override // q0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f7747y;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // kf.h
    public Object collect(kf.i iVar, le.c cVar) {
        Object collect = ((kf.h) this.f7747y).collect(new b1.u(iVar, 1), cVar);
        if (collect == me.a.f8833x) {
            return collect;
        }
        return y.f6101a;
    }

    @Override // u4.a
    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // o.w
    public void e(o.l lVar, boolean z10) {
        ((b0) this.f7747y).p(lVar);
    }

    @Override // d2.h
    public long f(long j, long j10) {
        return 0L;
    }

    @Override // d2.h
    public long g(long j, long j10) {
        return -9223372036854775807L;
    }

    @Override // d2.h
    public e2.j h(long j) {
        return (e2.j) this.f7747y;
    }

    @Override // u4.a
    public void i(int i6, Object obj) {
        String str;
        switch (i6) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = HttpUrl.FRAGMENT_ENCODE_SET;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i6 != 6 && i6 != 7 && i6 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f7747y).setResultCode(i6);
    }

    @Override // n9.w0
    public /* synthetic */ void j(String str, int i6, Throwable th, byte[] bArr, Map map) {
        ((e4) this.f7747y).v(str, i6, th, bArr, map);
    }

    @Override // u2.j
    public void k(l lVar, long j, long j10) {
        switch (this.f7746x) {
            case 5:
                r rVar = (r) lVar;
                d2.g gVar = (d2.g) this.f7747y;
                long j11 = rVar.f12871x;
                Uri uri = rVar.A.f13560z;
                u uVar = new u(j10);
                gVar.J.getClass();
                gVar.N.o(uVar, rVar.f12873z);
                gVar.f3726i0 = ((Long) rVar.C).longValue() - j;
                gVar.B(true);
                return;
            default:
                m2.f fVar = (m2.f) lVar;
                m2.s sVar = (m2.s) this.f7747y;
                long r10 = sVar.r();
                ArrayList arrayList = sVar.B;
                if (r10 == 0) {
                    if (!sVar.S) {
                        m2.s.j(sVar);
                        return;
                    }
                    return;
                }
                int i6 = 0;
                while (true) {
                    if (i6 < arrayList.size()) {
                        m2.r rVar2 = (m2.r) arrayList.get(i6);
                        if (rVar2.f8534a.f8531b == fVar) {
                            rVar2.a();
                        } else {
                            i6++;
                        }
                    }
                }
                sVar.A.L = 1;
                return;
        }
    }

    @Override // o.j
    public boolean n(o.l lVar, MenuItem menuItem) {
        a0 a0Var = (a0) ((n9.j) this.f7747y).A;
        if (a0Var != null) {
            PlaylistsFragment playlistsFragment = a0Var.f9675x;
            bf.o[] oVarArr = PlaylistsFragment.D0;
            int itemId = menuItem.getItemId();
            if (itemId == R.id.add_url_bt) {
                String str = null;
                playlistsFragment.O(true, new kd.d0(7, str, str));
                return true;
            }
            if (itemId == R.id.chose_file_btn) {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                playlistsFragment.C0.a(intent);
            }
            return true;
        }
        return false;
    }

    @Override // u2.j
    public void o(l lVar, long j, long j10, boolean z10) {
        switch (this.f7746x) {
            case 5:
                ((d2.g) this.f7747y).y((r) lVar, j10);
                return;
            default:
                return;
        }
    }

    @Override // s9.c
    public void onComplete(Task task) {
        Exception e10 = task.e();
        if (e10 == null) {
            if (((n) task).f12278d) {
                ((gf.k) this.f7747y).n(null);
                return;
            } else {
                ((gf.k) this.f7747y).resumeWith(task.f());
                return;
            }
        }
        ((gf.k) this.f7747y).resumeWith(he.a.b(e10));
    }

    @Override // org.chromium.net.c
    public FileChannel p() {
        return new FileInputStream((File) this.f7747y).getChannel();
    }

    @Override // j2.m
    public j2.n q(androidx.lifecycle.d dVar) {
        PlayerActivity playerActivity;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 23 && (i6 >= 31 || ((playerActivity = (PlayerActivity) this.f7747y) != null && i6 >= 28 && playerActivity.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int i10 = k0.i(((q) dVar.f898c).f11670n);
            u1.a.k("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + u1.a0.G(i10));
            return new f0(1, new j2.c(i10, 0), new j2.c(i10, 1)).q(dVar);
        }
        return new w8.l(16).q(dVar);
    }

    @Override // d2.h
    public long s(long j, long j10) {
        return 0L;
    }

    @Override // q0.a
    public Cursor t(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f7747y;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    public String toString() {
        switch (this.f7746x) {
            case 26:
                return "ContentInfoCompat{" + ((ContentInfo) this.f7747y) + "}";
            default:
                return super.toString();
        }
    }

    @Override // t0.f
    public int u() {
        int flags;
        flags = ((ContentInfo) this.f7747y).getFlags();
        return flags;
    }

    @Override // o.w
    public boolean v(o.l lVar) {
        Window.Callback callback = ((b0) this.f7747y).I.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, lVar);
            return true;
        }
        return true;
    }

    @Override // t0.f
    public ContentInfo w() {
        return (ContentInfo) this.f7747y;
    }

    @Override // d2.h
    public boolean x() {
        return true;
    }

    @Override // h5.f
    public void y(e eVar) {
        a5.f fVar = (a5.f) this.f7747y;
        int length = fVar.A.length;
        for (int i6 = 1; i6 < length; i6++) {
            int i10 = fVar.A[i6];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                eVar.c(i6);
                            }
                        } else {
                            byte[] bArr = fVar.E[i6];
                            kotlin.jvm.internal.k.b(bArr);
                            eVar.D(i6, bArr);
                        }
                    } else {
                        String str = fVar.D[i6];
                        kotlin.jvm.internal.k.b(str);
                        eVar.i(i6, str);
                    }
                } else {
                    eVar.o(i6, fVar.C[i6]);
                }
            } else {
                eVar.b(i6, fVar.B[i6]);
            }
        }
    }

    @Override // u2.j
    public /* synthetic */ void z(l lVar, long j, long j10, int i6) {
        int i10 = this.f7746x;
    }

    public /* synthetic */ d(int i6, Object obj, Object obj2) {
        this.f7746x = i6;
        this.f7747y = obj;
    }

    public /* synthetic */ d(Object obj, int i6) {
        this.f7746x = i6;
        this.f7747y = obj;
    }

    public d(b2 b2Var, n1 n1Var) {
        this.f7746x = 18;
        this.f7747y = n1Var;
    }

    public d(Resources resources) {
        this.f7746x = 14;
        resources.getClass();
        this.f7747y = resources;
    }

    public d(Context context, Uri uri) {
        this.f7746x = 23;
        this.f7747y = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public d(ContentInfo contentInfo) {
        this.f7746x = 26;
        contentInfo.getClass();
        this.f7747y = t0.e.d(contentInfo);
    }

    @Override // o.j
    public void G(o.l lVar) {
    }

    @Override // d2.h
    public long c(long j, long j10) {
        return j10;
    }

    private final /* synthetic */ void Q(l lVar, long j, long j10, int i6) {
    }

    private final /* synthetic */ void R(l lVar, long j, long j10, int i6) {
    }
}
