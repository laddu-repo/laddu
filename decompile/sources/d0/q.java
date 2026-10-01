package d0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q extends View {

    /* renamed from: x, reason: collision with root package name */
    public boolean f3643x;

    public q(Context context) {
        super(context);
        this.f3643x = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f3643x = z10;
    }

    public void setGuidelineBegin(int i6) {
        e eVar = (e) getLayoutParams();
        if (this.f3643x && eVar.f3500a == i6) {
            return;
        }
        eVar.f3500a = i6;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i6) {
        e eVar = (e) getLayoutParams();
        if (this.f3643x && eVar.f3502b == i6) {
            return;
        }
        eVar.f3502b = i6;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f3) {
        e eVar = (e) getLayoutParams();
        if (this.f3643x && eVar.f3504c == f3) {
            return;
        }
        eVar.f3504c = f3;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
    }
}
