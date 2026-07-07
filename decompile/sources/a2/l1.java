package a2;

import android.content.Intent;
import android.content.IntentSender;
import android.util.Pair;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class l1 implements Runnable {
    public final /* synthetic */ Object A;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f311x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f312y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f313z;

    public /* synthetic */ l1(Object obj, int i6, Object obj2, int i10) {
        this.f311x = i10;
        this.f313z = obj;
        this.f312y = i6;
        this.A = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [f2.m, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        f.b bVar;
        switch (this.f311x) {
            case 0:
                o1 o1Var = (o1) this.f313z;
                Pair pair = (Pair) this.A;
                ((b2.f) o1Var.f359y.f385i).B(((Integer) pair.first).intValue(), (q2.c0) pair.second, this.f312y);
                return;
            case 1:
                d.p pVar = (d.p) this.f313z;
                Serializable serializable = (Serializable) ((u5.r) this.A).f12916y;
                String str = (String) pVar.f4600a.get(Integer.valueOf(this.f312y));
                if (str != null) {
                    f.e eVar = (f.e) pVar.f4604e.get(str);
                    if (eVar != null) {
                        bVar = eVar.f4592a;
                    } else {
                        bVar = null;
                    }
                    if (bVar == null) {
                        pVar.f4606g.remove(str);
                        pVar.f4605f.put(str, serializable);
                        return;
                    } else {
                        f.b bVar2 = eVar.f4592a;
                        if (pVar.f4603d.remove(str)) {
                            bVar2.g(serializable);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 2:
                ((d.p) this.f313z).a(this.f312y, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.A));
                return;
            case 3:
                f2.l lVar = (f2.l) this.f313z;
                this.A.B(lVar.f4675a, lVar.f4676b, this.f312y);
                return;
            case 4:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f313z;
                u1.l lVar2 = (u1.l) this.A;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    u1.n nVar = (u1.n) it.next();
                    if (!nVar.f12783d) {
                        int i6 = this.f312y;
                        if (i6 != -1) {
                            nVar.f12781b.a(i6);
                        }
                        nVar.f12782c = true;
                        lVar2.invoke(nVar.f12780a);
                    }
                }
                return;
            default:
                ((u4.a) ((nc.c) this.f313z).f9597c).i(this.f312y, this.A);
                return;
        }
    }

    public /* synthetic */ l1(Object obj, Object obj2, int i6, int i10) {
        this.f311x = i10;
        this.f313z = obj;
        this.A = obj2;
        this.f312y = i6;
    }
}
