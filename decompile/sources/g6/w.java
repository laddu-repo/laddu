package g6;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class w implements com.bumptech.glide.load.data.d, com.bumptech.glide.load.data.c {
    public List A;
    public boolean B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f5700v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final s0.c f5701w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5702x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.bumptech.glide.h f5703y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.bumptech.glide.load.data.c f5704z;

    public w(ArrayList arrayList, s0.c cVar) {
        this.f5701w = cVar;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f5700v = arrayList;
        this.f5702x = 0;
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class a() {
        return ((com.bumptech.glide.load.data.d) this.f5700v.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        List list = this.A;
        if (list != null) {
            this.f5701w.e(list);
        }
        this.A = null;
        ArrayList arrayList = this.f5700v;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((com.bumptech.glide.load.data.d) obj).b();
        }
    }

    public final void c() {
        if (this.B) {
            return;
        }
        if (this.f5702x < this.f5700v.size() - 1) {
            this.f5702x++;
            e(this.f5703y, this.f5704z);
        } else {
            v6.f.b(this.A);
            this.f5704z.k(new c6.w("Fetch failed", new ArrayList(this.A)));
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.B = true;
        ArrayList arrayList = this.f5700v;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((com.bumptech.glide.load.data.d) obj).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final int d() {
        return ((com.bumptech.glide.load.data.d) this.f5700v.get(0)).d();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.c cVar) {
        this.f5703y = hVar;
        this.f5704z = cVar;
        this.A = (List) this.f5701w.k();
        ((com.bumptech.glide.load.data.d) this.f5700v.get(this.f5702x)).e(hVar, this);
        if (this.B) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final void k(Exception exc) {
        List list = this.A;
        v6.f.c(list, "Argument must not be null");
        list.add(exc);
        c();
    }

    @Override // com.bumptech.glide.load.data.c
    public final void q(Object obj) {
        if (obj != null) {
            this.f5704z.q(obj);
        } else {
            c();
        }
    }
}
