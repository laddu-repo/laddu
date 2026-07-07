package i4;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseBooleanArray;
import com.playfy.tv.activities.PlayerActivity;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class o0 extends j4.s {

    /* renamed from: w, reason: collision with root package name */
    public static final int f6471w;

    /* renamed from: f, reason: collision with root package name */
    public final ic.s f6472f;

    /* renamed from: g, reason: collision with root package name */
    public final b0 f6473g;

    /* renamed from: h, reason: collision with root package name */
    public final j4.g0 f6474h;

    /* renamed from: i, reason: collision with root package name */
    public final m0 f6475i;
    public final f2.c j;

    /* renamed from: k, reason: collision with root package name */
    public final j4.b0 f6476k;

    /* renamed from: l, reason: collision with root package name */
    public final c2.g f6477l;

    /* renamed from: m, reason: collision with root package name */
    public final ComponentName f6478m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f6479n = true;

    /* renamed from: o, reason: collision with root package name */
    public volatile long f6480o;

    /* renamed from: p, reason: collision with root package name */
    public m0 f6481p;

    /* renamed from: q, reason: collision with root package name */
    public int f6482q;

    /* renamed from: r, reason: collision with root package name */
    public final Bundle f6483r;
    public db.k0 s;

    /* renamed from: t, reason: collision with root package name */
    public db.k0 f6484t;

    /* renamed from: u, reason: collision with root package name */
    public p1 f6485u;

    /* renamed from: v, reason: collision with root package name */
    public r1.q0 f6486v;

    static {
        int i6;
        if (Build.VERSION.SDK_INT >= 31) {
            i6 = 33554432;
        } else {
            i6 = 0;
        }
        f6471w = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e3  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, j4.b0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o0(i4.b0 r7, android.net.Uri r8, android.os.Handler r9, android.os.Bundle r10, db.k0 r11, db.k0 r12, i4.p1 r13, r1.q0 r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.o0.<init>(i4.b0, android.net.Uri, android.os.Handler, android.os.Bundle, db.k0, db.k0, i4.p1, r1.q0, android.os.Bundle):void");
    }

    public static void D(j4.b0 b0Var, ArrayList arrayList) {
        int i6 = 0;
        if (arrayList != null) {
            b0Var.getClass();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                long j = ((j4.y) obj).f7222y;
                if (hashSet.contains(Long.valueOf(j))) {
                    Log.e("MediaSessionCompat", r4.a.j("Found duplicate queue id: ", j), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j));
            }
        }
        j4.u uVar = (j4.u) b0Var.f7158x;
        MediaSession mediaSession = uVar.f7208a;
        uVar.f7215h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            j4.y yVar = (j4.y) obj2;
            MediaSession.QueueItem queueItem = yVar.f7223z;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(yVar.f7221x.a(), yVar.f7222y);
                yVar.f7223z = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void E(j4.b0 b0Var, j4.p pVar) {
        j4.u uVar = (j4.u) b0Var.f7158x;
        uVar.f7216i = pVar;
        MediaSession mediaSession = uVar.f7208a;
        Bundle bundle = pVar.f7198x;
        if (pVar.f7199y == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) j4.p.f7197z.get(str);
                if (num == null) {
                    num = -1;
                }
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                Object obj = bundle.get(str);
                                if (obj != null && !(obj instanceof CharSequence)) {
                                    if (obj instanceof Long) {
                                        builder.putLong(str, ((Long) obj).longValue());
                                    }
                                } else {
                                    builder.putText(str, (CharSequence) obj);
                                }
                            } else {
                                builder.putRating(str, (Rating) bundle.getParcelable(str));
                            }
                        } else {
                            builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                        }
                    } else {
                        builder.putText(str, bundle.getString(str));
                    }
                } else {
                    builder.putLong(str, bundle.getLong(str));
                }
            }
            pVar.f7199y = builder.build();
        }
        mediaSession.setMetadata(pVar.f7199y);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [r1.w, r1.x] */
    public static r1.e0 F(String str, Uri uri, String str2, Bundle bundle) {
        r1.v vVar = new r1.v();
        db.i0 i0Var = db.k0.f4008y;
        db.c1 c1Var = db.c1.B;
        List list = Collections.EMPTY_LIST;
        db.c1 c1Var2 = db.c1.B;
        e2.t tVar = new e2.t();
        r1.b0 b0Var = r1.b0.f11307d;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str3 = str;
        n9.j jVar = new n9.j(9);
        jVar.f9355y = uri;
        jVar.f9356z = str2;
        jVar.A = bundle;
        return new r1.e0(str3, new r1.w(vVar), null, new r1.z(tVar), r1.h0.K, new r1.b0(jVar));
    }

    public static ComponentName J(PlayerActivity playerActivity, String str) {
        PackageManager packageManager = playerActivity.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(playerActivity.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        return null;
    }

    @Override // j4.s
    public final void A(long j) {
        if (j < 0) {
            return;
        }
        H(10, new d0(this, j, 0), ((j4.u) this.f6476k.f7158x).c(), true);
    }

    @Override // j4.s
    public final void B() {
        H(3, new e0(this, 6), ((j4.u) this.f6476k.f7158x).c(), true);
    }

    public final j4.k0 G(l1 l1Var) {
        boolean z10;
        boolean z11;
        int i6;
        int i10;
        long j;
        float f3;
        Bundle bundle;
        long j10;
        String str;
        int i11;
        long j11;
        r1.n0 S = l1Var.S();
        int i12 = 1;
        if (l1Var.n0(16) && !l1Var.S0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (S == null && !u1.a0.a0(l1Var, this.f6479n)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (S != null) {
            i10 = 7;
        } else {
            int i13 = l.f6450a;
            if (l1Var.S() != null) {
                i6 = 7;
            } else {
                int e02 = l1Var.e0();
                if (e02 != 1) {
                    if (e02 != 2) {
                        if (e02 != 3) {
                            if (e02 == 4) {
                                i6 = 1;
                            } else {
                                throw new IllegalArgumentException(h8.c.i(e02, "Unrecognized State: "));
                            }
                        } else {
                            if (!z11) {
                                i6 = 3;
                            }
                            i6 = 2;
                        }
                    } else {
                        if (!z11) {
                            i6 = 6;
                        }
                        i6 = 2;
                    }
                } else {
                    i6 = 0;
                }
            }
            i10 = i6;
        }
        r1.q0 k8 = lg.c.k(this.f6486v, l1Var.l());
        long j12 = 128;
        for (int i14 = 0; i14 < k8.f11684a.f11592a.size(); i14++) {
            int b10 = k8.f11684a.b(i14);
            if (b10 != 1) {
                if (b10 != 2) {
                    if (b10 != 3) {
                        if (b10 != 31) {
                            switch (b10) {
                                case 5:
                                    j11 = 256;
                                    break;
                                case 6:
                                case 7:
                                    j11 = 16;
                                    break;
                                case 8:
                                case 9:
                                    j11 = 32;
                                    break;
                                case 10:
                                    j11 = 4096;
                                    break;
                                case 11:
                                    j11 = 8;
                                    break;
                                case 12:
                                    j11 = 64;
                                    break;
                                case 13:
                                    j11 = 4194304;
                                    break;
                                case 14:
                                    j11 = 2621440;
                                    break;
                                case 15:
                                    j11 = 262144;
                                    break;
                                default:
                                    j11 = 0;
                                    break;
                            }
                        } else {
                            j11 = 240640;
                        }
                    } else {
                        j11 = 1;
                    }
                } else {
                    j11 = Http2Stream.EMIT_BUFFER_SIZE;
                }
            } else if (z11) {
                j11 = 516;
            } else {
                j11 = 514;
            }
            j12 |= j11;
        }
        boolean isEmpty = this.f6484t.isEmpty();
        Bundle bundle2 = this.f6483r;
        if (!isEmpty && !bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS")) {
            j12 &= -17;
        }
        if (!this.f6484t.isEmpty() && !bundle2.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            j12 &= -33;
        }
        if (!z10) {
            j12 &= -257;
        }
        long j13 = j12;
        long j14 = -1;
        if (l1Var.n0(17)) {
            int m02 = l1Var.m0();
            int i15 = l.f6450a;
            j = m02 == -1 ? -1L : m02;
        } else {
            j = -1;
        }
        float f10 = l1Var.d().f11596a;
        if (l1Var.isPlaying() && z10) {
            f3 = f10;
        } else {
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (S != null) {
            bundle = new Bundle(S.f11591z);
        } else {
            bundle = new Bundle();
        }
        bundle.putAll(bundle2);
        bundle.putFloat("EXO_SPEED", f10);
        r1.e0 g12 = l1Var.g1();
        if (g12 != null) {
            String str2 = g12.f11378a;
            if (!HttpUrl.FRAGMENT_ENCODE_SET.equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        if (z10) {
            j10 = l1Var.getCurrentPosition();
        } else {
            j10 = -1;
        }
        if (z10) {
            j14 = l1Var.a0();
        }
        ArrayList arrayList = new ArrayList();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.s.size() <= 0) {
            if (S != null) {
                int i16 = l.f6450a;
                int i17 = S.f11589x;
                if (i17 != -110) {
                    if (i17 != -109) {
                        if (i17 != -6) {
                            if (i17 != -2) {
                                if (i17 != 1) {
                                    switch (i17) {
                                        case -107:
                                            i12 = 9;
                                            break;
                                        case -106:
                                            i12 = 7;
                                            break;
                                        case -105:
                                            i12 = 6;
                                            break;
                                        case -104:
                                            i12 = 5;
                                            break;
                                        case -103:
                                            i12 = 4;
                                            break;
                                        case -102:
                                            i12 = 3;
                                            break;
                                        default:
                                            i12 = 0;
                                            break;
                                    }
                                } else {
                                    i12 = 10;
                                }
                            }
                        } else {
                            i12 = 2;
                        }
                    } else {
                        i12 = 11;
                    }
                } else {
                    i12 = 8;
                }
                str = S.getMessage();
                i11 = i12;
            } else {
                str = null;
                i11 = 0;
            }
            return new j4.k0(i10, j10, j14, f3, j13, i11, str, elapsedRealtime, arrayList, j, bundle);
        }
        this.s.get(0).getClass();
        throw new ClassCastException();
    }

    public final void H(final int i6, final n0 n0Var, final j4.d0 d0Var, final boolean z10) {
        b0 b0Var = this.f6473g;
        if (b0Var.j()) {
            return;
        }
        if (d0Var == null) {
            u1.a.f("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i6);
            return;
        }
        u1.a0.U(b0Var.f6311l, new Runnable() { // from class: i4.j0
            @Override // java.lang.Runnable
            public final void run() {
                n0 n0Var2 = n0Var;
                o0 o0Var = o0.this;
                b0 b0Var2 = o0Var.f6473g;
                if (!b0Var2.j()) {
                    boolean isActive = ((j4.u) o0Var.f6476k.f7158x).f7208a.isActive();
                    int i10 = i6;
                    j4.d0 d0Var2 = d0Var;
                    if (!isActive) {
                        StringBuilder n10 = h8.c.n(i10, "Ignore incoming player command before initialization. command=", ", pid=");
                        n10.append(d0Var2.f7163a.f7166b);
                        u1.a.p("MediaSessionLegacyStub", n10.toString());
                        return;
                    }
                    s L = o0Var.L(d0Var2);
                    if (!o0Var.f6472f.t(L, i10)) {
                        if (i10 == 1 && !b0Var2.f6318t.m()) {
                            u1.a.p("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            return;
                        }
                        return;
                    }
                    zb.d dVar = b0Var2.f6305e;
                    b0Var2.s(L);
                    dVar.getClass();
                    try {
                        n0Var2.f(L);
                    } catch (RemoteException e10) {
                        u1.a.q("MediaSessionLegacyStub", "Exception in " + L, e10);
                    }
                    if (z10) {
                        new SparseBooleanArray().append(i10, true);
                        b0Var2.p(L);
                    }
                }
            }
        });
    }

    public final void I(o1 o1Var, int i6, n0 n0Var, j4.d0 d0Var) {
        if (d0Var == null) {
            StringBuilder sb2 = new StringBuilder("RemoteUserInfo is null, ignoring command=");
            Object obj = o1Var;
            if (o1Var == null) {
                obj = Integer.valueOf(i6);
            }
            sb2.append(obj);
            u1.a.f("MediaSessionLegacyStub", sb2.toString());
            return;
        }
        u1.a0.U(this.f6473g.f6311l, new a2.m1(this, o1Var, i6, d0Var, n0Var));
    }

    public final void K(r1.e0 e0Var, boolean z10) {
        H(31, new i0(this, e0Var, z10), ((j4.u) this.f6476k.f7158x).c(), false);
    }

    public final s L(j4.d0 d0Var) {
        s j = this.f6472f.j(d0Var);
        if (j == null) {
            s sVar = new s(d0Var, 0, 0, this.f6474h.b(d0Var), new l0(d0Var), Bundle.EMPTY);
            q m9 = this.f6473g.m(sVar);
            this.f6472f.a(d0Var, sVar, m9.f6504a, m9.f6505b);
            b0 b0Var = this.f6473g;
            if (!b0Var.f6322x || !b0.k(sVar)) {
                b0Var.f6305e.getClass();
            }
            j = sVar;
        }
        f2.c cVar = this.j;
        long j10 = this.f6480o;
        cVar.removeMessages(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, j);
        cVar.sendMessageDelayed(cVar.obtainMessage(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, j), j10);
        return j;
    }

    public final void M() {
        db.k0 k0Var = this.f6484t;
        int i6 = a.f6295a;
        db.r.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        if (k0Var.size() <= 0) {
            db.c1 a10 = a.a(db.k0.h(0, objArr));
            this.s = a10;
            if (a10.size() <= 0) {
                Bundle bundle = this.f6483r;
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                db.k0 k0Var2 = this.s;
                if (k0Var2.size() <= 0) {
                    bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
                    return;
                } else {
                    k0Var2.get(0).getClass();
                    throw new ClassCastException();
                }
            }
            a10.get(0);
            throw new ClassCastException();
        }
        k0Var.get(0).getClass();
        throw new ClassCastException();
    }

    public final void N(l1 l1Var) {
        u1.a0.U(this.f6473g.f6311l, new f0(this, l1Var, 1));
    }

    @Override // j4.s
    public final void b(j4.o oVar) {
        if (oVar != null) {
            H(20, new a2.g0(-1, this, oVar), ((j4.u) this.f6476k.f7158x).c(), false);
        }
    }

    @Override // j4.s
    public final void c(j4.o oVar, int i6) {
        if (oVar != null) {
            if (i6 == -1 || i6 >= 0) {
                H(20, new a2.g0(i6, this, oVar), ((j4.u) this.f6476k.f7158x).c(), false);
            }
        }
    }

    @Override // j4.s
    public final void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            t1 t1Var = this.f6473g.j;
            t1Var.getClass();
            String str2 = t1.f6561b;
            Bundle bundle2 = new Bundle();
            u1 u1Var = t1Var.f6563a;
            if (u1Var != null) {
                bundle2.putInt(str2, 0);
            } else {
                bundle2.putInt(str2, 1);
            }
            String str3 = t1.f6562c;
            u1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(u1.f6568f, u1Var.f6577a);
            bundle3.putInt(u1.f6569g, 0);
            bundle3.putInt(u1.f6570h, 1008000300);
            bundle3.putString(u1.f6571i, u1Var.f6578b);
            bundle3.putString(u1.j, HttpUrl.FRAGMENT_ENCODE_SET);
            bundle3.putBinder(u1.f6573l, u1Var.f6579c);
            bundle3.putParcelable(u1.f6572k, null);
            bundle3.putBundle(u1.f6574m, u1Var.f6580d);
            bundle3.putInt(u1.f6575n, 5);
            MediaSession.Token token = u1Var.f6581e;
            if (token != null) {
                bundle3.putParcelable(u1.f6576o, token);
            }
            bundle2.putBundle(str3, bundle3);
            resultReceiver.send(0, bundle2);
            return;
        }
        o1 o1Var = new o1(str, Bundle.EMPTY);
        I(o1Var, 0, new h0(this, o1Var, bundle, resultReceiver), ((j4.u) this.f6476k.f7158x).c());
    }

    @Override // j4.s
    public final void e(String str, Bundle bundle) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        o1 o1Var = new o1(str, Bundle.EMPTY);
        I(o1Var, 0, new b2.b(this, o1Var, bundle), ((j4.u) this.f6476k.f7158x).c());
    }

    @Override // j4.s
    public final void f() {
        H(12, new e0(this, 4), ((j4.u) this.f6476k.f7158x).c(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    @Override // j4.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.o0.g(android.content.Intent):boolean");
    }

    @Override // j4.s
    public final void h() {
        H(1, new e0(this, 11), ((j4.u) this.f6476k.f7158x).c(), true);
    }

    @Override // j4.s
    public final void i() {
        H(1, new e0(this, 10), ((j4.u) this.f6476k.f7158x).c(), false);
    }

    @Override // j4.s
    public final void j(String str, Bundle bundle) {
        K(F(str, null, null, bundle), true);
    }

    @Override // j4.s
    public final void k(String str, Bundle bundle) {
        K(F(null, null, str, bundle), true);
    }

    @Override // j4.s
    public final void l(Uri uri, Bundle bundle) {
        K(F(null, uri, null, bundle), true);
    }

    @Override // j4.s
    public final void m() {
        H(2, new e0(this, 5), ((j4.u) this.f6476k.f7158x).c(), true);
    }

    @Override // j4.s
    public final void n(String str, Bundle bundle) {
        K(F(str, null, null, bundle), false);
    }

    @Override // j4.s
    public final void o(String str, Bundle bundle) {
        K(F(null, null, str, bundle), false);
    }

    @Override // j4.s
    public final void p(Uri uri, Bundle bundle) {
        K(F(null, uri, null, bundle), false);
    }

    @Override // j4.s
    public final void q(j4.o oVar) {
        if (oVar == null) {
            return;
        }
        H(20, new b2.b(3, this, oVar), ((j4.u) this.f6476k.f7158x).c(), true);
    }

    @Override // j4.s
    public final void r() {
        H(11, new e0(this, 3), ((j4.u) this.f6476k.f7158x).c(), true);
    }

    @Override // j4.s
    public final void s(long j) {
        H(5, new d0(this, j, 1), ((j4.u) this.f6476k.f7158x).c(), true);
    }

    @Override // j4.s
    public final void t(final float f3) {
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        H(13, new n0() { // from class: i4.c0
            @Override // i4.n0
            public final void f(s sVar) {
                o0.this.f6473g.f6318t.b(f3);
            }
        }, ((j4.u) this.f6476k.f7158x).c(), true);
    }

    @Override // j4.s
    public final void u(j4.l0 l0Var) {
        v(l0Var);
    }

    @Override // j4.s
    public final void v(j4.l0 l0Var) {
        r1.v0 c10 = l.c(l0Var);
        if (c10 == null) {
            u1.a.p("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + l0Var);
            return;
        }
        I(null, 40010, new e0(this, c10), ((j4.u) this.f6476k.f7158x).c());
    }

    @Override // j4.s
    public final void w(int i6) {
        H(15, new g0(this, i6, 0), ((j4.u) this.f6476k.f7158x).c(), true);
    }

    @Override // j4.s
    public final void x(int i6) {
        H(14, new g0(this, i6, 1), ((j4.u) this.f6476k.f7158x).c(), true);
    }

    @Override // j4.s
    public final void y() {
        boolean n02 = this.f6473g.f6318t.n0(9);
        j4.b0 b0Var = this.f6476k;
        if (n02) {
            H(9, new e0(this, 8), ((j4.u) b0Var.f7158x).c(), true);
        } else {
            H(8, new e0(this, 9), ((j4.u) b0Var.f7158x).c(), true);
        }
    }

    @Override // j4.s
    public final void z() {
        boolean n02 = this.f6473g.f6318t.n0(7);
        j4.b0 b0Var = this.f6476k;
        if (n02) {
            H(7, new e0(this, 1), ((j4.u) b0Var.f7158x).c(), true);
        } else {
            H(6, new e0(this, 2), ((j4.u) b0Var.f7158x).c(), true);
        }
    }
}
