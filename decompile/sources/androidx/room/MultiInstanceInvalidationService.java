package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import x4.j;
import x4.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: x, reason: collision with root package name */
    public int f1160x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f1161y = new LinkedHashMap();

    /* renamed from: z, reason: collision with root package name */
    public final k f1162z = new k(this);
    public final j A = new j(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.k.e(intent, "intent");
        return this.A;
    }
}
