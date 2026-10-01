package ic;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements qb.d {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f6765x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ qb.p f6766y;

    public /* synthetic */ m(qb.p pVar, int i6) {
        this.f6765x = i6;
        this.f6766y = pVar;
    }

    @Override // qb.d
    public final Object d(c6.h hVar) {
        mc.l lambda$getComponents$0;
        switch (this.f6765x) {
            case 0:
                return FirebaseMessagingRegistrar.a(this.f6766y, hVar);
            case 1:
                lambda$getComponents$0 = RemoteConfigRegistrar.lambda$getComponents$0(this.f6766y, hVar);
                return lambda$getComponents$0;
            default:
                return new zb.c((Context) hVar.a(Context.class), ((jb.g) hVar.a(jb.g.class)).d(), hVar.z(zb.d.class), hVar.c(lc.b.class), (Executor) hVar.d(this.f6766y));
        }
    }
}
