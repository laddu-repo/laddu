package d6;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.j1;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.datepicker.g;
import e6.i;
import f6.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import v5.h;
import v5.o;
import w5.l;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements a6.b, w5.b {
    public static final String G = o.h("SystemFgDispatcher");
    public String A;
    public final LinkedHashMap B;
    public final HashMap C;
    public final HashSet D;
    public final a6.c E;
    public SystemForegroundService F;

    /* renamed from: x, reason: collision with root package name */
    public final l f3824x;

    /* renamed from: y, reason: collision with root package name */
    public final h6.a f3825y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f3826z = new Object();

    public c(Context context) {
        l c10 = l.c(context);
        this.f3824x = c10;
        j1 j1Var = c10.f14114d;
        this.f3825y = j1Var;
        this.A = null;
        this.B = new LinkedHashMap();
        this.D = new HashSet();
        this.C = new HashMap();
        this.E = new a6.c(context, j1Var, this);
        c10.f14116f.a(this);
    }

    public static Intent b(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f13322a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f13323b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f13324c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f13322a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f13323b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f13324c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // a6.b
    public final void a(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                o.f().b(G, r4.a.k("Constraints unmet for WorkSpec ", str), new Throwable[0]);
                l lVar = this.f3824x;
                lVar.f14114d.k(new j(lVar, str, true));
            }
        }
    }

    @Override // w5.b
    public final void c(String str, boolean z10) {
        boolean z11;
        Map.Entry entry;
        synchronized (this.f3826z) {
            try {
                i iVar = (i) this.C.remove(str);
                if (iVar != null) {
                    z11 = this.D.remove(iVar);
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.E.c(this.D);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h hVar = (h) this.B.remove(str);
        if (str.equals(this.A) && this.B.size() > 0) {
            Iterator it = this.B.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.A = (String) entry.getKey();
            if (this.F != null) {
                h hVar2 = (h) entry.getValue();
                SystemForegroundService systemForegroundService = this.F;
                int i6 = hVar2.f13322a;
                int i10 = hVar2.f13323b;
                systemForegroundService.f1206y.post(new d(systemForegroundService, i6, hVar2.f13324c, i10));
                SystemForegroundService systemForegroundService2 = this.F;
                systemForegroundService2.f1206y.post(new g(hVar2.f13322a, 1, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.F;
        if (hVar != null && systemForegroundService3 != null) {
            o f3 = o.f();
            String str2 = G;
            int i11 = hVar.f13322a;
            int i12 = hVar.f13323b;
            StringBuilder sb2 = new StringBuilder("Removing Notification (id: ");
            sb2.append(i11);
            sb2.append(", workSpecId: ");
            sb2.append(str);
            sb2.append(" ,notificationType: ");
            f3.b(str2, r4.a.l(sb2, i12, ")"), new Throwable[0]);
            systemForegroundService3.f1206y.post(new g(hVar.f13322a, 1, systemForegroundService3));
        }
    }

    public final void f(Intent intent) {
        int i6 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        o f3 = o.f();
        StringBuilder sb2 = new StringBuilder("Notifying with (id: ");
        sb2.append(intExtra);
        sb2.append(", workSpecId: ");
        sb2.append(stringExtra);
        sb2.append(", notificationType: ");
        f3.b(G, r4.a.l(sb2, intExtra2, ")"), new Throwable[0]);
        if (notification != null && this.F != null) {
            h hVar = new h(intExtra, notification, intExtra2);
            LinkedHashMap linkedHashMap = this.B;
            linkedHashMap.put(stringExtra, hVar);
            if (TextUtils.isEmpty(this.A)) {
                this.A = stringExtra;
                SystemForegroundService systemForegroundService = this.F;
                systemForegroundService.f1206y.post(new d(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = this.F;
            systemForegroundService2.f1206y.post(new e(systemForegroundService2, intExtra, notification));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i6 |= ((h) ((Map.Entry) it.next()).getValue()).f13323b;
                }
                h hVar2 = (h) linkedHashMap.get(this.A);
                if (hVar2 != null) {
                    SystemForegroundService systemForegroundService3 = this.F;
                    systemForegroundService3.f1206y.post(new d(systemForegroundService3, hVar2.f13322a, hVar2.f13324c, i6));
                }
            }
        }
    }

    public final void g() {
        this.F = null;
        synchronized (this.f3826z) {
            this.E.d();
        }
        this.f3824x.f14116f.f(this);
    }

    @Override // a6.b
    public final void e(List list) {
    }
}
