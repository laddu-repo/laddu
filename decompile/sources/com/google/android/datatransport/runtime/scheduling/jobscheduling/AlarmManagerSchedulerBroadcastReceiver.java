package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.lifecycle.j1;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import e6.j;
import g8.i;
import g8.r;
import i4.k0;
import java.util.concurrent.Executor;
import k4.z;
import q8.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2128a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        int intValue = Integer.valueOf(intent.getData().getQueryParameter(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY)).intValue();
        int i6 = intent.getExtras().getInt("attemptNumber");
        r.b(context);
        j1 a10 = i.a();
        a10.E(queryParameter);
        a10.A = a.b(intValue);
        if (queryParameter2 != null) {
            a10.f950z = Base64.decode(queryParameter2, 0);
        }
        j jVar = r.a().f5559d;
        ((Executor) jVar.f4392e).execute(new k0(jVar, a10.g(), i6, new z(1)));
    }
}
