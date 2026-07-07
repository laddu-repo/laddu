package com.unity3d.services.core.fid;

import com.google.android.gms.tasks.Task;
import com.unity3d.services.core.reflection.GenericBridge;
import dg.b;
import he.i;
import ie.w;
import kotlin.jvm.internal.k;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class FIdBridge extends GenericBridge {
    private final Object instance;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FIdBridge(Object instance) {
        super(w.x(new i(Constants.GET_APP_INSTANCE_ID, new Class[0])), false);
        k.e(instance, "instance");
        this.instance = instance;
    }

    public final Task getAppInstanceId() {
        Task task = (Task) callNonVoidMethod(Constants.GET_APP_INSTANCE_ID, this.instance, new Object[0]);
        if (task == null) {
            return b.j(null);
        }
        return task;
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return Constants.Companion.getClassName();
    }
}
