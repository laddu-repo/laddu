package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.lifecycle.j1;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import e6.j;
import g8.i;
import g8.r;
import i4.k0;
import java.util.concurrent.Executor;
import m8.c;
import q8.a;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f2129x = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        int i6 = jobParameters.getExtras().getInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        r.b(getApplicationContext());
        j1 a10 = i.a();
        a10.E(string);
        a10.A = a.b(i6);
        if (string2 != null) {
            a10.f950z = Base64.decode(string2, 0);
        }
        j jVar = r.a().f5559d;
        ((Executor) jVar.f4392e).execute(new k0(jVar, a10.g(), i10, new c(0, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
