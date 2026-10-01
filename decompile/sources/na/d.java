package na;

import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.ExecutorService;
import k8.k4;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f9053v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f9054w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Runnable f9055x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k4 f9056y;

    public /* synthetic */ d(e eVar, Runnable runnable, k4 k4Var, int i) {
        this.f9053v = i;
        this.f9054w = eVar;
        this.f9055x = runnable;
        this.f9056y = k4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9053v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                ExecutorService executorService = this.f9054w.f9057v;
                final int i = 0;
                final Runnable runnable = this.f9055x;
                final k4 k4Var = this.f9056y;
                executorService.execute(new Runnable() { // from class: na.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i) {
                            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e7) {
                                    ((g) k4Var.f7607v).k(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((g) k4Var.f7607v).k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                g gVar = (g) k4Var.f7607v;
                                try {
                                    runnable2.run();
                                    gVar.j(null);
                                    return;
                                } catch (Exception e11) {
                                    gVar.k(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f9054w.f9057v;
                final int i10 = 2;
                final Runnable runnable2 = this.f9055x;
                final k4 k4Var2 = this.f9056y;
                executorService2.execute(new Runnable() { // from class: na.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ((g) k4Var2.f7607v).k(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((g) k4Var2.f7607v).k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                g gVar = (g) k4Var2.f7607v;
                                try {
                                    runnable22.run();
                                    gVar.j(null);
                                    return;
                                } catch (Exception e11) {
                                    gVar.k(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f9054w.f9057v;
                final int i11 = 1;
                final Runnable runnable3 = this.f9055x;
                final k4 k4Var3 = this.f9056y;
                executorService3.execute(new Runnable() { // from class: na.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e7) {
                                    ((g) k4Var3.f7607v).k(e7);
                                    throw e7;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((g) k4Var3.f7607v).k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                g gVar = (g) k4Var3.f7607v;
                                try {
                                    runnable22.run();
                                    gVar.j(null);
                                    return;
                                } catch (Exception e11) {
                                    gVar.k(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
