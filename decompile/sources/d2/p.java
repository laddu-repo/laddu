package d2;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
import u1.a0;
import u5.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class p implements Handler.Callback {
    public e2.c C;
    public boolean D;
    public boolean E;
    public boolean F;

    /* renamed from: x, reason: collision with root package name */
    public final u2.e f3764x;

    /* renamed from: y, reason: collision with root package name */
    public final r f3765y;
    public final TreeMap B = new TreeMap();
    public final Handler A = a0.n(this);

    /* renamed from: z, reason: collision with root package name */
    public final i3.b f3766z = new i3.b(1);

    public p(e2.c cVar, r rVar, u2.e eVar) {
        this.C = cVar;
        this.f3765y = rVar;
        this.f3764x = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.F) {
            if (message.what != 1) {
                return false;
            }
            n nVar = (n) message.obj;
            long j = nVar.f3757a;
            long j10 = nVar.f3758b;
            Long valueOf = Long.valueOf(j10);
            TreeMap treeMap = this.B;
            Long l10 = (Long) treeMap.get(valueOf);
            if (l10 == null) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j));
                return true;
            }
            if (l10.longValue() > j) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j));
            }
        }
        return true;
    }
}
