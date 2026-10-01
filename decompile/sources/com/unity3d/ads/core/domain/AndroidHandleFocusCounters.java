package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import ef.c;
import ef.k;
import ef.l;
import ef.m;
import gf.y;
import j1.f0;
import java.util.concurrent.ConcurrentHashMap;
import kf.f1;
import kf.r0;
import kf.y0;
import kotlin.jvm.internal.f;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class AndroidHandleFocusCounters {
    private final y defaultDispatcher;
    private final FocusRepository focusRepository;
    private final ConcurrentHashMap<String, k> focusTimesPerActivity;
    private final AndroidGetIsAdActivity isAdActivity;
    private volatile String latestKnownActivityResumed;
    private final r0 previousFocusState;
    private final SessionRepository sessionRepository;
    private final m timeSource;

    public AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity isAdActivity, y defaultDispatcher, m timeSource) {
        kotlin.jvm.internal.k.e(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.k.e(focusRepository, "focusRepository");
        kotlin.jvm.internal.k.e(isAdActivity, "isAdActivity");
        kotlin.jvm.internal.k.e(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.k.e(timeSource, "timeSource");
        this.sessionRepository = sessionRepository;
        this.focusRepository = focusRepository;
        this.isAdActivity = isAdActivity;
        this.defaultDispatcher = defaultDispatcher;
        this.timeSource = timeSource;
        this.focusTimesPerActivity = new ConcurrentHashMap<>();
        this.previousFocusState = y0.c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState focusState) {
        f1 f1Var;
        Object value;
        FocusState focusState2;
        r0 r0Var = this.previousFocusState;
        do {
            f1Var = (f1) r0Var;
            value = f1Var.getValue();
            focusState2 = (FocusState) value;
        } while (!f1Var.f(value, focusState));
        if (focusState2 != null && focusState.getClass() != focusState2.getClass()) {
            this.sessionRepository.incrementFocusChangeCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPause(String str) {
        long h4;
        String str2 = this.latestKnownActivityResumed;
        if (str2 != null && !str2.equals(str)) {
            return;
        }
        k remove = this.focusTimesPerActivity.remove(str);
        if (remove == null) {
            remove = this.timeSource.a();
        }
        long a10 = k.a(remove.f4584x);
        SessionRepository sessionRepository = this.sessionRepository;
        if ((((int) a10) & 1) == 1) {
            if (!ef.a.e(a10)) {
                h4 = a10 >> 1;
                sessionRepository.addTimeToGlobalAdsFocusTime((int) h4);
            }
        } else {
            int i6 = ef.a.A;
        }
        h4 = ef.a.h(a10, c.MILLISECONDS);
        sessionRepository.addTimeToGlobalAdsFocusTime((int) h4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResume(String str) {
        this.latestKnownActivityResumed = str;
        this.focusTimesPerActivity.put(str, this.timeSource.a());
    }

    public final String getLatestKnownActivityResumed() {
        return this.latestKnownActivityResumed;
    }

    public final void invoke() {
        y0.p(new f0(6, this.focusRepository.getFocusState(), new AndroidHandleFocusCounters$invoke$1(this, null)), gf.f0.b(this.defaultDispatcher));
    }

    public final void setLatestKnownActivityResumed(String str) {
        this.latestKnownActivityResumed = str;
    }

    public /* synthetic */ AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, y yVar, m mVar, int i6, f fVar) {
        this(sessionRepository, focusRepository, androidGetIsAdActivity, yVar, (i6 & 16) != 0 ? l.f4585a : mVar);
    }

    public static /* synthetic */ void getLatestKnownActivityResumed$annotations() {
    }
}
