package k4;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c extends View implements f0 {
    public d A;
    public float B;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f7606x;

    /* renamed from: y, reason: collision with root package name */
    public List f7607y;

    /* renamed from: z, reason: collision with root package name */
    public float f7608z;

    public c(Context context, int i6) {
        super(context, null);
        this.f7606x = new ArrayList();
        this.f7607y = Collections.EMPTY_LIST;
        this.f7608z = 0.0533f;
        this.A = d.f7611g;
        this.B = 0.08f;
    }

    @Override // k4.f0
    public final void a(List list, d dVar, float f3, float f10) {
        this.f7607y = list;
        this.A = dVar;
        this.f7608z = f3;
        this.B = f10;
        while (true) {
            ArrayList arrayList = this.f7606x;
            if (arrayList.size() < list.size()) {
                arrayList.add(new e0(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0473  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r37) {
        /*
            Method dump skipped, instructions count: 1185
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.c.dispatchDraw(android.graphics.Canvas):void");
    }
}
