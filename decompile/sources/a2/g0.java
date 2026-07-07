package a2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements u1.l, i4.n0, u1.g, o8.b {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f247x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f248y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f249z;

    public /* synthetic */ g0(int i6, Object obj, Object obj2) {
        this.f248y = obj;
        this.f249z = obj2;
        this.f247x = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // u1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void accept(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f248y
            i4.b0 r0 = (i4.b0) r0
            java.lang.Object r1 = r4.f249z
            i4.s r1 = (i4.s) r1
            hb.x r5 = (hb.x) r5
            java.lang.String r2 = "MediaSessionStub"
            java.lang.Object r5 = r5.get()     // Catch: java.lang.InterruptedException -> L18 java.util.concurrent.ExecutionException -> L1a java.util.concurrent.CancellationException -> L1c
            i4.s1 r5 = (i4.s1) r5     // Catch: java.lang.InterruptedException -> L18 java.util.concurrent.ExecutionException -> L1a java.util.concurrent.CancellationException -> L1c
            java.lang.String r3 = "SessionResult must not be null"
            u1.c.e(r5, r3)     // Catch: java.lang.InterruptedException -> L18 java.util.concurrent.ExecutionException -> L1a java.util.concurrent.CancellationException -> L1c
            goto L40
        L18:
            r5 = move-exception
            goto L1e
        L1a:
            r5 = move-exception
            goto L1e
        L1c:
            r5 = move-exception
            goto L35
        L1e:
            java.lang.String r3 = "Session operation failed"
            u1.a.q(r2, r3, r5)
            i4.s1 r2 = new i4.s1
            java.lang.Throwable r5 = r5.getCause()
            boolean r5 = r5 instanceof java.lang.UnsupportedOperationException
            if (r5 == 0) goto L2f
            r5 = -6
            goto L30
        L2f:
            r5 = -1
        L30:
            r2.<init>(r5)
            r5 = r2
            goto L40
        L35:
            java.lang.String r3 = "Session operation cancelled"
            u1.a.q(r2, r3, r5)
            i4.s1 r5 = new i4.s1
            r2 = 1
            r5.<init>(r2)
        L40:
            int r2 = r4.f247x
            i4.h1.Q(r0, r1, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.g0.accept(java.lang.Object):void");
    }

    @Override // o8.b
    public Object execute() {
        e6.j jVar = (e6.j) this.f248y;
        ((androidx.lifecycle.j1) jVar.f4391d).B((g8.i) this.f249z, this.f247x + 1, false);
        return null;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [r1.w, r1.x] */
    @Override // i4.n0
    public void f(i4.s sVar) {
        byte[] bArr;
        byte[] bArr2;
        i4.o0 o0Var = (i4.o0) this.f248y;
        j4.o oVar = (j4.o) this.f249z;
        if (TextUtils.isEmpty(oVar.f7194x)) {
            u1.a.p("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i6 = i4.l.f6450a;
        String str = oVar.f7194x;
        r1.v vVar = new r1.v();
        db.i0 i0Var = db.k0.f4008y;
        db.c1 c1Var = db.c1.B;
        List list = Collections.EMPTY_LIST;
        e2.t tVar = new e2.t();
        r1.b0 b0Var = r1.b0.f11307d;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str2 = str;
        n9.j jVar = new n9.j(9);
        jVar.f9355y = oVar.E;
        r1.b0 b0Var2 = new r1.b0(jVar);
        CharSequence charSequence = oVar.f7195y;
        r1.g0 g0Var = new r1.g0();
        g0Var.f11409f = oVar.f7196z;
        g0Var.f11410g = oVar.A;
        g0Var.f11415m = oVar.C;
        Bundle bundle = null;
        g0Var.f11412i = i4.l.c(null);
        Bitmap bitmap = oVar.B;
        int i10 = 3;
        if (bitmap != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    bArr = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } finally {
                }
            } catch (IOException e10) {
                u1.a.q("LegacyConversions", "Failed to convert iconBitmap to artworkData", e10);
                bArr = null;
            }
            if (bArr == null) {
                bArr2 = null;
            } else {
                bArr2 = (byte[]) bArr.clone();
            }
            g0Var.f11413k = bArr2;
            g0Var.f11414l = 3;
        }
        Bundle bundle2 = oVar.D;
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        }
        if (bundle != null && bundle.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            long j = bundle.getLong("android.media.extra.BT_FOLDER_TYPE");
            if (j != 0) {
                if (j == 1) {
                    i10 = 1;
                } else if (j == 2) {
                    i10 = 2;
                } else if (j != 3) {
                    if (j == 4) {
                        i10 = 4;
                    } else if (j == 5) {
                        i10 = 5;
                    } else if (j == 6) {
                        i10 = 6;
                    }
                }
                g0Var.f11418p = Integer.valueOf(i10);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i10 = 0;
            g0Var.f11418p = Integer.valueOf(i10);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        g0Var.f11419q = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            g0Var.G = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            g0Var.I = db.k0.k(db.k0.k(stringArrayList));
        }
        if (bundle != null && bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            g0Var.f11404a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            g0Var.f11408e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            g0Var.f11404a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            g0Var.H = bundle;
        }
        g0Var.f11420r = Boolean.TRUE;
        hb.x l10 = o0Var.f6473g.l(sVar, db.k0.o(new r1.e0(str2, new r1.w(vVar), null, new r1.z(tVar), new r1.h0(g0Var), b0Var2)));
        l10.a(new hb.s(0, l10, new b2.k(o0Var, sVar, this.f247x)), hb.q.f6029x);
    }

    @Override // u1.l
    public void invoke(Object obj) {
        r1.t0 t0Var = (r1.t0) this.f248y;
        r1.t0 t0Var2 = (r1.t0) this.f249z;
        r1.s0 s0Var = (r1.s0) obj;
        int i6 = this.f247x;
        s0Var.g(i6);
        s0Var.I(i6, t0Var, t0Var2);
    }

    public /* synthetic */ g0(int i6, r1.t0 t0Var, r1.t0 t0Var2) {
        this.f247x = i6;
        this.f248y = t0Var;
        this.f249z = t0Var2;
    }
}
