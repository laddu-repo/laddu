package androidx.emoji2.text;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class f extends p4.v {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f901j;

    public f(g gVar) {
        this.f901j = gVar;
    }

    @Override // p4.v
    public final void E(Throwable th) {
        ((m) this.f901j.f904c).d(th);
    }

    @Override // p4.v
    public final void F(sb.p pVar) {
        g gVar = this.f901j;
        gVar.f903b = pVar;
        sb.p pVar2 = (sb.p) gVar.f903b;
        m mVar = (m) gVar.f904c;
        gVar.f902a = new a7.j(pVar2, mVar.f918g, mVar.i, Build.VERSION.SDK_INT >= 34 ? r.a() : qf.g.t());
        m mVar2 = (m) gVar.f904c;
        mVar2.getClass();
        ArrayList arrayList = new ArrayList();
        mVar2.f913a.writeLock().lock();
        try {
            mVar2.f915c = 1;
            arrayList.addAll(mVar2.f914b);
            mVar2.f914b.clear();
            mVar2.f913a.writeLock().unlock();
            mVar2.f916d.post(new k(arrayList, mVar2.f915c, (Throwable) null));
        } catch (Throwable th) {
            mVar2.f913a.writeLock().unlock();
            throw th;
        }
    }
}
