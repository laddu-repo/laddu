package ic;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements bc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6760a;

    public /* synthetic */ j(int i6) {
        this.f6760a = i6;
    }

    @Override // bc.a
    public final Object get() {
        switch (this.f6760a) {
            case 0:
                k7.c cVar = FirebaseMessaging.f2839l;
                return null;
            case 1:
                Random random = mc.l.j;
                return null;
            case 2:
                return Collections.EMPTY_SET;
            case 3:
                return null;
            case 4:
                qb.l lVar = ExecutorsRegistrar.f2832a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 23) {
                    detectNetwork.detectResourceMismatches();
                    if (i6 >= 26) {
                        detectNetwork.detectUnbufferedIo();
                    }
                }
                return new rb.e(Executors.newFixedThreadPool(4, new rb.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f2835d.get());
            case 5:
                qb.l lVar2 = ExecutorsRegistrar.f2832a;
                return new rb.e(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new rb.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f2835d.get());
            case 6:
                qb.l lVar3 = ExecutorsRegistrar.f2832a;
                return new rb.e(Executors.newCachedThreadPool(new rb.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f2835d.get());
            default:
                qb.l lVar4 = ExecutorsRegistrar.f2832a;
                return Executors.newSingleThreadScheduledExecutor(new rb.a("Firebase Scheduler", 0, null));
        }
    }
}
