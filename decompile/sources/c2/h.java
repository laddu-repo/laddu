package c2;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.Objects;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1803a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.e0 f1804b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1805c;

    /* renamed from: d, reason: collision with root package name */
    public final e f1806d;

    /* renamed from: e, reason: collision with root package name */
    public final g f1807e;

    /* renamed from: f, reason: collision with root package name */
    public final f f1808f;

    /* renamed from: g, reason: collision with root package name */
    public d f1809g;

    /* renamed from: h, reason: collision with root package name */
    public k7.d f1810h;

    /* renamed from: i, reason: collision with root package name */
    public r1.d f1811i;
    public boolean j;

    public h(Context context, a2.e0 e0Var, r1.d dVar, k7.d dVar2) {
        e eVar;
        Uri uriFor;
        Context applicationContext = context.getApplicationContext();
        this.f1803a = applicationContext;
        this.f1804b = e0Var;
        this.f1811i = dVar;
        this.f1810h = dVar2;
        String str = u1.a0.f12750a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f1805c = handler;
        if (Build.VERSION.SDK_INT >= 23) {
            eVar = new e(this);
        } else {
            eVar = null;
        }
        this.f1806d = eVar;
        this.f1807e = new g(this, 0);
        d dVar3 = d.f1782c;
        String str2 = Build.MANUFACTURER;
        if (!str2.equals("Amazon") && !str2.equals("Xiaomi")) {
            uriFor = null;
        } else {
            uriFor = Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        this.f1808f = uriFor != null ? new f(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final void a(d dVar) {
        boolean z10;
        String name;
        if (this.j && !dVar.equals(this.f1809g)) {
            this.f1809g = dVar;
            i0 i0Var = (i0) this.f1804b.f212y;
            Looper myLooper = Looper.myLooper();
            if (i0Var.f1835i0 == myLooper) {
                z10 = true;
            } else {
                z10 = false;
            }
            StringBuilder sb2 = new StringBuilder("Current looper (");
            String str = "null";
            if (myLooper == null) {
                name = "null";
            } else {
                name = myLooper.getThread().getName();
            }
            sb2.append(name);
            sb2.append(") is not the playback looper (");
            Looper looper = i0Var.f1835i0;
            if (looper != null) {
                str = looper.getThread().getName();
            }
            sb2.append(str);
            sb2.append(")");
            u1.c.f(sb2.toString(), z10);
            d dVar2 = i0Var.f1854y;
            if (dVar2 != null && !dVar.equals(dVar2)) {
                i0Var.f1854y = dVar;
                q qVar = i0Var.f1849t;
                if (qVar != null) {
                    qVar.u();
                }
            }
        }
    }

    public final void b(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        k7.d dVar = this.f1810h;
        k7.d dVar2 = null;
        if (dVar == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = (AudioDeviceInfo) dVar.f7747y;
        }
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            dVar2 = new k7.d(audioDeviceInfo, 2);
        }
        this.f1810h = dVar2;
        a(d.c(this.f1803a, this.f1811i, dVar2));
    }
}
