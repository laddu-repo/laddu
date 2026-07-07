package kc;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.concurrent.Executors;
import p4.u;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ String A;
    public final /* synthetic */ mc.j B;
    public final /* synthetic */ Object C;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7914v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sc.c f7915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ sc.b f7916x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f7917y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ pc.c f7918z;

    public /* synthetic */ i(Context context, sc.c cVar, String str, sc.b bVar, pc.c cVar2, String str2, mc.j jVar) {
        this.C = context;
        this.f7915w = cVar;
        this.f7917y = str;
        this.f7916x = bVar;
        this.f7918z = cVar2;
        this.A = str2;
        this.B = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7914v) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                c9.b bVar = new c9.b((Context) this.C, 0);
                final sc.c cVar = this.f7915w;
                final String str = this.f7917y;
                h.b bVar2 = bVar.f5918a;
                if (cVar == null) {
                    bVar.d("Add Favourites");
                    bVar2.f = "Are you sure, you want to add " + str + " to favourites?";
                    bVar.c("Add", null);
                } else {
                    bVar.d("Delete Favourites");
                    bVar2.f = "Are you sure, you want to delete " + str + " from favourites?";
                    bVar.c("Delete", null);
                }
                bVar.b();
                final h.g gVarA = bVar.a();
                Button button = gVarA.B.i;
                final sc.b bVar3 = this.f7916x;
                final pc.c cVar2 = this.f7918z;
                final String str2 = this.A;
                final mc.j jVar = this.B;
                button.setOnClickListener(new View.OnClickListener() { // from class: kc.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Executors.newSingleThreadExecutor().execute(new i(cVar, bVar3, str, cVar2, str2, jVar, gVarA));
                    }
                });
                break;
            default:
                sc.b bVar4 = this.f7916x;
                u uVar = (u) bVar4.f11786w;
                h.g gVar = (h.g) this.C;
                sc.c cVar3 = this.f7915w;
                pc.c cVar4 = this.f7918z;
                mc.j jVar2 = this.B;
                if (cVar3 == null) {
                    String str3 = cVar4.f10488b;
                    String str4 = cVar4.f10489c;
                    String str5 = this.A;
                    if (str5 == null) {
                        str5 = "";
                    }
                    b8.h.D(uVar, false, true, new kb.j(2, bVar4, new sc.c(this.f7917y, str3, str4, str5)));
                    if (jVar2 != null) {
                        new Handler(Looper.getMainLooper()).post(new androidx.fragment.app.d(jVar2, true, cVar4));
                    }
                } else {
                    final int i = cVar3.f11788a;
                    b8.h.D(uVar, false, true, new ce.l() { // from class: sc.a
                        @Override // ce.l
                        public final Object a(Object obj) throws Exception {
                            int i10 = i;
                            v4.c cVarJ0 = ((v4.a) obj).j0("DELETE FROM fav_channels WHERE id = ?");
                            try {
                                cVarJ0.o(i10);
                                cVarJ0.Z();
                                cVarJ0.close();
                                return null;
                            } catch (Throwable th) {
                                cVarJ0.close();
                                throw th;
                            }
                        }
                    });
                    if (jVar2 != null) {
                        new Handler(Looper.getMainLooper()).post(new androidx.fragment.app.d(jVar2, false, cVar4));
                    }
                }
                gVar.dismiss();
                break;
        }
    }

    public /* synthetic */ i(sc.c cVar, sc.b bVar, String str, pc.c cVar2, String str2, mc.j jVar, h.g gVar) {
        this.f7915w = cVar;
        this.f7916x = bVar;
        this.f7917y = str;
        this.f7918z = cVar2;
        this.A = str2;
        this.B = jVar;
        this.C = gVar;
    }
}
