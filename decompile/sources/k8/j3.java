package k8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import androidx.media3.decoder.DecoderInputBuffer;
import com.google.android.gms.internal.measurement.ag;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class j3 implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7590v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Parcelable f7591w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f7592x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f7593y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f7594z;

    public /* synthetic */ j3(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z2, BroadcastReceiver.PendingResult pendingResult) {
        this.f7590v = 3;
        this.f7591w = intent;
        this.f7594z = context;
        this.f7592x = z2;
        this.f7593y = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Executor executorUnconfigurableExecutorService;
        int iA;
        switch (this.f7590v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                p3 p3Var = (p3) this.f7593y;
                i0 i0Var = p3Var.f7701z;
                if (i0Var != null) {
                    p3Var.V(i0Var, this.f7592x ? null : (q4) this.f7594z, (v4) this.f7591w);
                    p3Var.Q();
                    return;
                } else {
                    v0 v0Var = ((p1) p3Var.f2053w).A;
                    p1.l(v0Var);
                    v0Var.B.a("Discarding data. Failed to set user property");
                    return;
                }
            case 1:
                p3 p3Var2 = (p3) this.f7593y;
                i0 i0Var2 = p3Var2.f7701z;
                if (i0Var2 != null) {
                    p3Var2.V(i0Var2, this.f7592x ? null : (v) this.f7594z, (v4) this.f7591w);
                    p3Var2.Q();
                    return;
                } else {
                    v0 v0Var2 = ((p1) p3Var2.f2053w).A;
                    p1.l(v0Var2);
                    v0Var2.B.a("Discarding data. Failed to send event to service");
                    return;
                }
            case 2:
                p3 p3Var3 = (p3) this.f7593y;
                i0 i0Var3 = p3Var3.f7701z;
                if (i0Var3 != null) {
                    p3Var3.V(i0Var3, this.f7592x ? null : (e) this.f7594z, (v4) this.f7591w);
                    p3Var3.Q();
                    return;
                } else {
                    v0 v0Var3 = ((p1) p3Var3.f2053w).A;
                    p1.l(v0Var3);
                    v0Var3.B.a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
            default:
                Intent intent = (Intent) this.f7591w;
                Context context = (Context) this.f7594z;
                boolean z2 = this.f7592x;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f7593y;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            p7.a aVar = new p7.a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f3608b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new y7.a("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f3608b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } finally {
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new ag(context, aVar, countDownLatch, 13));
                            try {
                                iIntValue = ((Integer) b8.h.b(new sb.i(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e7) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e7);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e10) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e10.toString()));
                            }
                        }
                        iA = iIntValue;
                        break;
                    } else {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    }
                    if (z2 && pendingResult != null) {
                        pendingResult.setResultCode(iA);
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

    public /* synthetic */ j3(p3 p3Var, v4 v4Var, boolean z2, u7.a aVar, int i) {
        this.f7590v = i;
        this.f7591w = v4Var;
        this.f7592x = z2;
        this.f7594z = aVar;
        this.f7593y = p3Var;
    }

    public j3(p3 p3Var, v4 v4Var, boolean z2, e eVar) {
        this.f7590v = 2;
        this.f7591w = v4Var;
        this.f7592x = z2;
        this.f7594z = eVar;
        Objects.requireNonNull(p3Var);
        this.f7593y = p3Var;
    }
}
