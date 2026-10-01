package ea;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import com.playfy.tv.R;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d extends a1.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f4508q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f4508q = chip;
    }

    @Override // a1.b
    public final void l(ArrayList arrayList) {
        f fVar;
        arrayList.add(0);
        Rect rect = Chip.U;
        Chip chip = this.f4508q;
        if (chip.c() && (fVar = chip.B) != null && fVar.f4534r0 && chip.E != null) {
            arrayList.add(1);
        }
    }

    @Override // a1.b
    public final void o(int i6, u0.c cVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f12745a;
        CharSequence charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        if (i6 == 1) {
            Chip chip = this.f4508q;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, charSequence).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            cVar.b(u0.b.f12733e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            cVar.i(Button.class.getName());
            return;
        }
        accessibilityNodeInfo.setContentDescription(HttpUrl.FRAGMENT_ENCODE_SET);
        accessibilityNodeInfo.setBoundsInParent(Chip.U);
    }

    @Override // a1.b
    public final void p(int i6, boolean z10) {
        int[] iArr;
        Chip chip = this.f4508q;
        if (i6 == 1) {
            chip.K = z10;
        }
        f fVar = chip.B;
        boolean z11 = chip.K;
        boolean z12 = false;
        if (fVar.f4535s0 != null) {
            if (z11) {
                iArr = new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled};
            } else {
                iArr = f.f4509m1;
            }
            z12 = fVar.W(iArr);
        }
        if (z12) {
            chip.refreshDrawableState();
        }
    }
}
