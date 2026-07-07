package y5;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import e6.i;
import v5.o;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements w5.d {

    /* renamed from: y, reason: collision with root package name */
    public static final String f15001y = o.h("SystemAlarmScheduler");

    /* renamed from: x, reason: collision with root package name */
    public final Context f15002x;

    public h(Context context) {
        this.f15002x = context.getApplicationContext();
    }

    @Override // w5.d
    public final boolean b() {
        return true;
    }

    @Override // w5.d
    public final void d(String str) {
        String str2 = b.A;
        Context context = this.f15002x;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        context.startService(intent);
    }

    @Override // w5.d
    public final void f(i... iVarArr) {
        for (i iVar : iVarArr) {
            o.f().b(f15001y, r4.a.k("Scheduling work with workSpecId ", iVar.f4371a), new Throwable[0]);
            String str = iVar.f4371a;
            Context context = this.f15002x;
            context.startService(b.b(context, str));
        }
    }
}
