package b1;

import android.widget.Toast;
import androidx.lifecycle.q1;
import bg.p0;
import com.google.android.gms.internal.measurement.k4;
import com.playfy.tv.ui.fragments.CatsFragment;
import com.playfy.tv.ui.fragments.HighFragment;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.l implements ve.a {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f1329x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1330y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, int i6) {
        super(0);
        this.f1329x = i6;
        this.f1330y = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ve.a, kotlin.jvm.internal.l] */
    @Override // ve.a
    public final Object invoke() {
        int T;
        ArrayList arrayList;
        long size;
        long j;
        int i6;
        Throwable th;
        he.i iVar;
        Throwable th2;
        Throwable th3;
        int l10;
        he.i iVar2;
        boolean z10 = false;
        switch (this.f1329x) {
            case 0:
                File file = (File) ((g0) this.f1330y).f1298a.invoke();
                String it = file.getAbsolutePath();
                synchronized (g0.f1297k) {
                    LinkedHashSet linkedHashSet = g0.j;
                    if (!linkedHashSet.contains(it)) {
                        kotlin.jvm.internal.k.d(it, "it");
                        linkedHashSet.add(it);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return file;
            case 1:
                Toast toast = k4.f2318y;
                if (toast != null) {
                    toast.cancel();
                }
                Toast makeText = Toast.makeText(p7.a.a(), (String) this.f1330y, 0);
                k4.f2318y = makeText;
                if (makeText != null) {
                    makeText.show();
                }
                return he.y.f6101a;
            case 2:
                cg.f fVar = (cg.f) this.f1330y;
                ClassLoader classLoader = fVar.f2101b;
                bg.q qVar = fVar.f2102c;
                Enumeration<URL> resources = classLoader.getResources(HttpUrl.FRAGMENT_ENCODE_SET);
                kotlin.jvm.internal.k.d(resources, "getResources(...)");
                ArrayList list = Collections.list(resources);
                kotlin.jvm.internal.k.d(list, "list(...)");
                ArrayList arrayList2 = new ArrayList();
                int size2 = list.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = list.get(i10);
                    i10++;
                    URL url = (URL) obj;
                    kotlin.jvm.internal.k.b(url);
                    if (!kotlin.jvm.internal.k.a(url.getProtocol(), "file")) {
                        iVar2 = null;
                    } else {
                        String str = bg.c0.f1692y;
                        iVar2 = new he.i(qVar, zb.d.u(new File(url.toURI())));
                    }
                    if (iVar2 != null) {
                        arrayList2.add(iVar2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                kotlin.jvm.internal.k.d(resources2, "getResources(...)");
                ArrayList list2 = Collections.list(resources2);
                kotlin.jvm.internal.k.d(list2, "list(...)");
                ArrayList arrayList3 = new ArrayList();
                int size3 = list2.size();
                int i11 = 0;
                while (i11 < size3) {
                    int i12 = i11 + 1;
                    URL url2 = (URL) list2.get(i11);
                    kotlin.jvm.internal.k.b(url2);
                    String url3 = url2.toString();
                    kotlin.jvm.internal.k.d(url3, "toString(...)");
                    if (!df.u.H(url3, "jar:file:", z10) || (T = df.m.T(6, url3, "!")) == -1) {
                        arrayList = list2;
                        i6 = i12;
                        iVar = null;
                    } else {
                        String str2 = bg.c0.f1692y;
                        String substring = url3.substring(4, T);
                        kotlin.jvm.internal.k.d(substring, "substring(...)");
                        bg.c0 u3 = zb.d.u(new File(URI.create(substring)));
                        bg.w j10 = qVar.j(u3);
                        try {
                            arrayList = list2;
                            size = j10.size() - 22;
                            j = 0;
                        } finally {
                        }
                        if (size >= 0) {
                            long max = Math.max(size - 65536, 0L);
                            while (true) {
                                long j11 = j;
                                bg.f0 d10 = bg.b.d(j10.d(size));
                                try {
                                    if (d10.l() == 101010256) {
                                        int y9 = d10.y() & 65535;
                                        int y10 = d10.y() & 65535;
                                        long y11 = d10.y() & 65535;
                                        i6 = i12;
                                        if (y11 == (d10.y() & 65535) && y9 == 0 && y10 == 0) {
                                            d10.skip(4L);
                                            int y12 = d10.y() & 65535;
                                            cg.d dVar = new cg.d(y12, y11, d10.l() & 4294967295L);
                                            d10.K(y12);
                                            d10.close();
                                            long j12 = size - 20;
                                            if (j12 > j11) {
                                                d10 = bg.b.d(j10.d(j12));
                                                try {
                                                    if (d10.l() == 117853008) {
                                                        int l11 = d10.l();
                                                        long m9 = d10.m();
                                                        if (d10.l() == 1 && l11 == 0) {
                                                            d10 = bg.b.d(j10.d(m9));
                                                            try {
                                                                l10 = d10.l();
                                                            } catch (Throwable th4) {
                                                                try {
                                                                } catch (Throwable th5) {
                                                                    he.a.a(th4, th5);
                                                                }
                                                                th3 = th4;
                                                            }
                                                            if (l10 == 101075792) {
                                                                d10.skip(12L);
                                                                int l12 = d10.l();
                                                                int l13 = d10.l();
                                                                long m10 = d10.m();
                                                                if (m10 == d10.m() && l12 == 0 && l13 == 0) {
                                                                    d10.skip(8L);
                                                                    try {
                                                                        th3 = null;
                                                                    } catch (Throwable th6) {
                                                                        th3 = th6;
                                                                    }
                                                                    dVar = new cg.d(y12, m10, d10.m());
                                                                    if (th3 != null) {
                                                                        throw th3;
                                                                    }
                                                                } else {
                                                                    throw new IOException("unsupported zip: spanned");
                                                                }
                                                            } else {
                                                                throw new IOException("bad zip: expected " + cg.b.c(101075792) + " but was " + cg.b.c(l10));
                                                            }
                                                        } else {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                    }
                                                    try {
                                                        th2 = null;
                                                    } catch (Throwable th7) {
                                                        th2 = th7;
                                                    }
                                                } catch (Throwable th8) {
                                                    try {
                                                    } catch (Throwable th9) {
                                                        he.a.a(th8, th9);
                                                    }
                                                    th2 = th8;
                                                }
                                                if (th2 != null) {
                                                    throw th2;
                                                }
                                            }
                                            cg.d dVar2 = dVar;
                                            ArrayList arrayList4 = new ArrayList();
                                            d10 = bg.b.d(j10.d(dVar2.f2096b));
                                            try {
                                                long j13 = dVar2.f2095a;
                                                while (j11 < j13) {
                                                    cg.g d11 = cg.b.d(d10);
                                                    long j14 = j13;
                                                    if (d11.f2111h < dVar2.f2096b) {
                                                        bg.c0 c0Var = cg.f.f2100e;
                                                        if (w8.l.o(d11.f2104a)) {
                                                            arrayList4.add(d11);
                                                        }
                                                        j11++;
                                                        j13 = j14;
                                                    } else {
                                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                                        break;
                                                    }
                                                }
                                                try {
                                                    th = null;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                }
                                            } catch (Throwable th11) {
                                                try {
                                                } catch (Throwable th12) {
                                                    he.a.a(th11, th12);
                                                }
                                                th = th11;
                                            }
                                            if (th == null) {
                                                p0 p0Var = new p0(u3, qVar, cg.b.b(arrayList4));
                                                try {
                                                    j10.close();
                                                } catch (Throwable unused) {
                                                }
                                                iVar = new he.i(p0Var, cg.f.f2100e);
                                            } else {
                                                throw th;
                                            }
                                        } else {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                    } else {
                                        int i13 = i12;
                                        d10.close();
                                        size--;
                                        if (size >= max) {
                                            j = j11;
                                            i12 = i13;
                                        } else {
                                            throw new IOException("not a zip: end of central directory signature not found");
                                        }
                                    }
                                } finally {
                                    d10.close();
                                }
                            }
                        } else {
                            throw new IOException("not a zip: size=" + j10.size());
                        }
                    }
                    if (iVar != null) {
                        arrayList3.add(iVar);
                    }
                    list2 = arrayList;
                    i11 = i6;
                    z10 = false;
                }
                return ie.j.P(arrayList3, arrayList2);
            case 3:
                return (CatsFragment) this.f1330y;
            case 4:
                return (q1) ((v) this.f1330y).invoke();
            case 5:
                return (HighFragment) this.f1330y;
            case 6:
                return (q1) ((v) this.f1330y).invoke();
            default:
                return Long.valueOf(((q7.b) this.f1330y).f11135a.contentLength());
        }
    }
}
