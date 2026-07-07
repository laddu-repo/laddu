package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f920v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f921w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f922x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f923y;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i) {
        this.f920v = i;
        this.f921w = obj;
        this.f922x = obj2;
        this.f923y = obj3;
    }

    private final void a() {
        p pVar = (p) this.f921w;
        p4.v vVar = (p4.v) this.f922x;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f923y;
        try {
            x xVarH = fa.b.h(pVar.f926a);
            if (xVarH == null) {
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            }
            w wVar = (w) ((l) xVarH.f906b);
            synchronized (wVar.f941d) {
                wVar.f = threadPoolExecutor;
            }
            ((l) xVarH.f906b).a(new o(vVar, threadPoolExecutor));
        } catch (Throwable th) {
            vVar.E(th);
            threadPoolExecutor.shutdown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0251  */
    /* JADX WARN: Type inference failed for: r1v16, types: [h2.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.n.run():void");
    }
}
