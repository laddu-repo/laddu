package fd;

import android.content.DialogInterface;
import com.playfy.tv.activities.MainActivity;
import com.playfy.tv.activities.PlayerActivity;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements DialogInterface.OnDismissListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f5201x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i.j f5202y;

    public /* synthetic */ m(i.j jVar, int i6) {
        this.f5201x = i6;
        this.f5202y = jVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i6 = this.f5201x;
        i.j jVar = this.f5202y;
        switch (i6) {
            case 0:
                bf.o[] oVarArr = MainActivity.J;
                ((od.s) ((MainActivity) jVar).E.getValue()).f10143g.c("tg", Boolean.FALSE);
                return;
            default:
                ((PlayerActivity) jVar).K = false;
                return;
        }
    }
}
