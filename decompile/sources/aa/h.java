package aa;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.m;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.protobuf.CodedOutputStream;
import com.playfy.tv.R;
import u5.r;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h extends t0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f673e;

    public /* synthetic */ h(Object obj, int i6) {
        this.f672d = i6;
        this.f673e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r3.c() > 1) goto L12;
     */
    @Override // t0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            int r0 = r2.f672d
            switch(r0) {
                case 2: goto L47;
                case 3: goto L5;
                case 4: goto L9;
                default: goto L5;
            }
        L5:
            super.c(r3, r4)
            return
        L9:
            java.lang.Object r0 = r2.f673e
            s5.g r0 = (s5.g) r0
            super.c(r3, r4)
            java.lang.Class<s5.g> r3 = s5.g.class
            java.lang.String r3 = r3.getName()
            r4.setClassName(r3)
            s5.a r3 = r0.B
            if (r3 == 0) goto L25
            int r3 = r3.c()
            r1 = 1
            if (r3 <= r1) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            r4.setScrollable(r1)
            int r3 = r4.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r3 != r1) goto L46
            s5.a r3 = r0.B
            if (r3 == 0) goto L46
            int r3 = r3.c()
            r4.setItemCount(r3)
            int r3 = r0.C
            r4.setFromIndex(r3)
            int r3 = r0.C
            r4.setToIndex(r3)
        L46:
            return
        L47:
            super.c(r3, r4)
            java.lang.Object r3 = r2.f673e
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            boolean r3 = r3.A
            r4.setChecked(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.h.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // t0.b
    public final void d(View view, u0.c cVar) {
        String i6;
        int i10 = this.f672d;
        int i11 = -1;
        boolean z10 = false;
        Object obj = this.f673e;
        View.AccessibilityDelegate accessibilityDelegate = this.f12323a;
        switch (i10) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, cVar.f12745a);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i12 = MaterialButtonToggleGroup.N;
                if (view instanceof MaterialButton) {
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        if (i13 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i13) == view) {
                                i11 = i14;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i13) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i13).getVisibility() != 8) {
                                    i14++;
                                }
                                i13++;
                            }
                        }
                    }
                }
                cVar.j(r.w(0, 1, i11, 1, ((MaterialButton) view).L));
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, cVar.f12745a);
                m mVar = (m) obj;
                if (mVar.K0.getVisibility() == 0) {
                    i6 = mVar.i(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    i6 = mVar.i(R.string.mtrl_picker_toggle_to_day_selection);
                }
                cVar.b(new u0.b(16, i6));
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f12745a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.B);
                accessibilityNodeInfo.setChecked(checkableImageButton.A);
                return;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo2 = cVar.f12745a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).U);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, cVar.f12745a);
                cVar.i(s5.g.class.getName());
                s5.g gVar = (s5.g) obj;
                s5.a aVar = gVar.B;
                if (aVar != null && aVar.c() > 1) {
                    z10 = true;
                }
                cVar.k(z10);
                if (gVar.canScrollHorizontally(1)) {
                    cVar.a(CodedOutputStream.DEFAULT_BUFFER_SIZE);
                }
                if (gVar.canScrollHorizontally(-1)) {
                    cVar.a(8192);
                    return;
                }
                return;
        }
    }

    @Override // t0.b
    public boolean g(View view, int i6, Bundle bundle) {
        switch (this.f672d) {
            case 4:
                s5.g gVar = (s5.g) this.f673e;
                if (super.g(view, i6, bundle)) {
                    return true;
                }
                if (i6 != 4096) {
                    if (i6 == 8192 && gVar.canScrollHorizontally(-1)) {
                        gVar.setCurrentItem(gVar.C - 1);
                        return true;
                    }
                } else if (gVar.canScrollHorizontally(1)) {
                    gVar.setCurrentItem(gVar.C + 1);
                    return true;
                }
                return false;
            default:
                return super.g(view, i6, bundle);
        }
    }
}
