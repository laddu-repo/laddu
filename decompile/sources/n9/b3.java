package n9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b3 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9195x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Parcelable f9196y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f9197z;

    public /* synthetic */ b3(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f9195x = 3;
        this.f9196y = intent;
        this.B = context;
        this.f9197z = z10;
        this.A = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g4 g4Var;
        v vVar;
        e eVar;
        Intent intent;
        Executor executor;
        int i6;
        switch (this.f9195x) {
            case 0:
                h3 h3Var = (h3) this.A;
                h0 h0Var = h3Var.B;
                if (h0Var == null) {
                    u0 u0Var = ((n1) h3Var.f4301y).C;
                    n1.g(u0Var);
                    u0Var.D.a("Discarding data. Failed to set user property");
                    return;
                } else {
                    l4 l4Var = (l4) this.f9196y;
                    if (this.f9197z) {
                        g4Var = null;
                    } else {
                        g4Var = (g4) this.B;
                    }
                    h3Var.v1(h0Var, g4Var, l4Var);
                    h3Var.q1();
                    return;
                }
            case 1:
                h3 h3Var2 = (h3) this.A;
                h0 h0Var2 = h3Var2.B;
                if (h0Var2 == null) {
                    u0 u0Var2 = ((n1) h3Var2.f4301y).C;
                    n1.g(u0Var2);
                    u0Var2.D.a("Discarding data. Failed to send event to service");
                    return;
                } else {
                    l4 l4Var2 = (l4) this.f9196y;
                    if (this.f9197z) {
                        vVar = null;
                    } else {
                        vVar = (v) this.B;
                    }
                    h3Var2.v1(h0Var2, vVar, l4Var2);
                    h3Var2.q1();
                    return;
                }
            case 2:
                h3 h3Var3 = (h3) this.A;
                h0 h0Var3 = h3Var3.B;
                if (h0Var3 == null) {
                    u0 u0Var3 = ((n1) h3Var3.f4301y).C;
                    n1.g(u0Var3);
                    u0Var3.D.a("Discarding data. Failed to send conditional user property to service");
                    return;
                } else {
                    l4 l4Var3 = (l4) this.f9196y;
                    if (this.f9197z) {
                        eVar = null;
                    } else {
                        eVar = (e) this.B;
                    }
                    h3Var3.v1(h0Var3, eVar, l4Var3);
                    h3Var3.q1();
                    return;
                }
            default:
                Intent intent2 = (Intent) this.f9196y;
                Context context = (Context) this.B;
                boolean z10 = this.f9197z;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.A;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    if (parcelableExtra instanceof Intent) {
                        intent = (Intent) parcelableExtra;
                    } else {
                        intent = null;
                    }
                    if (intent != null) {
                        i6 = FirebaseInstanceIdReceiver.a(intent);
                    } else {
                        Bundle extras = intent2.getExtras();
                        int i10 = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
                        if (extras == null) {
                            i6 = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
                        } else {
                            Executor executor2 = null;
                            s8.a aVar = new s8.a(intent2);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f2837b;
                                    if (softReference != null) {
                                        executor2 = (Executor) softReference.get();
                                    }
                                    if (executor2 == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b9.a("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor2 = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f2837b = new SoftReference(executor2);
                                    }
                                    executor = executor2;
                                } finally {
                                }
                            }
                            executor.execute(new d6.b(12, context, aVar, countDownLatch, false));
                            try {
                                i10 = ((Integer) dg.b.a(new ic.h(context).b(intent2))).intValue();
                            } catch (InterruptedException | ExecutionException e10) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e11) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e11.toString()));
                            }
                            i6 = i10;
                        }
                    }
                    if (z10 && pendingResult != null) {
                        pendingResult.setResultCode(i6);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ b3(h3 h3Var, l4 l4Var, boolean z10, x8.a aVar, int i6) {
        this.f9195x = i6;
        this.f9196y = l4Var;
        this.f9197z = z10;
        this.B = aVar;
        this.A = h3Var;
    }

    public b3(h3 h3Var, l4 l4Var, boolean z10, e eVar) {
        this.f9195x = 2;
        this.f9196y = l4Var;
        this.f9197z = z10;
        this.B = eVar;
        Objects.requireNonNull(h3Var);
        this.A = h3Var;
    }
}
