package v5;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class u {
    public final void a(p pVar) {
        List singletonList = Collections.singletonList(pVar);
        w5.l lVar = (w5.l) this;
        if (!singletonList.isEmpty()) {
            w5.f fVar = new w5.f(lVar, singletonList);
            if (!fVar.f14096e) {
                lVar.f14114d.k(new f6.d(fVar));
                return;
            } else {
                o.f().i(w5.f.f14091f, h8.c.m("Already enqueued work ids (", TextUtils.join(", ", fVar.f14094c), ")"), new Throwable[0]);
                return;
            }
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }
}
