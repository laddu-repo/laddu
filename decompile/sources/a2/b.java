package a2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f163a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.x f164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f165c;

    public b(c cVar, u1.x xVar, k0 k0Var) {
        this.f165c = cVar;
        this.f164b = xVar;
        this.f163a = k0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f164b.c(new a(this, 1));
        }
    }
}
