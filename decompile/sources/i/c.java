package i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f6155x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f6156y;

    public c(d dVar, f fVar) {
        this.f6156y = dVar;
        this.f6155x = fVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i6, long j) {
        d dVar = this.f6156y;
        DialogInterface.OnClickListener onClickListener = dVar.f6170n;
        f fVar = this.f6155x;
        onClickListener.onClick(fVar.f6178b, i6);
        if (!dVar.f6172p) {
            fVar.f6178b.dismiss();
        }
    }
}
