package l4;

import android.os.Bundle;
import java.util.UUID;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h0 {
    public static h a(e1.m mVar, u destination, Bundle bundle, androidx.lifecycle.x hostLifecycleState, m mVar2) {
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.k.d(uuid, "toString(...)");
        kotlin.jvm.internal.k.e(destination, "destination");
        kotlin.jvm.internal.k.e(hostLifecycleState, "hostLifecycleState");
        return new h(mVar, destination, bundle, hostLifecycleState, mVar2, uuid, null);
    }
}
