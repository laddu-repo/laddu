package com.unity3d.ads.core.domain;

import android.app.Activity;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import he.y;
import kotlin.jvm.internal.x;
import le.c;
import ne.e;
import ne.j;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1", f = "AndroidHandleFocusCounters.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidHandleFocusCounters$invoke$1 extends j implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidHandleFocusCounters this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleFocusCounters$invoke$1(AndroidHandleFocusCounters androidHandleFocusCounters, c cVar) {
        super(2, cVar);
        this.this$0 = androidHandleFocusCounters;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        AndroidHandleFocusCounters$invoke$1 androidHandleFocusCounters$invoke$1 = new AndroidHandleFocusCounters$invoke$1(this.this$0, cVar);
        androidHandleFocusCounters$invoke$1.L$0 = obj;
        return androidHandleFocusCounters$invoke$1;
    }

    @Override // ve.p
    public final Object invoke(FocusState focusState, c cVar) {
        return ((AndroidHandleFocusCounters$invoke$1) create(focusState, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        String str;
        AndroidGetIsAdActivity androidGetIsAdActivity;
        SessionRepository sessionRepository;
        if (this.label == 0) {
            he.a.f(obj);
            FocusState focusState = (FocusState) this.L$0;
            this.this$0.onFocusStateChange(focusState);
            Activity activity = focusState.getActivity().get();
            if (activity == null || (str = x.a(activity.getClass()).b()) == null) {
                str = "unknown_activity_name";
            }
            androidGetIsAdActivity = this.this$0.isAdActivity;
            boolean invoke = androidGetIsAdActivity.invoke(str);
            y yVar = y.f6101a;
            if (invoke) {
                sessionRepository = this.this$0.sessionRepository;
                sessionRepository.incrementGlobalAdsFocusChangeCount();
                if (focusState instanceof FocusState.Focused) {
                    this.this$0.onResume(str);
                    return yVar;
                }
                if (focusState instanceof FocusState.Unfocused) {
                    this.this$0.onPause(str);
                }
            }
            return yVar;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
