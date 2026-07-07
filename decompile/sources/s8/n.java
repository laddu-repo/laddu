package s8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.widget.ImageView;
import androidx.lifecycle.j1;
import he.p;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import l4.u;
import l4.v;
import m2.a0;
import m2.z;
import p.d3;
import p.n1;
import p.t;
import r1.l0;
import t0.q0;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static n f12258e;

    /* renamed from: a, reason: collision with root package name */
    public int f12259a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12260b;

    /* renamed from: c, reason: collision with root package name */
    public Object f12261c;

    /* renamed from: d, reason: collision with root package name */
    public Object f12262d;

    public /* synthetic */ n(Object obj, int i6, Serializable serializable, Object obj2) {
        this.f12260b = obj;
        this.f12259a = i6;
        this.f12261c = serializable;
        this.f12262d = obj2;
    }

    public static synchronized n j(Context context) {
        n nVar;
        synchronized (n.class) {
            try {
                if (f12258e == null) {
                    f12258e = new n(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new b9.a("MessengerIpcClient"))));
                }
                nVar = f12258e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    public void a() {
        ImageView imageView = (ImageView) this.f12260b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            n1.a(drawable);
        }
        if (drawable != null) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 <= 21 && i6 == 21) {
                if (((d3) this.f12262d) == null) {
                    this.f12262d = new Object();
                }
                d3 d3Var = (d3) this.f12262d;
                d3Var.f10230a = null;
                d3Var.f10233d = false;
                d3Var.f10231b = null;
                d3Var.f10232c = false;
                ColorStateList imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    d3Var.f10233d = true;
                    d3Var.f10230a = imageTintList;
                }
                PorterDuff.Mode imageTintMode = imageView.getImageTintMode();
                if (imageTintMode != null) {
                    d3Var.f10232c = true;
                    d3Var.f10231b = imageTintMode;
                }
                if (d3Var.f10233d || d3Var.f10232c) {
                    t.e(drawable, d3Var, imageView.getDrawableState());
                    return;
                }
            }
            d3 d3Var2 = (d3) this.f12261c;
            if (d3Var2 != null) {
                t.e(drawable, d3Var2, imageView.getDrawableState());
            }
        }
    }

    public u b(int i6, u uVar, u uVar2, boolean z10) {
        v vVar = (v) this.f12260b;
        v.m mVar = (v.m) this.f12261c;
        u uVar3 = (u) mVar.c(i6);
        if (uVar2 != null) {
            if (kotlin.jvm.internal.k.a(uVar3, uVar2) && kotlin.jvm.internal.k.a(uVar3.f8196z, uVar2.f8196z)) {
                return uVar3;
            }
            uVar3 = null;
        } else if (uVar3 != null) {
            return uVar3;
        }
        if (z10) {
            Iterator it = ((cf.a) cf.l.K(new p(mVar, 9))).iterator();
            while (true) {
                if (it.hasNext()) {
                    u uVar4 = (u) it.next();
                    if ((uVar4 instanceof v) && !uVar4.equals(uVar)) {
                        uVar3 = ((v) uVar4).D.b(i6, vVar, uVar2, true);
                    } else {
                        uVar3 = null;
                    }
                    if (uVar3 != null) {
                        break;
                    }
                } else {
                    uVar3 = null;
                    break;
                }
            }
        }
        if (uVar3 == null) {
            v vVar2 = vVar.f8196z;
            if (vVar2 == null || vVar2.equals(uVar)) {
                return null;
            }
            v vVar3 = vVar.f8196z;
            kotlin.jvm.internal.k.b(vVar3);
            return vVar3.D.b(i6, vVar, uVar2, z10);
        }
        return uVar3;
    }

    public String c(e2.u uVar, Uri uri, int i6) {
        String str = (String) this.f12262d;
        String str2 = (String) this.f12260b;
        String str3 = (String) this.f12261c;
        int i10 = this.f12259a;
        if (i10 != 1) {
            if (i10 == 2) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    String g10 = a0.g(i6);
                    String str4 = uVar.f4281b + ":" + str2 + ":" + uVar.f4282c;
                    Charset charset = z.D;
                    String c02 = u1.a0.c0(messageDigest.digest((u1.a0.c0(messageDigest.digest(str4.getBytes(charset))) + ":" + str3 + ":" + u1.a0.c0(messageDigest.digest((g10 + ":" + uri).getBytes(charset)))).getBytes(charset)));
                    if (str.isEmpty()) {
                        return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", uVar.f4281b, str2, str3, uri, c02);
                    }
                    return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", uVar.f4281b, str2, str3, uri, c02, str);
                } catch (NoSuchAlgorithmException e10) {
                    throw new l0(null, e10, false, 4);
                }
            }
            throw new l0(null, new UnsupportedOperationException(), false, 4);
        }
        String encodeToString = Base64.encodeToString((uVar.f4281b + ":" + uVar.f4282c).getBytes(z.D), 0);
        String str5 = u1.a0.f12750a;
        Locale locale = Locale.US;
        return r4.a.k("Basic ", encodeToString);
    }

    public int d() {
        int i6 = this.f12259a;
        if (i6 != 2) {
            if (i6 != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }

    public void e(AttributeSet attributeSet, int i6) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.f12260b;
        Context context = imageView.getContext();
        int[] iArr = h.a.f5737f;
        n9.j E = n9.j.E(context, attributeSet, iArr, i6);
        TypedArray typedArray = (TypedArray) E.f9356z;
        q0.q(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) E.f9356z, i6);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = c9.a.f(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                n1.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList t10 = E.t(2);
                int i10 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(t10);
                if (i10 == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode c10 = n1.c(typedArray.getInt(3, -1), null);
                int i11 = Build.VERSION.SDK_INT;
                imageView.setImageTintMode(c10);
                if (i11 == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            E.G();
        } catch (Throwable th) {
            E.G();
            throw th;
        }
    }

    public l4.t f(l4.t tVar, j1 j1Var, boolean z10, u uVar) {
        l4.t tVar2;
        v vVar = (v) this.f12260b;
        ArrayList arrayList = new ArrayList();
        Iterator it = vVar.iterator();
        while (true) {
            o4.k kVar = (o4.k) it;
            tVar2 = null;
            if (!kVar.hasNext()) {
                break;
            }
            u uVar2 = (u) kVar.next();
            if (!kotlin.jvm.internal.k.a(uVar2, uVar)) {
                tVar2 = uVar2.e(j1Var);
            }
            if (tVar2 != null) {
                arrayList.add(tVar2);
            }
        }
        l4.t tVar3 = (l4.t) ie.j.O(arrayList);
        v vVar2 = vVar.f8196z;
        if (vVar2 != null && z10 && !vVar2.equals(uVar)) {
            tVar2 = vVar2.j(j1Var, vVar);
        }
        return (l4.t) ie.j.O(ie.i.k0(new l4.t[]{tVar, tVar3, tVar2}));
    }

    public Looper g() {
        Looper looper;
        boolean z10;
        synchronized (this.f12260b) {
            try {
                if (((Looper) this.f12261c) == null) {
                    if (this.f12259a == 0 && ((HandlerThread) this.f12262d) == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u1.c.g(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f12262d = handlerThread;
                    handlerThread.start();
                    this.f12261c = ((HandlerThread) this.f12262d).getLooper();
                }
                this.f12259a++;
                looper = (Looper) this.f12261c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public void h() {
        boolean z10;
        HandlerThread handlerThread;
        synchronized (this.f12260b) {
            try {
                if (this.f12259a > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u1.c.g(z10);
                int i6 = this.f12259a - 1;
                this.f12259a = i6;
                if (i6 == 0 && (handlerThread = (HandlerThread) this.f12262d) != null) {
                    handlerThread.quit();
                    this.f12262d = null;
                    this.f12261c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(int i6) {
        ImageView imageView = (ImageView) this.f12260b;
        if (i6 != 0) {
            Drawable f3 = c9.a.f(imageView.getContext(), i6);
            if (f3 != null) {
                n1.a(f3);
            }
            imageView.setImageDrawable(f3);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }

    public synchronized s9.n k(m mVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(mVar.toString()));
            }
            if (!((k) this.f12262d).d(mVar)) {
                k kVar = new k(this);
                this.f12262d = kVar;
                kVar.d(mVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return mVar.f12254b.f12263a;
    }

    public n(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f12262d = new k(this);
        this.f12259a = 1;
        this.f12261c = scheduledExecutorService;
        this.f12260b = context.getApplicationContext();
    }

    public n(h7.a aVar, h7.a aVar2, h7.a aVar3, int i6) {
        this.f12260b = aVar;
        this.f12261c = aVar2;
        this.f12262d = aVar3;
        this.f12259a = i6;
    }

    public n(l4.h hVar, int i6) {
        this.f12260b = hVar.C;
        this.f12259a = i6;
        o4.c cVar = hVar.E;
        this.f12261c = cVar.a();
        Bundle b10 = k6.e.b((he.i[]) Arrays.copyOf(new he.i[0], 0));
        this.f12262d = b10;
        cVar.f9883h.c(b10);
    }

    public n(v vVar) {
        this.f12260b = vVar;
        this.f12261c = new v.m(0);
    }

    public n(Bundle state) {
        kotlin.jvm.internal.k.e(state, "state");
        String string = state.getString("nav-entry-state:id");
        if (string != null) {
            this.f12260b = string;
            this.f12259a = a8.i.m("nav-entry-state:destination-id", state);
            Bundle bundle = state.getBundle("nav-entry-state:args");
            if (bundle != null) {
                this.f12261c = bundle;
                Bundle bundle2 = state.getBundle("nav-entry-state:saved-state");
                if (bundle2 != null) {
                    this.f12262d = bundle2;
                    return;
                } else {
                    android.support.v4.media.session.b.m("nav-entry-state:saved-state");
                    throw null;
                }
            }
            android.support.v4.media.session.b.m("nav-entry-state:args");
            throw null;
        }
        android.support.v4.media.session.b.m("nav-entry-state:id");
        throw null;
    }

    public n(ImageView imageView) {
        this.f12259a = 0;
        this.f12260b = imageView;
    }

    public n() {
        this.f12260b = new Object();
        this.f12261c = null;
        this.f12262d = null;
        this.f12259a = 0;
    }

    public n(int i6, String str, String str2, String str3) {
        this.f12259a = i6;
        this.f12260b = str;
        this.f12261c = str2;
        this.f12262d = str3;
    }

    public n(int i6, String str, int i10, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f12260b = str;
        this.f12259a = i10;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f12261c = unmodifiableList;
        this.f12262d = bArr;
    }
}
