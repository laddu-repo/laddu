package a2;

import android.content.Context;
import com.playfy.tv.activities.PlayerActivity;
import java.util.HashMap;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements cb.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f371x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f372y;

    public /* synthetic */ r(PlayerActivity playerActivity, int i6) {
        this.f371x = i6;
        this.f372y = playerActivity;
    }

    @Override // cb.l
    public final Object get() {
        u2.g gVar;
        switch (this.f371x) {
            case 0:
                return new n(this.f372y);
            case 1:
                PlayerActivity playerActivity = this.f372y;
                return new q2.q(new s8.l(playerActivity), new y2.m());
            case 2:
                return new t2.q(this.f372y);
            default:
                PlayerActivity playerActivity2 = this.f372y;
                db.c1 c1Var = u2.g.f12840p;
                synchronized (u2.g.class) {
                    try {
                        if (u2.g.f12845v == null) {
                            Context applicationContext = playerActivity2.getApplicationContext();
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            hashMap.put(2, -9223372036854775807L);
                            hashMap.put(3, -9223372036854775807L);
                            hashMap.put(4, -9223372036854775807L);
                            hashMap.put(5, -9223372036854775807L);
                            hashMap.put(10, -9223372036854775807L);
                            hashMap.put(9, -9223372036854775807L);
                            hashMap.put(7, -9223372036854775807L);
                            u2.g.f12845v = new u2.g(applicationContext, hashMap);
                        }
                        gVar = u2.g.f12845v;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return gVar;
        }
    }
}
