package za;

import bf.y;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends m {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15244e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(l lVar, int i6) {
        super(lVar);
        this.f15244e = i6;
    }

    @Override // za.m
    public void q() {
        switch (this.f15244e) {
            case 0:
                l lVar = this.f15269b;
                lVar.L = null;
                CheckableImageButton checkableImageButton = lVar.D;
                checkableImageButton.setOnLongClickListener(null);
                y.t(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
