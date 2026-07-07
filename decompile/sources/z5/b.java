package z5;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f15216b = o.h("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f15217a;

    public b(Context context) {
        this.f15217a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
