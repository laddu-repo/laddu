package ea;

import a2.a2;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: x, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f4543x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ChipGroup f4544y;

    public j(ChipGroup chipGroup) {
        this.f4544y = chipGroup;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.f4544y;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                view2.setId(View.generateViewId());
            }
            ma.a aVar = chipGroup.E;
            Chip chip = (Chip) view2;
            aVar.f8723a.put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                aVar.a(chip);
            }
            chip.setInternalOnCheckedChangeListener(new a2(aVar, 15));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f4543x;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.f4544y;
        if (view == chipGroup && (view2 instanceof Chip)) {
            ma.a aVar = chipGroup.E;
            Chip chip = (Chip) view2;
            aVar.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            aVar.f8723a.remove(Integer.valueOf(chip.getId()));
            aVar.f8724b.remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f4543x;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
