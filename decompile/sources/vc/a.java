package vc;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.MimeTypes;
import e7.c;
import java.util.Collections;
import java.util.Iterator;
import uc.j;
import wc.g;

/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13502a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f13503b;

    /* renamed from: c, reason: collision with root package name */
    public final ob.a f13504c;

    /* renamed from: d, reason: collision with root package name */
    public final c f13505d;

    /* renamed from: e, reason: collision with root package name */
    public float f13506e;

    public a(Handler handler, Context context, ob.a aVar, c cVar) {
        super(handler);
        this.f13502a = context;
        this.f13503b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f13504c = aVar;
        this.f13505d = cVar;
    }

    public final float a() {
        AudioManager audioManager = this.f13503b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        this.f13504c.getClass();
        if (streamMaxVolume > 0 && streamVolume > 0) {
            float f3 = streamVolume / streamMaxVolume;
            if (f3 > 1.0f) {
                return 1.0f;
            }
            return f3;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void b() {
        float f3 = this.f13506e;
        c cVar = this.f13505d;
        cVar.f4399x = f3;
        if (((wc.c) cVar.A) == null) {
            cVar.A = wc.c.f14279c;
        }
        Iterator it = Collections.unmodifiableCollection(((wc.c) cVar.A).f14281b).iterator();
        while (it.hasNext()) {
            yc.a aVar = ((j) it.next()).f13098e;
            g.f14287a.a(aVar.e(), "setDeviceVolume", Float.valueOf(f3), aVar.f15047a);
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float a10 = a();
        if (a10 != this.f13506e) {
            this.f13506e = a10;
            b();
        }
    }
}
