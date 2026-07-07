package com.unity3d.ads.core.data.datasource;

import com.google.android.gms.tasks.Task;
import gf.c0;
import he.a;
import he.y;
import kotlin.jvm.internal.k;
import le.c;
import ne.e;
import ne.j;
import s9.d;
import s9.i;
import s9.n;
import ve.l;
import ve.p;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
@e(c = "com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1", f = "AndroidFIdDataSource.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidFIdDataSource$invoke$1$1 extends j implements p {
    final /* synthetic */ Task $task;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFIdDataSource$invoke$1$1(Task task, c cVar) {
        super(2, cVar);
        this.$task = task;
    }

    @Override // ne.a
    public final c create(Object obj, c cVar) {
        return new AndroidFIdDataSource$invoke$1$1(this.$task, cVar);
    }

    @Override // ve.p
    public final Object invoke(c0 c0Var, c cVar) {
        return ((AndroidFIdDataSource$invoke$1$1) create(c0Var, cVar)).invokeSuspend(y.f6101a);
    }

    @Override // ne.a
    public final Object invokeSuspend(Object obj) {
        int i6 = this.label;
        if (i6 != 0) {
            if (i6 == 1) {
                a.f(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.f(obj);
        Task task = this.$task;
        this.L$0 = task;
        this.label = 1;
        final le.j jVar = new le.j(a8.c.i(this));
        final AndroidFIdDataSource$invoke$1$1$1$1 androidFIdDataSource$invoke$1$1$1$1 = new AndroidFIdDataSource$invoke$1$1$1$1(jVar);
        s9.e eVar = new s9.e(androidFIdDataSource$invoke$1$1$1$1) { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$sam$com_google_android_gms_tasks_OnSuccessListener$0
            private final /* synthetic */ l function;

            {
                k.e(androidFIdDataSource$invoke$1$1$1$1, "function");
                this.function = androidFIdDataSource$invoke$1$1$1$1;
            }

            @Override // s9.e
            public final /* synthetic */ void onSuccess(Object obj2) {
                this.function.invoke(obj2);
            }
        };
        n nVar = (n) task;
        nVar.getClass();
        g8.p pVar = i.f12264a;
        nVar.c(pVar, eVar);
        ((n) task).b(pVar, new d() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$2
            @Override // s9.d
            public final void onFailure(Exception it) {
                k.e(it, "it");
                c.this.resumeWith(a.b(it));
            }
        });
        Object b10 = jVar.b();
        me.a aVar = me.a.f8833x;
        if (b10 == aVar) {
            return aVar;
        }
        return b10;
    }
}
