package p7;

import java.util.concurrent.CountDownLatch;
import o8.o;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements o8.c, o8.e, o8.d, o8.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CountDownLatch f10415v;

    @Override // o8.b
    public void m() {
        this.f10415v.countDown();
    }

    @Override // o8.e
    public void n(Object obj) {
        this.f10415v.countDown();
    }

    @Override // o8.c
    public void u(o oVar) {
        this.f10415v.countDown();
    }

    @Override // o8.d
    public void z(Exception exc) {
        this.f10415v.countDown();
    }

    public i() {
        this.f10415v = new CountDownLatch(1);
    }
}
